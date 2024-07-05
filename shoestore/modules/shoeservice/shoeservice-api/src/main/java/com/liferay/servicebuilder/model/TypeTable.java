/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.servicebuilder.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;ShoeServiceBuilder_Type&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Type
 * @generated
 */
public class TypeTable extends BaseTable<TypeTable> {

	public static final TypeTable INSTANCE = new TypeTable();

	public final Column<TypeTable, String> typeId = createColumn(
		"typeId", String.class, Types.VARCHAR, Column.FLAG_PRIMARY);
	public final Column<TypeTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private TypeTable() {
		super("ShoeServiceBuilder_Type", TypeTable::new);
	}

}