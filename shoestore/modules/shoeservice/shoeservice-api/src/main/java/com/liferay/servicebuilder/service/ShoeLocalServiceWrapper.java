/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ShoeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ShoeLocalService
 * @generated
 */
public class ShoeLocalServiceWrapper
	implements ServiceWrapper<ShoeLocalService>, ShoeLocalService {

	public ShoeLocalServiceWrapper() {
		this(null);
	}

	public ShoeLocalServiceWrapper(ShoeLocalService shoeLocalService) {
		_shoeLocalService = shoeLocalService;
	}

	/**
	 * Adds the shoe to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ShoeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param shoe the shoe
	 * @return the shoe that was added
	 */
	@Override
	public com.liferay.servicebuilder.model.Shoe addShoe(
		com.liferay.servicebuilder.model.Shoe shoe) {

		return _shoeLocalService.addShoe(shoe);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _shoeLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new shoe with the primary key. Does not add the shoe to the database.
	 *
	 * @param shoeId the primary key for the new shoe
	 * @return the new shoe
	 */
	@Override
	public com.liferay.servicebuilder.model.Shoe createShoe(String shoeId) {
		return _shoeLocalService.createShoe(shoeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _shoeLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the shoe from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ShoeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param shoe the shoe
	 * @return the shoe that was removed
	 */
	@Override
	public com.liferay.servicebuilder.model.Shoe deleteShoe(
		com.liferay.servicebuilder.model.Shoe shoe) {

		return _shoeLocalService.deleteShoe(shoe);
	}

	/**
	 * Deletes the shoe with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ShoeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param shoeId the primary key of the shoe
	 * @return the shoe that was removed
	 * @throws PortalException if a shoe with the primary key could not be found
	 */
	@Override
	public com.liferay.servicebuilder.model.Shoe deleteShoe(String shoeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _shoeLocalService.deleteShoe(shoeId);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _shoeLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _shoeLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _shoeLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _shoeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.servicebuilder.model.impl.ShoeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _shoeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.servicebuilder.model.impl.ShoeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _shoeLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _shoeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _shoeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.servicebuilder.model.Shoe fetchShoe(String shoeId) {
		return _shoeLocalService.fetchShoe(shoeId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _shoeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _shoeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the shoe with the primary key.
	 *
	 * @param shoeId the primary key of the shoe
	 * @return the shoe
	 * @throws PortalException if a shoe with the primary key could not be found
	 */
	@Override
	public com.liferay.servicebuilder.model.Shoe getShoe(String shoeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _shoeLocalService.getShoe(shoeId);
	}

	/**
	 * Returns a range of all the shoes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.servicebuilder.model.impl.ShoeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shoes
	 * @param end the upper bound of the range of shoes (not inclusive)
	 * @return the range of shoes
	 */
	@Override
	public java.util.List<com.liferay.servicebuilder.model.Shoe> getShoes(
		int start, int end) {

		return _shoeLocalService.getShoes(start, end);
	}

	/**
	 * Returns the number of shoes.
	 *
	 * @return the number of shoes
	 */
	@Override
	public int getShoesCount() {
		return _shoeLocalService.getShoesCount();
	}

	/**
	 * Updates the shoe in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ShoeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param shoe the shoe
	 * @return the shoe that was updated
	 */
	@Override
	public com.liferay.servicebuilder.model.Shoe updateShoe(
		com.liferay.servicebuilder.model.Shoe shoe) {

		return _shoeLocalService.updateShoe(shoe);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _shoeLocalService.getBasePersistence();
	}

	@Override
	public ShoeLocalService getWrappedService() {
		return _shoeLocalService;
	}

	@Override
	public void setWrappedService(ShoeLocalService shoeLocalService) {
		_shoeLocalService = shoeLocalService;
	}

	private ShoeLocalService _shoeLocalService;

}