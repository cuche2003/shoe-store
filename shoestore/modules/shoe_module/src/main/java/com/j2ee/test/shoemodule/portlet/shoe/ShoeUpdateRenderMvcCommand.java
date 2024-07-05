package com.j2ee.test.shoemodule.portlet.shoe;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.servicebuilder.model.Brand;
import com.liferay.servicebuilder.model.Type;
import com.liferay.servicebuilder.service.BrandService;
import com.liferay.servicebuilder.service.ShoeService;
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
				"mvc.command.name=/shoe/update"
		}
)

public class ShoeUpdateRenderMvcCommand implements MVCRenderCommand {
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		String shoeId = ParamUtil.getString(renderRequest, "shoeId", "");
		
		if (!shoeId.isEmpty()) {
			try {
				renderRequest.setAttribute("shoe", _shoeService.getShoeById(shoeId));
				
				List<Brand> brands = _brandService.getBrands(0, _brandService.getBrandsCount());
				renderRequest.setAttribute("brands", brands);
				
				List<Type> types = _typeService.getTypes(0, _typeService.getTypesCount());
				renderRequest.setAttribute("types", types);
				
			} catch (PortalException e) {
				e.printStackTrace();
			}
		}
		
		return "/shoe/update.jsp";
	}
	
	private ShoeService _shoeService;
	@Reference(unbind = "-")
	protected void setShoeService(ShoeService shoeService) {
		_shoeService = shoeService;
	}
	
	private BrandService _brandService;
	@Reference(unbind = "-")
	protected void setBrandService(BrandService brandService) {
		_brandService = brandService;
	}
	
	private TypeService _typeService;
	@Reference(unbind = "-")
	protected void setTypeService(TypeService typeService) {
		_typeService = typeService;
	}
	
}
