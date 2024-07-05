/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.model.impl;

import com.liferay.servicebuilder.model.Type;
import com.liferay.servicebuilder.service.TypeLocalServiceUtil;

/**
 * The extended model base implementation for the Type service. Represents a row in the &quot;ShoeServiceBuilder_Type&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TypeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TypeImpl
 * @see Type
 * @generated
 */
public abstract class TypeBaseImpl extends TypeModelImpl implements Type {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a type model instance should use the <code>Type</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			TypeLocalServiceUtil.addType(this);
		}
		else {
			TypeLocalServiceUtil.updateType(this);
		}
	}

}