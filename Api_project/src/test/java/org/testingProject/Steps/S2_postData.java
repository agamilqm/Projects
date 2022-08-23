package org.testingProject.Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.testng.Assert;
import utils.RestAssuredExtension;

import java.util.HashMap;

public class S2_postData {

    private ResponseOptions<Response> response;

    @Given("User Post data using body {string}")
    public void step1_S1(String url, DataTable data)
    {
        var x = data.asList();
        HashMap<String,String> body = new HashMap<>();
        body.put("id",x.get(1));
        response = RestAssuredExtension.postWithBody(url,body);
    }
    @Then("Assert we got code {int}")
    public void step2_S1(int codeStatus)
    {
        Assert.assertEquals(response.getStatusCode(),codeStatus);
    }

    @Given("User Post data using PathParams {string} and Body")
    public void step1_S2(String url , DataTable table)
    {
        HashMap<String,String> body =new HashMap<>();
        body.put(table.asList().get(0),table.asList().get(1));
        HashMap<String,String> pathParams =new HashMap<>();
        pathParams.put("Activities","Activities");
        response = RestAssuredExtension.postOpsWithBodyAndPathParams(url,pathParams,body);
    }
    @Then("Assert we got code S2 {int}")
    public void step2_S2(int codeStatus)
    {
        Assert.assertEquals(response.getStatusCode(),codeStatus);
    }

    @And("Assert title is {string}")
    public void step3_S2(String title)
    {
        Assert.assertEquals(response.getBody().jsonPath().get("title").toString(),title);
    }


}
