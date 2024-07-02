/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.servicebuilder.model.Brand;
import com.liferay.servicebuilder.model.Type;
import com.liferay.servicebuilder.model.impl.BrandImpl;
import com.liferay.servicebuilder.model.impl.TypeImpl;
import com.liferay.servicebuilder.service.base.TypeLocalServiceBaseImpl;

import java.util.UUID;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.servicebuilder.model.Type",
	service = AopService.class
)
public class TypeLocalServiceImpl extends TypeLocalServiceBaseImpl {
	public Type addType(String name) {
		Type type = new TypeImpl();
		
		type.setName(name);
		
		String typeId = UUID.randomUUID().toString();
		type.setTypeId(typeId);
		
		typeLocalService.addType(type);
		
		return type;
	}
}