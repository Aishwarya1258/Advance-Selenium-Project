package workingwithunittestingtool;

import org.testng.annotations.Test;

public class workingwithdependsonMethod {
		@Test(priority = 1)
		public void register() {
			System.out.println("user is able to register");
		}

		@Test(priority=2)
		public void login() {
			System.out.println("user is able to login");
		}

		@Test(priority=3)
		public void searchproduct() {
			System.out.println("user is able to search product");
		}

		@Test(priority = 4)
		public void addtocart() {
			System.out.println("user is able to add product to the cart");
		}

		@Test(priority = 5)
		public void payment() {
			System.out.println("user is able to do payment");
		}

		@Test(priority = 6)
		public void closetheapp() {
			System.out.println("user is able to close the application");
		}

	}



