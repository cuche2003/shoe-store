/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.servicebuilder.exception.NoSuchShoeException;
import com.liferay.servicebuilder.model.Shoe;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the shoe service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShoeUtil
 * @generated
 */
@ProviderType
public interface ShoePersistence extends BasePersistence<Shoe> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ShoeUtil} to access the shoe persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the shoes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching shoes
	 */
	public java.util.List<Shoe> findByUuid(String uuid);

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
	public java.util.List<Shoe> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Shoe> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Shoe>
			orderByComparator);

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
	public java.util.List<Shoe> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Shoe>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first shoe in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shoe
	 * @throws NoSuchShoeException if a matching shoe could not be found
	 */
	public Shoe findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Shoe>
				orderByComparator)
		throws NoSuchShoeException;

	/**
	 * Returns the first shoe in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shoe, or <code>null</code> if a matching shoe could not be found
	 */
	public Shoe fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Shoe>
			orderByComparator);

	/**
	 * Returns the last shoe in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shoe
	 * @throws NoSuchShoeException if a matching shoe could not be found
	 */
	public Shoe findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Shoe>
				orderByComparator)
		throws NoSuchShoeException;

	/**
	 * Returns the last shoe in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shoe, or <code>null</code> if a matching shoe could not be found
	 */
	public Shoe fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Shoe>
			orderByComparator);

	/**
	 * Returns the shoes before and after the current shoe in the ordered set where uuid = &#63;.
	 *
	 * @param shoeId the primary key of the current shoe
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next shoe
	 * @throws NoSuchShoeException if a shoe with the primary key could not be found
	 */
	public Shoe[] findByUuid_PrevAndNext(
			String shoeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Shoe>
				orderByComparator)
		throws NoSuchShoeException;

	/**
	 * Removes all the shoes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of shoes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching shoes
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the shoe in the entity cache if it is enabled.
	 *
	 * @param shoe the shoe
	 */
	public void cacheResult(Shoe shoe);

	/**
	 * Caches the shoes in the entity cache if it is enabled.
	 *
	 * @param shoes the shoes
	 */
	public void cacheResult(java.util.List<Shoe> shoes);

	/**
	 * Creates a new shoe with the primary key. Does not add the shoe to the database.
	 *
	 * @param shoeId the primary key for the new shoe
	 * @return the new shoe
	 */
	public Shoe create(String shoeId);

	/**
	 * Removes the shoe with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param shoeId the primary key of the shoe
	 * @return the shoe that was removed
	 * @throws NoSuchShoeException if a shoe with the primary key could not be found
	 */
	public Shoe remove(String shoeId) throws NoSuchShoeException;

	public Shoe updateImpl(Shoe shoe);

	/**
	 * Returns the shoe with the primary key or throws a <code>NoSuchShoeException</code> if it could not be found.
	 *
	 * @param shoeId the primary key of the shoe
	 * @return the shoe
	 * @throws NoSuchShoeException if a shoe with the primary key could not be found
	 */
	public Shoe findByPrimaryKey(String shoeId) throws NoSuchShoeException;

	/**
	 * Returns the shoe with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param shoeId the primary key of the shoe
	 * @return the shoe, or <code>null</code> if a shoe with the primary key could not be found
	 */
	public Shoe fetchByPrimaryKey(String shoeId);

	/**
	 * Returns all the shoes.
	 *
	 * @return the shoes
	 */
	public java.util.List<Shoe> findAll();

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
	public java.util.List<Shoe> findAll(int start, int end);

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
	public java.util.List<Shoe> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Shoe>
			orderByComparator);

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
	public java.util.List<Shoe> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Shoe>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the shoes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of shoes.
	 *
	 * @return the number of shoes
	 */
	public int countAll();

}