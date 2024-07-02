/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service.persistence;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BrandPK implements Comparable<BrandPK>, Serializable {

	public String brandId;
	public String name;

	public BrandPK() {
	}

	public BrandPK(String brandId, String name) {
		this.brandId = brandId;
		this.name = name;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(BrandPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = brandId.compareTo(pk.brandId);

		if (value != 0) {
			return value;
		}

		value = name.compareTo(pk.name);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BrandPK)) {
			return false;
		}

		BrandPK pk = (BrandPK)object;

		if (brandId.equals(pk.brandId) && name.equals(pk.name)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, brandId);
		hashCode = HashUtil.hash(hashCode, name);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("brandId=");

		sb.append(brandId);
		sb.append(", name=");

		sb.append(name);

		sb.append("}");

		return sb.toString();
	}

}