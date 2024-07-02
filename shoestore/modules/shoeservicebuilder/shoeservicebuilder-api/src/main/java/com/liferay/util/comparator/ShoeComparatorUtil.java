package com.liferay.util.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;

public class ShoeComparatorUtil {
	 public static OrderByComparator getShoeOrderByComparator(
	   String orderByCol, String orderByType) {
	   boolean orderByAsc = false;

	   if (orderByType.equals("asc")) {
		   orderByAsc = true;
	   }

	   OrderByComparator orderByComparator = null;
	   
	   if (orderByCol.equalsIgnoreCase("Model")) {
		   orderByComparator = new ShoeModelComparator(orderByAsc);
	   } else if (orderByCol.equalsIgnoreCase("Price")) {
		   orderByComparator = new ShoePriceComparator(orderByAsc);
	   }
	   
	   return orderByComparator;
	 }
}
