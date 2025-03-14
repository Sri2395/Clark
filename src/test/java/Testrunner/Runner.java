package Testrunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Adam.AppTest;
import Adam.Source;

@RunWith(Suite.class)
@SuiteClasses({AppTest.class, Source.class})
public class Runner {

}
