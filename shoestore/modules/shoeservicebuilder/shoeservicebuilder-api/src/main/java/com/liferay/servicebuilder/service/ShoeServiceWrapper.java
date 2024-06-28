/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ShoeService}.
 *
 * @author Brian Wing Shun Chan
 * @see ShoeService
 * @generated
 */
public class ShoeServiceWrapper
	implements ServiceWrapper<ShoeService>, ShoeService {

	public ShoeServiceWrapper() {
		this(null);
	}

	public ShoeServiceWrapper(ShoeService shoeService) {
		_shoeService = shoeService;
	}

	@Override
	public com.liferay.servicebuilder.model.Shoe addShoe(
		String brandId, String typeId, String shoeModel, String gender,
		double size, double price) {

		return _shoeService.addShoe(
			brandId, typeId, shoeModel, gender, size, price);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _shoeService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.servicebuilder.model.Shoe getShoeById(String shoeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _shoeService.getShoeById(shoeId);
	}

	@Override
	public java.util.List<com.liferay.servicebuilder.model.Shoe> getShoes(
		int startIndex, int lastIndex) {

		return _shoeService.getShoes(startIndex, lastIndex);
	}

	@Override
	public int getShoesCount() {
		return _shoeService.getShoesCount();
	}

	@Override
	public ShoeService getWrappedService() {
		return _shoeService;
	}

	@Override
	public void setWrappedService(ShoeService shoeService) {
		_shoeService = shoeService;
	}

	private ShoeService _shoeService;

}