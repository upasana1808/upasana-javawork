package com;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
		{TestCustomer.class,TestProduct.class,TestPayment.class }
		)
public class MasterTest {

}
