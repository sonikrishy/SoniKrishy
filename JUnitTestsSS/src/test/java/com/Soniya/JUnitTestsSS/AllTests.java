package com.Soniya.JUnitTestsSS;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCalc.class, TestMult.class })
public class AllTests
{

}
