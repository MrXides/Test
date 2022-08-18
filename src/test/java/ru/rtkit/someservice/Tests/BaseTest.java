package ru.rtkit.someservice.Tests;

import io.restassured.specification.ResponseSpecification;
import ru.rtkit.someservice.apiHelper.ApiHelper;

import static io.restassured.RestAssured.expect;

public class BaseTest {
    public static ResponseSpecification resp200 = expect().statusCode(200);
    public static ResponseSpecification resp400 = expect().statusCode(400);
    public static ResponseSpecification resp401 = expect().statusCode(401);
    public static ResponseSpecification resp403 = expect().statusCode(403);
    public static ResponseSpecification resp406 = expect().statusCode(406);
    public static ResponseSpecification resp404 = expect().statusCode(404);
    public static ResponseSpecification resp413 = expect().statusCode(413);
    public static ResponseSpecification resp422 = expect().statusCode(422);
    public static ResponseSpecification resp500 = expect().statusCode(500);
    public static ApiHelper apiHelper;
    static {
        apiHelper = new ApiHelper();
    }
}
