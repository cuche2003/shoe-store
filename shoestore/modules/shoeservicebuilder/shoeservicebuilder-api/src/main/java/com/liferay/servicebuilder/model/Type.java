/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Type service. Represents a row in the &quot;ShoeServiceBuilder_Type&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TypeModel
 * @generated
 */
@ImplementationClassName("com.liferay.servicebuilder.model.impl.TypeImpl")
@ProviderType
public interface Type extends PersistedModel, TypeModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.liferay.servicebuilder.model.impl.TypeImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Type, String> TYPE_ID_ACCESSOR =
		new Accessor<Type, String>() {

			@Override
			public String get(Type type) {
				return type.getTypeId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<Type> getTypeClass() {
				return Type.class;
			}

		};

}