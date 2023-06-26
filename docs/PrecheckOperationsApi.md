# PrecheckOperationsApi

All URIs are relative to *https://api.partner.skippay.cz*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**precheck**](PrecheckOperationsApi.md#precheck) | **POST** /financing/v1/precheck | Precheck |


<a id="precheck"></a>
# **precheck**
> PrecheckResultsResponse precheck(precheckRequest)

Precheck

Precheck *application*  Returns probability of *application&#39;s* approval and limits of particular customer, if known to Skip Pay  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  It has to be called with valid access token (see the [Security section](https://developers.skippay.cz/docs/api-reference/security)) from your server. If you plan to integrate it in client flow, you should implement REST endpoint bound to your shopping basket session, that will be used as a proxy to call Skip Pay API - **NEVER put access token directly to client side**.  Possible error codes explanation:  | Status code | Code                  | Explanation                                                                     | | ---         | ---                   | ---                                                                             | | 400         | &#x60;INVALID_REQUEST&#x60;     | Request was not well formatted (malformed request syntax, size too large, etc.) | | 422         | &#x60;PERSONAL_ID_INVALID&#x60; | PersonalId is not valid                                                         |Returns probability of *application&#39;s* approval and limits of particular customer, if known to Skip Pay

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.PrecheckOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.skippay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    PrecheckOperationsApi apiInstance = new PrecheckOperationsApi(defaultClient);
    PrecheckRequest precheckRequest = new PrecheckRequest(); // PrecheckRequest | 
    try {
      PrecheckResultsResponse result = apiInstance.precheck(precheckRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecheckOperationsApi#precheck");
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
| **precheckRequest** | [**PrecheckRequest**](PrecheckRequest.md)|  | [optional] |

### Return type

[**PrecheckResultsResponse**](PrecheckResultsResponse.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Probability of approval |  -  |
| **400** | Error in processing request |  -  |
| **422** | Error in processing request |  -  |

