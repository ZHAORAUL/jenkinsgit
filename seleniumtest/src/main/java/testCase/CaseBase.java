package testCase;

import base.DriverBase;

public class CaseBase {
	public DriverBase InitDriver(String browser) {
		return new DriverBase(browser);
	}
}
