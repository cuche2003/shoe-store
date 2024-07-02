package com.liferay.util.comparator;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.servicebuilder.model.Shoe;

public class ShoePriceComparator extends OrderByComparator<Shoe>{
	private static final long serialVersionUID = 2198039412750066665L;
	public static final String ORDER_BY_ASC = "shoe.Price ASC";
	public static final String ORDER_BY_DESC = "shoe.Price DESC";
	public static final String[] ORDER_BY_FIELDS = {"price"};

	public ShoePriceComparator() {
		this(false);
	}

	public ShoePriceComparator(boolean ascending) {
		_ascending = ascending;
	}
	
	@Override
	public int compare(Shoe shoe1, Shoe shoe2) {
		double value1 = shoe1.getPrice();
		double value2  = shoe2.getPrice();
		
		int value = Double.compare(value1, value2);

	    if (_ascending) {
	    	return value;
	    }
	    else {
	    	return -value;
	    }
	}

	@Override
	public boolean isAscending() {
		return _ascending;
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

	private final boolean _ascending;
 }