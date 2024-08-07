/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Brand service. Represents a row in the &quot;ShoeServiceBuilder_Brand&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.servicebuilder.model.impl.BrandModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.servicebuilder.model.impl.BrandImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Brand
 * @generated
 */
@ProviderType
public interface BrandModel extends BaseModel<Brand> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a brand model instance should use the {@link Brand} interface instead.
	 */

	/**
	 * Returns the primary key of this brand.
	 *
	 * @return the primary key of this brand
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this brand.
	 *
	 * @param primaryKey the primary key of this brand
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the brand ID of this brand.
	 *
	 * @return the brand ID of this brand
	 */
	@AutoEscape
	public String getBrandId();

	/**
	 * Sets the brand ID of this brand.
	 *
	 * @param brandId the brand ID of this brand
	 */
	public void setBrandId(String brandId);

	/**
	 * Returns the name of this brand.
	 *
	 * @return the name of this brand
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this brand.
	 *
	 * @param name the name of this brand
	 */
	public void setName(String name);

	@Override
	public Brand cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}