package com.j2ee.test.shoemodule.portlet.type;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ShoeModulePortletKeys.TYPEPORTLET,
				"mvc.command.name=/type/create"
		}
)

public class TypeCreateRenderMvcCommand implements MVCRenderCommand {
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		return "/type/create.jsp";
	}
}
