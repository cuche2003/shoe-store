/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.servicebuilder.model.Brand;
import com.liferay.servicebuilder.model.Type;
import com.liferay.servicebuilder.service.base.TypeServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=shoeservicebuilder",
		"json.web.service.context.path=Type"
	},
	service = AopService.class
)
public class TypeServiceImpl extends TypeServiceBaseImpl {
	public Type addType(String name) {
		return typeLocalService.addType(name);
	}

	public Type getTypeById(String typeId) throws PortalException {
		return typeLocalService.getType(typeId);
	}
	
	public Type updateType(Type type) {
		return typeLocalService.updateType(type);
	}
	
	public Type deleteType(String typeId) throws PortalException {
		return typeLocalService.deleteType(typeId);
	}
	
	public List<Type> getTypes(int startIndex, int lastIndex) {
		List<Type> types = new ArrayList<Type>();
		types = typeLocalService.getTypes(startIndex, lastIndex);
		return types;
	}
	
	public int getTypesCount() {
		return typeLocalService.getTypesCount();
	}
}