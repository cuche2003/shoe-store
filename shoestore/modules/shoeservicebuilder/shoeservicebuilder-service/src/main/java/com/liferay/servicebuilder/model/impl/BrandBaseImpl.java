/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.model.impl;

import com.liferay.servicebuilder.model.Brand;
import com.liferay.servicebuilder.service.BrandLocalServiceUtil;

/**
 * The extended model base implementation for the Brand service. Represents a row in the &quot;ShoeServiceBuilder_Brand&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BrandImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BrandImpl
 * @see Brand
 * @generated
 */
public abstract class BrandBaseImpl extends BrandModelImpl implements Brand {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a brand model instance should use the <code>Brand</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			BrandLocalServiceUtil.addBrand(this);
		}
		else {
			BrandLocalServiceUtil.updateBrand(this);
		}
	}

}