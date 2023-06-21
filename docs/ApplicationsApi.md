# ApplicationsApi

All URIs are relative to *https://api.partner.mallpay.cz*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelapplication**](ApplicationsApi.md#cancelapplication) | **PUT** /financing/v1/applications/{applicationId}/cancel | Cancel application |
| [**changeapplicationorder**](ApplicationsApi.md#changeapplicationorder) | **PUT** /financing/v1/applications/{applicationId}/order | Change application order |
| [**createapplication**](ApplicationsApi.md#createapplication) | **POST** /financing/v1/applications | Create application |
| [**createapplicationfromrecurrence**](ApplicationsApi.md#createapplicationfromrecurrence) | **POST** /financing/v1/recurrences/{recurrenceId}/applications | Create application from recurrence |
| [**getapplicationdetail**](ApplicationsApi.md#getapplicationdetail) | **GET** /financing/v1/applications/{applicationId} | Get application detail |
| [**getorder**](ApplicationsApi.md#getorder) | **GET** /financing/v1/orders | Get order |
| [**getpaymentsonspecificapplication**](ApplicationsApi.md#getpaymentsonspecificapplication) | **GET** /financing/v1/applications/{applicationId}/payments | Get payments on specific application |
| [**getrecurrence**](ApplicationsApi.md#getrecurrence) | **GET** /financing/v1/recurrences/{recurrenceId} | Get recurrence |
| [**markorderitemsascancelled**](ApplicationsApi.md#markorderitemsascancelled) | **PUT** /financing/v1/applications/{applicationId}/order/cancel | Mark order items as cancelled |
| [**markorderitemsasdelivered**](ApplicationsApi.md#markorderitemsasdelivered) | **PUT** /financing/v1/applications/{applicationId}/order/deliver | Mark order items as delivered |
| [**markorderitemsasreturned**](ApplicationsApi.md#markorderitemsasreturned) | **PUT** /financing/v1/applications/{applicationId}/order/return | Mark order items as returned |
| [**markorderitemsassent**](ApplicationsApi.md#markorderitemsassent) | **PUT** /financing/v1/applications/{applicationId}/order/send | Mark order items as sent |
| [**updaterecurrence**](ApplicationsApi.md#updaterecurrence) | **PATCH** /financing/v1/recurrences/{recurrenceId} | Update recurrence |


<a id="cancelapplication"></a>
# **cancelapplication**
> ApplicationResponse cancelapplication(applicationId, applicationCancelRequest)

Cancel application

If there is need to completely cancel customer&#39;s *order*, it is necessary to cancel respective *application*. For this purpose use &#x60;/financing/v1/applications/{applicationId}/cancel&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability                                                                                                                                                  | | ---               | ---                                                                                                                                                           | | &#x60;REJECTED&#x60;        | NO                                                                                                                                                            | | &#x60;CANCELLED&#x60;       | NO                                                                                                                                                            | | &#x60;PROCESSING&#x60;      | YES                                                                                                                                                           | | &#x60;READY&#x60;           | YES *(available only when the Application&#39;s order is not marked as sent (via *Mark order items as sent*) or delivered (via *Mark order items as delivered*))  |  If the request was successfully processed, you receive HTTP status code 200 and object of information about cancelled *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                                  | Explanation                                                                                           | | ---         | ---                                   | ---                                                                                                   | | 400         | &#x60;INVALID_REQUEST&#x60;                     | Request was not well formatted (malformed request syntax, size too large, etc.)                       | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;                    | The requested resource could not be found                                                             | | 422         | &#x60;UNPROCESSABLE&#x60;                       | The request was well-formed but was unable to be followed due to semantic errors                      | | 422         | &#x60;APPLICATION_REJECTED&#x60;                | When you try to cancel &#x60;Application&#x60; already &#x60;REJECTED&#x60;, which is not allowed                         | | 422         | &#x60;APPLICATION_ALREADY_CANCELLED&#x60;       | When you try to cancel &#x60;Application&#x60; that has been cancelled already                                  | | 422         | &#x60;APPLICATION_VALIDATION_IN_PROGRESS&#x60;  | When you try to cancel &#x60;Application&#x60; which undergoes validation                                       | | 422         | &#x60;APPLICATION_PAID&#x60;                    | When you try to cancel &#x60;Application&#x60; already paid, which is not allowed                               | | 422         | &#x60;NOT_SUPPORTED&#x60;                       | The request was well-formed but server was not able to change application state due internal rules    |Cancel *application*.

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String applicationId = "11b00a1ef1"; // String | applicationId
    ApplicationCancelRequest applicationCancelRequest = new ApplicationCancelRequest(); // ApplicationCancelRequest | 
    try {
      ApplicationResponse result = apiInstance.cancelapplication(applicationId, applicationCancelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#cancelapplication");
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
| **applicationId** | **String**| applicationId | |
| **applicationCancelRequest** | [**ApplicationCancelRequest**](ApplicationCancelRequest.md)|  | [optional] |

### Return type

[**ApplicationResponse**](ApplicationResponse.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Application was cancelled |  -  |
| **422** | Application can not be cancelled |  -  |

<a id="changeapplicationorder"></a>
# **changeapplicationorder**
> OrderExtendedResponse changeapplicationorder(applicationId, applicationOrderChangeRequest)

Change application order

When there&#39;s some changes within *order* before delivery (e.g. change in order items that impacts the total price of the *order*, or other billing information), use &#x60;/financing/v1/applications/{applicationId}/order&#x60; resource in order we can adjust everything properly. &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability | | ---               | ---          | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;PROCESSING&#x60;      | YES          | | &#x60;READY&#x60;           | YES *        |  &gt; \\* Order items can&#39;t be changed when some of them are marked as sent (via Mark order items as sent) or delivered (via Mark order items as delivered)  Use &#x60;/financing/v1/applications/{applicationId}/order&#x60; resource with properly filled request that contains (only) changed data (resource allows partial put).  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                     | | ---         | ---                     | ---                                                                             | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.) | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                       | | 422         | &#x60;NOT_SUPPORTED&#x60;         | Resource is not supported for given financing type                              |Change *order*. Used to change order items, total amount, billing details etc.

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String applicationId = "11b00a1ef1"; // String | applicationId
    ApplicationOrderChangeRequest applicationOrderChangeRequest = new ApplicationOrderChangeRequest(); // ApplicationOrderChangeRequest | 
    try {
      OrderExtendedResponse result = apiInstance.changeapplicationorder(applicationId, applicationOrderChangeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#changeapplicationorder");
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
| **applicationId** | **String**| applicationId | |
| **applicationOrderChangeRequest** | [**ApplicationOrderChangeRequest**](ApplicationOrderChangeRequest.md)|  | [optional] |

### Return type

[**OrderExtendedResponse**](OrderExtendedResponse.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order was changed |  -  |
| **422** | Order can not be changed. |  -  |

<a id="createapplication"></a>
# **createapplication**
> ApplicationResponse createapplication(applicationRequest)

Create application

Elementary flow starts when customer wants to use one of Skip Pay&#39;s payment method for financing his purchase made in partner e-shop.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  Use &#x60;/financing/v1/applications&#x60; resource with properly filled request that contains at least following data  - Customer information   - Name (first name and last name - if possible, otherwise full name)   - E-mail   - Phone number  - Order details   - Number   - Total Price (including VAT)   - Total VAT (array of total amounts split by VAT rates)   - Order items (array, at least one item is required)     - Code     - Order item name     - Total price (all pieces, including VAT)     - Total VAT  - Additional information necessary for the continuation and completion of the process   - Your URL where the customer should be redirected after application approval   - Your URL where the customer should be redirected after application rejection   - URL of your notification endpoint you want us to send you notifications about particular application updates  For best customer experience request should contain following data:  - Customer information   - Extra data     - Historical count of customer&#39;s transactions made in partner&#39;s e-shop  - Order details   - Delivery carrier information   - Address (type BILLING)     - Country     - City     - Street     - Street number     - ZIP     - Address type   - Order items     - Image  - Personal data processing and terms and conditions agreement  If the request was successfully processed, you receive HTTP status code 201 and *application* object with following important information in the response:  - Application unique ID  - Application state  - Application substate  - Gateway redirect URL where you should redirect a customer after processing of the response  - Recurrence ID if you sent &#x60;isRecurring&#x3D;true&#x60; in request (for recurring orders)  If the request was recognized as duplication, you receive HTTP status code 200 and the *application* object created during the first related successful request.  __Note__: If the optional *agreementTermsAndConditions* field was not sent with the request (or it was sent with a value of &#x60;false&#x60;), the *application* will be created with *agreementTermsAndConditions* value set to &#x60;false&#x60;, *state* &#x60;PROCESSING&#x60; and *stateReason* &#x60;PROCESSING_REDIRECT_NEEDED&#x60;.  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 422         | &#x60;UNPROCESSABLE&#x60;         | Request was well-formed but was unable to be followed due to semantic errors     |Create new *application* of particular financing type

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    ApplicationRequest applicationRequest = new ApplicationRequest(); // ApplicationRequest | 
    try {
      ApplicationResponse result = apiInstance.createapplication(applicationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#createapplication");
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
| **applicationRequest** | [**ApplicationRequest**](ApplicationRequest.md)|  | [optional] |

### Return type

[**ApplicationResponse**](ApplicationResponse.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Application data is duplicate. Existing application is returned. |  -  |
| **201** | Application was created |  -  |
| **400** | There was an error processing request |  -  |

<a id="createapplicationfromrecurrence"></a>
# **createapplicationfromrecurrence**
> ApplicationResponse createapplicationfromrecurrence(recurrenceId, applicationWithoutCustomerRequest)

Create application from recurrence

It allows to create application without customer authorization at Skip Pay gate. It needs the recurrence ID to be received previously. This endpoint doesn&#39;t need any data about customer.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | NO        |

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String recurrenceId = "recurrenceId_example"; // String | Recurrence ID from first application
    ApplicationWithoutCustomerRequest applicationWithoutCustomerRequest = new ApplicationWithoutCustomerRequest(); // ApplicationWithoutCustomerRequest | 
    try {
      ApplicationResponse result = apiInstance.createapplicationfromrecurrence(recurrenceId, applicationWithoutCustomerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#createapplicationfromrecurrence");
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
| **recurrenceId** | **String**| Recurrence ID from first application | |
| **applicationWithoutCustomerRequest** | [**ApplicationWithoutCustomerRequest**](ApplicationWithoutCustomerRequest.md)|  | [optional] |

### Return type

[**ApplicationResponse**](ApplicationResponse.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Application was created |  -  |
| **400** | There was an error processing request |  -  |
| **404** | There is no recurrence |  -  |
| **422** | Recurrence could not be used or invalid input data |  -  |

<a id="getapplicationdetail"></a>
# **getapplicationdetail**
> ApplicationResponse getapplicationdetail(applicationId)

Get application detail

If you need to find out current information about particular *application* - primarily its state and other details - use &#x60;/financing/v1/applications/{applicationId}&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  If the request was successfully processed, you receive HTTP status code 200 and *application* object.  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Message                                                                          | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 404         | &#x60;APPLICATION_NOT_FOUND&#x60; | The requested resource could not be found                                        | | 422         | &#x60;UNPROCESSABLE&#x60;         | The request was well-formed but was unable to be followed due to semantic errors |Get specific *application* detail by ID

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String applicationId = "11200a0ee1"; // String | applicationId
    try {
      ApplicationResponse result = apiInstance.getapplicationdetail(applicationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#getapplicationdetail");
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
| **applicationId** | **String**| applicationId | |

### Return type

[**ApplicationResponse**](ApplicationResponse.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Actual application data |  -  |
| **404** | Application does not exist |  -  |

<a id="getorder"></a>
# **getorder**
> OrderExtendedResponse getorder(orderNumber, orderVariableSymbol, applicationId)

Get order

If you need to find out current information about particular *order* - primarily its state (or its order items&#39; states) and other details - use &#x60;/financing/v1/orders{?orderNumber,orderVariableSymbol,applicationId}&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation, &#x60;{orderNumber}&#x60; is your order&#39;s number and &#x60;{orderVariableSymbol}&#x60; is your order&#39;s variable symbol.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | YES          | | &#x60;REJECTED&#x60;        | YES          | | &#x60;CANCELLED&#x60;       | YES          | | &#x60;READY&#x60;           | YES          |  If the request was successfully processed, you receive HTTP status code 200 and object of information about specified *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                        | | 422         | &#x60;UNPROCESSABLE&#x60;         | The request was well-formed but was unable to be followed due to semantic errors |Search for *order* using specified parameters.  use &#x60;/financing/v1/orders&#x60; with at least one of following parameter:  - variable symbol,  - order number,  - application number.  &lt;a name&#x3D;\&quot;orders-parameters-restriction\&quot;&gt;&lt;/a&gt;

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String orderNumber = "1234567890"; // String | Order Number
    String orderVariableSymbol = "1234567890"; // String | Order Variable Symbol
    String applicationId = "11b00a1ef1"; // String | applicationId
    try {
      OrderExtendedResponse result = apiInstance.getorder(orderNumber, orderVariableSymbol, applicationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#getorder");
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
| **orderNumber** | **String**| Order Number | [optional] |
| **orderVariableSymbol** | **String**| Order Variable Symbol | [optional] |
| **applicationId** | **String**| applicationId | [optional] |

### Return type

[**OrderExtendedResponse**](OrderExtendedResponse.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order data |  -  |
| **404** | Order not found |  -  |

<a id="getpaymentsonspecificapplication"></a>
# **getpaymentsonspecificapplication**
> Getpaymentsonspecificapplicationresponse getpaymentsonspecificapplication(applicationId)

Get payments on specific application

Get payments on specific *application*  List of realized payments from Skip Pay to partner. In case of multiple invoices, list may contain more items.  feature | supported by resource --- | --- [paging](#header-paging) | yes [sorting](#header-sorting) | no [filtering](#header-filtering) | no  This resource supports [paging](#header-paging). As a value to &#x60;before&#x60; and &#x60;after&#x60; parameters, use &#x60;paymentId&#x60; attribute.  Collection is sorted by paymentId attribute.

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String applicationId = "11b00a1ef1"; // String | applicationId
    try {
      Getpaymentsonspecificapplicationresponse result = apiInstance.getpaymentsonspecificapplication(applicationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#getpaymentsonspecificapplication");
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
| **applicationId** | **String**| applicationId | |

### Return type

[**Getpaymentsonspecificapplicationresponse**](Getpaymentsonspecificapplicationresponse.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of payments. May be empty if no payment was processed yet. |  -  |
| **404** | Application does not exist |  -  |

<a id="getrecurrence"></a>
# **getrecurrence**
> RecurrenceObject getrecurrence(recurrenceId)

Get recurrence

It allows to get recurrence detail. You can check if customer authorized your request and if recurrence is ready to be used.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | NO        |

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String recurrenceId = "recurrenceId_example"; // String | recurrenceId
    try {
      RecurrenceObject result = apiInstance.getrecurrence(recurrenceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#getrecurrence");
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
| **recurrenceId** | **String**| recurrenceId | |

### Return type

[**RecurrenceObject**](RecurrenceObject.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Actual recurrence data |  -  |
| **404** | There is no recurrence |  -  |

<a id="markorderitemsascancelled"></a>
# **markorderitemsascancelled**
> OrderExtendedResponse markorderitemsascancelled(applicationId, orderItemsChangeRequest)

Mark order items as cancelled

When some or all order items were cancelled (won&#39;t be ever delivered), use &#x60;/financing/v1/applications/{applicationId}/order/cancel&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  If you want to cancel some items after marking those items as sent or delivered, use [Mark order items as returned](#reference/application-operations/mark-order-items-as-returned) operation.  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | NO           | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;READY&#x60;           | YES          |  Use &#x60;/financing/v1/applications/{applicationId}/order/cancel&#x60; resource with an empty request to cancel all order items (the whole *order*) at once.  If you want to cancel specific order item/s, use &#x60;/financing/v1/applications/{applicationId}/order/cancel&#x60; resource with properly filled request that contains cancelled order items info. In this case request should contain array of cancelled order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as cancelled.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                        | | 422         | &#x60;NOT_SUPPORTED&#x60;         | Resource is not supported for given financing type                               |Mark order items as cancelled  System notification. Some or all of the order items were cancelled. Based on *application* financing type and partner setting, credit note may be issued.

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String applicationId = "11b00a1ef1"; // String | applicationId
    OrderItemsChangeRequest orderItemsChangeRequest = new OrderItemsChangeRequest(); // OrderItemsChangeRequest | 
    try {
      OrderExtendedResponse result = apiInstance.markorderitemsascancelled(applicationId, orderItemsChangeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#markorderitemsascancelled");
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
| **applicationId** | **String**| applicationId | |
| **orderItemsChangeRequest** | [**OrderItemsChangeRequest**](OrderItemsChangeRequest.md)|  | [optional] |

### Return type

[**OrderExtendedResponse**](OrderExtendedResponse.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Some order items or the whole order was cancelled |  -  |
| **422** | Order items can not be canceled. |  -  |

<a id="markorderitemsasdelivered"></a>
# **markorderitemsasdelivered**
> OrderExtendedResponse markorderitemsasdelivered(applicationId, orderItemsDeliverRequest)

Mark order items as delivered

When some or all order items were delivered to the customer, use &#x60;/financing/v1/applications/{applicationId}/order/deliver&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | NO           | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;READY&#x60;           | YES          |  Use &#x60;/financing/v1/applications/{applicationId}/order/deliver&#x60; resource with an empty request to mark all order items (the whole *order*) as delivered at once.  If you want to mark specific order item/s as delivered, use &#x60;/financing/v1/applications/{applicationId}/order/deliver&#x60; resource with properly filled request that contains delivered order items info. In this case request should contain array of delivered order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as delivered.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                              | Explanation                                                                       | | ---         | ---                               | ---                                                                               | | 400         | &#x60;INVALID_REQUEST&#x60;                 | Request was not well formatted (malformed request syntax, size too large, etc.)   | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;                | The requested resource could not be found                                         | | 422         | &#x60;TOTAL_PRICE_LIMIT_EXCEEDED&#x60;      | The total price of all subcontracts exceeded the order total price                | | 422         | &#x60;NOT_SUPPORTED&#x60;                   | Resource is not supported for given financing type                                |Mark order items as delivered.  System notification. Some or all order items were delivered to customer. Based on *application* financing type and partner setting, application payment may be processed.

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String applicationId = "11b00a1ef1"; // String | applicationId
    OrderItemsDeliverRequest orderItemsDeliverRequest = new OrderItemsDeliverRequest(); // OrderItemsDeliverRequest | 
    try {
      OrderExtendedResponse result = apiInstance.markorderitemsasdelivered(applicationId, orderItemsDeliverRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#markorderitemsasdelivered");
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
| **applicationId** | **String**| applicationId | |
| **orderItemsDeliverRequest** | [**OrderItemsDeliverRequest**](OrderItemsDeliverRequest.md)|  | [optional] |

### Return type

[**OrderExtendedResponse**](OrderExtendedResponse.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order items or whole order is marked as delivered |  -  |
| **422** | State change can not be processed |  -  |

<a id="markorderitemsasreturned"></a>
# **markorderitemsasreturned**
> OrderExtendedResponse markorderitemsasreturned(applicationId, orderItemsReturnRequest)

Mark order items as returned

When some or all order items were returned by the customer to you (after delivery), use &#x60;/financing/v1/applications/{applicationId}/order/return&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  If you want to cancel some items before marking those items as sent or delivered, use [Mark order items as cancelled](#reference/application-operations/mark-order-items-as-cancelled) operation.  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | NO           | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;READY&#x60;           | YES          |  Use &#x60;/financing/v1/applications/{applicationId}/order/return&#x60; resource with an empty request to mark all order items (the whole *order*) as returned at once.  If you want to mark specific order item/s as returned, use &#x60;/financing/v1/applications/{applicationId}/order/return&#x60; resource with properly filled request that contains returned order items info. In this case request should contain array of returned order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as returned.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                        | | 422         | &#x60;NOT_SUPPORTED&#x60;         | Resource is not supported for given financing type                               |Mark order items as returned.  System notification. Some or all order items were returned by customer back to e-shop. Based on *application* financing type and partner setting, credit note may be issued.

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String applicationId = "11b00a1ef1"; // String | applicationId
    OrderItemsReturnRequest orderItemsReturnRequest = new OrderItemsReturnRequest(); // OrderItemsReturnRequest | 
    try {
      OrderExtendedResponse result = apiInstance.markorderitemsasreturned(applicationId, orderItemsReturnRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#markorderitemsasreturned");
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
| **applicationId** | **String**| applicationId | |
| **orderItemsReturnRequest** | [**OrderItemsReturnRequest**](OrderItemsReturnRequest.md)|  | [optional] |

### Return type

[**OrderExtendedResponse**](OrderExtendedResponse.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order items or whole order is marked as returned |  -  |
| **422** | State change can not be processed |  -  |

<a id="markorderitemsassent"></a>
# **markorderitemsassent**
> OrderExtendedResponse markorderitemsassent(applicationId, orderItemsSendRequest)

Mark order items as sent

When some or all order items were shipped to the customer, use &#x60;/financing/v1/applications/{applicationId}/order/send&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability| | ---               | ---         | | &#x60;PROCESSING&#x60;      | NO          | | &#x60;REJECTED&#x60;        | NO          | | &#x60;CANCELLED&#x60;       | NO          | | &#x60;READY&#x60;           | YES         |  Use &#x60;/financing/v1/applications/{applicationId}/order/send&#x60; resource with an empty request to mark all order items (the whole *order*) as sent at once.  If you want to mark specific order item/s as sent, use &#x60;/financing/v1/applications/{applicationId}/order/send&#x60; resource with properly filled request that contains sent order items info. In this case request should contain array of sent order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as sent.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                            | Explanation                                                                       | | ---         | ---                             | ---                                                                               | | 400         | &#x60;INVALID_REQUEST&#x60;               | Request was not well formatted (malformed request syntax, size too large, etc.)   | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;              | The requested resource could not be found                                         | | 422         | &#x60;TOTAL_PRICE_LIMIT_EXCEEDED&#x60;    | The total price of all subcontracts exceeded the order total price                | | 422         | &#x60;NOT_SUPPORTED&#x60;                 | Resource is not supported for given financing type                                |Mark order items as sent  System notification. Some or all order items were shipped to customer. Based on *application* financing type and partner setting, application payment may be processed.

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String applicationId = "11b00a1ef1"; // String | applicationId
    OrderItemsSendRequest orderItemsSendRequest = new OrderItemsSendRequest(); // OrderItemsSendRequest | 
    try {
      OrderExtendedResponse result = apiInstance.markorderitemsassent(applicationId, orderItemsSendRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#markorderitemsassent");
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
| **applicationId** | **String**| applicationId | |
| **orderItemsSendRequest** | [**OrderItemsSendRequest**](OrderItemsSendRequest.md)|  | [optional] |

### Return type

[**OrderExtendedResponse**](OrderExtendedResponse.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order items or whole order is marked as shipped |  -  |
| **422** | State change can not be processed |  -  |

<a id="updaterecurrence"></a>
# **updaterecurrence**
> RecurrenceObject updaterecurrence(recurrenceId, recurrenceUpdateRequest)

Update recurrence

It allows to get recurrence detail. You can check if customer authorized your request and if recurrence is ready to be used.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | NO        |At this moment it allows to change the recurrence state only. It&#39;s not neccessary but if you want to be sure that nobody can use the recurrence in the future you can cancel it.

### Example
```java
// Import classes:
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.Configuration;
import cz.skippay.auth.*;
import cz.skippay.models.*;
import cz.skippay.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.partner.mallpay.cz");
    
    // Configure HTTP bearer authorization: httpBearer
    HttpBearerAuth httpBearer = (HttpBearerAuth) defaultClient.getAuthentication("httpBearer");
    httpBearer.setBearerToken("BEARER TOKEN");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String recurrenceId = "recurrenceId_example"; // String | recurenceId
    RecurrenceUpdateRequest recurrenceUpdateRequest = new RecurrenceUpdateRequest(); // RecurrenceUpdateRequest | 
    try {
      RecurrenceObject result = apiInstance.updaterecurrence(recurrenceId, recurrenceUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#updaterecurrence");
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
| **recurrenceId** | **String**| recurenceId | |
| **recurrenceUpdateRequest** | [**RecurrenceUpdateRequest**](RecurrenceUpdateRequest.md)|  | [optional] |

### Return type

[**RecurrenceObject**](RecurrenceObject.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Recurrence was updated |  -  |
| **404** | There is no recurrence |  -  |
| **422** | Recurrence can not be updated |  -  |

