/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.servicebuilder.model.Brand;
import com.liferay.servicebuilder.service.base.BrandServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=shoeservicebuilder",
		"json.web.service.context.path=Brand"
	},
	service = AopService.class
)
public class BrandServiceImpl extends BrandServiceBaseImpl {
	public Brand addBrand(String name) {
		return brandLocalService.addBrand(name);
	}
	
	public Brand getBrandById(String brandId) throws PortalException {
		return brandLocalService.getBrand(brandId);
	}
	
	public Brand updateBrand(Brand brand) {
		return brandLocalService.updateBrand(brand);
	}
	
	public Brand deleteBrand(String brandId) throws PortalException {
		return brandLocalService.deleteBrand(brandId);
	}
	
	public List<Brand> getBrands(int startIndex, int lastIndex) {
		List<Brand> brands = new ArrayList<Brand>();
		brands = brandLocalService.getBrands(startIndex, lastIndex);
		return brands;
	}
	
	public int getBrandsCount() {
		return brandLocalService.getBrandsCount();
	}
}