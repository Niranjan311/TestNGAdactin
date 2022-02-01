package org.adictin.rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	int minCount =0; int maxCount=5;
	@Override
	public boolean retry(ITestResult result) {
		
		if(minCount< maxCount) {
			minCount++;
			return true;
		}
		return false;
	}

}
