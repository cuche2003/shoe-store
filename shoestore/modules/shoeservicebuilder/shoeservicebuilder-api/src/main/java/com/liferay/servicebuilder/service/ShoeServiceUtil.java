/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.servicebuilder.model.Shoe;

import java.util.List;

/**
 * Provides the remote service utility for Shoe. This utility wraps
 * <code>com.liferay.servicebuilder.service.impl.ShoeServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ShoeService
 * @generated
 */
public class ShoeServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.servicebuilder.service.impl.ShoeServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Shoe addShoe(
		String brandId, String typeId, String shoeModel, String gender,
		double size, double price) {

		return getService().addShoe(
			brandId, typeId, shoeModel, gender, size, price);
	}

	public static Shoe deleteShoe(String shoeId) throws PortalException {
		return getService().deleteShoe(shoeId);
	}

	public static void deleteShoesByBrandId(String brandId) {
		getService().deleteShoesByBrandId(brandId);
	}

	public static void deleteShoesByTypeId(String typeId) {
		getService().deleteShoesByTypeId(typeId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Shoe getShoeById(String shoeId) throws PortalException {
		return getService().getShoeById(shoeId);
	}

	public static List<Shoe> getShoes(int startIndex, int lastIndex) {
		return getService().getShoes(startIndex, lastIndex);
	}

	public static int getShoesCount() {
		return getService().getShoesCount();
	}

	public static Shoe updateShoe(Shoe shoe) {
		return getService().updateShoe(shoe);
	}

	public static ShoeService getService() {
		return _service;
	}

	public static void setService(ShoeService service) {
		_service = service;
	}

	private static volatile ShoeService _service;

}