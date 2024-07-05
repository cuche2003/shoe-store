/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.servicebuilder.model.Brand;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Brand in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BrandCacheModel implements CacheModel<Brand>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BrandCacheModel)) {
			return false;
		}

		BrandCacheModel brandCacheModel = (BrandCacheModel)object;

		if (brandId.equals(brandCacheModel.brandId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, brandId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{brandId=");
		sb.append(brandId);
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Brand toEntityModel() {
		BrandImpl brandImpl = new BrandImpl();

		if (brandId == null) {
			brandImpl.setBrandId("");
		}
		else {
			brandImpl.setBrandId(brandId);
		}

		if (name == null) {
			brandImpl.setName("");
		}
		else {
			brandImpl.setName(name);
		}

		brandImpl.resetOriginalValues();

		return brandImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		brandId = objectInput.readUTF();
		name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (brandId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(brandId);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}
	}

	public String brandId;
	public String name;

}