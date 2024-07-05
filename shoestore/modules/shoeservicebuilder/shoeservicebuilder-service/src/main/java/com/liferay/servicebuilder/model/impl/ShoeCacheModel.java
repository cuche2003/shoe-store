/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.servicebuilder.model.Shoe;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Shoe in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ShoeCacheModel implements CacheModel<Shoe>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ShoeCacheModel)) {
			return false;
		}

		ShoeCacheModel shoeCacheModel = (ShoeCacheModel)object;

		if (shoeId.equals(shoeCacheModel.shoeId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, shoeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{shoeId=");
		sb.append(shoeId);
		sb.append(", shoeModel=");
		sb.append(shoeModel);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", size=");
		sb.append(size);
		sb.append(", price=");
		sb.append(price);
		sb.append(", brandId=");
		sb.append(brandId);
		sb.append(", typeId=");
		sb.append(typeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Shoe toEntityModel() {
		ShoeImpl shoeImpl = new ShoeImpl();

		if (shoeId == null) {
			shoeImpl.setShoeId("");
		}
		else {
			shoeImpl.setShoeId(shoeId);
		}

		if (shoeModel == null) {
			shoeImpl.setShoeModel("");
		}
		else {
			shoeImpl.setShoeModel(shoeModel);
		}

		if (gender == null) {
			shoeImpl.setGender("");
		}
		else {
			shoeImpl.setGender(gender);
		}

		shoeImpl.setSize(size);
		shoeImpl.setPrice(price);

		if (brandId == null) {
			shoeImpl.setBrandId("");
		}
		else {
			shoeImpl.setBrandId(brandId);
		}

		if (typeId == null) {
			shoeImpl.setTypeId("");
		}
		else {
			shoeImpl.setTypeId(typeId);
		}

		shoeImpl.resetOriginalValues();

		return shoeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		shoeId = objectInput.readUTF();
		shoeModel = objectInput.readUTF();
		gender = objectInput.readUTF();

		size = objectInput.readDouble();

		price = objectInput.readDouble();
		brandId = objectInput.readUTF();
		typeId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (shoeId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shoeId);
		}

		if (shoeModel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shoeModel);
		}

		if (gender == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gender);
		}

		objectOutput.writeDouble(size);

		objectOutput.writeDouble(price);

		if (brandId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(brandId);
		}

		if (typeId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeId);
		}
	}

	public String shoeId;
	public String shoeModel;
	public String gender;
	public double size;
	public double price;
	public String brandId;
	public String typeId;

}