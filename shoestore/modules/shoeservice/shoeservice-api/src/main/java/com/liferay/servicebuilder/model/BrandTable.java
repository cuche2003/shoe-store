/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;ShoeServiceBuilder_Brand&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Brand
 * @generated
 */
public class BrandTable extends BaseTable<BrandTable> {

	public static final BrandTable INSTANCE = new BrandTable();

	public final Column<BrandTable, String> brandId = createColumn(
		"brandId", String.class, Types.VARCHAR, Column.FLAG_PRIMARY);
	public final Column<BrandTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private BrandTable() {
		super("ShoeServiceBuilder_Brand", BrandTable::new);
	}

}