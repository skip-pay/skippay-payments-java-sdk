# MerchantsitesApi

All URIs are relative to *https://api.partner.mallpay.cz*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applicationnotification**](MerchantsitesApi.md#applicationnotification) | **POST** /financing/v1/{application.merchantUrls.notificationEndpoint} | Application notification |
| [**paymentnotification**](MerchantsitesApi.md#paymentnotification) | **POST** /financing/v1/{application.merchantUrls.paymentEndpoint} | Payment notification |


<a id="applicationnotification"></a>
# **applicationnotification**
> Applicationnotificationresponse applicationnotification(applicationMerchantUrlsNotificationEndpoint, applicationBaseResponse)

Application notification

We use this resource when there is need to let you know about important changes within particular *application*. Namely in following situations:  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  &gt; IMPORTANT NOTE: This service should be developed and exposed by partner e-shops to allow Skip Pay to asynchronously inform these partners about important changes regarding particular applications.  | Trigger                                                             | Corresponding Application.stateReason | Expected reaction                                                                        | | ---                                                                 | ---                                   | ---                                                                                      | | Application was rejected                                            | &#x60;REJECTED&#x60;                            | You should probably cancel respective order and release reserved goods                   | | Application was cancelled                                           | &#x60;CANCELLED_NOT_PAID&#x60;                  | You should probably cancel respective order and release reserved goods                   | | Order to dispatch (we commit to finance customer&#39;s order)           | &#x60;READY_TO_SHIP&#x60;                       | Dispatch the order to the customer                                                       | | Order dispatched                                                    | &#x60;READY_SHIPPED&#x60;                       | None - serves as an acknowledgment (partner should know about this change)               | | Order delivered                                                     | &#x60;READY_DELIVERED&#x60;                     | None - serves as an acknowledgment (partner should know about this change)               | | Application was paid to the partner                                 | &#x60;READY_PAID&#x60;                          | Financial compensation for the application has been processed - check your bank account  |  &gt; NOTE: READY_PAID state is set when at least part of the application price was paid to the partner, not necessarily full application price. This also applies to the &#x60;Application was paid to the partner&#x60; application notification trigger.  We fill the request with following information:  - Application unique ID  - Application state  - Application substate  &gt; IMPORTANT: You should always double check the state of Application on &#x60;/financing/v1/applications/{applicationId}&#x60; resource due to security reasons.  If notification is not processed due to error or unavailability it is automatically sent again (retried) after 1, 5, 5, 5 a 5 minutes by default (5 tries in total).Notify partner about changes in application.

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.MerchantsitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    MerchantsitesApi apiInstance = new MerchantsitesApi(defaultClient);
    String applicationMerchantUrlsNotificationEndpoint = "applicationMerchantUrlsNotificationEndpoint_example"; // String | application.merchantUrls.notificationEndpoint
    ApplicationBaseResponse applicationBaseResponse = new ApplicationBaseResponse(); // ApplicationBaseResponse | 
    try {
      Applicationnotificationresponse result = apiInstance.applicationnotification(applicationMerchantUrlsNotificationEndpoint, applicationBaseResponse);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsitesApi#applicationnotification");
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
| **applicationMerchantUrlsNotificationEndpoint** | **String**| application.merchantUrls.notificationEndpoint | |
| **applicationBaseResponse** | [**ApplicationBaseResponse**](ApplicationBaseResponse.md)|  | [optional] |

### Return type

[**Applicationnotificationresponse**](Applicationnotificationresponse.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Can not process changes |  -  |

<a id="paymentnotification"></a>
# **paymentnotification**
> Paymentnotificationresponse paymentnotification(applicationMerchantUrlsPaymentEndpoint, payment)

Payment notification

| Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |Notification about new payment.

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.MerchantsitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    MerchantsitesApi apiInstance = new MerchantsitesApi(defaultClient);
    String applicationMerchantUrlsPaymentEndpoint = "applicationMerchantUrlsPaymentEndpoint_example"; // String | application.merchantUrls.paymentEndpoint
    Payment payment = new Payment(); // Payment | 
    try {
      Paymentnotificationresponse result = apiInstance.paymentnotification(applicationMerchantUrlsPaymentEndpoint, payment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsitesApi#paymentnotification");
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
| **applicationMerchantUrlsPaymentEndpoint** | **String**| application.merchantUrls.paymentEndpoint | |
| **payment** | [**Payment**](Payment.md)|  | [optional] |

### Return type

[**Paymentnotificationresponse**](Paymentnotificationresponse.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** |  |  -  |

