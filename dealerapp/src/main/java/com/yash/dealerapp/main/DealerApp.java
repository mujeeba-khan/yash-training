package com.yash.dealerapp.main;

import com.yash.dealerapp.daoimpl.DealerDaoImpl;

/*
 * Dealer main class from where the actual execution 
 * of this application will take place
 * 
 */

public class DealerApp {

	public static void main(String[] args)
	{
		DealerDaoImpl ddi = new DealerDaoImpl();
		
		ddi.addDealerDetails();	// inserting the records in dealer table
		
		ddi.getDealerDetails();	// retrieving the records from dealer table
		
		ddi.updateDealerDetails();	// updating the records in dealer table
		ddi.getDealerDetails();
		
		ddi.deleteDealerDetails();	// deleting the records from dealer table
		ddi.getDealerDetails();
	}

}
