# SecurityApi

All URIs are relative to *https://api.partner.mallpay.cz*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**loginpartner**](SecurityApi.md#loginpartner) | **POST** /authentication/v1/partner | Login partner |


<a id="loginpartner"></a>
# **loginpartner**
> PartnerLoginResult loginpartner(partnerLogin)

Login partner

Partner authenticate himself and obtain access token

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    PartnerLogin partnerLogin = new PartnerLogin(); // PartnerLogin | 
    try {
      PartnerLoginResult result = apiInstance.loginpartner(partnerLogin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#loginpartner");
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
| **partnerLogin** | [**PartnerLogin**](PartnerLogin.md)|  | |

### Return type

[**PartnerLoginResult**](PartnerLoginResult.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Partner acces token issued |  -  |
| **400** | Unable to authenticate partner |  -  |

