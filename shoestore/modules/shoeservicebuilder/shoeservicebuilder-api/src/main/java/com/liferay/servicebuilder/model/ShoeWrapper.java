/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Shoe}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Shoe
 * @generated
 */
public class ShoeWrapper
	extends BaseModelWrapper<Shoe> implements ModelWrapper<Shoe>, Shoe {

	public ShoeWrapper(Shoe shoe) {
		super(shoe);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("shoeId", getShoeId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("shoeModel", getShoeModel());
		attributes.put("gender", getGender());
		attributes.put("size", getSize());
		attributes.put("price", getPrice());
		attributes.put("brandId", getBrandId());
		attributes.put("typeId", getTypeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String shoeId = (String)attributes.get("shoeId");

		if (shoeId != null) {
			setShoeId(shoeId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String shoeModel = (String)attributes.get("shoeModel");

		if (shoeModel != null) {
			setShoeModel(shoeModel);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		Double size = (Double)attributes.get("size");

		if (size != null) {
			setSize(size);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		String brandId = (String)attributes.get("brandId");

		if (brandId != null) {
			setBrandId(brandId);
		}

		String typeId = (String)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}
	}

	@Override
	public Shoe cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	@Override
	public Brand getBrand()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getBrand();
	}

	/**
	 * Returns the brand ID of this shoe.
	 *
	 * @return the brand ID of this shoe
	 */
	@Override
	public String getBrandId() {
		return model.getBrandId();
	}

	/**
	 * Returns the create date of this shoe.
	 *
	 * @return the create date of this shoe
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the gender of this shoe.
	 *
	 * @return the gender of this shoe
	 */
	@Override
	public String getGender() {
		return model.getGender();
	}

	/**
	 * Returns the modified date of this shoe.
	 *
	 * @return the modified date of this shoe
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the price of this shoe.
	 *
	 * @return the price of this shoe
	 */
	@Override
	public double getPrice() {
		return model.getPrice();
	}

	/**
	 * Returns the primary key of this shoe.
	 *
	 * @return the primary key of this shoe
	 */
	@Override
	public String getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the shoe ID of this shoe.
	 *
	 * @return the shoe ID of this shoe
	 */
	@Override
	public String getShoeId() {
		return model.getShoeId();
	}

	/**
	 * Returns the shoe model of this shoe.
	 *
	 * @return the shoe model of this shoe
	 */
	@Override
	public String getShoeModel() {
		return model.getShoeModel();
	}

	/**
	 * Returns the size of this shoe.
	 *
	 * @return the size of this shoe
	 */
	@Override
	public double getSize() {
		return model.getSize();
	}

	@Override
	public Type getType()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getType();
	}

	/**
	 * Returns the type ID of this shoe.
	 *
	 * @return the type ID of this shoe
	 */
	@Override
	public String getTypeId() {
		return model.getTypeId();
	}

	/**
	 * Returns the uuid of this shoe.
	 *
	 * @return the uuid of this shoe
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the brand ID of this shoe.
	 *
	 * @param brandId the brand ID of this shoe
	 */
	@Override
	public void setBrandId(String brandId) {
		model.setBrandId(brandId);
	}

	/**
	 * Sets the create date of this shoe.
	 *
	 * @param createDate the create date of this shoe
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the gender of this shoe.
	 *
	 * @param gender the gender of this shoe
	 */
	@Override
	public void setGender(String gender) {
		model.setGender(gender);
	}

	/**
	 * Sets the modified date of this shoe.
	 *
	 * @param modifiedDate the modified date of this shoe
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the price of this shoe.
	 *
	 * @param price the price of this shoe
	 */
	@Override
	public void setPrice(double price) {
		model.setPrice(price);
	}

	/**
	 * Sets the primary key of this shoe.
	 *
	 * @param primaryKey the primary key of this shoe
	 */
	@Override
	public void setPrimaryKey(String primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the shoe ID of this shoe.
	 *
	 * @param shoeId the shoe ID of this shoe
	 */
	@Override
	public void setShoeId(String shoeId) {
		model.setShoeId(shoeId);
	}

	/**
	 * Sets the shoe model of this shoe.
	 *
	 * @param shoeModel the shoe model of this shoe
	 */
	@Override
	public void setShoeModel(String shoeModel) {
		model.setShoeModel(shoeModel);
	}

	/**
	 * Sets the size of this shoe.
	 *
	 * @param size the size of this shoe
	 */
	@Override
	public void setSize(double size) {
		model.setSize(size);
	}

	/**
	 * Sets the type ID of this shoe.
	 *
	 * @param typeId the type ID of this shoe
	 */
	@Override
	public void setTypeId(String typeId) {
		model.setTypeId(typeId);
	}

	/**
	 * Sets the uuid of this shoe.
	 *
	 * @param uuid the uuid of this shoe
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected ShoeWrapper wrap(Shoe shoe) {
		return new ShoeWrapper(shoe);
	}

}