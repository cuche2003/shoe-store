/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BrandService}.
 *
 * @author Brian Wing Shun Chan
 * @see BrandService
 * @generated
 */
public class BrandServiceWrapper
	implements BrandService, ServiceWrapper<BrandService> {

	public BrandServiceWrapper() {
		this(null);
	}

	public BrandServiceWrapper(BrandService brandService) {
		_brandService = brandService;
	}

	@Override
	public com.liferay.servicebuilder.model.Brand addBrand(String name) {
		return _brandService.addBrand(name);
	}

	@Override
	public com.liferay.servicebuilder.model.Brand deleteBrand(String brandId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _brandService.deleteBrand(brandId);
	}

	@Override
	public com.liferay.servicebuilder.model.Brand getBrandById(String brandId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _brandService.getBrandById(brandId);
	}

	@Override
	public java.util.List<com.liferay.servicebuilder.model.Brand> getBrands(
		int startIndex, int lastIndex) {

		return _brandService.getBrands(startIndex, lastIndex);
	}

	@Override
	public int getBrandsCount() {
		return _brandService.getBrandsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _brandService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.servicebuilder.model.Brand updateBrand(
		com.liferay.servicebuilder.model.Brand brand) {

		return _brandService.updateBrand(brand);
	}

	@Override
	public BrandService getWrappedService() {
		return _brandService;
	}

	@Override
	public void setWrappedService(BrandService brandService) {
		_brandService = brandService;
	}

	private BrandService _brandService;

}