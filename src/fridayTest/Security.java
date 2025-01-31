package fridayTest;

import java.util.*;

public class Security {

	public boolean login(String userName, String password, int companyID) {

		if (userName == null || userName.trim().length() < 3)
			return false;

		if (!userName.matches("[a-zA-Z]+"))
			return false;

		if (password == null || password.trim().length() < 8)
			return false;

		int count = 0;
		boolean hasNumber = false;
		for (char c : password.toCharArray()) {
			if (Character.isAlphabetic(c))
				count++;

			if (Character.isDigit(c))
				hasNumber = true;
		}
		if (count < 3)
			return false;

		if (!hasNumber)
			return false;

		if (companyID < 1 || companyID > 100)
			return false;

		return this.isValidUser(userName, password, companyID);
	}

	private boolean isValidUser(String username, String password, int companyID) {
		// create a stub for unit testing. These will go into a database later
		if (username.equalsIgnoreCase("Bobby") && password.equals("Password1$") && companyID == 10)
			return true;
		if (username.equalsIgnoreCase("Linda") && password.equals("Password2$") && companyID == 20)
			return true;
		if (username.equalsIgnoreCase("David") && password.equals("Password3$") && companyID == 30)
			return true;
		return false;
	}
}
