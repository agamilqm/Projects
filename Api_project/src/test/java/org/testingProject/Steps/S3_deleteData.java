package org.testingProject.Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.testng.Assert;
import utils.RestAssuredExtension;

import java.util.HashMap;

public class S3_deleteData {

    private ResponseOptions<Response> response ;
    @Given("Delete Activity using PathParams {string}")
    public void step1_S1(String url , DataTable table)
    {
        HashMap<String ,String > pathParams = new HashMap<>();
        pathParams.put(table.asList().get(0),table.asList().get(1));
        response = RestAssuredExtension.deleteOpsWithPathParams(url,pathParams);
    }
    @Then("Assert we deleted with code {int}")
    public void step2_S1(int value)
    {
        Assert.assertEquals(response.getStatusCode(),value);
    }
}
