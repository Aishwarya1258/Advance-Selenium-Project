package workingwithunittestingtool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class workingwithdataprovider {
	@DataProvider(name = "testdata")
	public String[][] getdata() {
		String[][] data = new String[2][5];
		data[0][0] = "Aishwarya";
		data[0][1] = "mysore";
		data[0][2] = "Aishwarya@15gmail.com";
		data[0][3] = "123abc";
		data[0][4] = "123abc";

		data[1][0] = "mysore";
		data[1][1] = "Aishwarya";
		data[1][2] = "Aish@15gmail.com";
		data[1][3] = "123abcABC";
		data[1][4] = "123abcABC";
		return data;
	}

	@Test(dataProvider = "testdata")
	public void dataDemo(String firstname, String lastname, String emailid, String password, String cnfirmpwd) {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(emailid);
		System.out.println(password);
		System.out.println(cnfirmpwd);

	}
}
