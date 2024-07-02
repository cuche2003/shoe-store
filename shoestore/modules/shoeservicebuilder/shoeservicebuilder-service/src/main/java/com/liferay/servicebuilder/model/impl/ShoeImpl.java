/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.model.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.servicebuilder.model.Brand;
import com.liferay.servicebuilder.model.Type;
import com.liferay.servicebuilder.service.BrandServiceUtil;
import com.liferay.servicebuilder.service.TypeServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class ShoeImpl extends ShoeBaseImpl {
	public Brand getBrand() throws PortalException {
		return BrandServiceUtil.getBrandById(getBrandId());
	}
	public Type getType() throws PortalException {
		return TypeServiceUtil.getTypeById(getTypeId());
	}
}