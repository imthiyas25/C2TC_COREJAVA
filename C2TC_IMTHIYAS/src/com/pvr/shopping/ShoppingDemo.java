package com.pvr.shopping;
import com.pvr.shopping.impl_ordering.MobileTools;
import com.pvr.shopping.entity.Customer;
import com.pvr.shopping.interfacesample.*;
import com.pvr.shopping.impl_ordering.ComputerTools;
public class ShoppingDemo {
		public static void main(String[]args) {
			Customer c1=new Customer();
			c1.setCid(103);
			c1.setName("Imthiyas");
			c1.setCity("Tindivanam");
			c1.setProduct("mobile tools");
			Order order;
			String choice=c1.getProduct();
			if(choice.equals("computertools")) {
				order=MobileTools.getMobiletools();
			}
			else {
				order=ComputerTools.getComputertools();
			}
			order.ordering();	
			}

	}