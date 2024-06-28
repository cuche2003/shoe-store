package com.j2ee.test.shoemodule.portlet;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.servicebuilder.model.Shoe;
import com.liferay.servicebuilder.service.ShoeService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ShoeModulePortletKeys.SHOEMODULE,
				"mvc.command.name=updateShoe"
		},
		service = MVCActionCommand.class
)

public class UpdateShoeActionMvcCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		System.out.println("Shoe updated!");
		
		String shoeId = ParamUtil.get(actionRequest, "shoeId", "");
		String shoeModel = ParamUtil.get(actionRequest, "shoeModel", "");
		String gender = ParamUtil.get(actionRequest, "gender", "Men");
		double size = ParamUtil.getDouble(actionRequest, "size", 0);
		String brandId = ParamUtil.get(actionRequest, "brandId", "");
		String typeId = ParamUtil.get(actionRequest, "typeId", "");
		double price = ParamUtil.getDouble(actionRequest, "price", 0);
		
		try {
			Shoe shoe = _shoeService.getShoeById(shoeId);
			shoe.setShoeModel(shoeModel);
			shoe.setGender(gender);
			shoe.setSize(size);
			shoe.setBrandId(brandId);
			shoe.setTypeId(typeId);
			shoe.setPrice(price);
			
			System.out.println(shoe.toString());
			
			_shoeService.updateShoe(shoe);
		} catch (PortalException e) {
			e.printStackTrace();
		}
	}
	
	private ShoeService _shoeService;
	
	@Reference(unbind = "-")
	protected void setShoeService(ShoeService shoeService) {
		_shoeService = shoeService;
	}
}