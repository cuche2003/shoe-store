/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Type}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Type
 * @generated
 */
public class TypeWrapper
	extends BaseModelWrapper<Type> implements ModelWrapper<Type>, Type {

	public TypeWrapper(Type type) {
		super(type);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("typeId", getTypeId());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String typeId = (String)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@Override
	public Type cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the name of this type.
	 *
	 * @return the name of this type
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this type.
	 *
	 * @return the primary key of this type
	 */
	@Override
	public String getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the type ID of this type.
	 *
	 * @return the type ID of this type
	 */
	@Override
	public String getTypeId() {
		return model.getTypeId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the name of this type.
	 *
	 * @param name the name of this type
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this type.
	 *
	 * @param primaryKey the primary key of this type
	 */
	@Override
	public void setPrimaryKey(String primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the type ID of this type.
	 *
	 * @param typeId the type ID of this type
	 */
	@Override
	public void setTypeId(String typeId) {
		model.setTypeId(typeId);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected TypeWrapper wrap(Type type) {
		return new TypeWrapper(type);
	}

}