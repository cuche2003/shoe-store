/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.model.impl;

import com.liferay.servicebuilder.model.Shoe;
import com.liferay.servicebuilder.service.ShoeLocalServiceUtil;

/**
 * The extended model base implementation for the Shoe service. Represents a row in the &quot;ShoeServiceBuilder_Shoe&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ShoeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShoeImpl
 * @see Shoe
 * @generated
 */
public abstract class ShoeBaseImpl extends ShoeModelImpl implements Shoe {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a shoe model instance should use the <code>Shoe</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			ShoeLocalServiceUtil.addShoe(this);
		}
		else {
			ShoeLocalServiceUtil.updateShoe(this);
		}
	}

}