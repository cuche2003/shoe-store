package com.liferay.util.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.servicebuilder.model.Shoe;

public class ShoeModelComparator extends OrderByComparator<Shoe>{
	public static final String ORDER_BY_ASC = "shoe.Model ASC";
	public static final String ORDER_BY_DESC = "shoe.Model DESC";
	public static final String[] ORDER_BY_FIELDS = {"shoeModel"};
	
	public ShoeModelComparator() {
		this(false);
	}

	public ShoeModelComparator(boolean ascending) {
		_ascending = ascending;
	}
	
	@Override
	public int compare(Shoe shoe1, Shoe shoe2) {
	  String model1 = shoe1.getShoeModel();
	  String model2 = shoe2.getShoeModel();

	  int value = model1.compareTo(model2);

	  if (_ascending) {
	    return value;
	  }
	  else {
	    return -value;
	  }
	}
	
	@Override
	public String getOrderBy() {
		if (_ascending) {
			return ORDER_BY_ASC;
		}
		else {
			return ORDER_BY_DESC;
		}
	}

	@Override
	public String[] getOrderByFields() {
		return ORDER_BY_FIELDS;
	}

	@Override
	public boolean isAscending() {
		return _ascending;
	}

	private final boolean _ascending;
 }