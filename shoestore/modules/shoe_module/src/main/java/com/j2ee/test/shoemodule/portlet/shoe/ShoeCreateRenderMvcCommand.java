package com.j2ee.test.shoemodule.portlet.shoe;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.servicebuilder.model.Brand;
import com.liferay.servicebuilder.model.Type;
import com.liferay.servicebuilder.service.BrandService;
import com.liferay.servicebuilder.service.TypeService;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ShoeModulePortletKeys.SHOEPORTLET,
				"mvc.command.name=/shoe/create"
		}
)

public class ShoeCreateRenderMvcCommand implements MVCRenderCommand {
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		List<Brand> brands = _brandService.getBrands(0, _brandService.getBrandsCount());
		renderRequest.setAttribute("brands", brands);
		
		List<Type> types = _typeService.getTypes(0, _brandService.getBrandsCount());
		renderRequest.setAttribute("types", types);
		
		return "/shoe/create.jsp";
	}
	
	private BrandService _brandService;
	private TypeService _typeService;
	
	@Reference(unbind = "-")
	protected void setTypeService(TypeService typeService) {
		_typeService = typeService;
	}
	
	@Reference(unbind = "-")
	protected void setBrandService(BrandService brandService) {
		_brandService = brandService;
	}
}
