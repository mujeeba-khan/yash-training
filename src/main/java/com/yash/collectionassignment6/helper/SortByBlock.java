package com.yash.collectionassignment6.helper;

import java.util.Comparator;

import com.yash.collectionassignment6.model.Ticket;

public class SortByBlock implements Comparator<Ticket>
{

	@Override
	public int compare(Ticket t1, Ticket t2) {
		
		return t1.getBlock().compareTo(t2.getBlock());
	}

	
}
