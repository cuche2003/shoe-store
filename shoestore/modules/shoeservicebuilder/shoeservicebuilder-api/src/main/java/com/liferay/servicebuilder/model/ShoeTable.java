/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;ShoeServiceBuilder_Shoe&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Shoe
 * @generated
 */
public class ShoeTable extends BaseTable<ShoeTable> {

	public static final ShoeTable INSTANCE = new ShoeTable();

	public final Column<ShoeTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ShoeTable, String> shoeId = createColumn(
		"shoeId", String.class, Types.VARCHAR, Column.FLAG_PRIMARY);
	public final Column<ShoeTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ShoeTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ShoeTable, String> shoeModel = createColumn(
		"shoeModel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ShoeTable, String> gender = createColumn(
		"gender", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ShoeTable, Double> size = createColumn(
		"size_", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<ShoeTable, Double> price = createColumn(
		"price", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<ShoeTable, String> brandId = createColumn(
		"brandId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ShoeTable, String> typeId = createColumn(
		"typeId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private ShoeTable() {
		super("ShoeServiceBuilder_Shoe", ShoeTable::new);
	}

}