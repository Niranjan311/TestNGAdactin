package org.adictin.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Transform implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation a, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer rt = a.getRetryAnalyzer();
		a.setRetryAnalyzer(Retry.class);	
		
	}

}
