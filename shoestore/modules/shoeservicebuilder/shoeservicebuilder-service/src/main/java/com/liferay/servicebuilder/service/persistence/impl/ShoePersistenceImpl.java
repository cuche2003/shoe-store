/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.servicebuilder.exception.NoSuchShoeException;
import com.liferay.servicebuilder.model.Shoe;
import com.liferay.servicebuilder.model.ShoeTable;
import com.liferay.servicebuilder.model.impl.ShoeImpl;
import com.liferay.servicebuilder.model.impl.ShoeModelImpl;
import com.liferay.servicebuilder.service.persistence.ShoePersistence;
import com.liferay.servicebuilder.service.persistence.ShoeUtil;
import com.liferay.servicebuilder.service.persistence.impl.constants.ShoeServiceBuilderPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the shoe service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ShoePersistence.class)
public class ShoePersistenceImpl
	extends BasePersistenceImpl<Shoe> implements ShoePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ShoeUtil</code> to access the shoe persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ShoeImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the shoes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching shoes
	 */
	@Override
	public List<Shoe> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Shoe> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Shoe> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Shoe> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Shoe> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Shoe> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Shoe> list = null;

		if (useFinderCache) {
			list = (List<Shoe>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Shoe shoe : list) {
					if (!uuid.equals(shoe.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_SHOE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ShoeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Shoe>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first shoe in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shoe
	 * @throws NoSuchShoeException if a matching shoe could not be found
	 */
	@Override
	public Shoe findByUuid_First(
			String uuid, OrderByComparator<Shoe> orderByComparator)
		throws NoSuchShoeException {

		Shoe shoe = fetchByUuid_First(uuid, orderByComparator);

		if (shoe != null) {
			return shoe;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchShoeException(sb.toString());
	}

	/**
	 * Returns the first shoe in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shoe, or <code>null</code> if a matching shoe could not be found
	 */
	@Override
	public Shoe fetchByUuid_First(
		String uuid, OrderByComparator<Shoe> orderByComparator) {

		List<Shoe> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last shoe in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shoe
	 * @throws NoSuchShoeException if a matching shoe could not be found
	 */
	@Override
	public Shoe findByUuid_Last(
			String uuid, OrderByComparator<Shoe> orderByComparator)
		throws NoSuchShoeException {

		Shoe shoe = fetchByUuid_Last(uuid, orderByComparator);

		if (shoe != null) {
			return shoe;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchShoeException(sb.toString());
	}

	/**
	 * Returns the last shoe in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shoe, or <code>null</code> if a matching shoe could not be found
	 */
	@Override
	public Shoe fetchByUuid_Last(
		String uuid, OrderByComparator<Shoe> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Shoe> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Shoe[] findByUuid_PrevAndNext(
			String shoeId, String uuid,
			OrderByComparator<Shoe> orderByComparator)
		throws NoSuchShoeException {

		uuid = Objects.toString(uuid, "");

		Shoe shoe = findByPrimaryKey(shoeId);

		Session session = null;

		try {
			session = openSession();

			Shoe[] array = new ShoeImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, shoe, uuid, orderByComparator, true);

			array[1] = shoe;

			array[2] = getByUuid_PrevAndNext(
				session, shoe, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Shoe getByUuid_PrevAndNext(
		Session session, Shoe shoe, String uuid,
		OrderByComparator<Shoe> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SHOE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ShoeModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(shoe)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Shoe> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the shoes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Shoe shoe :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(shoe);
		}
	}

	/**
	 * Returns the number of shoes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching shoes
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SHOE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "shoe.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(shoe.uuid IS NULL OR shoe.uuid = '')";

	public ShoePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("size", "size_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Shoe.class);

		setModelImplClass(ShoeImpl.class);
		setModelPKClass(String.class);

		setTable(ShoeTable.INSTANCE);
	}

	/**
	 * Caches the shoe in the entity cache if it is enabled.
	 *
	 * @param shoe the shoe
	 */
	@Override
	public void cacheResult(Shoe shoe) {
		entityCache.putResult(ShoeImpl.class, shoe.getPrimaryKey(), shoe);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the shoes in the entity cache if it is enabled.
	 *
	 * @param shoes the shoes
	 */
	@Override
	public void cacheResult(List<Shoe> shoes) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (shoes.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Shoe shoe : shoes) {
			if (entityCache.getResult(ShoeImpl.class, shoe.getPrimaryKey()) ==
					null) {

				cacheResult(shoe);
			}
		}
	}

	/**
	 * Clears the cache for all shoes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ShoeImpl.class);

		finderCache.clearCache(ShoeImpl.class);
	}

	/**
	 * Clears the cache for the shoe.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Shoe shoe) {
		entityCache.removeResult(ShoeImpl.class, shoe);
	}

	@Override
	public void clearCache(List<Shoe> shoes) {
		for (Shoe shoe : shoes) {
			entityCache.removeResult(ShoeImpl.class, shoe);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ShoeImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ShoeImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new shoe with the primary key. Does not add the shoe to the database.
	 *
	 * @param shoeId the primary key for the new shoe
	 * @return the new shoe
	 */
	@Override
	public Shoe create(String shoeId) {
		Shoe shoe = new ShoeImpl();

		shoe.setNew(true);
		shoe.setPrimaryKey(shoeId);

		String uuid = PortalUUIDUtil.generate();

		shoe.setUuid(uuid);

		return shoe;
	}

	/**
	 * Removes the shoe with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param shoeId the primary key of the shoe
	 * @return the shoe that was removed
	 * @throws NoSuchShoeException if a shoe with the primary key could not be found
	 */
	@Override
	public Shoe remove(String shoeId) throws NoSuchShoeException {
		return remove((Serializable)shoeId);
	}

	/**
	 * Removes the shoe with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the shoe
	 * @return the shoe that was removed
	 * @throws NoSuchShoeException if a shoe with the primary key could not be found
	 */
	@Override
	public Shoe remove(Serializable primaryKey) throws NoSuchShoeException {
		Session session = null;

		try {
			session = openSession();

			Shoe shoe = (Shoe)session.get(ShoeImpl.class, primaryKey);

			if (shoe == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchShoeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(shoe);
		}
		catch (NoSuchShoeException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Shoe removeImpl(Shoe shoe) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(shoe)) {
				shoe = (Shoe)session.get(
					ShoeImpl.class, shoe.getPrimaryKeyObj());
			}

			if (shoe != null) {
				session.delete(shoe);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (shoe != null) {
			clearCache(shoe);
		}

		return shoe;
	}

	@Override
	public Shoe updateImpl(Shoe shoe) {
		boolean isNew = shoe.isNew();

		if (!(shoe instanceof ShoeModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(shoe.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(shoe);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in shoe proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Shoe implementation " +
					shoe.getClass());
		}

		ShoeModelImpl shoeModelImpl = (ShoeModelImpl)shoe;

		if (Validator.isNull(shoe.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			shoe.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (shoe.getCreateDate() == null)) {
			if (serviceContext == null) {
				shoe.setCreateDate(date);
			}
			else {
				shoe.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!shoeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				shoe.setModifiedDate(date);
			}
			else {
				shoe.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(shoe);
			}
			else {
				shoe = (Shoe)session.merge(shoe);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(ShoeImpl.class, shoeModelImpl, false, true);

		if (isNew) {
			shoe.setNew(false);
		}

		shoe.resetOriginalValues();

		return shoe;
	}

	/**
	 * Returns the shoe with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the shoe
	 * @return the shoe
	 * @throws NoSuchShoeException if a shoe with the primary key could not be found
	 */
	@Override
	public Shoe findByPrimaryKey(Serializable primaryKey)
		throws NoSuchShoeException {

		Shoe shoe = fetchByPrimaryKey(primaryKey);

		if (shoe == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchShoeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return shoe;
	}

	/**
	 * Returns the shoe with the primary key or throws a <code>NoSuchShoeException</code> if it could not be found.
	 *
	 * @param shoeId the primary key of the shoe
	 * @return the shoe
	 * @throws NoSuchShoeException if a shoe with the primary key could not be found
	 */
	@Override
	public Shoe findByPrimaryKey(String shoeId) throws NoSuchShoeException {
		return findByPrimaryKey((Serializable)shoeId);
	}

	/**
	 * Returns the shoe with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param shoeId the primary key of the shoe
	 * @return the shoe, or <code>null</code> if a shoe with the primary key could not be found
	 */
	@Override
	public Shoe fetchByPrimaryKey(String shoeId) {
		return fetchByPrimaryKey((Serializable)shoeId);
	}

	/**
	 * Returns all the shoes.
	 *
	 * @return the shoes
	 */
	@Override
	public List<Shoe> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Shoe> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Shoe> findAll(
		int start, int end, OrderByComparator<Shoe> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Shoe> findAll(
		int start, int end, OrderByComparator<Shoe> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Shoe> list = null;

		if (useFinderCache) {
			list = (List<Shoe>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SHOE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SHOE;

				sql = sql.concat(ShoeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Shoe>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the shoes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Shoe shoe : findAll()) {
			remove(shoe);
		}
	}

	/**
	 * Returns the number of shoes.
	 *
	 * @return the number of shoes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SHOE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "shoeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SHOE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ShoeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the shoe persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		ShoeUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ShoeUtil.setPersistence(null);

		entityCache.removeCache(ShoeImpl.class.getName());
	}

	@Override
	@Reference(
		target = ShoeServiceBuilderPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = ShoeServiceBuilderPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = ShoeServiceBuilderPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SHOE = "SELECT shoe FROM Shoe shoe";

	private static final String _SQL_SELECT_SHOE_WHERE =
		"SELECT shoe FROM Shoe shoe WHERE ";

	private static final String _SQL_COUNT_SHOE =
		"SELECT COUNT(shoe) FROM Shoe shoe";

	private static final String _SQL_COUNT_SHOE_WHERE =
		"SELECT COUNT(shoe) FROM Shoe shoe WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "shoe.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Shoe exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Shoe exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ShoePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "size"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}