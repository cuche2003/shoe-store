package com.j2ee.test.shoemodule.portlet.shoe;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
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
				"javax.portlet.name=" + ShoeModulePortletKeys.SHOEPORTLET,
				"mvc.command.name=ShoeDelete"
		},
		service = MVCActionCommand.class
)

public class ShoeDeleteActionMvcCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		System.out.println("Shoe deleted!");
		
		String shoeId = ParamUtil.get(actionRequest, "shoeId", "");
		
		try {		
			_shoeService.deleteShoe(shoeId);
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