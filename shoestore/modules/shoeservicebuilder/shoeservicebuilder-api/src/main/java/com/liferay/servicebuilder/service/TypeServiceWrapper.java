/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TypeService}.
 *
 * @author Brian Wing Shun Chan
 * @see TypeService
 * @generated
 */
public class TypeServiceWrapper
	implements ServiceWrapper<TypeService>, TypeService {

	public TypeServiceWrapper() {
		this(null);
	}

	public TypeServiceWrapper(TypeService typeService) {
		_typeService = typeService;
	}

	@Override
	public com.liferay.servicebuilder.model.Type addType(String name) {
		return _typeService.addType(name);
	}

	@Override
	public com.liferay.servicebuilder.model.Type deleteType(String typeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _typeService.deleteType(typeId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _typeService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.servicebuilder.model.Type getTypeById(String typeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _typeService.getTypeById(typeId);
	}

	@Override
	public java.util.List<com.liferay.servicebuilder.model.Type> getTypes(
		int startIndex, int lastIndex) {

		return _typeService.getTypes(startIndex, lastIndex);
	}

	@Override
	public int getTypesCount() {
		return _typeService.getTypesCount();
	}

	@Override
	public com.liferay.servicebuilder.model.Type updateType(
		com.liferay.servicebuilder.model.Type type) {

		return _typeService.updateType(type);
	}

	@Override
	public TypeService getWrappedService() {
		return _typeService;
	}

	@Override
	public void setWrappedService(TypeService typeService) {
		_typeService = typeService;
	}

	private TypeService _typeService;

}