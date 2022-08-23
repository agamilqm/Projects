package org.testingProject.Steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.testng.Assert;
import utils.RestAssuredExtension;

import java.util.HashMap;


public class S1_getData {

    private static ResponseOptions<Response> response;

    @Given("Get All Activities {string}")
    public void step1_S1(String url)
    {
        response = RestAssuredExtension.getOps(url);
    }

    @Then(value = "assert we got it using CodeStatus {int}")
    public void step2_S1(Integer value)
    {
        Assert.assertEquals(response.getStatusCode(),value);
    }

    @Given("Get Activities with id {string}")
    public void Step1(String url)
    {
        HashMap<String,String> params = new HashMap<>();
        params.put("id","1");
        response= RestAssuredExtension.getOpsWithPathParameter(url,params);

    }

    @Then("assert we got title {string}")
    public void getResult(String title)
    {

      Assert.assertEquals(response.getBody().jsonPath().get("title"),title);
    }
}
