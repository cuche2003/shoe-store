package com.j2ee.test.shoemodule.portlet;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.servicebuilder.service.ShoeService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ShoeModulePortletKeys.SHOEMODULE,
				"mvc.command.name=createShoe"
		},
		service = MVCActionCommand.class
)

public class CreateShoeActionMvcCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		System.out.println("Shoe created!");
		
		String shoeModel = ParamUtil.get(actionRequest, "shoeModel", "");
		String gender = ParamUtil.get(actionRequest, "gender", "Men");
		double size = ParamUtil.get(actionRequest, "size", 0);
		String brandId = ParamUtil.get(actionRequest, "brandId", "");
		String typeId = ParamUtil.get(actionRequest, "typeId", "");
		double price = ParamUtil.get(actionRequest, "price", 0);
		
		_shoeService.addShoe(brandId, typeId, shoeModel, gender, size, price);
	}
	
	private ShoeService _shoeService;
	
	@Reference(unbind = "-")
	protected void setShoeService(ShoeService shoeService) {
		_shoeService = shoeService;
	}
}