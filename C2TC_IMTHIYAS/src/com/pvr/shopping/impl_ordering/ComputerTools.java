package com.pvr.shopping.impl_ordering;
import com.pvr.shopping.interfacesample.Order;
public class ComputerTools implements Order {

		private static ComputerTools computertools=new ComputerTools();

		public static ComputerTools getComputertools() {
			return computertools;
		}

		public static void setComputertools(ComputerTools computertools) {
			ComputerTools.computertools = computertools;
		}

		@Override
		public void ordering() {
			System.out.println("I'm buying computer....");		
		}
		
		

	}