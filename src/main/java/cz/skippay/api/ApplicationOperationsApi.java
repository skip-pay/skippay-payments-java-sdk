/**
 * Skip Pay API for partners
 * API documentation for Skip Pay partners.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: info@skippay.cz
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 */
package cz.skippay.api;

import com.sun.jersey.api.client.GenericType;

import cz.skippay.ApiException;
import cz.skippay.ApiClient;
import cz.skippay.Configuration;
import cz.skippay.model.*;
import cz.skippay.Pair;

import cz.skippay.model.ApplicationCancelRequest;
import cz.skippay.model.ApplicationOrderChangeRequest;
import cz.skippay.model.ApplicationRequest;
import cz.skippay.model.ApplicationResponse;
import cz.skippay.model.ApplicationWithoutCustomerRequest;
import cz.skippay.model.ErrorsResponse;
import cz.skippay.model.Getpaymentsonspecificapplicationresponse;
import cz.skippay.model.OrderExtendedResponse;
import cz.skippay.model.OrderItemsChangeRequest;
import cz.skippay.model.OrderItemsDeliverRequest;
import cz.skippay.model.OrderItemsReturnRequest;
import cz.skippay.model.OrderItemsSendRequest;
import cz.skippay.model.RecurrenceObject;
import cz.skippay.model.RecurrenceUpdateRequest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class ApplicationOperationsApi {
  private ApiClient apiClient;

  public ApplicationOperationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ApplicationOperationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Cancel application
   * If there is need to completely cancel customer's *order*, it is necessary to cancel respective *application*. For this purpose use `/financing/v1/applications/{applicationId}/cancel` resource where `{applicationId}` is the application ID you received in the response of `/financing/v1/applications` after its creation.  | Financing type     | Supported | | ---                | ---       | | `DEFERRED_PAYMENT` | YES       | | `PAY_IN_THREE`     | YES       |  | Application state | Availability                                                                                                                                                  | | ---               | ---                                                                                                                                                           | | `REJECTED`        | NO                                                                                                                                                            | | `CANCELLED`       | NO                                                                                                                                                            | | `PROCESSING`      | YES                                                                                                                                                           | | `READY`           | YES *(available only when the Application's order is not marked as sent (via *Mark order items as sent*) or delivered (via *Mark order items as delivered*))  |  If the request was successfully processed, you receive HTTP status code 200 and object of information about cancelled *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones:  | Status code | Code                                  | Explanation                                                                                           | | ---         | ---                                   | ---                                                                                                   | | 400         | `INVALID_REQUEST`                     | Request was not well formatted (malformed request syntax, size too large, etc.)                       | | 404         | `OBJECT_NOT_FOUND`                    | The requested resource could not be found                                                             | | 422         | `UNPROCESSABLE`                       | The request was well-formed but was unable to be followed due to semantic errors                      | | 422         | `APPLICATION_REJECTED`                | When you try to cancel `Application` already `REJECTED`, which is not allowed                         | | 422         | `APPLICATION_ALREADY_CANCELLED`       | When you try to cancel `Application` that has been cancelled already                                  | | 422         | `APPLICATION_VALIDATION_IN_PROGRESS`  | When you try to cancel `Application` which undergoes validation                                       | | 422         | `APPLICATION_PAID`                    | When you try to cancel `Application` already paid, which is not allowed                               | | 422         | `NOT_SUPPORTED`                       | The request was well-formed but server was not able to change application state due internal rules    |Cancel *application*.
   * @param applicationId applicationId (required)
   * @param applicationCancelRequest  (optional)
   * @return ApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationResponse cancelapplication(String applicationId, ApplicationCancelRequest applicationCancelRequest) throws ApiException {
    Object localVarPostBody = applicationCancelRequest;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling cancelapplication");
    }
    
    // create path and map variables
    String localVarPath = "/financing/v1/applications/{applicationId}/cancel"
      .replaceAll("\\{" + "applicationId" + "\\}", apiClient.escapeString(applicationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json; charset=utf-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "httpBearer" };

    GenericType<ApplicationResponse> localVarReturnType = new GenericType<ApplicationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Change application order
   * When there's some changes within *order* before delivery (e.g. change in order items that impacts the total price of the *order*, or other billing information), use `/financing/v1/applications/{applicationId}/order` resource in order we can adjust everything properly. `{applicationId}` is the application ID you received in the response of `/financing/v1/applications` after its creation.  | Financing type     | Supported | | ---                | ---       | | `DEFERRED_PAYMENT` | YES       | | `PAY_IN_THREE`     | YES       |  | Application state | Availability | | ---               | ---          | | `REJECTED`        | NO           | | `CANCELLED`       | NO           | | `PROCESSING`      | YES          | | `READY`           | YES *        |  > \\* Order items can't be changed when some of them are marked as sent (via Mark order items as sent) or delivered (via Mark order items as delivered)  Use `/financing/v1/applications/{applicationId}/order` resource with properly filled request that contains (only) changed data (resource allows partial put).  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones:  | Status code | Code                    | Explanation                                                                     | | ---         | ---                     | ---                                                                             | | 400         | `INVALID_REQUEST`       | Request was not well formatted (malformed request syntax, size too large, etc.) | | 404         | `OBJECT_NOT_FOUND`      | The requested resource could not be found                                       | | 422         | `NOT_SUPPORTED`         | Resource is not supported for given financing type                              |Change *order*. Used to change order items, total amount, billing details etc.
   * @param applicationId applicationId (required)
   * @param applicationOrderChangeRequest  (optional)
   * @return OrderExtendedResponse
   * @throws ApiException if fails to make API call
   */
  public OrderExtendedResponse changeapplicationorder(String applicationId, ApplicationOrderChangeRequest applicationOrderChangeRequest) throws ApiException {
    Object localVarPostBody = applicationOrderChangeRequest;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling changeapplicationorder");
    }
    
    // create path and map variables
    String localVarPath = "/financing/v1/applications/{applicationId}/order"
      .replaceAll("\\{" + "applicationId" + "\\}", apiClient.escapeString(applicationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json; charset=utf-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "httpBearer" };

    GenericType<OrderExtendedResponse> localVarReturnType = new GenericType<OrderExtendedResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create application
   * Elementary flow starts when customer wants to use one of Skip Pay's payment method for financing his purchase made in partner e-shop.  | Financing type     | Supported | | ---                | ---       | | `DEFERRED_PAYMENT` | YES       | | `PAY_IN_THREE`     | YES       |  Use `/financing/v1/applications` resource with properly filled request that contains at least following data  - Customer information   - Name (first name and last name - if possible, otherwise full name)   - E-mail   - Phone number  - Order details   - Number   - Total Price (including VAT)   - Total VAT (array of total amounts split by VAT rates)   - Order items (array, at least one item is required)     - Code     - Order item name     - Total price (all pieces, including VAT)     - Total VAT  - Additional information necessary for the continuation and completion of the process   - Your URL where the customer should be redirected after application approval   - Your URL where the customer should be redirected after application rejection   - URL of your notification endpoint you want us to send you notifications about particular application updates  For best customer experience request should contain following data:  - Customer information   - Extra data     - Historical count of customer's transactions made in partner's e-shop  - Order details   - Delivery carrier information   - Address (type BILLING)     - Country     - City     - Street     - Street number     - ZIP     - Address type   - Order items     - Image  - Personal data processing and terms and conditions agreement  If the request was successfully processed, you receive HTTP status code 201 and *application* object with following important information in the response:  - Application unique ID  - Application state  - Application substate  - Gateway redirect URL where you should redirect a customer after processing of the response  - Recurrence ID if you sent `isRecurring=true` in request (for recurring orders)  If the request was recognized as duplication, you receive HTTP status code 200 and the *application* object created during the first related successful request.  __Note__: If the optional *agreementTermsAndConditions* field was not sent with the request (or it was sent with a value of `false`), the *application* will be created with *agreementTermsAndConditions* value set to `false`, *state* `PROCESSING` and *stateReason* `PROCESSING_REDIRECT_NEEDED`.  In other cases, you may receive errors similar to the following ones:  | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 400         | `INVALID_REQUEST`       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 422         | `UNPROCESSABLE`         | Request was well-formed but was unable to be followed due to semantic errors     |Create new *application* of particular financing type
   * @param applicationRequest  (optional)
   * @return ApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationResponse createapplication(ApplicationRequest applicationRequest) throws ApiException {
    Object localVarPostBody = applicationRequest;
    
    // create path and map variables
    String localVarPath = "/financing/v1/applications";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json; charset=utf-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "httpBearer" };

    GenericType<ApplicationResponse> localVarReturnType = new GenericType<ApplicationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create application from recurrence
   * It allows to create application without customer authorization at Skip Pay gate. It needs the recurrence ID to be received previously. This endpoint doesn't need any data about customer.  | Financing type     | Supported | | ---                | ---       | | `DEFERRED_PAYMENT` | YES       | | `PAY_IN_THREE`     | NO        |
   * @param recurrenceId Recurrence ID from first application (required)
   * @param applicationWithoutCustomerRequest  (optional)
   * @return ApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationResponse createapplicationfromrecurrence(String recurrenceId, ApplicationWithoutCustomerRequest applicationWithoutCustomerRequest) throws ApiException {
    Object localVarPostBody = applicationWithoutCustomerRequest;
    
    // verify the required parameter 'recurrenceId' is set
    if (recurrenceId == null) {
      throw new ApiException(400, "Missing the required parameter 'recurrenceId' when calling createapplicationfromrecurrence");
    }
    
    // create path and map variables
    String localVarPath = "/financing/v1/recurrences/{recurrenceId}/applications"
      .replaceAll("\\{" + "recurrenceId" + "\\}", apiClient.escapeString(recurrenceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json; charset=utf-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "httpBearer" };

    GenericType<ApplicationResponse> localVarReturnType = new GenericType<ApplicationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get application detail
   * If you need to find out current information about particular *application* - primarily its state and other details - use `/financing/v1/applications/{applicationId}` resource where `{applicationId}` is the application ID you received in the response of `/financing/v1/applications` after its creation.  | Financing type     | Supported | | ---                | ---       | | `DEFERRED_PAYMENT` | YES       | | `PAY_IN_THREE`     | YES       |  If the request was successfully processed, you receive HTTP status code 200 and *application* object.  In other cases, you may receive errors similar to the following ones:  | Status code | Code                    | Message                                                                          | | ---         | ---                     | ---                                                                              | | 400         | `INVALID_REQUEST`       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 404         | `APPLICATION_NOT_FOUND` | The requested resource could not be found                                        | | 422         | `UNPROCESSABLE`         | The request was well-formed but was unable to be followed due to semantic errors |Get specific *application* detail by ID
   * @param applicationId applicationId (required)
   * @return ApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationResponse getapplicationdetail(String applicationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getapplicationdetail");
    }
    
    // create path and map variables
    String localVarPath = "/financing/v1/applications/{applicationId}"
      .replaceAll("\\{" + "applicationId" + "\\}", apiClient.escapeString(applicationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "httpBearer" };

    GenericType<ApplicationResponse> localVarReturnType = new GenericType<ApplicationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get order
   * If you need to find out current information about particular *order* - primarily its state (or its order items' states) and other details - use `/financing/v1/orders{?orderNumber,orderVariableSymbol,applicationId}` resource where `{applicationId}` is the application ID you received in the response of `/financing/v1/applications` after its creation, `{orderNumber}` is your order's number and `{orderVariableSymbol}` is your order's variable symbol.  | Financing type     | Supported | | ---                | ---       | | `DEFERRED_PAYMENT` | YES       | | `PAY_IN_THREE`     | YES       |  | Application state | Availability | | ---               | ---          | | `PROCESSING`      | YES          | | `REJECTED`        | YES          | | `CANCELLED`       | YES          | | `READY`           | YES          |  If the request was successfully processed, you receive HTTP status code 200 and object of information about specified *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones:  | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 404         | `OBJECT_NOT_FOUND`      | The requested resource could not be found                                        | | 422         | `UNPROCESSABLE`         | The request was well-formed but was unable to be followed due to semantic errors |Search for *order* using specified parameters.  use `/financing/v1/orders` with at least one of following parameter:  - variable symbol,  - order number,  - application number.  <a name=\"orders-parameters-restriction\"></a>
   * @param orderNumber Order Number (optional)
   * @param orderVariableSymbol Order Variable Symbol (optional)
   * @param applicationId applicationId (optional)
   * @return OrderExtendedResponse
   * @throws ApiException if fails to make API call
   */
  public OrderExtendedResponse getorder(String orderNumber, String orderVariableSymbol, String applicationId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/financing/v1/orders";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("orderNumber", orderNumber));
    localVarQueryParams.addAll(apiClient.parameterToPair("orderVariableSymbol", orderVariableSymbol));
    localVarQueryParams.addAll(apiClient.parameterToPair("applicationId", applicationId));

    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "httpBearer" };

    GenericType<OrderExtendedResponse> localVarReturnType = new GenericType<OrderExtendedResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get payments on specific application
   * Get payments on specific *application*  List of realized payments from Skip Pay to partner. In case of multiple invoices, list may contain more items.  feature | supported by resource --- | --- pagingheader-paging | yes sortingheader-sorting | no filteringheader-filtering | no  This resource supports paging. As a value to `before` and `after` parameters, use `paymentId` attribute.  Collection is sorted by paymentId attribute.
   * @param applicationId applicationId (required)
   * @return Getpaymentsonspecificapplicationresponse
   * @throws ApiException if fails to make API call
   */
  public Getpaymentsonspecificapplicationresponse getpaymentsonspecificapplication(String applicationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getpaymentsonspecificapplication");
    }
    
    // create path and map variables
    String localVarPath = "/financing/v1/applications/{applicationId}/payments"
      .replaceAll("\\{" + "applicationId" + "\\}", apiClient.escapeString(applicationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "httpBearer" };

    GenericType<Getpaymentsonspecificapplicationresponse> localVarReturnType = new GenericType<Getpaymentsonspecificapplicationresponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get recurrence
   * It allows to get recurrence detail. You can check if customer authorized your request and if recurrence is ready to be used.  | Financing type     | Supported | | ---                | ---       | | `DEFERRED_PAYMENT` | YES       | | `PAY_IN_THREE`     | NO        |
   * @param recurrenceId recurrenceId (required)
   * @return RecurrenceObject
   * @throws ApiException if fails to make API call
   */
  public RecurrenceObject getrecurrence(String recurrenceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'recurrenceId' is set
    if (recurrenceId == null) {
      throw new ApiException(400, "Missing the required parameter 'recurrenceId' when calling getrecurrence");
    }
    
    // create path and map variables
    String localVarPath = "/financing/v1/recurrences/{recurrenceId}"
      .replaceAll("\\{" + "recurrenceId" + "\\}", apiClient.escapeString(recurrenceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "httpBearer" };

    GenericType<RecurrenceObject> localVarReturnType = new GenericType<RecurrenceObject>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Mark order items as cancelled
   * When some or all order items were cancelled (won't be ever delivered), use `/financing/v1/applications/{applicationId}/order/cancel` resource where `{applicationId}` is the application ID you received in the response of `/financing/v1/applications` after its creation.  | Financing type     | Supported | | ---                | ---       | | `DEFERRED_PAYMENT` | YES       | | `PAY_IN_THREE`     | YES       |  If you want to cancel some items after marking those items as sent or delivered, use [Mark order items as returned](https://developers.skippay.cz/docs/api/markorderitemsasreturned) operation.  | Application state | Availability | | ---               | ---          | | `PROCESSING`      | NO           | | `REJECTED`        | NO           | | `CANCELLED`       | NO           | | `READY`           | YES          |  Use `/financing/v1/applications/{applicationId}/order/cancel` resource with an empty request to cancel all order items (the whole *order*) at once.  If you want to cancel specific order item/s, use `/financing/v1/applications/{applicationId}/order/cancel` resource with properly filled request that contains cancelled order items info. In this case request should contain array of cancelled order items with one or more particular order item identificators (`code`/`EAN`/`name`/`type`) - `code`, `ean`, `name` and `type` is used for identifying order item sent in `Create application`.  > TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as cancelled.  > **ATTENTION:** If multiple properties (`code`, `ean`, `name` or `type`) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones:  | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 400         | `INVALID_REQUEST`       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 404         | `OBJECT_NOT_FOUND`      | The requested resource could not be found                                        | | 422         | `NOT_SUPPORTED`         | Resource is not supported for given financing type                               |Mark order items as cancelled  System notification. Some or all of the order items were cancelled. Based on *application* financing type and partner setting, credit note may be issued.
   * @param applicationId applicationId (required)
   * @param orderItemsChangeRequest  (optional)
   * @return OrderExtendedResponse
   * @throws ApiException if fails to make API call
   */
  public OrderExtendedResponse markorderitemsascancelled(String applicationId, OrderItemsChangeRequest orderItemsChangeRequest) throws ApiException {
    Object localVarPostBody = orderItemsChangeRequest;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling markorderitemsascancelled");
    }
    
    // create path and map variables
    String localVarPath = "/financing/v1/applications/{applicationId}/order/cancel"
      .replaceAll("\\{" + "applicationId" + "\\}", apiClient.escapeString(applicationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json; charset=utf-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "httpBearer" };

    GenericType<OrderExtendedResponse> localVarReturnType = new GenericType<OrderExtendedResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Mark order items as delivered
   * When some or all order items were delivered to the customer, use `/financing/v1/applications/{applicationId}/order/deliver` resource where `{applicationId}` is the application ID you received in the response of `/financing/v1/applications` after its creation.  | Financing type     | Supported | | ---                | ---       | | `DEFERRED_PAYMENT` | YES       | | `PAY_IN_THREE`     | YES       |  | Application state | Availability | | ---               | ---          | | `PROCESSING`      | NO           | | `REJECTED`        | NO           | | `CANCELLED`       | NO           | | `READY`           | YES          |  Use `/financing/v1/applications/{applicationId}/order/deliver` resource with an empty request to mark all order items (the whole *order*) as delivered at once.  If you want to mark specific order item/s as delivered, use `/financing/v1/applications/{applicationId}/order/deliver` resource with properly filled request that contains delivered order items info. In this case request should contain array of delivered order items with one or more particular order item identificators (`code`/`EAN`/`name`/`type`) - `code`, `ean`, `name` and `type` is used for identifying order item sent in `Create application`.  > TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as delivered.  > **ATTENTION:** If multiple properties (`code`, `ean`, `name` or `type`) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones:  | Status code | Code                              | Explanation                                                                       | | ---         | ---                               | ---                                                                               | | 400         | `INVALID_REQUEST`                 | Request was not well formatted (malformed request syntax, size too large, etc.)   | | 404         | `OBJECT_NOT_FOUND`                | The requested resource could not be found                                         | | 422         | `TOTAL_PRICE_LIMIT_EXCEEDED`      | The total price of all subcontracts exceeded the order total price                | | 422         | `NOT_SUPPORTED`                   | Resource is not supported for given financing type                                |Mark order items as delivered.  System notification. Some or all order items were delivered to customer. Based on *application* financing type and partner setting, application payment may be processed.
   * @param applicationId applicationId (required)
   * @param orderItemsDeliverRequest  (optional)
   * @return OrderExtendedResponse
   * @throws ApiException if fails to make API call
   */
  public OrderExtendedResponse markorderitemsasdelivered(String applicationId, OrderItemsDeliverRequest orderItemsDeliverRequest) throws ApiException {
    Object localVarPostBody = orderItemsDeliverRequest;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling markorderitemsasdelivered");
    }
    
    // create path and map variables
    String localVarPath = "/financing/v1/applications/{applicationId}/order/deliver"
      .replaceAll("\\{" + "applicationId" + "\\}", apiClient.escapeString(applicationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json; charset=utf-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "httpBearer" };

    GenericType<OrderExtendedResponse> localVarReturnType = new GenericType<OrderExtendedResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Mark order items as returned
   * When some or all order items were returned by the customer to you (after delivery), use `/financing/v1/applications/{applicationId}/order/return` resource where `{applicationId}` is the application ID you received in the response of `/financing/v1/applications` after its creation.  | Financing type     | Supported | | ---                | ---       | | `DEFERRED_PAYMENT` | YES       | | `PAY_IN_THREE`     | YES       |  If you want to cancel some items before marking those items as sent or delivered, use [Mark order items as cancelled](#reference/application-operations/mark-order-items-as-cancelled) operation.  | Application state | Availability | | ---               | ---          | | `PROCESSING`      | NO           | | `REJECTED`        | NO           | | `CANCELLED`       | NO           | | `READY`           | YES          |  Use `/financing/v1/applications/{applicationId}/order/return` resource with an empty request to mark all order items (the whole *order*) as returned at once.  If you want to mark specific order item/s as returned, use `/financing/v1/applications/{applicationId}/order/return` resource with properly filled request that contains returned order items info. In this case request should contain array of returned order items with one or more particular order item identificators (`code`/`EAN`/`name`/`type`) - `code`, `ean`, `name` and `type` is used for identifying order item sent in `Create application`.  > TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as returned.  > **ATTENTION:** If multiple properties (`code`, `ean`, `name` or `type`) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones:  | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 400         | `INVALID_REQUEST`       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 404         | `OBJECT_NOT_FOUND`      | The requested resource could not be found                                        | | 422         | `NOT_SUPPORTED`         | Resource is not supported for given financing type                               |Mark order items as returned.  System notification. Some or all order items were returned by customer back to e-shop. Based on *application* financing type and partner setting, credit note may be issued.
   * @param applicationId applicationId (required)
   * @param orderItemsReturnRequest  (optional)
   * @return OrderExtendedResponse
   * @throws ApiException if fails to make API call
   */
  public OrderExtendedResponse markorderitemsasreturned(String applicationId, OrderItemsReturnRequest orderItemsReturnRequest) throws ApiException {
    Object localVarPostBody = orderItemsReturnRequest;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling markorderitemsasreturned");
    }
    
    // create path and map variables
    String localVarPath = "/financing/v1/applications/{applicationId}/order/return"
      .replaceAll("\\{" + "applicationId" + "\\}", apiClient.escapeString(applicationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json; charset=utf-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "httpBearer" };

    GenericType<OrderExtendedResponse> localVarReturnType = new GenericType<OrderExtendedResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Mark order items as sent
   * When some or all order items were shipped to the customer, use `/financing/v1/applications/{applicationId}/order/send` resource where `{applicationId}` is the application ID you received in the response of `/financing/v1/applications` after its creation.  | Financing type     | Supported | | ---                | ---       | | `DEFERRED_PAYMENT` | YES       | | `PAY_IN_THREE`     | YES       |  | Application state | Availability| | ---               | ---         | | `PROCESSING`      | NO          | | `REJECTED`        | NO          | | `CANCELLED`       | NO          | | `READY`           | YES         |  Use `/financing/v1/applications/{applicationId}/order/send` resource with an empty request to mark all order items (the whole *order*) as sent at once.  If you want to mark specific order item/s as sent, use `/financing/v1/applications/{applicationId}/order/send` resource with properly filled request that contains sent order items info. In this case request should contain array of sent order items with one or more particular order item identificators (`code`/`EAN`/`name`/`type`) - `code`, `ean`, `name` and `type` is used for identifying order item sent in `Create application`.  > TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as sent.  > **ATTENTION:** If multiple properties (`code`, `ean`, `name` or `type`) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones:  | Status code | Code                            | Explanation                                                                       | | ---         | ---                             | ---                                                                               | | 400         | `INVALID_REQUEST`               | Request was not well formatted (malformed request syntax, size too large, etc.)   | | 404         | `OBJECT_NOT_FOUND`              | The requested resource could not be found                                         | | 422         | `TOTAL_PRICE_LIMIT_EXCEEDED`    | The total price of all subcontracts exceeded the order total price                | | 422         | `NOT_SUPPORTED`                 | Resource is not supported for given financing type                                |Mark order items as sent  System notification. Some or all order items were shipped to customer. Based on *application* financing type and partner setting, application payment may be processed.
   * @param applicationId applicationId (required)
   * @param orderItemsSendRequest  (optional)
   * @return OrderExtendedResponse
   * @throws ApiException if fails to make API call
   */
  public OrderExtendedResponse markorderitemsassent(String applicationId, OrderItemsSendRequest orderItemsSendRequest) throws ApiException {
    Object localVarPostBody = orderItemsSendRequest;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling markorderitemsassent");
    }
    
    // create path and map variables
    String localVarPath = "/financing/v1/applications/{applicationId}/order/send"
      .replaceAll("\\{" + "applicationId" + "\\}", apiClient.escapeString(applicationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json; charset=utf-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "httpBearer" };

    GenericType<OrderExtendedResponse> localVarReturnType = new GenericType<OrderExtendedResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update recurrence
   * It allows to get recurrence detail. You can check if customer authorized your request and if recurrence is ready to be used.  | Financing type     | Supported | | ---                | ---       | | `DEFERRED_PAYMENT` | YES       | | `PAY_IN_THREE`     | NO        |At this moment it allows to change the recurrence state only. It's not neccessary but if you want to be sure that nobody can use the recurrence in the future you can cancel it.
   * @param recurrenceId recurenceId (required)
   * @param recurrenceUpdateRequest  (optional)
   * @return RecurrenceObject
   * @throws ApiException if fails to make API call
   */
  public RecurrenceObject updaterecurrence(String recurrenceId, RecurrenceUpdateRequest recurrenceUpdateRequest) throws ApiException {
    Object localVarPostBody = recurrenceUpdateRequest;
    
    // verify the required parameter 'recurrenceId' is set
    if (recurrenceId == null) {
      throw new ApiException(400, "Missing the required parameter 'recurrenceId' when calling updaterecurrence");
    }
    
    // create path and map variables
    String localVarPath = "/financing/v1/recurrences/{recurrenceId}"
      .replaceAll("\\{" + "recurrenceId" + "\\}", apiClient.escapeString(recurrenceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json; charset=utf-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "httpBearer" };

    GenericType<RecurrenceObject> localVarReturnType = new GenericType<RecurrenceObject>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
