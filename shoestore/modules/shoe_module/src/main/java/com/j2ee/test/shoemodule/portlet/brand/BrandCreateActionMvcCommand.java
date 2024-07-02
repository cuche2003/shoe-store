package com.j2ee.test.shoemodule.portlet.brand;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.servicebuilder.service.BrandService;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ShoeModulePortletKeys.BRANDPORTLET,
				"mvc.command.name=BrandCreate"
		},
		service = MVCActionCommand.class
)

public class BrandCreateActionMvcCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		System.out.println("Brand created!");
		
		String name = ParamUtil.get(actionRequest, "name", "");
		
		_brandService.addBrand(name);
	}
	
	private BrandService _brandService;
	
	@Reference(unbind = "-")
	protected void setBrandService(BrandService brandService) {
		_brandService = brandService;
	}
}