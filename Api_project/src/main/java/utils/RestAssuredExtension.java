package utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class RestAssuredExtension {

    private static RequestSpecification request ;

    public RestAssuredExtension()
    {
        //Arrange
        RequestSpecification requestSpec = new RequestSpecBuilder().
                setBaseUri("https://fakerestapi.azurewebsites.net/api/v1").setContentType(ContentType.JSON).build();

          request = RestAssured.given().spec(requestSpec);
    }

    public static ResponseOptions<Response> getOps(String url)
    {
        return request.get((url));
    }

    public static ResponseOptions<Response> getOpsWithPathParameter(String url , Map<String,String> pathParams)
    {
        //Act
        request.pathParams(pathParams);
        return request.get(url);
    }


    public static ResponseOptions<Response> postWithBody(String url , Map<String ,String> body)
    {
        request.body(body);
        return request.post (url);
    }

    public static ResponseOptions<Response> postOpsWithBodyAndPathParams(String url , Map<String ,String> pathParams , Map <String,String > body)
    {
        request.pathParams(pathParams);
        request.body(body);
        return request.post((url));
    }

    public static ResponseOptions<Response> deleteOpsWithPathParams(String url , Map<String,String> pathParams)
    {
        request.pathParams(pathParams);
        return request.delete(url);
    }

    public static ResponseOptions<Response> putOpsWithPathParamsAndBody(String url,Map<String,String> pathParams, Map<String,String> body)
    {
        request.pathParams(pathParams);
        request.body(body);
        return request.put(url);
    }
}
