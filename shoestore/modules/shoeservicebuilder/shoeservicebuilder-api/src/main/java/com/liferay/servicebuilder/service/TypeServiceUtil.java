/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.servicebuilder.model.Type;

import java.util.List;

/**
 * Provides the remote service utility for Type. This utility wraps
 * <code>com.liferay.servicebuilder.service.impl.TypeServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see TypeService
 * @generated
 */
public class TypeServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.servicebuilder.service.impl.TypeServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Type addType(String name) {
		return getService().addType(name);
	}

	public static Type deleteType(String typeId) throws PortalException {
		return getService().deleteType(typeId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Type getTypeById(String typeId) throws PortalException {
		return getService().getTypeById(typeId);
	}

	public static List<Type> getTypes(int startIndex, int lastIndex) {
		return getService().getTypes(startIndex, lastIndex);
	}

	public static int getTypesCount() {
		return getService().getTypesCount();
	}

	public static Type updateType(Type type) {
		return getService().updateType(type);
	}

	public static TypeService getService() {
		return _service;
	}

	public static void setService(TypeService service) {
		_service = service;
	}

	private static volatile TypeService _service;

}