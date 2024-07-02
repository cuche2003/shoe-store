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
public class TypePK implements Comparable<TypePK>, Serializable {

	public String typeId;
	public String name;

	public TypePK() {
	}

	public TypePK(String typeId, String name) {
		this.typeId = typeId;
		this.name = name;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(TypePK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = typeId.compareTo(pk.typeId);

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

		if (!(object instanceof TypePK)) {
			return false;
		}

		TypePK pk = (TypePK)object;

		if (typeId.equals(pk.typeId) && name.equals(pk.name)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, typeId);
		hashCode = HashUtil.hash(hashCode, name);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("typeId=");

		sb.append(typeId);
		sb.append(", name=");

		sb.append(name);

		sb.append("}");

		return sb.toString();
	}

}