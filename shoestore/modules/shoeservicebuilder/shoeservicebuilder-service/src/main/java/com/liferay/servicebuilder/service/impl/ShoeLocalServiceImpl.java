/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service.impl;

import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.aop.AopService;
import com.liferay.servicebuilder.model.Shoe;
import com.liferay.servicebuilder.model.impl.ShoeImpl;
import com.liferay.servicebuilder.service.base.ShoeLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.servicebuilder.model.Shoe",
	service = AopService.class
)
public class ShoeLocalServiceImpl extends ShoeLocalServiceBaseImpl {
	public Shoe addShoe(String brandId, String typeId, String shoeModel, String gender, double size, double price) {
		Shoe shoe = new ShoeImpl();
		
		shoe.setBrandId(brandId);
		shoe.setTypeId(typeId);
		shoe.setShoeModel(shoeModel);
		shoe.setSize(size);
		shoe.setGender(gender);
		shoe.setPrice(price);
		
		String shoeId = UUID.randomUUID().toString();
		shoe.setShoeId(shoeId);
		
		shoeLocalService.addShoe(shoe);
		
		return shoe;
	}
	
	public List<Shoe> getShoesSorted(int start, int end, OrderByComparator<Shoe> obc) {
		return shoePersistence.findAll(start, end, obc);
	}
	
	public void deleteShoesByBrandId(String brandId) {
		shoePersistence.removeByBrandId(brandId);
	}
	
	public void deleteShoesByTypeId(String typeId) {
		shoePersistence.removeByTypeId(typeId);
	}
}