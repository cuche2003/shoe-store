/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.servicebuilder.model.Brand;

import java.util.List;

/**
 * Provides the remote service utility for Brand. This utility wraps
 * <code>com.liferay.servicebuilder.service.impl.BrandServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see BrandService
 * @generated
 */
public class BrandServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.servicebuilder.service.impl.BrandServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Brand addBrand(String name) {
		return getService().addBrand(name);
	}

	public static Brand deleteBrand(String brandId) throws PortalException {
		return getService().deleteBrand(brandId);
	}

	public static Brand getBrandById(String brandId) throws PortalException {
		return getService().getBrandById(brandId);
	}

	public static List<Brand> getBrands(int startIndex, int lastIndex) {
		return getService().getBrands(startIndex, lastIndex);
	}

	public static int getBrandsCount() {
		return getService().getBrandsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Brand updateBrand(Brand brand) {
		return getService().updateBrand(brand);
	}

	public static BrandService getService() {
		return _service;
	}

	public static void setService(BrandService service) {
		_service = service;
	}

	private static volatile BrandService _service;

}