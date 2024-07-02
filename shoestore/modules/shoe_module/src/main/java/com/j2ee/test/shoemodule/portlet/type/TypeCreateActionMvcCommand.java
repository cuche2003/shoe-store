package com.j2ee.test.shoemodule.portlet.type;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.servicebuilder.service.TypeService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ShoeModulePortletKeys.TYPEPORTLET,
				"mvc.command.name=TypeCreate"
		},
		service = MVCActionCommand.class
)

public class TypeCreateActionMvcCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {		
		String name = ParamUtil.get(actionRequest, "name", "");
		_typeService.addType(name);
	}
	
	private TypeService _typeService;
	
	@Reference(unbind = "-")
	protected void setTypeService(TypeService typeService) {
		_typeService = typeService;
	}
}