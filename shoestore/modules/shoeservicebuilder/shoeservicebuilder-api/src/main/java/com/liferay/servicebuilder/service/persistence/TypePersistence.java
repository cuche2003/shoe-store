/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.servicebuilder.exception.NoSuchTypeException;
import com.liferay.servicebuilder.model.Type;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TypeUtil
 * @generated
 */
@ProviderType
public interface TypePersistence extends BasePersistence<Type> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TypeUtil} to access the type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the type in the entity cache if it is enabled.
	 *
	 * @param type the type
	 */
	public void cacheResult(Type type);

	/**
	 * Caches the types in the entity cache if it is enabled.
	 *
	 * @param types the types
	 */
	public void cacheResult(java.util.List<Type> types);

	/**
	 * Creates a new type with the primary key. Does not add the type to the database.
	 *
	 * @param typeId the primary key for the new type
	 * @return the new type
	 */
	public Type create(String typeId);

	/**
	 * Removes the type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param typeId the primary key of the type
	 * @return the type that was removed
	 * @throws NoSuchTypeException if a type with the primary key could not be found
	 */
	public Type remove(String typeId) throws NoSuchTypeException;

	public Type updateImpl(Type type);

	/**
	 * Returns the type with the primary key or throws a <code>NoSuchTypeException</code> if it could not be found.
	 *
	 * @param typeId the primary key of the type
	 * @return the type
	 * @throws NoSuchTypeException if a type with the primary key could not be found
	 */
	public Type findByPrimaryKey(String typeId) throws NoSuchTypeException;

	/**
	 * Returns the type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param typeId the primary key of the type
	 * @return the type, or <code>null</code> if a type with the primary key could not be found
	 */
	public Type fetchByPrimaryKey(String typeId);

	/**
	 * Returns all the types.
	 *
	 * @return the types
	 */
	public java.util.List<Type> findAll();

	/**
	 * Returns a range of all the types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of types
	 * @param end the upper bound of the range of types (not inclusive)
	 * @return the range of types
	 */
	public java.util.List<Type> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of types
	 * @param end the upper bound of the range of types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of types
	 */
	public java.util.List<Type> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Type>
			orderByComparator);

	/**
	 * Returns an ordered range of all the types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of types
	 * @param end the upper bound of the range of types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of types
	 */
	public java.util.List<Type> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Type>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the types from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of types.
	 *
	 * @return the number of types
	 */
	public int countAll();

}