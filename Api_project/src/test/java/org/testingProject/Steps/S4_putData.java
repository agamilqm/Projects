package org.testingProject.Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.testng.Assert;
import utils.RestAssuredExtension;

import java.util.HashMap;

public class S4_putData {

    public ResponseOptions<Response> response ;

    @Given("User Update Data using Body and PathParams {string}")
    public void Step1(String url, DataTable table)
    {
        HashMap<String ,String> pathParam = new HashMap<>();
        pathParam.put(table.cell(1,0),table.cell(1,1) );
        HashMap<String ,String> body = new HashMap<>();
        body.put(table.cell(0,0), table.cell(0,1));

        response = RestAssuredExtension.putOpsWithPathParamsAndBody(url,pathParam,body);
    }

    @Then("Assert we updated the info using code {int}")
    public void Step2(int value)
    {
        Assert.assertEquals(response.getStatusCode(),value);
    }
}
