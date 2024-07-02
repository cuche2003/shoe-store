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
import com.liferay.servicebuilder.service.BrandServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>BrandServiceUtil</code> service
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
public class BrandServiceHttp {

	public static com.liferay.servicebuilder.model.Brand addBrand(
		HttpPrincipal httpPrincipal, String name) {

		try {
			MethodKey methodKey = new MethodKey(
				BrandServiceUtil.class, "addBrand", _addBrandParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey, name);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.servicebuilder.model.Brand)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.servicebuilder.model.Brand getBrandById(
			HttpPrincipal httpPrincipal, String brandId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				BrandServiceUtil.class, "getBrandById",
				_getBrandByIdParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey, brandId);

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

			return (com.liferay.servicebuilder.model.Brand)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.servicebuilder.model.Brand updateBrand(
		HttpPrincipal httpPrincipal,
		com.liferay.servicebuilder.model.Brand brand) {

		try {
			MethodKey methodKey = new MethodKey(
				BrandServiceUtil.class, "updateBrand",
				_updateBrandParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, brand);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.servicebuilder.model.Brand)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.servicebuilder.model.Brand deleteBrand(
			HttpPrincipal httpPrincipal, String brandId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				BrandServiceUtil.class, "deleteBrand",
				_deleteBrandParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, brandId);

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

			return (com.liferay.servicebuilder.model.Brand)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.servicebuilder.model.Brand>
		getBrands(HttpPrincipal httpPrincipal, int startIndex, int lastIndex) {

		try {
			MethodKey methodKey = new MethodKey(
				BrandServiceUtil.class, "getBrands", _getBrandsParameterTypes4);

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

			return (java.util.List<com.liferay.servicebuilder.model.Brand>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int getBrandsCount(HttpPrincipal httpPrincipal) {
		try {
			MethodKey methodKey = new MethodKey(
				BrandServiceUtil.class, "getBrandsCount",
				_getBrandsCountParameterTypes5);

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

	private static Log _log = LogFactoryUtil.getLog(BrandServiceHttp.class);

	private static final Class<?>[] _addBrandParameterTypes0 = new Class[] {
		String.class
	};
	private static final Class<?>[] _getBrandByIdParameterTypes1 = new Class[] {
		String.class
	};
	private static final Class<?>[] _updateBrandParameterTypes2 = new Class[] {
		com.liferay.servicebuilder.model.Brand.class
	};
	private static final Class<?>[] _deleteBrandParameterTypes3 = new Class[] {
		String.class
	};
	private static final Class<?>[] _getBrandsParameterTypes4 = new Class[] {
		int.class, int.class
	};
	private static final Class<?>[] _getBrandsCountParameterTypes5 =
		new Class[] {};

}