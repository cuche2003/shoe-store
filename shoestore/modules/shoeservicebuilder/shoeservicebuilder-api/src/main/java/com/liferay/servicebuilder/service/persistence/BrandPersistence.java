/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.servicebuilder.exception.NoSuchBrandException;
import com.liferay.servicebuilder.model.Brand;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the brand service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BrandUtil
 * @generated
 */
@ProviderType
public interface BrandPersistence extends BasePersistence<Brand> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BrandUtil} to access the brand persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the brand in the entity cache if it is enabled.
	 *
	 * @param brand the brand
	 */
	public void cacheResult(Brand brand);

	/**
	 * Caches the brands in the entity cache if it is enabled.
	 *
	 * @param brands the brands
	 */
	public void cacheResult(java.util.List<Brand> brands);

	/**
	 * Creates a new brand with the primary key. Does not add the brand to the database.
	 *
	 * @param brandId the primary key for the new brand
	 * @return the new brand
	 */
	public Brand create(String brandId);

	/**
	 * Removes the brand with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param brandId the primary key of the brand
	 * @return the brand that was removed
	 * @throws NoSuchBrandException if a brand with the primary key could not be found
	 */
	public Brand remove(String brandId) throws NoSuchBrandException;

	public Brand updateImpl(Brand brand);

	/**
	 * Returns the brand with the primary key or throws a <code>NoSuchBrandException</code> if it could not be found.
	 *
	 * @param brandId the primary key of the brand
	 * @return the brand
	 * @throws NoSuchBrandException if a brand with the primary key could not be found
	 */
	public Brand findByPrimaryKey(String brandId) throws NoSuchBrandException;

	/**
	 * Returns the brand with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param brandId the primary key of the brand
	 * @return the brand, or <code>null</code> if a brand with the primary key could not be found
	 */
	public Brand fetchByPrimaryKey(String brandId);

	/**
	 * Returns all the brands.
	 *
	 * @return the brands
	 */
	public java.util.List<Brand> findAll();

	/**
	 * Returns a range of all the brands.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrandModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of brands
	 * @param end the upper bound of the range of brands (not inclusive)
	 * @return the range of brands
	 */
	public java.util.List<Brand> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the brands.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrandModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of brands
	 * @param end the upper bound of the range of brands (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of brands
	 */
	public java.util.List<Brand> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Brand>
			orderByComparator);

	/**
	 * Returns an ordered range of all the brands.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrandModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of brands
	 * @param end the upper bound of the range of brands (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of brands
	 */
	public java.util.List<Brand> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Brand>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the brands from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of brands.
	 *
	 * @return the number of brands
	 */
	public int countAll();

}