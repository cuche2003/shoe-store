package com.j2ee.test.shoemodule.portlet;

import com.j2ee.test.shoemodule.constants.ShoeModulePortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.servicebuilder.service.ShoeService;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ShoeModulePortletKeys.SHOEMODULE,
				"mvc.command.name=/create/edit"
		}
)

public class CreateEditRenderMvcCommand implements MVCRenderCommand {
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		String shoeId = ParamUtil.getString(renderRequest, "shoeId", "");
		
		if (!shoeId.isEmpty()) {
			try {
				renderRequest.setAttribute("shoe", _shoeService.getShoeById(shoeId));
			} catch (PortalException e) {
				e.printStackTrace();
			}
		}
		
		return "/edit.jsp";
	}
	
	private ShoeService _shoeService;
	
	@Reference(unbind = "-")
	protected void setShoeService(ShoeService shoeService) {
		_shoeService = shoeService;
	}
}
