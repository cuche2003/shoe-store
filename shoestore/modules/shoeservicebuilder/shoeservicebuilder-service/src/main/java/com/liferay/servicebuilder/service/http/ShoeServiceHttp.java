/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.servicebuilder.service.ShoeServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>ShoeServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ShoeServiceHttp {

	public static com.liferay.servicebuilder.model.Shoe addShoe(
		HttpPrincipal httpPrincipal, String brandId, String typeId,
		String shoeModel, String gender, double size, double price) {

		try {
			MethodKey methodKey = new MethodKey(
				ShoeServiceUtil.class, "addShoe", _addShoeParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, brandId, typeId, shoeModel, gender, size, price);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.servicebuilder.model.Shoe)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.servicebuilder.model.Shoe updateShoe(
		HttpPrincipal httpPrincipal,
		com.liferay.servicebuilder.model.Shoe shoe) {

		try {
			MethodKey methodKey = new MethodKey(
				ShoeServiceUtil.class, "updateShoe",
				_updateShoeParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey, shoe);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.servicebuilder.model.Shoe)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.servicebuilder.model.Shoe getShoeById(
			HttpPrincipal httpPrincipal, String shoeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ShoeServiceUtil.class, "getShoeById",
				_getShoeByIdParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, shoeId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.servicebuilder.model.Shoe)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.servicebuilder.model.Shoe>
		getShoes(HttpPrincipal httpPrincipal, int startIndex, int lastIndex) {

		try {
			MethodKey methodKey = new MethodKey(
				ShoeServiceUtil.class, "getShoes", _getShoesParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, startIndex, lastIndex);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.servicebuilder.model.Shoe>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int getShoesCount(HttpPrincipal httpPrincipal) {
		try {
			MethodKey methodKey = new MethodKey(
				ShoeServiceUtil.class, "getShoesCount",
				_getShoesCountParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ShoeServiceHttp.class);

	private static final Class<?>[] _addShoeParameterTypes0 = new Class[] {
		String.class, String.class, String.class, String.class, double.class,
		double.class
	};
	private static final Class<?>[] _updateShoeParameterTypes1 = new Class[] {
		com.liferay.servicebuilder.model.Shoe.class
	};
	private static final Class<?>[] _getShoeByIdParameterTypes2 = new Class[] {
		String.class
	};
	private static final Class<?>[] _getShoesParameterTypes3 = new Class[] {
		int.class, int.class
	};
	private static final Class<?>[] _getShoesCountParameterTypes4 =
		new Class[] {};

}