/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.servicebuilder.model.Shoe;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the shoe service. This utility wraps <code>com.liferay.servicebuilder.service.persistence.impl.ShoePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShoePersistence
 * @generated
 */
public class ShoeUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Shoe shoe) {
		getPersistence().clearCache(shoe);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Shoe> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Shoe> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Shoe> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Shoe> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Shoe> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Shoe update(Shoe shoe) {
		return getPersistence().update(shoe);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Shoe update(Shoe shoe, ServiceContext serviceContext) {
		return getPersistence().update(shoe, serviceContext);
	}

	/**
	 * Returns all the shoes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching shoes
	 */
	public static List<Shoe> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the shoes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShoeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of shoes
	 * @param end the upper bound of the range of shoes (not inclusive)
	 * @return the range of matching shoes
	 */
	public static List<Shoe> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the shoes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShoeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of shoes
	 * @param end the upper bound of the range of shoes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching shoes
	 */
	public static List<Shoe> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Shoe> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the shoes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShoeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of shoes
	 * @param end the upper bound of the range of shoes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching shoes
	 */
	public static List<Shoe> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Shoe> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first shoe in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shoe
	 * @throws NoSuchShoeException if a matching shoe could not be found
	 */
	public static Shoe findByUuid_First(
			String uuid, OrderByComparator<Shoe> orderByComparator)
		throws com.liferay.servicebuilder.exception.NoSuchShoeException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first shoe in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shoe, or <code>null</code> if a matching shoe could not be found
	 */
	public static Shoe fetchByUuid_First(
		String uuid, OrderByComparator<Shoe> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last shoe in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shoe
	 * @throws NoSuchShoeException if a matching shoe could not be found
	 */
	public static Shoe findByUuid_Last(
			String uuid, OrderByComparator<Shoe> orderByComparator)
		throws com.liferay.servicebuilder.exception.NoSuchShoeException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last shoe in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shoe, or <code>null</code> if a matching shoe could not be found
	 */
	public static Shoe fetchByUuid_Last(
		String uuid, OrderByComparator<Shoe> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the shoes before and after the current shoe in the ordered set where uuid = &#63;.
	 *
	 * @param shoeId the primary key of the current shoe
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next shoe
	 * @throws NoSuchShoeException if a shoe with the primary key could not be found
	 */
	public static Shoe[] findByUuid_PrevAndNext(
			String shoeId, String uuid,
			OrderByComparator<Shoe> orderByComparator)
		throws com.liferay.servicebuilder.exception.NoSuchShoeException {

		return getPersistence().findByUuid_PrevAndNext(
			shoeId, uuid, orderByComparator);
	}

	/**
	 * Removes all the shoes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of shoes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching shoes
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the shoes where brandId = &#63;.
	 *
	 * @param brandId the brand ID
	 * @return the matching shoes
	 */
	public static List<Shoe> findByBrandId(String brandId) {
		return getPersistence().findByBrandId(brandId);
	}

	/**
	 * Returns a range of all the shoes where brandId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShoeModelImpl</code>.
	 * </p>
	 *
	 * @param brandId the brand ID
	 * @param start the lower bound of the range of shoes
	 * @param end the upper bound of the range of shoes (not inclusive)
	 * @return the range of matching shoes
	 */
	public static List<Shoe> findByBrandId(String brandId, int start, int end) {
		return getPersistence().findByBrandId(brandId, start, end);
	}

	/**
	 * Returns an ordered range of all the shoes where brandId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShoeModelImpl</code>.
	 * </p>
	 *
	 * @param brandId the brand ID
	 * @param start the lower bound of the range of shoes
	 * @param end the upper bound of the range of shoes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching shoes
	 */
	public static List<Shoe> findByBrandId(
		String brandId, int start, int end,
		OrderByComparator<Shoe> orderByComparator) {

		return getPersistence().findByBrandId(
			brandId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the shoes where brandId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShoeModelImpl</code>.
	 * </p>
	 *
	 * @param brandId the brand ID
	 * @param start the lower bound of the range of shoes
	 * @param end the upper bound of the range of shoes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching shoes
	 */
	public static List<Shoe> findByBrandId(
		String brandId, int start, int end,
		OrderByComparator<Shoe> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByBrandId(
			brandId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first shoe in the ordered set where brandId = &#63;.
	 *
	 * @param brandId the brand ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shoe
	 * @throws NoSuchShoeException if a matching shoe could not be found
	 */
	public static Shoe findByBrandId_First(
			String brandId, OrderByComparator<Shoe> orderByComparator)
		throws com.liferay.servicebuilder.exception.NoSuchShoeException {

		return getPersistence().findByBrandId_First(brandId, orderByComparator);
	}

	/**
	 * Returns the first shoe in the ordered set where brandId = &#63;.
	 *
	 * @param brandId the brand ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shoe, or <code>null</code> if a matching shoe could not be found
	 */
	public static Shoe fetchByBrandId_First(
		String brandId, OrderByComparator<Shoe> orderByComparator) {

		return getPersistence().fetchByBrandId_First(
			brandId, orderByComparator);
	}

	/**
	 * Returns the last shoe in the ordered set where brandId = &#63;.
	 *
	 * @param brandId the brand ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shoe
	 * @throws NoSuchShoeException if a matching shoe could not be found
	 */
	public static Shoe findByBrandId_Last(
			String brandId, OrderByComparator<Shoe> orderByComparator)
		throws com.liferay.servicebuilder.exception.NoSuchShoeException {

		return getPersistence().findByBrandId_Last(brandId, orderByComparator);
	}

	/**
	 * Returns the last shoe in the ordered set where brandId = &#63;.
	 *
	 * @param brandId the brand ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shoe, or <code>null</code> if a matching shoe could not be found
	 */
	public static Shoe fetchByBrandId_Last(
		String brandId, OrderByComparator<Shoe> orderByComparator) {

		return getPersistence().fetchByBrandId_Last(brandId, orderByComparator);
	}

	/**
	 * Returns the shoes before and after the current shoe in the ordered set where brandId = &#63;.
	 *
	 * @param shoeId the primary key of the current shoe
	 * @param brandId the brand ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next shoe
	 * @throws NoSuchShoeException if a shoe with the primary key could not be found
	 */
	public static Shoe[] findByBrandId_PrevAndNext(
			String shoeId, String brandId,
			OrderByComparator<Shoe> orderByComparator)
		throws com.liferay.servicebuilder.exception.NoSuchShoeException {

		return getPersistence().findByBrandId_PrevAndNext(
			shoeId, brandId, orderByComparator);
	}

	/**
	 * Removes all the shoes where brandId = &#63; from the database.
	 *
	 * @param brandId the brand ID
	 */
	public static void removeByBrandId(String brandId) {
		getPersistence().removeByBrandId(brandId);
	}

	/**
	 * Returns the number of shoes where brandId = &#63;.
	 *
	 * @param brandId the brand ID
	 * @return the number of matching shoes
	 */
	public static int countByBrandId(String brandId) {
		return getPersistence().countByBrandId(brandId);
	}

	/**
	 * Returns all the shoes where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the matching shoes
	 */
	public static List<Shoe> findByTypeId(String typeId) {
		return getPersistence().findByTypeId(typeId);
	}

	/**
	 * Returns a range of all the shoes where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShoeModelImpl</code>.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of shoes
	 * @param end the upper bound of the range of shoes (not inclusive)
	 * @return the range of matching shoes
	 */
	public static List<Shoe> findByTypeId(String typeId, int start, int end) {
		return getPersistence().findByTypeId(typeId, start, end);
	}

	/**
	 * Returns an ordered range of all the shoes where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShoeModelImpl</code>.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of shoes
	 * @param end the upper bound of the range of shoes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching shoes
	 */
	public static List<Shoe> findByTypeId(
		String typeId, int start, int end,
		OrderByComparator<Shoe> orderByComparator) {

		return getPersistence().findByTypeId(
			typeId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the shoes where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShoeModelImpl</code>.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of shoes
	 * @param end the upper bound of the range of shoes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching shoes
	 */
	public static List<Shoe> findByTypeId(
		String typeId, int start, int end,
		OrderByComparator<Shoe> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByTypeId(
			typeId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first shoe in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shoe
	 * @throws NoSuchShoeException if a matching shoe could not be found
	 */
	public static Shoe findByTypeId_First(
			String typeId, OrderByComparator<Shoe> orderByComparator)
		throws com.liferay.servicebuilder.exception.NoSuchShoeException {

		return getPersistence().findByTypeId_First(typeId, orderByComparator);
	}

	/**
	 * Returns the first shoe in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shoe, or <code>null</code> if a matching shoe could not be found
	 */
	public static Shoe fetchByTypeId_First(
		String typeId, OrderByComparator<Shoe> orderByComparator) {

		return getPersistence().fetchByTypeId_First(typeId, orderByComparator);
	}

	/**
	 * Returns the last shoe in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shoe
	 * @throws NoSuchShoeException if a matching shoe could not be found
	 */
	public static Shoe findByTypeId_Last(
			String typeId, OrderByComparator<Shoe> orderByComparator)
		throws com.liferay.servicebuilder.exception.NoSuchShoeException {

		return getPersistence().findByTypeId_Last(typeId, orderByComparator);
	}

	/**
	 * Returns the last shoe in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shoe, or <code>null</code> if a matching shoe could not be found
	 */
	public static Shoe fetchByTypeId_Last(
		String typeId, OrderByComparator<Shoe> orderByComparator) {

		return getPersistence().fetchByTypeId_Last(typeId, orderByComparator);
	}

	/**
	 * Returns the shoes before and after the current shoe in the ordered set where typeId = &#63;.
	 *
	 * @param shoeId the primary key of the current shoe
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next shoe
	 * @throws NoSuchShoeException if a shoe with the primary key could not be found
	 */
	public static Shoe[] findByTypeId_PrevAndNext(
			String shoeId, String typeId,
			OrderByComparator<Shoe> orderByComparator)
		throws com.liferay.servicebuilder.exception.NoSuchShoeException {

		return getPersistence().findByTypeId_PrevAndNext(
			shoeId, typeId, orderByComparator);
	}

	/**
	 * Removes all the shoes where typeId = &#63; from the database.
	 *
	 * @param typeId the type ID
	 */
	public static void removeByTypeId(String typeId) {
		getPersistence().removeByTypeId(typeId);
	}

	/**
	 * Returns the number of shoes where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the number of matching shoes
	 */
	public static int countByTypeId(String typeId) {
		return getPersistence().countByTypeId(typeId);
	}

	/**
	 * Caches the shoe in the entity cache if it is enabled.
	 *
	 * @param shoe the shoe
	 */
	public static void cacheResult(Shoe shoe) {
		getPersistence().cacheResult(shoe);
	}

	/**
	 * Caches the shoes in the entity cache if it is enabled.
	 *
	 * @param shoes the shoes
	 */
	public static void cacheResult(List<Shoe> shoes) {
		getPersistence().cacheResult(shoes);
	}

	/**
	 * Creates a new shoe with the primary key. Does not add the shoe to the database.
	 *
	 * @param shoeId the primary key for the new shoe
	 * @return the new shoe
	 */
	public static Shoe create(String shoeId) {
		return getPersistence().create(shoeId);
	}

	/**
	 * Removes the shoe with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param shoeId the primary key of the shoe
	 * @return the shoe that was removed
	 * @throws NoSuchShoeException if a shoe with the primary key could not be found
	 */
	public static Shoe remove(String shoeId)
		throws com.liferay.servicebuilder.exception.NoSuchShoeException {

		return getPersistence().remove(shoeId);
	}

	public static Shoe updateImpl(Shoe shoe) {
		return getPersistence().updateImpl(shoe);
	}

	/**
	 * Returns the shoe with the primary key or throws a <code>NoSuchShoeException</code> if it could not be found.
	 *
	 * @param shoeId the primary key of the shoe
	 * @return the shoe
	 * @throws NoSuchShoeException if a shoe with the primary key could not be found
	 */
	public static Shoe findByPrimaryKey(String shoeId)
		throws com.liferay.servicebuilder.exception.NoSuchShoeException {

		return getPersistence().findByPrimaryKey(shoeId);
	}

	/**
	 * Returns the shoe with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param shoeId the primary key of the shoe
	 * @return the shoe, or <code>null</code> if a shoe with the primary key could not be found
	 */
	public static Shoe fetchByPrimaryKey(String shoeId) {
		return getPersistence().fetchByPrimaryKey(shoeId);
	}

	/**
	 * Returns all the shoes.
	 *
	 * @return the shoes
	 */
	public static List<Shoe> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the shoes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShoeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shoes
	 * @param end the upper bound of the range of shoes (not inclusive)
	 * @return the range of shoes
	 */
	public static List<Shoe> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the shoes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShoeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shoes
	 * @param end the upper bound of the range of shoes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of shoes
	 */
	public static List<Shoe> findAll(
		int start, int end, OrderByComparator<Shoe> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the shoes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShoeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shoes
	 * @param end the upper bound of the range of shoes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of shoes
	 */
	public static List<Shoe> findAll(
		int start, int end, OrderByComparator<Shoe> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the shoes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of shoes.
	 *
	 * @return the number of shoes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ShoePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(ShoePersistence persistence) {
		_persistence = persistence;
	}

	private static volatile ShoePersistence _persistence;

}