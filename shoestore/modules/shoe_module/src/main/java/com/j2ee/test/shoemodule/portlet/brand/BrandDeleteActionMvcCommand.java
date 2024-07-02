package com.j2ee.test.shoemodule.portlet.brand;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.servicebuilder.service.BrandService;
import com.liferay.servicebuilder.service.ShoeService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ShoeModulePortletKeys.BRANDPORTLET,
				"mvc.command.name=BrandDelete"
		},
		service = MVCActionCommand.class
)

public class BrandDeleteActionMvcCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		System.out.println("Brand deleted!");
		
		String brandId = ParamUtil.get(actionRequest, "brandId", "");
		
		try {		
			_brandService.deleteBrand(brandId);
			_shoeService.deleteShoesByBrandId(brandId);
		} catch (PortalException e) {
			e.printStackTrace();
		}
	}
	
	private BrandService _brandService;
	private ShoeService _shoeService;
	
	@Reference(unbind = "-")
	protected void setBrandService(BrandService brandService) {
		_brandService = brandService;
	}
	
	@Reference(unbind = "-")
	protected void setShoeService(ShoeService shoeService) {
		_shoeService = shoeService;
	}
}