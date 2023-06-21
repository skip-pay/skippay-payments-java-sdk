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

import cz.skippay.ApiCallback;
import cz.skippay.ApiClient;
import cz.skippay.ApiException;
import cz.skippay.ApiResponse;
import cz.skippay.Configuration;
import cz.skippay.Pair;
import cz.skippay.ProgressRequestBody;
import cz.skippay.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import cz.skippay.model.ApplicationBaseResponse;
import cz.skippay.model.Applicationnotificationresponse;
import cz.skippay.model.Payment;
import cz.skippay.model.Paymentnotificationresponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MerchantsitesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MerchantsitesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MerchantsitesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for applicationnotification
     * @param applicationMerchantUrlsNotificationEndpoint application.merchantUrls.notificationEndpoint (required)
     * @param applicationBaseResponse  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Can not process changes </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call applicationnotificationCall(String applicationMerchantUrlsNotificationEndpoint, ApplicationBaseResponse applicationBaseResponse, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = applicationBaseResponse;

        // create path and map variables
        String localVarPath = "/financing/v1/{application.merchantUrls.notificationEndpoint}"
            .replace("{" + "application.merchantUrls.notificationEndpoint" + "}", localVarApiClient.escapeString(applicationMerchantUrlsNotificationEndpoint.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json; charset=utf-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json; charset=utf-8"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "httpBearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call applicationnotificationValidateBeforeCall(String applicationMerchantUrlsNotificationEndpoint, ApplicationBaseResponse applicationBaseResponse, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'applicationMerchantUrlsNotificationEndpoint' is set
        if (applicationMerchantUrlsNotificationEndpoint == null) {
            throw new ApiException("Missing the required parameter 'applicationMerchantUrlsNotificationEndpoint' when calling applicationnotification(Async)");
        }

        return applicationnotificationCall(applicationMerchantUrlsNotificationEndpoint, applicationBaseResponse, _callback);

    }

    /**
     * Application notification
     * We use this resource when there is need to let you know about important changes within particular *application*. Namely in following situations:  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  &gt; IMPORTANT NOTE: This service should be developed and exposed by partner e-shops to allow Skip Pay to asynchronously inform these partners about important changes regarding particular applications.  | Trigger                                                             | Corresponding Application.stateReason | Expected reaction                                                                        | | ---                                                                 | ---                                   | ---                                                                                      | | Application was rejected                                            | &#x60;REJECTED&#x60;                            | You should probably cancel respective order and release reserved goods                   | | Application was cancelled                                           | &#x60;CANCELLED_NOT_PAID&#x60;                  | You should probably cancel respective order and release reserved goods                   | | Order to dispatch (we commit to finance customer&#39;s order)           | &#x60;READY_TO_SHIP&#x60;                       | Dispatch the order to the customer                                                       | | Order dispatched                                                    | &#x60;READY_SHIPPED&#x60;                       | None - serves as an acknowledgment (partner should know about this change)               | | Order delivered                                                     | &#x60;READY_DELIVERED&#x60;                     | None - serves as an acknowledgment (partner should know about this change)               | | Application was paid to the partner                                 | &#x60;READY_PAID&#x60;                          | Financial compensation for the application has been processed - check your bank account  |  &gt; NOTE: READY_PAID state is set when at least part of the application price was paid to the partner, not necessarily full application price. This also applies to the &#x60;Application was paid to the partner&#x60; application notification trigger.  We fill the request with following information:  - Application unique ID  - Application state  - Application substate  &gt; IMPORTANT: You should always double check the state of Application on &#x60;/financing/v1/applications/{applicationId}&#x60; resource due to security reasons.  If notification is not processed due to error or unavailability it is automatically sent again (retried) after 1, 5, 5, 5 a 5 minutes by default (5 tries in total).Notify partner about changes in application.
     * @param applicationMerchantUrlsNotificationEndpoint application.merchantUrls.notificationEndpoint (required)
     * @param applicationBaseResponse  (optional)
     * @return Applicationnotificationresponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Can not process changes </td><td>  -  </td></tr>
     </table>
     */
    public Applicationnotificationresponse applicationnotification(String applicationMerchantUrlsNotificationEndpoint, ApplicationBaseResponse applicationBaseResponse) throws ApiException {
        ApiResponse<Applicationnotificationresponse> localVarResp = applicationnotificationWithHttpInfo(applicationMerchantUrlsNotificationEndpoint, applicationBaseResponse);
        return localVarResp.getData();
    }

    /**
     * Application notification
     * We use this resource when there is need to let you know about important changes within particular *application*. Namely in following situations:  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  &gt; IMPORTANT NOTE: This service should be developed and exposed by partner e-shops to allow Skip Pay to asynchronously inform these partners about important changes regarding particular applications.  | Trigger                                                             | Corresponding Application.stateReason | Expected reaction                                                                        | | ---                                                                 | ---                                   | ---                                                                                      | | Application was rejected                                            | &#x60;REJECTED&#x60;                            | You should probably cancel respective order and release reserved goods                   | | Application was cancelled                                           | &#x60;CANCELLED_NOT_PAID&#x60;                  | You should probably cancel respective order and release reserved goods                   | | Order to dispatch (we commit to finance customer&#39;s order)           | &#x60;READY_TO_SHIP&#x60;                       | Dispatch the order to the customer                                                       | | Order dispatched                                                    | &#x60;READY_SHIPPED&#x60;                       | None - serves as an acknowledgment (partner should know about this change)               | | Order delivered                                                     | &#x60;READY_DELIVERED&#x60;                     | None - serves as an acknowledgment (partner should know about this change)               | | Application was paid to the partner                                 | &#x60;READY_PAID&#x60;                          | Financial compensation for the application has been processed - check your bank account  |  &gt; NOTE: READY_PAID state is set when at least part of the application price was paid to the partner, not necessarily full application price. This also applies to the &#x60;Application was paid to the partner&#x60; application notification trigger.  We fill the request with following information:  - Application unique ID  - Application state  - Application substate  &gt; IMPORTANT: You should always double check the state of Application on &#x60;/financing/v1/applications/{applicationId}&#x60; resource due to security reasons.  If notification is not processed due to error or unavailability it is automatically sent again (retried) after 1, 5, 5, 5 a 5 minutes by default (5 tries in total).Notify partner about changes in application.
     * @param applicationMerchantUrlsNotificationEndpoint application.merchantUrls.notificationEndpoint (required)
     * @param applicationBaseResponse  (optional)
     * @return ApiResponse&lt;Applicationnotificationresponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Can not process changes </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Applicationnotificationresponse> applicationnotificationWithHttpInfo(String applicationMerchantUrlsNotificationEndpoint, ApplicationBaseResponse applicationBaseResponse) throws ApiException {
        okhttp3.Call localVarCall = applicationnotificationValidateBeforeCall(applicationMerchantUrlsNotificationEndpoint, applicationBaseResponse, null);
        Type localVarReturnType = new TypeToken<Applicationnotificationresponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Application notification (asynchronously)
     * We use this resource when there is need to let you know about important changes within particular *application*. Namely in following situations:  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  &gt; IMPORTANT NOTE: This service should be developed and exposed by partner e-shops to allow Skip Pay to asynchronously inform these partners about important changes regarding particular applications.  | Trigger                                                             | Corresponding Application.stateReason | Expected reaction                                                                        | | ---                                                                 | ---                                   | ---                                                                                      | | Application was rejected                                            | &#x60;REJECTED&#x60;                            | You should probably cancel respective order and release reserved goods                   | | Application was cancelled                                           | &#x60;CANCELLED_NOT_PAID&#x60;                  | You should probably cancel respective order and release reserved goods                   | | Order to dispatch (we commit to finance customer&#39;s order)           | &#x60;READY_TO_SHIP&#x60;                       | Dispatch the order to the customer                                                       | | Order dispatched                                                    | &#x60;READY_SHIPPED&#x60;                       | None - serves as an acknowledgment (partner should know about this change)               | | Order delivered                                                     | &#x60;READY_DELIVERED&#x60;                     | None - serves as an acknowledgment (partner should know about this change)               | | Application was paid to the partner                                 | &#x60;READY_PAID&#x60;                          | Financial compensation for the application has been processed - check your bank account  |  &gt; NOTE: READY_PAID state is set when at least part of the application price was paid to the partner, not necessarily full application price. This also applies to the &#x60;Application was paid to the partner&#x60; application notification trigger.  We fill the request with following information:  - Application unique ID  - Application state  - Application substate  &gt; IMPORTANT: You should always double check the state of Application on &#x60;/financing/v1/applications/{applicationId}&#x60; resource due to security reasons.  If notification is not processed due to error or unavailability it is automatically sent again (retried) after 1, 5, 5, 5 a 5 minutes by default (5 tries in total).Notify partner about changes in application.
     * @param applicationMerchantUrlsNotificationEndpoint application.merchantUrls.notificationEndpoint (required)
     * @param applicationBaseResponse  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Can not process changes </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call applicationnotificationAsync(String applicationMerchantUrlsNotificationEndpoint, ApplicationBaseResponse applicationBaseResponse, final ApiCallback<Applicationnotificationresponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = applicationnotificationValidateBeforeCall(applicationMerchantUrlsNotificationEndpoint, applicationBaseResponse, _callback);
        Type localVarReturnType = new TypeToken<Applicationnotificationresponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for paymentnotification
     * @param applicationMerchantUrlsPaymentEndpoint application.merchantUrls.paymentEndpoint (required)
     * @param payment  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call paymentnotificationCall(String applicationMerchantUrlsPaymentEndpoint, Payment payment, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = payment;

        // create path and map variables
        String localVarPath = "/financing/v1/{application.merchantUrls.paymentEndpoint}"
            .replace("{" + "application.merchantUrls.paymentEndpoint" + "}", localVarApiClient.escapeString(applicationMerchantUrlsPaymentEndpoint.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json; charset=utf-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json; charset=utf-8"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "httpBearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call paymentnotificationValidateBeforeCall(String applicationMerchantUrlsPaymentEndpoint, Payment payment, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'applicationMerchantUrlsPaymentEndpoint' is set
        if (applicationMerchantUrlsPaymentEndpoint == null) {
            throw new ApiException("Missing the required parameter 'applicationMerchantUrlsPaymentEndpoint' when calling paymentnotification(Async)");
        }

        return paymentnotificationCall(applicationMerchantUrlsPaymentEndpoint, payment, _callback);

    }

    /**
     * Payment notification
     * | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |Notification about new payment.
     * @param applicationMerchantUrlsPaymentEndpoint application.merchantUrls.paymentEndpoint (required)
     * @param payment  (optional)
     * @return Paymentnotificationresponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Paymentnotificationresponse paymentnotification(String applicationMerchantUrlsPaymentEndpoint, Payment payment) throws ApiException {
        ApiResponse<Paymentnotificationresponse> localVarResp = paymentnotificationWithHttpInfo(applicationMerchantUrlsPaymentEndpoint, payment);
        return localVarResp.getData();
    }

    /**
     * Payment notification
     * | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |Notification about new payment.
     * @param applicationMerchantUrlsPaymentEndpoint application.merchantUrls.paymentEndpoint (required)
     * @param payment  (optional)
     * @return ApiResponse&lt;Paymentnotificationresponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Paymentnotificationresponse> paymentnotificationWithHttpInfo(String applicationMerchantUrlsPaymentEndpoint, Payment payment) throws ApiException {
        okhttp3.Call localVarCall = paymentnotificationValidateBeforeCall(applicationMerchantUrlsPaymentEndpoint, payment, null);
        Type localVarReturnType = new TypeToken<Paymentnotificationresponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Payment notification (asynchronously)
     * | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |Notification about new payment.
     * @param applicationMerchantUrlsPaymentEndpoint application.merchantUrls.paymentEndpoint (required)
     * @param payment  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call paymentnotificationAsync(String applicationMerchantUrlsPaymentEndpoint, Payment payment, final ApiCallback<Paymentnotificationresponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = paymentnotificationValidateBeforeCall(applicationMerchantUrlsPaymentEndpoint, payment, _callback);
        Type localVarReturnType = new TypeToken<Paymentnotificationresponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
