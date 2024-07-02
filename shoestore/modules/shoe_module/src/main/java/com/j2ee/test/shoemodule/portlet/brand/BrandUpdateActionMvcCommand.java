package com.j2ee.test.shoemodule.portlet.brand;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.servicebuilder.model.Brand;
import com.liferay.servicebuilder.service.BrandService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ShoeModulePortletKeys.BRANDPORTLET,
				"mvc.command.name=BrandUpdate"
		},
		service = MVCActionCommand.class
)

public class BrandUpdateActionMvcCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		System.out.println("Shoe updated!");
		
		String brandId = ParamUtil.get(actionRequest, "brandId", "");
		String name = ParamUtil.get(actionRequest, "name", "");
		
		try {
			Brand brand = _brandService.getBrandById(brandId);
			brand.setName(name);
						
			_brandService.updateBrand(brand);
		} catch (PortalException e) {
			e.printStackTrace();
		}
	}
	
	private BrandService _brandService;
	
	@Reference(unbind = "-")
	protected void setBrandService(BrandService brandService) {
		_brandService = brandService;
	}
}