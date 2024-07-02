package com.j2ee.test.shoemodule.portlet.brand;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.servicebuilder.service.BrandService;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author DELL
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=BrandModule",
		"javax.portlet.init-param.template-path=/brand/",
		"javax.portlet.init-param.view-template=/brand/view.jsp",
		"javax.portlet.name=" + ShoeModulePortletKeys.BRANDPORTLET,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class BrandModulePortlet extends MVCPortlet {
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		int delta = ParamUtil.getInteger(renderRequest, "delta");
		int cur = ParamUtil.getInteger(renderRequest, "cur");
		int from = delta * (cur - 1);
		int to = delta == 0 ? 9 : delta * cur;
		
		renderRequest.setAttribute("totalBrands", _brandService.getBrandsCount());
		renderRequest.setAttribute("entries", _brandService.getBrands(from,to));
		
		super.doView(renderRequest, renderResponse);
	}
	
	private BrandService _brandService;
	
	@Reference(unbind = "-")
	protected void setBrandService(BrandService brandService) {
		_brandService = brandService;
	}
}