package org.testingProject.Steps;

import io.cucumber.java.Before;
import utils.RestAssuredExtension;

public class Hooks {
    @Before
    public void testSetup()
    {
        RestAssuredExtension restAssuredExtension = new RestAssuredExtension();
    }
}
