package com.j2ee.test.shoemodule.portlet.type;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.servicebuilder.model.Type;
import com.liferay.servicebuilder.service.TypeService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ShoeModulePortletKeys.TYPEPORTLET,
				"mvc.command.name=TypeUpdate"
		},
		service = MVCActionCommand.class
)

public class TypeUpdateActionMvcCommand extends BaseMVCActionCommand {
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		System.out.println("Type updated!");
		
		String typeId = ParamUtil.get(actionRequest, "typeId", "");
		String name = ParamUtil.get(actionRequest, "name", "");
		
		try {
			Type type = _typeService.getTypeById(typeId);
			type.setName(name);
						
			_typeService.updateType(type);
		} catch (PortalException e) {
			e.printStackTrace();
		}
	}
	
	private TypeService _typeService;
	
	@Reference(unbind = "-")
	protected void setTypeService(TypeService typeService) {
		_typeService = typeService;
	}
}