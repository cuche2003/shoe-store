package com.j2ee.test.shoemodule.portlet.brand;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.servicebuilder.service.BrandService;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ShoeModulePortletKeys.BRANDPORTLET,
				"mvc.command.name=/brand/update"
		}
)

public class BrandUpdateRenderMvcCommand implements MVCRenderCommand {
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		String brandId = ParamUtil.getString(renderRequest, "brandId", "");
		
		if (!brandId.isEmpty()) {
			try {
				renderRequest.setAttribute("brand", _brandService.getBrandById(brandId));
			} catch (PortalException e) {
				e.printStackTrace();
			}
		}
		
		return "/brand/update.jsp";
	}
	
	private BrandService _brandService;
	
	@Reference(unbind = "-")
	protected void setBrandService(BrandService brandService) {
		_brandService = brandService;
	}
}
