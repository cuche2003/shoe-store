/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.servicebuilder.model.Shoe;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for Shoe. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ShoeServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface ShoeService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.liferay.servicebuilder.service.impl.ShoeServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the shoe remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link ShoeServiceUtil} if injection and service tracking are not available.
	 */
	public Shoe addShoe(
		String brandId, String typeId, String shoeModel, String gender,
		double size, double price);

	public Shoe deleteShoe(String shoeId) throws PortalException;

	public void deleteShoesByBrandId(String brandId);

	public void deleteShoesByTypeId(String typeId);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Shoe getShoeById(String shoeId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Shoe> getShoes(int startIndex, int lastIndex);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getShoesCount();

	public Shoe updateShoe(Shoe shoe);

}