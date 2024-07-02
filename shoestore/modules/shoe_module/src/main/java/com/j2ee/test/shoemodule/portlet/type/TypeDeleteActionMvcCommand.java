package com.j2ee.test.shoemodule.portlet.type;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.servicebuilder.service.TypeService;
import com.liferay.servicebuilder.service.ShoeService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ShoeModulePortletKeys.TYPEPORTLET,
				"mvc.command.name=TypeDelete"
		},
		service = MVCActionCommand.class
)

public class TypeDeleteActionMvcCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		System.out.println("Type deleted!");
		
		String typeId = ParamUtil.get(actionRequest, "typeId", "");
		
		try {		
			_typeService.deleteType(typeId);
			_shoeService.deleteShoesByTypeId(typeId);
		} catch (PortalException e) {
			e.printStackTrace();
		}
	}
	
	private TypeService _typeService;
	private ShoeService _shoeService;
	
	@Reference(unbind = "-")
	protected void setBrandService(TypeService typeService) {
		_typeService = typeService;
	}
	
	@Reference(unbind = "-")
	protected void setShoeService(ShoeService shoeService) {
		_shoeService = shoeService;
	}
}