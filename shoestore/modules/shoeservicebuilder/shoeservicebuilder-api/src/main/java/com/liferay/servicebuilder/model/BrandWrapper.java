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
 * This class is a wrapper for {@link Brand}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Brand
 * @generated
 */
public class BrandWrapper
	extends BaseModelWrapper<Brand> implements Brand, ModelWrapper<Brand> {

	public BrandWrapper(Brand brand) {
		super(brand);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("brandId", getBrandId());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String brandId = (String)attributes.get("brandId");

		if (brandId != null) {
			setBrandId(brandId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@Override
	public Brand cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the brand ID of this brand.
	 *
	 * @return the brand ID of this brand
	 */
	@Override
	public String getBrandId() {
		return model.getBrandId();
	}

	/**
	 * Returns the name of this brand.
	 *
	 * @return the name of this brand
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this brand.
	 *
	 * @return the primary key of this brand
	 */
	@Override
	public String getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the brand ID of this brand.
	 *
	 * @param brandId the brand ID of this brand
	 */
	@Override
	public void setBrandId(String brandId) {
		model.setBrandId(brandId);
	}

	/**
	 * Sets the name of this brand.
	 *
	 * @param name the name of this brand
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this brand.
	 *
	 * @param primaryKey the primary key of this brand
	 */
	@Override
	public void setPrimaryKey(String primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected BrandWrapper wrap(Brand brand) {
		return new BrandWrapper(brand);
	}

}