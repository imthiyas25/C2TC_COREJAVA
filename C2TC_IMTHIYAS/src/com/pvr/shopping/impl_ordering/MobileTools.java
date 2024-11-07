package com.pvr.shopping.impl_ordering;
import com.pvr.shopping.interfacesample.Order;
public class MobileTools implements Order {
		private static MobileTools mobiletools=new MobileTools();

		public static MobileTools getComputertools() {
			return mobiletools;
		}


	public static MobileTools getMobiletools() {
			return mobiletools;
		}


		public static void setMobiletools(MobileTools mobiletools) {
			MobileTools.mobiletools = mobiletools;
		}
	@Override
	public void ordering() {
		// TODO Auto-generated method stub
		System.out.println("I'm buying mobile ");
	}
	}