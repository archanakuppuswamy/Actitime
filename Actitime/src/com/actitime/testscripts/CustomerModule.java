package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class CustomerModule extends BaseClass {
	@Test

	public  void createcustomer(){
		Reporter.log("createcustomer",true);
	}
	@Test
	public void modifycustomer() {
		Reporter.log("modifycustomer",true);

	}

}
