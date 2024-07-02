package com.j2ee.test.shoemodule.portlet.type;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.servicebuilder.service.TypeService;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ShoeModulePortletKeys.TYPEPORTLET,
				"mvc.command.name=/type/update"
		}
)

public class TypeUpdateRenderMvcCommand implements MVCRenderCommand {
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		String typeId = ParamUtil.getString(renderRequest, "typeId", "");
		
		if (!typeId.isEmpty()) {
			try {
				renderRequest.setAttribute("type", _typeService.getTypeById(typeId));
			} catch (PortalException e) {
				e.printStackTrace();
			}
		}
		
		return "/type/update.jsp";
	}
	
	private TypeService _typeService;
	
	@Reference(unbind = "-")
	protected void setTypeService(TypeService typeService) {
		_typeService = typeService;
	}
}
