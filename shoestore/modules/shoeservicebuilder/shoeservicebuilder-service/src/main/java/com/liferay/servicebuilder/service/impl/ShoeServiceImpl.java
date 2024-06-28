/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.servicebuilder.model.Shoe;
import com.liferay.servicebuilder.service.base.ShoeServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=shoeservicebuilder",
		"json.web.service.context.path=Shoe"
	},
	service = AopService.class
)
public class ShoeServiceImpl extends ShoeServiceBaseImpl {
	public Shoe addShoe(String brandId, String typeId, String shoeModel, String gender, double size, double price) {
		return shoeLocalService.addShoe(brandId, typeId, shoeModel, gender, size, price);
	}
	
	public Shoe updateShoe(Shoe shoe) {
		return shoeLocalService.updateShoe(shoe);
	}
	
	public Shoe getShoeById(String shoeId) throws PortalException {
		return shoeLocalService.getShoe(shoeId);
	}
	
	public List<Shoe> getShoes(int startIndex, int lastIndex) {
		List<Shoe> shoes = new ArrayList<Shoe>();
		shoes = shoeLocalService.getShoes(startIndex, lastIndex);
		return shoes;
	}
	
	public int getShoesCount() {
		return shoeLocalService.getShoesCount();
	}
}