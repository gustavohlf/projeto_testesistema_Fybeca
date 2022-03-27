package system.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import system.helpers.DriverManager;

public class Hooks {

    @Before
    public void before() {
        DriverManager.getDriver();
        DriverManager.getDriverWait();
    }

    @After
    public void after() {
        DriverManager.quitDriver();
    }

}
