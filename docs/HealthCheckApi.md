# HealthCheckApi

All URIs are relative to *https://api.partner.mallpay.cz*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aPIhealthcheck**](HealthCheckApi.md#aPIhealthcheck) | **GET** /v1/health | API health check |


<a id="aPIhealthcheck"></a>
# **aPIhealthcheck**
> HealthCheckResponse aPIhealthcheck(contentType)

API health check

If the API back-end services are up and runing, you receive HTTP status code 200 with optional version info.  In other cases, you may receive errors similar to the following ones: | Status code | Description                                             | | ---         | ---                                                     | | 503         | &#x60;Service Unavailable&#x60; - there is planned service outage |  &gt; Note: resource DOES NOT require valid *access_token* in the HTTP header of the requestGet current state of the API

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.HealthCheckApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    HealthCheckApi apiInstance = new HealthCheckApi(defaultClient);
    String contentType = "application/json; charset=utf-8"; // String | Content Type
    try {
      HealthCheckResponse result = apiInstance.aPIhealthcheck(contentType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthCheckApi#aPIhealthcheck");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**| Content Type | [enum: application/json; charset=utf-8] |

### Return type

[**HealthCheckResponse**](HealthCheckResponse.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **503** | Service is not available |  -  |

