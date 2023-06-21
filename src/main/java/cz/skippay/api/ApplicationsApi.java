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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ApplicationsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ApplicationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationsApi(ApiClient apiClient) {
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
     * Build call for cancelapplication
     * @param applicationId applicationId (required)
     * @param applicationCancelRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Application was cancelled </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Application can not be cancelled </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelapplicationCall(String applicationId, ApplicationCancelRequest applicationCancelRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = applicationCancelRequest;

        // create path and map variables
        String localVarPath = "/financing/v1/applications/{applicationId}/cancel"
            .replace("{" + "applicationId" + "}", localVarApiClient.escapeString(applicationId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelapplicationValidateBeforeCall(String applicationId, ApplicationCancelRequest applicationCancelRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling cancelapplication(Async)");
        }

        return cancelapplicationCall(applicationId, applicationCancelRequest, _callback);

    }

    /**
     * Cancel application
     * If there is need to completely cancel customer&#39;s *order*, it is necessary to cancel respective *application*. For this purpose use &#x60;/financing/v1/applications/{applicationId}/cancel&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability                                                                                                                                                  | | ---               | ---                                                                                                                                                           | | &#x60;REJECTED&#x60;        | NO                                                                                                                                                            | | &#x60;CANCELLED&#x60;       | NO                                                                                                                                                            | | &#x60;PROCESSING&#x60;      | YES                                                                                                                                                           | | &#x60;READY&#x60;           | YES *(available only when the Application&#39;s order is not marked as sent (via *Mark order items as sent*) or delivered (via *Mark order items as delivered*))  |  If the request was successfully processed, you receive HTTP status code 200 and object of information about cancelled *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                                  | Explanation                                                                                           | | ---         | ---                                   | ---                                                                                                   | | 400         | &#x60;INVALID_REQUEST&#x60;                     | Request was not well formatted (malformed request syntax, size too large, etc.)                       | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;                    | The requested resource could not be found                                                             | | 422         | &#x60;UNPROCESSABLE&#x60;                       | The request was well-formed but was unable to be followed due to semantic errors                      | | 422         | &#x60;APPLICATION_REJECTED&#x60;                | When you try to cancel &#x60;Application&#x60; already &#x60;REJECTED&#x60;, which is not allowed                         | | 422         | &#x60;APPLICATION_ALREADY_CANCELLED&#x60;       | When you try to cancel &#x60;Application&#x60; that has been cancelled already                                  | | 422         | &#x60;APPLICATION_VALIDATION_IN_PROGRESS&#x60;  | When you try to cancel &#x60;Application&#x60; which undergoes validation                                       | | 422         | &#x60;APPLICATION_PAID&#x60;                    | When you try to cancel &#x60;Application&#x60; already paid, which is not allowed                               | | 422         | &#x60;NOT_SUPPORTED&#x60;                       | The request was well-formed but server was not able to change application state due internal rules    |Cancel *application*.
     * @param applicationId applicationId (required)
     * @param applicationCancelRequest  (optional)
     * @return ApplicationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Application was cancelled </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Application can not be cancelled </td><td>  -  </td></tr>
     </table>
     */
    public ApplicationResponse cancelapplication(String applicationId, ApplicationCancelRequest applicationCancelRequest) throws ApiException {
        ApiResponse<ApplicationResponse> localVarResp = cancelapplicationWithHttpInfo(applicationId, applicationCancelRequest);
        return localVarResp.getData();
    }

    /**
     * Cancel application
     * If there is need to completely cancel customer&#39;s *order*, it is necessary to cancel respective *application*. For this purpose use &#x60;/financing/v1/applications/{applicationId}/cancel&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability                                                                                                                                                  | | ---               | ---                                                                                                                                                           | | &#x60;REJECTED&#x60;        | NO                                                                                                                                                            | | &#x60;CANCELLED&#x60;       | NO                                                                                                                                                            | | &#x60;PROCESSING&#x60;      | YES                                                                                                                                                           | | &#x60;READY&#x60;           | YES *(available only when the Application&#39;s order is not marked as sent (via *Mark order items as sent*) or delivered (via *Mark order items as delivered*))  |  If the request was successfully processed, you receive HTTP status code 200 and object of information about cancelled *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                                  | Explanation                                                                                           | | ---         | ---                                   | ---                                                                                                   | | 400         | &#x60;INVALID_REQUEST&#x60;                     | Request was not well formatted (malformed request syntax, size too large, etc.)                       | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;                    | The requested resource could not be found                                                             | | 422         | &#x60;UNPROCESSABLE&#x60;                       | The request was well-formed but was unable to be followed due to semantic errors                      | | 422         | &#x60;APPLICATION_REJECTED&#x60;                | When you try to cancel &#x60;Application&#x60; already &#x60;REJECTED&#x60;, which is not allowed                         | | 422         | &#x60;APPLICATION_ALREADY_CANCELLED&#x60;       | When you try to cancel &#x60;Application&#x60; that has been cancelled already                                  | | 422         | &#x60;APPLICATION_VALIDATION_IN_PROGRESS&#x60;  | When you try to cancel &#x60;Application&#x60; which undergoes validation                                       | | 422         | &#x60;APPLICATION_PAID&#x60;                    | When you try to cancel &#x60;Application&#x60; already paid, which is not allowed                               | | 422         | &#x60;NOT_SUPPORTED&#x60;                       | The request was well-formed but server was not able to change application state due internal rules    |Cancel *application*.
     * @param applicationId applicationId (required)
     * @param applicationCancelRequest  (optional)
     * @return ApiResponse&lt;ApplicationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Application was cancelled </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Application can not be cancelled </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApplicationResponse> cancelapplicationWithHttpInfo(String applicationId, ApplicationCancelRequest applicationCancelRequest) throws ApiException {
        okhttp3.Call localVarCall = cancelapplicationValidateBeforeCall(applicationId, applicationCancelRequest, null);
        Type localVarReturnType = new TypeToken<ApplicationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Cancel application (asynchronously)
     * If there is need to completely cancel customer&#39;s *order*, it is necessary to cancel respective *application*. For this purpose use &#x60;/financing/v1/applications/{applicationId}/cancel&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability                                                                                                                                                  | | ---               | ---                                                                                                                                                           | | &#x60;REJECTED&#x60;        | NO                                                                                                                                                            | | &#x60;CANCELLED&#x60;       | NO                                                                                                                                                            | | &#x60;PROCESSING&#x60;      | YES                                                                                                                                                           | | &#x60;READY&#x60;           | YES *(available only when the Application&#39;s order is not marked as sent (via *Mark order items as sent*) or delivered (via *Mark order items as delivered*))  |  If the request was successfully processed, you receive HTTP status code 200 and object of information about cancelled *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                                  | Explanation                                                                                           | | ---         | ---                                   | ---                                                                                                   | | 400         | &#x60;INVALID_REQUEST&#x60;                     | Request was not well formatted (malformed request syntax, size too large, etc.)                       | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;                    | The requested resource could not be found                                                             | | 422         | &#x60;UNPROCESSABLE&#x60;                       | The request was well-formed but was unable to be followed due to semantic errors                      | | 422         | &#x60;APPLICATION_REJECTED&#x60;                | When you try to cancel &#x60;Application&#x60; already &#x60;REJECTED&#x60;, which is not allowed                         | | 422         | &#x60;APPLICATION_ALREADY_CANCELLED&#x60;       | When you try to cancel &#x60;Application&#x60; that has been cancelled already                                  | | 422         | &#x60;APPLICATION_VALIDATION_IN_PROGRESS&#x60;  | When you try to cancel &#x60;Application&#x60; which undergoes validation                                       | | 422         | &#x60;APPLICATION_PAID&#x60;                    | When you try to cancel &#x60;Application&#x60; already paid, which is not allowed                               | | 422         | &#x60;NOT_SUPPORTED&#x60;                       | The request was well-formed but server was not able to change application state due internal rules    |Cancel *application*.
     * @param applicationId applicationId (required)
     * @param applicationCancelRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Application was cancelled </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Application can not be cancelled </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelapplicationAsync(String applicationId, ApplicationCancelRequest applicationCancelRequest, final ApiCallback<ApplicationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelapplicationValidateBeforeCall(applicationId, applicationCancelRequest, _callback);
        Type localVarReturnType = new TypeToken<ApplicationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for changeapplicationorder
     * @param applicationId applicationId (required)
     * @param applicationOrderChangeRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order was changed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Order can not be changed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call changeapplicationorderCall(String applicationId, ApplicationOrderChangeRequest applicationOrderChangeRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = applicationOrderChangeRequest;

        // create path and map variables
        String localVarPath = "/financing/v1/applications/{applicationId}/order"
            .replace("{" + "applicationId" + "}", localVarApiClient.escapeString(applicationId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call changeapplicationorderValidateBeforeCall(String applicationId, ApplicationOrderChangeRequest applicationOrderChangeRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling changeapplicationorder(Async)");
        }

        return changeapplicationorderCall(applicationId, applicationOrderChangeRequest, _callback);

    }

    /**
     * Change application order
     * When there&#39;s some changes within *order* before delivery (e.g. change in order items that impacts the total price of the *order*, or other billing information), use &#x60;/financing/v1/applications/{applicationId}/order&#x60; resource in order we can adjust everything properly. &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability | | ---               | ---          | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;PROCESSING&#x60;      | YES          | | &#x60;READY&#x60;           | YES *        |  &gt; \\* Order items can&#39;t be changed when some of them are marked as sent (via Mark order items as sent) or delivered (via Mark order items as delivered)  Use &#x60;/financing/v1/applications/{applicationId}/order&#x60; resource with properly filled request that contains (only) changed data (resource allows partial put).  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                     | | ---         | ---                     | ---                                                                             | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.) | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                       | | 422         | &#x60;NOT_SUPPORTED&#x60;         | Resource is not supported for given financing type                              |Change *order*. Used to change order items, total amount, billing details etc.
     * @param applicationId applicationId (required)
     * @param applicationOrderChangeRequest  (optional)
     * @return OrderExtendedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order was changed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Order can not be changed. </td><td>  -  </td></tr>
     </table>
     */
    public OrderExtendedResponse changeapplicationorder(String applicationId, ApplicationOrderChangeRequest applicationOrderChangeRequest) throws ApiException {
        ApiResponse<OrderExtendedResponse> localVarResp = changeapplicationorderWithHttpInfo(applicationId, applicationOrderChangeRequest);
        return localVarResp.getData();
    }

    /**
     * Change application order
     * When there&#39;s some changes within *order* before delivery (e.g. change in order items that impacts the total price of the *order*, or other billing information), use &#x60;/financing/v1/applications/{applicationId}/order&#x60; resource in order we can adjust everything properly. &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability | | ---               | ---          | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;PROCESSING&#x60;      | YES          | | &#x60;READY&#x60;           | YES *        |  &gt; \\* Order items can&#39;t be changed when some of them are marked as sent (via Mark order items as sent) or delivered (via Mark order items as delivered)  Use &#x60;/financing/v1/applications/{applicationId}/order&#x60; resource with properly filled request that contains (only) changed data (resource allows partial put).  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                     | | ---         | ---                     | ---                                                                             | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.) | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                       | | 422         | &#x60;NOT_SUPPORTED&#x60;         | Resource is not supported for given financing type                              |Change *order*. Used to change order items, total amount, billing details etc.
     * @param applicationId applicationId (required)
     * @param applicationOrderChangeRequest  (optional)
     * @return ApiResponse&lt;OrderExtendedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order was changed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Order can not be changed. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OrderExtendedResponse> changeapplicationorderWithHttpInfo(String applicationId, ApplicationOrderChangeRequest applicationOrderChangeRequest) throws ApiException {
        okhttp3.Call localVarCall = changeapplicationorderValidateBeforeCall(applicationId, applicationOrderChangeRequest, null);
        Type localVarReturnType = new TypeToken<OrderExtendedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Change application order (asynchronously)
     * When there&#39;s some changes within *order* before delivery (e.g. change in order items that impacts the total price of the *order*, or other billing information), use &#x60;/financing/v1/applications/{applicationId}/order&#x60; resource in order we can adjust everything properly. &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability | | ---               | ---          | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;PROCESSING&#x60;      | YES          | | &#x60;READY&#x60;           | YES *        |  &gt; \\* Order items can&#39;t be changed when some of them are marked as sent (via Mark order items as sent) or delivered (via Mark order items as delivered)  Use &#x60;/financing/v1/applications/{applicationId}/order&#x60; resource with properly filled request that contains (only) changed data (resource allows partial put).  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                     | | ---         | ---                     | ---                                                                             | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.) | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                       | | 422         | &#x60;NOT_SUPPORTED&#x60;         | Resource is not supported for given financing type                              |Change *order*. Used to change order items, total amount, billing details etc.
     * @param applicationId applicationId (required)
     * @param applicationOrderChangeRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order was changed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Order can not be changed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call changeapplicationorderAsync(String applicationId, ApplicationOrderChangeRequest applicationOrderChangeRequest, final ApiCallback<OrderExtendedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = changeapplicationorderValidateBeforeCall(applicationId, applicationOrderChangeRequest, _callback);
        Type localVarReturnType = new TypeToken<OrderExtendedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createapplication
     * @param applicationRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Application data is duplicate. Existing application is returned. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Application was created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was an error processing request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createapplicationCall(ApplicationRequest applicationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = applicationRequest;

        // create path and map variables
        String localVarPath = "/financing/v1/applications";

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
    private okhttp3.Call createapplicationValidateBeforeCall(ApplicationRequest applicationRequest, final ApiCallback _callback) throws ApiException {
        return createapplicationCall(applicationRequest, _callback);

    }

    /**
     * Create application
     * Elementary flow starts when customer wants to use one of Skip Pay&#39;s payment method for financing his purchase made in partner e-shop.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  Use &#x60;/financing/v1/applications&#x60; resource with properly filled request that contains at least following data  - Customer information   - Name (first name and last name - if possible, otherwise full name)   - E-mail   - Phone number  - Order details   - Number   - Total Price (including VAT)   - Total VAT (array of total amounts split by VAT rates)   - Order items (array, at least one item is required)     - Code     - Order item name     - Total price (all pieces, including VAT)     - Total VAT  - Additional information necessary for the continuation and completion of the process   - Your URL where the customer should be redirected after application approval   - Your URL where the customer should be redirected after application rejection   - URL of your notification endpoint you want us to send you notifications about particular application updates  For best customer experience request should contain following data:  - Customer information   - Extra data     - Historical count of customer&#39;s transactions made in partner&#39;s e-shop  - Order details   - Delivery carrier information   - Address (type BILLING)     - Country     - City     - Street     - Street number     - ZIP     - Address type   - Order items     - Image  - Personal data processing and terms and conditions agreement  If the request was successfully processed, you receive HTTP status code 201 and *application* object with following important information in the response:  - Application unique ID  - Application state  - Application substate  - Gateway redirect URL where you should redirect a customer after processing of the response  - Recurrence ID if you sent &#x60;isRecurring&#x3D;true&#x60; in request (for recurring orders)  If the request was recognized as duplication, you receive HTTP status code 200 and the *application* object created during the first related successful request.  __Note__: If the optional *agreementTermsAndConditions* field was not sent with the request (or it was sent with a value of &#x60;false&#x60;), the *application* will be created with *agreementTermsAndConditions* value set to &#x60;false&#x60;, *state* &#x60;PROCESSING&#x60; and *stateReason* &#x60;PROCESSING_REDIRECT_NEEDED&#x60;.  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 422         | &#x60;UNPROCESSABLE&#x60;         | Request was well-formed but was unable to be followed due to semantic errors     |Create new *application* of particular financing type
     * @param applicationRequest  (optional)
     * @return ApplicationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Application data is duplicate. Existing application is returned. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Application was created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was an error processing request </td><td>  -  </td></tr>
     </table>
     */
    public ApplicationResponse createapplication(ApplicationRequest applicationRequest) throws ApiException {
        ApiResponse<ApplicationResponse> localVarResp = createapplicationWithHttpInfo(applicationRequest);
        return localVarResp.getData();
    }

    /**
     * Create application
     * Elementary flow starts when customer wants to use one of Skip Pay&#39;s payment method for financing his purchase made in partner e-shop.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  Use &#x60;/financing/v1/applications&#x60; resource with properly filled request that contains at least following data  - Customer information   - Name (first name and last name - if possible, otherwise full name)   - E-mail   - Phone number  - Order details   - Number   - Total Price (including VAT)   - Total VAT (array of total amounts split by VAT rates)   - Order items (array, at least one item is required)     - Code     - Order item name     - Total price (all pieces, including VAT)     - Total VAT  - Additional information necessary for the continuation and completion of the process   - Your URL where the customer should be redirected after application approval   - Your URL where the customer should be redirected after application rejection   - URL of your notification endpoint you want us to send you notifications about particular application updates  For best customer experience request should contain following data:  - Customer information   - Extra data     - Historical count of customer&#39;s transactions made in partner&#39;s e-shop  - Order details   - Delivery carrier information   - Address (type BILLING)     - Country     - City     - Street     - Street number     - ZIP     - Address type   - Order items     - Image  - Personal data processing and terms and conditions agreement  If the request was successfully processed, you receive HTTP status code 201 and *application* object with following important information in the response:  - Application unique ID  - Application state  - Application substate  - Gateway redirect URL where you should redirect a customer after processing of the response  - Recurrence ID if you sent &#x60;isRecurring&#x3D;true&#x60; in request (for recurring orders)  If the request was recognized as duplication, you receive HTTP status code 200 and the *application* object created during the first related successful request.  __Note__: If the optional *agreementTermsAndConditions* field was not sent with the request (or it was sent with a value of &#x60;false&#x60;), the *application* will be created with *agreementTermsAndConditions* value set to &#x60;false&#x60;, *state* &#x60;PROCESSING&#x60; and *stateReason* &#x60;PROCESSING_REDIRECT_NEEDED&#x60;.  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 422         | &#x60;UNPROCESSABLE&#x60;         | Request was well-formed but was unable to be followed due to semantic errors     |Create new *application* of particular financing type
     * @param applicationRequest  (optional)
     * @return ApiResponse&lt;ApplicationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Application data is duplicate. Existing application is returned. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Application was created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was an error processing request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApplicationResponse> createapplicationWithHttpInfo(ApplicationRequest applicationRequest) throws ApiException {
        okhttp3.Call localVarCall = createapplicationValidateBeforeCall(applicationRequest, null);
        Type localVarReturnType = new TypeToken<ApplicationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create application (asynchronously)
     * Elementary flow starts when customer wants to use one of Skip Pay&#39;s payment method for financing his purchase made in partner e-shop.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  Use &#x60;/financing/v1/applications&#x60; resource with properly filled request that contains at least following data  - Customer information   - Name (first name and last name - if possible, otherwise full name)   - E-mail   - Phone number  - Order details   - Number   - Total Price (including VAT)   - Total VAT (array of total amounts split by VAT rates)   - Order items (array, at least one item is required)     - Code     - Order item name     - Total price (all pieces, including VAT)     - Total VAT  - Additional information necessary for the continuation and completion of the process   - Your URL where the customer should be redirected after application approval   - Your URL where the customer should be redirected after application rejection   - URL of your notification endpoint you want us to send you notifications about particular application updates  For best customer experience request should contain following data:  - Customer information   - Extra data     - Historical count of customer&#39;s transactions made in partner&#39;s e-shop  - Order details   - Delivery carrier information   - Address (type BILLING)     - Country     - City     - Street     - Street number     - ZIP     - Address type   - Order items     - Image  - Personal data processing and terms and conditions agreement  If the request was successfully processed, you receive HTTP status code 201 and *application* object with following important information in the response:  - Application unique ID  - Application state  - Application substate  - Gateway redirect URL where you should redirect a customer after processing of the response  - Recurrence ID if you sent &#x60;isRecurring&#x3D;true&#x60; in request (for recurring orders)  If the request was recognized as duplication, you receive HTTP status code 200 and the *application* object created during the first related successful request.  __Note__: If the optional *agreementTermsAndConditions* field was not sent with the request (or it was sent with a value of &#x60;false&#x60;), the *application* will be created with *agreementTermsAndConditions* value set to &#x60;false&#x60;, *state* &#x60;PROCESSING&#x60; and *stateReason* &#x60;PROCESSING_REDIRECT_NEEDED&#x60;.  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 422         | &#x60;UNPROCESSABLE&#x60;         | Request was well-formed but was unable to be followed due to semantic errors     |Create new *application* of particular financing type
     * @param applicationRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Application data is duplicate. Existing application is returned. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Application was created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was an error processing request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createapplicationAsync(ApplicationRequest applicationRequest, final ApiCallback<ApplicationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createapplicationValidateBeforeCall(applicationRequest, _callback);
        Type localVarReturnType = new TypeToken<ApplicationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createapplicationfromrecurrence
     * @param recurrenceId Recurrence ID from first application (required)
     * @param applicationWithoutCustomerRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Application was created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was an error processing request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> There is no recurrence </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Recurrence could not be used or invalid input data </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createapplicationfromrecurrenceCall(String recurrenceId, ApplicationWithoutCustomerRequest applicationWithoutCustomerRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = applicationWithoutCustomerRequest;

        // create path and map variables
        String localVarPath = "/financing/v1/recurrences/{recurrenceId}/applications"
            .replace("{" + "recurrenceId" + "}", localVarApiClient.escapeString(recurrenceId.toString()));

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
    private okhttp3.Call createapplicationfromrecurrenceValidateBeforeCall(String recurrenceId, ApplicationWithoutCustomerRequest applicationWithoutCustomerRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'recurrenceId' is set
        if (recurrenceId == null) {
            throw new ApiException("Missing the required parameter 'recurrenceId' when calling createapplicationfromrecurrence(Async)");
        }

        return createapplicationfromrecurrenceCall(recurrenceId, applicationWithoutCustomerRequest, _callback);

    }

    /**
     * Create application from recurrence
     * It allows to create application without customer authorization at Skip Pay gate. It needs the recurrence ID to be received previously. This endpoint doesn&#39;t need any data about customer.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | NO        |
     * @param recurrenceId Recurrence ID from first application (required)
     * @param applicationWithoutCustomerRequest  (optional)
     * @return ApplicationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Application was created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was an error processing request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> There is no recurrence </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Recurrence could not be used or invalid input data </td><td>  -  </td></tr>
     </table>
     */
    public ApplicationResponse createapplicationfromrecurrence(String recurrenceId, ApplicationWithoutCustomerRequest applicationWithoutCustomerRequest) throws ApiException {
        ApiResponse<ApplicationResponse> localVarResp = createapplicationfromrecurrenceWithHttpInfo(recurrenceId, applicationWithoutCustomerRequest);
        return localVarResp.getData();
    }

    /**
     * Create application from recurrence
     * It allows to create application without customer authorization at Skip Pay gate. It needs the recurrence ID to be received previously. This endpoint doesn&#39;t need any data about customer.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | NO        |
     * @param recurrenceId Recurrence ID from first application (required)
     * @param applicationWithoutCustomerRequest  (optional)
     * @return ApiResponse&lt;ApplicationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Application was created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was an error processing request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> There is no recurrence </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Recurrence could not be used or invalid input data </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApplicationResponse> createapplicationfromrecurrenceWithHttpInfo(String recurrenceId, ApplicationWithoutCustomerRequest applicationWithoutCustomerRequest) throws ApiException {
        okhttp3.Call localVarCall = createapplicationfromrecurrenceValidateBeforeCall(recurrenceId, applicationWithoutCustomerRequest, null);
        Type localVarReturnType = new TypeToken<ApplicationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create application from recurrence (asynchronously)
     * It allows to create application without customer authorization at Skip Pay gate. It needs the recurrence ID to be received previously. This endpoint doesn&#39;t need any data about customer.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | NO        |
     * @param recurrenceId Recurrence ID from first application (required)
     * @param applicationWithoutCustomerRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Application was created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was an error processing request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> There is no recurrence </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Recurrence could not be used or invalid input data </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createapplicationfromrecurrenceAsync(String recurrenceId, ApplicationWithoutCustomerRequest applicationWithoutCustomerRequest, final ApiCallback<ApplicationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createapplicationfromrecurrenceValidateBeforeCall(recurrenceId, applicationWithoutCustomerRequest, _callback);
        Type localVarReturnType = new TypeToken<ApplicationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getapplicationdetail
     * @param applicationId applicationId (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Actual application data </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Application does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getapplicationdetailCall(String applicationId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/financing/v1/applications/{applicationId}"
            .replace("{" + "applicationId" + "}", localVarApiClient.escapeString(applicationId.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "httpBearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getapplicationdetailValidateBeforeCall(String applicationId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling getapplicationdetail(Async)");
        }

        return getapplicationdetailCall(applicationId, _callback);

    }

    /**
     * Get application detail
     * If you need to find out current information about particular *application* - primarily its state and other details - use &#x60;/financing/v1/applications/{applicationId}&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  If the request was successfully processed, you receive HTTP status code 200 and *application* object.  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Message                                                                          | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 404         | &#x60;APPLICATION_NOT_FOUND&#x60; | The requested resource could not be found                                        | | 422         | &#x60;UNPROCESSABLE&#x60;         | The request was well-formed but was unable to be followed due to semantic errors |Get specific *application* detail by ID
     * @param applicationId applicationId (required)
     * @return ApplicationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Actual application data </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Application does not exist </td><td>  -  </td></tr>
     </table>
     */
    public ApplicationResponse getapplicationdetail(String applicationId) throws ApiException {
        ApiResponse<ApplicationResponse> localVarResp = getapplicationdetailWithHttpInfo(applicationId);
        return localVarResp.getData();
    }

    /**
     * Get application detail
     * If you need to find out current information about particular *application* - primarily its state and other details - use &#x60;/financing/v1/applications/{applicationId}&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  If the request was successfully processed, you receive HTTP status code 200 and *application* object.  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Message                                                                          | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 404         | &#x60;APPLICATION_NOT_FOUND&#x60; | The requested resource could not be found                                        | | 422         | &#x60;UNPROCESSABLE&#x60;         | The request was well-formed but was unable to be followed due to semantic errors |Get specific *application* detail by ID
     * @param applicationId applicationId (required)
     * @return ApiResponse&lt;ApplicationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Actual application data </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Application does not exist </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApplicationResponse> getapplicationdetailWithHttpInfo(String applicationId) throws ApiException {
        okhttp3.Call localVarCall = getapplicationdetailValidateBeforeCall(applicationId, null);
        Type localVarReturnType = new TypeToken<ApplicationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get application detail (asynchronously)
     * If you need to find out current information about particular *application* - primarily its state and other details - use &#x60;/financing/v1/applications/{applicationId}&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  If the request was successfully processed, you receive HTTP status code 200 and *application* object.  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Message                                                                          | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 404         | &#x60;APPLICATION_NOT_FOUND&#x60; | The requested resource could not be found                                        | | 422         | &#x60;UNPROCESSABLE&#x60;         | The request was well-formed but was unable to be followed due to semantic errors |Get specific *application* detail by ID
     * @param applicationId applicationId (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Actual application data </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Application does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getapplicationdetailAsync(String applicationId, final ApiCallback<ApplicationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getapplicationdetailValidateBeforeCall(applicationId, _callback);
        Type localVarReturnType = new TypeToken<ApplicationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getorder
     * @param orderNumber Order Number (optional)
     * @param orderVariableSymbol Order Variable Symbol (optional)
     * @param applicationId applicationId (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order data </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getorderCall(String orderNumber, String orderVariableSymbol, String applicationId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/financing/v1/orders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (orderNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderNumber", orderNumber));
        }

        if (orderVariableSymbol != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderVariableSymbol", orderVariableSymbol));
        }

        if (applicationId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("applicationId", applicationId));
        }

        final String[] localVarAccepts = {
            "application/json; charset=utf-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "httpBearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getorderValidateBeforeCall(String orderNumber, String orderVariableSymbol, String applicationId, final ApiCallback _callback) throws ApiException {
        return getorderCall(orderNumber, orderVariableSymbol, applicationId, _callback);

    }

    /**
     * Get order
     * If you need to find out current information about particular *order* - primarily its state (or its order items&#39; states) and other details - use &#x60;/financing/v1/orders{?orderNumber,orderVariableSymbol,applicationId}&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation, &#x60;{orderNumber}&#x60; is your order&#39;s number and &#x60;{orderVariableSymbol}&#x60; is your order&#39;s variable symbol.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | YES          | | &#x60;REJECTED&#x60;        | YES          | | &#x60;CANCELLED&#x60;       | YES          | | &#x60;READY&#x60;           | YES          |  If the request was successfully processed, you receive HTTP status code 200 and object of information about specified *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                        | | 422         | &#x60;UNPROCESSABLE&#x60;         | The request was well-formed but was unable to be followed due to semantic errors |Search for *order* using specified parameters.  use &#x60;/financing/v1/orders&#x60; with at least one of following parameter:  - variable symbol,  - order number,  - application number.  &lt;a name&#x3D;\&quot;orders-parameters-restriction\&quot;&gt;&lt;/a&gt;
     * @param orderNumber Order Number (optional)
     * @param orderVariableSymbol Order Variable Symbol (optional)
     * @param applicationId applicationId (optional)
     * @return OrderExtendedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order data </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
     */
    public OrderExtendedResponse getorder(String orderNumber, String orderVariableSymbol, String applicationId) throws ApiException {
        ApiResponse<OrderExtendedResponse> localVarResp = getorderWithHttpInfo(orderNumber, orderVariableSymbol, applicationId);
        return localVarResp.getData();
    }

    /**
     * Get order
     * If you need to find out current information about particular *order* - primarily its state (or its order items&#39; states) and other details - use &#x60;/financing/v1/orders{?orderNumber,orderVariableSymbol,applicationId}&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation, &#x60;{orderNumber}&#x60; is your order&#39;s number and &#x60;{orderVariableSymbol}&#x60; is your order&#39;s variable symbol.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | YES          | | &#x60;REJECTED&#x60;        | YES          | | &#x60;CANCELLED&#x60;       | YES          | | &#x60;READY&#x60;           | YES          |  If the request was successfully processed, you receive HTTP status code 200 and object of information about specified *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                        | | 422         | &#x60;UNPROCESSABLE&#x60;         | The request was well-formed but was unable to be followed due to semantic errors |Search for *order* using specified parameters.  use &#x60;/financing/v1/orders&#x60; with at least one of following parameter:  - variable symbol,  - order number,  - application number.  &lt;a name&#x3D;\&quot;orders-parameters-restriction\&quot;&gt;&lt;/a&gt;
     * @param orderNumber Order Number (optional)
     * @param orderVariableSymbol Order Variable Symbol (optional)
     * @param applicationId applicationId (optional)
     * @return ApiResponse&lt;OrderExtendedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order data </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OrderExtendedResponse> getorderWithHttpInfo(String orderNumber, String orderVariableSymbol, String applicationId) throws ApiException {
        okhttp3.Call localVarCall = getorderValidateBeforeCall(orderNumber, orderVariableSymbol, applicationId, null);
        Type localVarReturnType = new TypeToken<OrderExtendedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get order (asynchronously)
     * If you need to find out current information about particular *order* - primarily its state (or its order items&#39; states) and other details - use &#x60;/financing/v1/orders{?orderNumber,orderVariableSymbol,applicationId}&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation, &#x60;{orderNumber}&#x60; is your order&#39;s number and &#x60;{orderVariableSymbol}&#x60; is your order&#39;s variable symbol.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | YES          | | &#x60;REJECTED&#x60;        | YES          | | &#x60;CANCELLED&#x60;       | YES          | | &#x60;READY&#x60;           | YES          |  If the request was successfully processed, you receive HTTP status code 200 and object of information about specified *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                        | | 422         | &#x60;UNPROCESSABLE&#x60;         | The request was well-formed but was unable to be followed due to semantic errors |Search for *order* using specified parameters.  use &#x60;/financing/v1/orders&#x60; with at least one of following parameter:  - variable symbol,  - order number,  - application number.  &lt;a name&#x3D;\&quot;orders-parameters-restriction\&quot;&gt;&lt;/a&gt;
     * @param orderNumber Order Number (optional)
     * @param orderVariableSymbol Order Variable Symbol (optional)
     * @param applicationId applicationId (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order data </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getorderAsync(String orderNumber, String orderVariableSymbol, String applicationId, final ApiCallback<OrderExtendedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getorderValidateBeforeCall(orderNumber, orderVariableSymbol, applicationId, _callback);
        Type localVarReturnType = new TypeToken<OrderExtendedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getpaymentsonspecificapplication
     * @param applicationId applicationId (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of payments. May be empty if no payment was processed yet. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Application does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getpaymentsonspecificapplicationCall(String applicationId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/financing/v1/applications/{applicationId}/payments"
            .replace("{" + "applicationId" + "}", localVarApiClient.escapeString(applicationId.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "httpBearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getpaymentsonspecificapplicationValidateBeforeCall(String applicationId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling getpaymentsonspecificapplication(Async)");
        }

        return getpaymentsonspecificapplicationCall(applicationId, _callback);

    }

    /**
     * Get payments on specific application
     * Get payments on specific *application*  List of realized payments from Skip Pay to partner. In case of multiple invoices, list may contain more items.  feature | supported by resource --- | --- [paging](#header-paging) | yes [sorting](#header-sorting) | no [filtering](#header-filtering) | no  This resource supports [paging](#header-paging). As a value to &#x60;before&#x60; and &#x60;after&#x60; parameters, use &#x60;paymentId&#x60; attribute.  Collection is sorted by paymentId attribute.
     * @param applicationId applicationId (required)
     * @return Getpaymentsonspecificapplicationresponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of payments. May be empty if no payment was processed yet. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Application does not exist </td><td>  -  </td></tr>
     </table>
     */
    public Getpaymentsonspecificapplicationresponse getpaymentsonspecificapplication(String applicationId) throws ApiException {
        ApiResponse<Getpaymentsonspecificapplicationresponse> localVarResp = getpaymentsonspecificapplicationWithHttpInfo(applicationId);
        return localVarResp.getData();
    }

    /**
     * Get payments on specific application
     * Get payments on specific *application*  List of realized payments from Skip Pay to partner. In case of multiple invoices, list may contain more items.  feature | supported by resource --- | --- [paging](#header-paging) | yes [sorting](#header-sorting) | no [filtering](#header-filtering) | no  This resource supports [paging](#header-paging). As a value to &#x60;before&#x60; and &#x60;after&#x60; parameters, use &#x60;paymentId&#x60; attribute.  Collection is sorted by paymentId attribute.
     * @param applicationId applicationId (required)
     * @return ApiResponse&lt;Getpaymentsonspecificapplicationresponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of payments. May be empty if no payment was processed yet. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Application does not exist </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Getpaymentsonspecificapplicationresponse> getpaymentsonspecificapplicationWithHttpInfo(String applicationId) throws ApiException {
        okhttp3.Call localVarCall = getpaymentsonspecificapplicationValidateBeforeCall(applicationId, null);
        Type localVarReturnType = new TypeToken<Getpaymentsonspecificapplicationresponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get payments on specific application (asynchronously)
     * Get payments on specific *application*  List of realized payments from Skip Pay to partner. In case of multiple invoices, list may contain more items.  feature | supported by resource --- | --- [paging](#header-paging) | yes [sorting](#header-sorting) | no [filtering](#header-filtering) | no  This resource supports [paging](#header-paging). As a value to &#x60;before&#x60; and &#x60;after&#x60; parameters, use &#x60;paymentId&#x60; attribute.  Collection is sorted by paymentId attribute.
     * @param applicationId applicationId (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of payments. May be empty if no payment was processed yet. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Application does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getpaymentsonspecificapplicationAsync(String applicationId, final ApiCallback<Getpaymentsonspecificapplicationresponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getpaymentsonspecificapplicationValidateBeforeCall(applicationId, _callback);
        Type localVarReturnType = new TypeToken<Getpaymentsonspecificapplicationresponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getrecurrence
     * @param recurrenceId recurrenceId (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Actual recurrence data </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> There is no recurrence </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getrecurrenceCall(String recurrenceId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/financing/v1/recurrences/{recurrenceId}"
            .replace("{" + "recurrenceId" + "}", localVarApiClient.escapeString(recurrenceId.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "httpBearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getrecurrenceValidateBeforeCall(String recurrenceId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'recurrenceId' is set
        if (recurrenceId == null) {
            throw new ApiException("Missing the required parameter 'recurrenceId' when calling getrecurrence(Async)");
        }

        return getrecurrenceCall(recurrenceId, _callback);

    }

    /**
     * Get recurrence
     * It allows to get recurrence detail. You can check if customer authorized your request and if recurrence is ready to be used.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | NO        |
     * @param recurrenceId recurrenceId (required)
     * @return RecurrenceObject
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Actual recurrence data </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> There is no recurrence </td><td>  -  </td></tr>
     </table>
     */
    public RecurrenceObject getrecurrence(String recurrenceId) throws ApiException {
        ApiResponse<RecurrenceObject> localVarResp = getrecurrenceWithHttpInfo(recurrenceId);
        return localVarResp.getData();
    }

    /**
     * Get recurrence
     * It allows to get recurrence detail. You can check if customer authorized your request and if recurrence is ready to be used.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | NO        |
     * @param recurrenceId recurrenceId (required)
     * @return ApiResponse&lt;RecurrenceObject&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Actual recurrence data </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> There is no recurrence </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RecurrenceObject> getrecurrenceWithHttpInfo(String recurrenceId) throws ApiException {
        okhttp3.Call localVarCall = getrecurrenceValidateBeforeCall(recurrenceId, null);
        Type localVarReturnType = new TypeToken<RecurrenceObject>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get recurrence (asynchronously)
     * It allows to get recurrence detail. You can check if customer authorized your request and if recurrence is ready to be used.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | NO        |
     * @param recurrenceId recurrenceId (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Actual recurrence data </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> There is no recurrence </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getrecurrenceAsync(String recurrenceId, final ApiCallback<RecurrenceObject> _callback) throws ApiException {

        okhttp3.Call localVarCall = getrecurrenceValidateBeforeCall(recurrenceId, _callback);
        Type localVarReturnType = new TypeToken<RecurrenceObject>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for markorderitemsascancelled
     * @param applicationId applicationId (required)
     * @param orderItemsChangeRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Some order items or the whole order was cancelled </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Order items can not be canceled. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call markorderitemsascancelledCall(String applicationId, OrderItemsChangeRequest orderItemsChangeRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = orderItemsChangeRequest;

        // create path and map variables
        String localVarPath = "/financing/v1/applications/{applicationId}/order/cancel"
            .replace("{" + "applicationId" + "}", localVarApiClient.escapeString(applicationId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call markorderitemsascancelledValidateBeforeCall(String applicationId, OrderItemsChangeRequest orderItemsChangeRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling markorderitemsascancelled(Async)");
        }

        return markorderitemsascancelledCall(applicationId, orderItemsChangeRequest, _callback);

    }

    /**
     * Mark order items as cancelled
     * When some or all order items were cancelled (won&#39;t be ever delivered), use &#x60;/financing/v1/applications/{applicationId}/order/cancel&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  If you want to cancel some items after marking those items as sent or delivered, use [Mark order items as returned](#reference/application-operations/mark-order-items-as-returned) operation.  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | NO           | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;READY&#x60;           | YES          |  Use &#x60;/financing/v1/applications/{applicationId}/order/cancel&#x60; resource with an empty request to cancel all order items (the whole *order*) at once.  If you want to cancel specific order item/s, use &#x60;/financing/v1/applications/{applicationId}/order/cancel&#x60; resource with properly filled request that contains cancelled order items info. In this case request should contain array of cancelled order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as cancelled.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                        | | 422         | &#x60;NOT_SUPPORTED&#x60;         | Resource is not supported for given financing type                               |Mark order items as cancelled  System notification. Some or all of the order items were cancelled. Based on *application* financing type and partner setting, credit note may be issued.
     * @param applicationId applicationId (required)
     * @param orderItemsChangeRequest  (optional)
     * @return OrderExtendedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Some order items or the whole order was cancelled </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Order items can not be canceled. </td><td>  -  </td></tr>
     </table>
     */
    public OrderExtendedResponse markorderitemsascancelled(String applicationId, OrderItemsChangeRequest orderItemsChangeRequest) throws ApiException {
        ApiResponse<OrderExtendedResponse> localVarResp = markorderitemsascancelledWithHttpInfo(applicationId, orderItemsChangeRequest);
        return localVarResp.getData();
    }

    /**
     * Mark order items as cancelled
     * When some or all order items were cancelled (won&#39;t be ever delivered), use &#x60;/financing/v1/applications/{applicationId}/order/cancel&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  If you want to cancel some items after marking those items as sent or delivered, use [Mark order items as returned](#reference/application-operations/mark-order-items-as-returned) operation.  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | NO           | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;READY&#x60;           | YES          |  Use &#x60;/financing/v1/applications/{applicationId}/order/cancel&#x60; resource with an empty request to cancel all order items (the whole *order*) at once.  If you want to cancel specific order item/s, use &#x60;/financing/v1/applications/{applicationId}/order/cancel&#x60; resource with properly filled request that contains cancelled order items info. In this case request should contain array of cancelled order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as cancelled.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                        | | 422         | &#x60;NOT_SUPPORTED&#x60;         | Resource is not supported for given financing type                               |Mark order items as cancelled  System notification. Some or all of the order items were cancelled. Based on *application* financing type and partner setting, credit note may be issued.
     * @param applicationId applicationId (required)
     * @param orderItemsChangeRequest  (optional)
     * @return ApiResponse&lt;OrderExtendedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Some order items or the whole order was cancelled </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Order items can not be canceled. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OrderExtendedResponse> markorderitemsascancelledWithHttpInfo(String applicationId, OrderItemsChangeRequest orderItemsChangeRequest) throws ApiException {
        okhttp3.Call localVarCall = markorderitemsascancelledValidateBeforeCall(applicationId, orderItemsChangeRequest, null);
        Type localVarReturnType = new TypeToken<OrderExtendedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Mark order items as cancelled (asynchronously)
     * When some or all order items were cancelled (won&#39;t be ever delivered), use &#x60;/financing/v1/applications/{applicationId}/order/cancel&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  If you want to cancel some items after marking those items as sent or delivered, use [Mark order items as returned](#reference/application-operations/mark-order-items-as-returned) operation.  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | NO           | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;READY&#x60;           | YES          |  Use &#x60;/financing/v1/applications/{applicationId}/order/cancel&#x60; resource with an empty request to cancel all order items (the whole *order*) at once.  If you want to cancel specific order item/s, use &#x60;/financing/v1/applications/{applicationId}/order/cancel&#x60; resource with properly filled request that contains cancelled order items info. In this case request should contain array of cancelled order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as cancelled.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                        | | 422         | &#x60;NOT_SUPPORTED&#x60;         | Resource is not supported for given financing type                               |Mark order items as cancelled  System notification. Some or all of the order items were cancelled. Based on *application* financing type and partner setting, credit note may be issued.
     * @param applicationId applicationId (required)
     * @param orderItemsChangeRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Some order items or the whole order was cancelled </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Order items can not be canceled. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call markorderitemsascancelledAsync(String applicationId, OrderItemsChangeRequest orderItemsChangeRequest, final ApiCallback<OrderExtendedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = markorderitemsascancelledValidateBeforeCall(applicationId, orderItemsChangeRequest, _callback);
        Type localVarReturnType = new TypeToken<OrderExtendedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for markorderitemsasdelivered
     * @param applicationId applicationId (required)
     * @param orderItemsDeliverRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order items or whole order is marked as delivered </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> State change can not be processed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call markorderitemsasdeliveredCall(String applicationId, OrderItemsDeliverRequest orderItemsDeliverRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = orderItemsDeliverRequest;

        // create path and map variables
        String localVarPath = "/financing/v1/applications/{applicationId}/order/deliver"
            .replace("{" + "applicationId" + "}", localVarApiClient.escapeString(applicationId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call markorderitemsasdeliveredValidateBeforeCall(String applicationId, OrderItemsDeliverRequest orderItemsDeliverRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling markorderitemsasdelivered(Async)");
        }

        return markorderitemsasdeliveredCall(applicationId, orderItemsDeliverRequest, _callback);

    }

    /**
     * Mark order items as delivered
     * When some or all order items were delivered to the customer, use &#x60;/financing/v1/applications/{applicationId}/order/deliver&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | NO           | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;READY&#x60;           | YES          |  Use &#x60;/financing/v1/applications/{applicationId}/order/deliver&#x60; resource with an empty request to mark all order items (the whole *order*) as delivered at once.  If you want to mark specific order item/s as delivered, use &#x60;/financing/v1/applications/{applicationId}/order/deliver&#x60; resource with properly filled request that contains delivered order items info. In this case request should contain array of delivered order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as delivered.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                              | Explanation                                                                       | | ---         | ---                               | ---                                                                               | | 400         | &#x60;INVALID_REQUEST&#x60;                 | Request was not well formatted (malformed request syntax, size too large, etc.)   | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;                | The requested resource could not be found                                         | | 422         | &#x60;TOTAL_PRICE_LIMIT_EXCEEDED&#x60;      | The total price of all subcontracts exceeded the order total price                | | 422         | &#x60;NOT_SUPPORTED&#x60;                   | Resource is not supported for given financing type                                |Mark order items as delivered.  System notification. Some or all order items were delivered to customer. Based on *application* financing type and partner setting, application payment may be processed.
     * @param applicationId applicationId (required)
     * @param orderItemsDeliverRequest  (optional)
     * @return OrderExtendedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order items or whole order is marked as delivered </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> State change can not be processed </td><td>  -  </td></tr>
     </table>
     */
    public OrderExtendedResponse markorderitemsasdelivered(String applicationId, OrderItemsDeliverRequest orderItemsDeliverRequest) throws ApiException {
        ApiResponse<OrderExtendedResponse> localVarResp = markorderitemsasdeliveredWithHttpInfo(applicationId, orderItemsDeliverRequest);
        return localVarResp.getData();
    }

    /**
     * Mark order items as delivered
     * When some or all order items were delivered to the customer, use &#x60;/financing/v1/applications/{applicationId}/order/deliver&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | NO           | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;READY&#x60;           | YES          |  Use &#x60;/financing/v1/applications/{applicationId}/order/deliver&#x60; resource with an empty request to mark all order items (the whole *order*) as delivered at once.  If you want to mark specific order item/s as delivered, use &#x60;/financing/v1/applications/{applicationId}/order/deliver&#x60; resource with properly filled request that contains delivered order items info. In this case request should contain array of delivered order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as delivered.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                              | Explanation                                                                       | | ---         | ---                               | ---                                                                               | | 400         | &#x60;INVALID_REQUEST&#x60;                 | Request was not well formatted (malformed request syntax, size too large, etc.)   | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;                | The requested resource could not be found                                         | | 422         | &#x60;TOTAL_PRICE_LIMIT_EXCEEDED&#x60;      | The total price of all subcontracts exceeded the order total price                | | 422         | &#x60;NOT_SUPPORTED&#x60;                   | Resource is not supported for given financing type                                |Mark order items as delivered.  System notification. Some or all order items were delivered to customer. Based on *application* financing type and partner setting, application payment may be processed.
     * @param applicationId applicationId (required)
     * @param orderItemsDeliverRequest  (optional)
     * @return ApiResponse&lt;OrderExtendedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order items or whole order is marked as delivered </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> State change can not be processed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OrderExtendedResponse> markorderitemsasdeliveredWithHttpInfo(String applicationId, OrderItemsDeliverRequest orderItemsDeliverRequest) throws ApiException {
        okhttp3.Call localVarCall = markorderitemsasdeliveredValidateBeforeCall(applicationId, orderItemsDeliverRequest, null);
        Type localVarReturnType = new TypeToken<OrderExtendedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Mark order items as delivered (asynchronously)
     * When some or all order items were delivered to the customer, use &#x60;/financing/v1/applications/{applicationId}/order/deliver&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | NO           | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;READY&#x60;           | YES          |  Use &#x60;/financing/v1/applications/{applicationId}/order/deliver&#x60; resource with an empty request to mark all order items (the whole *order*) as delivered at once.  If you want to mark specific order item/s as delivered, use &#x60;/financing/v1/applications/{applicationId}/order/deliver&#x60; resource with properly filled request that contains delivered order items info. In this case request should contain array of delivered order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as delivered.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                              | Explanation                                                                       | | ---         | ---                               | ---                                                                               | | 400         | &#x60;INVALID_REQUEST&#x60;                 | Request was not well formatted (malformed request syntax, size too large, etc.)   | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;                | The requested resource could not be found                                         | | 422         | &#x60;TOTAL_PRICE_LIMIT_EXCEEDED&#x60;      | The total price of all subcontracts exceeded the order total price                | | 422         | &#x60;NOT_SUPPORTED&#x60;                   | Resource is not supported for given financing type                                |Mark order items as delivered.  System notification. Some or all order items were delivered to customer. Based on *application* financing type and partner setting, application payment may be processed.
     * @param applicationId applicationId (required)
     * @param orderItemsDeliverRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order items or whole order is marked as delivered </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> State change can not be processed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call markorderitemsasdeliveredAsync(String applicationId, OrderItemsDeliverRequest orderItemsDeliverRequest, final ApiCallback<OrderExtendedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = markorderitemsasdeliveredValidateBeforeCall(applicationId, orderItemsDeliverRequest, _callback);
        Type localVarReturnType = new TypeToken<OrderExtendedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for markorderitemsasreturned
     * @param applicationId applicationId (required)
     * @param orderItemsReturnRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order items or whole order is marked as returned </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> State change can not be processed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call markorderitemsasreturnedCall(String applicationId, OrderItemsReturnRequest orderItemsReturnRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = orderItemsReturnRequest;

        // create path and map variables
        String localVarPath = "/financing/v1/applications/{applicationId}/order/return"
            .replace("{" + "applicationId" + "}", localVarApiClient.escapeString(applicationId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call markorderitemsasreturnedValidateBeforeCall(String applicationId, OrderItemsReturnRequest orderItemsReturnRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling markorderitemsasreturned(Async)");
        }

        return markorderitemsasreturnedCall(applicationId, orderItemsReturnRequest, _callback);

    }

    /**
     * Mark order items as returned
     * When some or all order items were returned by the customer to you (after delivery), use &#x60;/financing/v1/applications/{applicationId}/order/return&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  If you want to cancel some items before marking those items as sent or delivered, use [Mark order items as cancelled](#reference/application-operations/mark-order-items-as-cancelled) operation.  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | NO           | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;READY&#x60;           | YES          |  Use &#x60;/financing/v1/applications/{applicationId}/order/return&#x60; resource with an empty request to mark all order items (the whole *order*) as returned at once.  If you want to mark specific order item/s as returned, use &#x60;/financing/v1/applications/{applicationId}/order/return&#x60; resource with properly filled request that contains returned order items info. In this case request should contain array of returned order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as returned.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                        | | 422         | &#x60;NOT_SUPPORTED&#x60;         | Resource is not supported for given financing type                               |Mark order items as returned.  System notification. Some or all order items were returned by customer back to e-shop. Based on *application* financing type and partner setting, credit note may be issued.
     * @param applicationId applicationId (required)
     * @param orderItemsReturnRequest  (optional)
     * @return OrderExtendedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order items or whole order is marked as returned </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> State change can not be processed </td><td>  -  </td></tr>
     </table>
     */
    public OrderExtendedResponse markorderitemsasreturned(String applicationId, OrderItemsReturnRequest orderItemsReturnRequest) throws ApiException {
        ApiResponse<OrderExtendedResponse> localVarResp = markorderitemsasreturnedWithHttpInfo(applicationId, orderItemsReturnRequest);
        return localVarResp.getData();
    }

    /**
     * Mark order items as returned
     * When some or all order items were returned by the customer to you (after delivery), use &#x60;/financing/v1/applications/{applicationId}/order/return&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  If you want to cancel some items before marking those items as sent or delivered, use [Mark order items as cancelled](#reference/application-operations/mark-order-items-as-cancelled) operation.  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | NO           | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;READY&#x60;           | YES          |  Use &#x60;/financing/v1/applications/{applicationId}/order/return&#x60; resource with an empty request to mark all order items (the whole *order*) as returned at once.  If you want to mark specific order item/s as returned, use &#x60;/financing/v1/applications/{applicationId}/order/return&#x60; resource with properly filled request that contains returned order items info. In this case request should contain array of returned order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as returned.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                        | | 422         | &#x60;NOT_SUPPORTED&#x60;         | Resource is not supported for given financing type                               |Mark order items as returned.  System notification. Some or all order items were returned by customer back to e-shop. Based on *application* financing type and partner setting, credit note may be issued.
     * @param applicationId applicationId (required)
     * @param orderItemsReturnRequest  (optional)
     * @return ApiResponse&lt;OrderExtendedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order items or whole order is marked as returned </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> State change can not be processed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OrderExtendedResponse> markorderitemsasreturnedWithHttpInfo(String applicationId, OrderItemsReturnRequest orderItemsReturnRequest) throws ApiException {
        okhttp3.Call localVarCall = markorderitemsasreturnedValidateBeforeCall(applicationId, orderItemsReturnRequest, null);
        Type localVarReturnType = new TypeToken<OrderExtendedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Mark order items as returned (asynchronously)
     * When some or all order items were returned by the customer to you (after delivery), use &#x60;/financing/v1/applications/{applicationId}/order/return&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  If you want to cancel some items before marking those items as sent or delivered, use [Mark order items as cancelled](#reference/application-operations/mark-order-items-as-cancelled) operation.  | Application state | Availability | | ---               | ---          | | &#x60;PROCESSING&#x60;      | NO           | | &#x60;REJECTED&#x60;        | NO           | | &#x60;CANCELLED&#x60;       | NO           | | &#x60;READY&#x60;           | YES          |  Use &#x60;/financing/v1/applications/{applicationId}/order/return&#x60; resource with an empty request to mark all order items (the whole *order*) as returned at once.  If you want to mark specific order item/s as returned, use &#x60;/financing/v1/applications/{applicationId}/order/return&#x60; resource with properly filled request that contains returned order items info. In this case request should contain array of returned order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as returned.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                    | Explanation                                                                      | | ---         | ---                     | ---                                                                              | | 400         | &#x60;INVALID_REQUEST&#x60;       | Request was not well formatted (malformed request syntax, size too large, etc.)  | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;      | The requested resource could not be found                                        | | 422         | &#x60;NOT_SUPPORTED&#x60;         | Resource is not supported for given financing type                               |Mark order items as returned.  System notification. Some or all order items were returned by customer back to e-shop. Based on *application* financing type and partner setting, credit note may be issued.
     * @param applicationId applicationId (required)
     * @param orderItemsReturnRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order items or whole order is marked as returned </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> State change can not be processed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call markorderitemsasreturnedAsync(String applicationId, OrderItemsReturnRequest orderItemsReturnRequest, final ApiCallback<OrderExtendedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = markorderitemsasreturnedValidateBeforeCall(applicationId, orderItemsReturnRequest, _callback);
        Type localVarReturnType = new TypeToken<OrderExtendedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for markorderitemsassent
     * @param applicationId applicationId (required)
     * @param orderItemsSendRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order items or whole order is marked as shipped </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> State change can not be processed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call markorderitemsassentCall(String applicationId, OrderItemsSendRequest orderItemsSendRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = orderItemsSendRequest;

        // create path and map variables
        String localVarPath = "/financing/v1/applications/{applicationId}/order/send"
            .replace("{" + "applicationId" + "}", localVarApiClient.escapeString(applicationId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call markorderitemsassentValidateBeforeCall(String applicationId, OrderItemsSendRequest orderItemsSendRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling markorderitemsassent(Async)");
        }

        return markorderitemsassentCall(applicationId, orderItemsSendRequest, _callback);

    }

    /**
     * Mark order items as sent
     * When some or all order items were shipped to the customer, use &#x60;/financing/v1/applications/{applicationId}/order/send&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability| | ---               | ---         | | &#x60;PROCESSING&#x60;      | NO          | | &#x60;REJECTED&#x60;        | NO          | | &#x60;CANCELLED&#x60;       | NO          | | &#x60;READY&#x60;           | YES         |  Use &#x60;/financing/v1/applications/{applicationId}/order/send&#x60; resource with an empty request to mark all order items (the whole *order*) as sent at once.  If you want to mark specific order item/s as sent, use &#x60;/financing/v1/applications/{applicationId}/order/send&#x60; resource with properly filled request that contains sent order items info. In this case request should contain array of sent order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as sent.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                            | Explanation                                                                       | | ---         | ---                             | ---                                                                               | | 400         | &#x60;INVALID_REQUEST&#x60;               | Request was not well formatted (malformed request syntax, size too large, etc.)   | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;              | The requested resource could not be found                                         | | 422         | &#x60;TOTAL_PRICE_LIMIT_EXCEEDED&#x60;    | The total price of all subcontracts exceeded the order total price                | | 422         | &#x60;NOT_SUPPORTED&#x60;                 | Resource is not supported for given financing type                                |Mark order items as sent  System notification. Some or all order items were shipped to customer. Based on *application* financing type and partner setting, application payment may be processed.
     * @param applicationId applicationId (required)
     * @param orderItemsSendRequest  (optional)
     * @return OrderExtendedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order items or whole order is marked as shipped </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> State change can not be processed </td><td>  -  </td></tr>
     </table>
     */
    public OrderExtendedResponse markorderitemsassent(String applicationId, OrderItemsSendRequest orderItemsSendRequest) throws ApiException {
        ApiResponse<OrderExtendedResponse> localVarResp = markorderitemsassentWithHttpInfo(applicationId, orderItemsSendRequest);
        return localVarResp.getData();
    }

    /**
     * Mark order items as sent
     * When some or all order items were shipped to the customer, use &#x60;/financing/v1/applications/{applicationId}/order/send&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability| | ---               | ---         | | &#x60;PROCESSING&#x60;      | NO          | | &#x60;REJECTED&#x60;        | NO          | | &#x60;CANCELLED&#x60;       | NO          | | &#x60;READY&#x60;           | YES         |  Use &#x60;/financing/v1/applications/{applicationId}/order/send&#x60; resource with an empty request to mark all order items (the whole *order*) as sent at once.  If you want to mark specific order item/s as sent, use &#x60;/financing/v1/applications/{applicationId}/order/send&#x60; resource with properly filled request that contains sent order items info. In this case request should contain array of sent order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as sent.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                            | Explanation                                                                       | | ---         | ---                             | ---                                                                               | | 400         | &#x60;INVALID_REQUEST&#x60;               | Request was not well formatted (malformed request syntax, size too large, etc.)   | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;              | The requested resource could not be found                                         | | 422         | &#x60;TOTAL_PRICE_LIMIT_EXCEEDED&#x60;    | The total price of all subcontracts exceeded the order total price                | | 422         | &#x60;NOT_SUPPORTED&#x60;                 | Resource is not supported for given financing type                                |Mark order items as sent  System notification. Some or all order items were shipped to customer. Based on *application* financing type and partner setting, application payment may be processed.
     * @param applicationId applicationId (required)
     * @param orderItemsSendRequest  (optional)
     * @return ApiResponse&lt;OrderExtendedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order items or whole order is marked as shipped </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> State change can not be processed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OrderExtendedResponse> markorderitemsassentWithHttpInfo(String applicationId, OrderItemsSendRequest orderItemsSendRequest) throws ApiException {
        okhttp3.Call localVarCall = markorderitemsassentValidateBeforeCall(applicationId, orderItemsSendRequest, null);
        Type localVarReturnType = new TypeToken<OrderExtendedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Mark order items as sent (asynchronously)
     * When some or all order items were shipped to the customer, use &#x60;/financing/v1/applications/{applicationId}/order/send&#x60; resource where &#x60;{applicationId}&#x60; is the application ID you received in the response of &#x60;/financing/v1/applications&#x60; after its creation.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  | Application state | Availability| | ---               | ---         | | &#x60;PROCESSING&#x60;      | NO          | | &#x60;REJECTED&#x60;        | NO          | | &#x60;CANCELLED&#x60;       | NO          | | &#x60;READY&#x60;           | YES         |  Use &#x60;/financing/v1/applications/{applicationId}/order/send&#x60; resource with an empty request to mark all order items (the whole *order*) as sent at once.  If you want to mark specific order item/s as sent, use &#x60;/financing/v1/applications/{applicationId}/order/send&#x60; resource with properly filled request that contains sent order items info. In this case request should contain array of sent order items with one or more particular order item identificators (&#x60;code&#x60;/&#x60;EAN&#x60;/&#x60;name&#x60;/&#x60;type&#x60;) - &#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; and &#x60;type&#x60; is used for identifying order item sent in &#x60;Create application&#x60;.  &gt; TIP: Use an empty request if marking last (those not yet not marked) item(s) on order as sent.  &gt; **ATTENTION:** If multiple properties (&#x60;code&#x60;, &#x60;ean&#x60;, &#x60;name&#x60; or &#x60;type&#x60;) are used for identifying some order item, it all must exact match the item data.  If the request was successfully processed, you receive HTTP status code 200 and object of information about changed *order* plus basic information about respective *application* (ID, state, substate).  In other cases, you may receive errors similar to the following ones: | Status code | Code                            | Explanation                                                                       | | ---         | ---                             | ---                                                                               | | 400         | &#x60;INVALID_REQUEST&#x60;               | Request was not well formatted (malformed request syntax, size too large, etc.)   | | 404         | &#x60;OBJECT_NOT_FOUND&#x60;              | The requested resource could not be found                                         | | 422         | &#x60;TOTAL_PRICE_LIMIT_EXCEEDED&#x60;    | The total price of all subcontracts exceeded the order total price                | | 422         | &#x60;NOT_SUPPORTED&#x60;                 | Resource is not supported for given financing type                                |Mark order items as sent  System notification. Some or all order items were shipped to customer. Based on *application* financing type and partner setting, application payment may be processed.
     * @param applicationId applicationId (required)
     * @param orderItemsSendRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order items or whole order is marked as shipped </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> State change can not be processed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call markorderitemsassentAsync(String applicationId, OrderItemsSendRequest orderItemsSendRequest, final ApiCallback<OrderExtendedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = markorderitemsassentValidateBeforeCall(applicationId, orderItemsSendRequest, _callback);
        Type localVarReturnType = new TypeToken<OrderExtendedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updaterecurrence
     * @param recurrenceId recurenceId (required)
     * @param recurrenceUpdateRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Recurrence was updated </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> There is no recurrence </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Recurrence can not be updated </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updaterecurrenceCall(String recurrenceId, RecurrenceUpdateRequest recurrenceUpdateRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = recurrenceUpdateRequest;

        // create path and map variables
        String localVarPath = "/financing/v1/recurrences/{recurrenceId}"
            .replace("{" + "recurrenceId" + "}", localVarApiClient.escapeString(recurrenceId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updaterecurrenceValidateBeforeCall(String recurrenceId, RecurrenceUpdateRequest recurrenceUpdateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'recurrenceId' is set
        if (recurrenceId == null) {
            throw new ApiException("Missing the required parameter 'recurrenceId' when calling updaterecurrence(Async)");
        }

        return updaterecurrenceCall(recurrenceId, recurrenceUpdateRequest, _callback);

    }

    /**
     * Update recurrence
     * It allows to get recurrence detail. You can check if customer authorized your request and if recurrence is ready to be used.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | NO        |At this moment it allows to change the recurrence state only. It&#39;s not neccessary but if you want to be sure that nobody can use the recurrence in the future you can cancel it.
     * @param recurrenceId recurenceId (required)
     * @param recurrenceUpdateRequest  (optional)
     * @return RecurrenceObject
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Recurrence was updated </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> There is no recurrence </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Recurrence can not be updated </td><td>  -  </td></tr>
     </table>
     */
    public RecurrenceObject updaterecurrence(String recurrenceId, RecurrenceUpdateRequest recurrenceUpdateRequest) throws ApiException {
        ApiResponse<RecurrenceObject> localVarResp = updaterecurrenceWithHttpInfo(recurrenceId, recurrenceUpdateRequest);
        return localVarResp.getData();
    }

    /**
     * Update recurrence
     * It allows to get recurrence detail. You can check if customer authorized your request and if recurrence is ready to be used.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | NO        |At this moment it allows to change the recurrence state only. It&#39;s not neccessary but if you want to be sure that nobody can use the recurrence in the future you can cancel it.
     * @param recurrenceId recurenceId (required)
     * @param recurrenceUpdateRequest  (optional)
     * @return ApiResponse&lt;RecurrenceObject&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Recurrence was updated </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> There is no recurrence </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Recurrence can not be updated </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RecurrenceObject> updaterecurrenceWithHttpInfo(String recurrenceId, RecurrenceUpdateRequest recurrenceUpdateRequest) throws ApiException {
        okhttp3.Call localVarCall = updaterecurrenceValidateBeforeCall(recurrenceId, recurrenceUpdateRequest, null);
        Type localVarReturnType = new TypeToken<RecurrenceObject>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update recurrence (asynchronously)
     * It allows to get recurrence detail. You can check if customer authorized your request and if recurrence is ready to be used.  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | NO        |At this moment it allows to change the recurrence state only. It&#39;s not neccessary but if you want to be sure that nobody can use the recurrence in the future you can cancel it.
     * @param recurrenceId recurenceId (required)
     * @param recurrenceUpdateRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Recurrence was updated </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> There is no recurrence </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Recurrence can not be updated </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updaterecurrenceAsync(String recurrenceId, RecurrenceUpdateRequest recurrenceUpdateRequest, final ApiCallback<RecurrenceObject> _callback) throws ApiException {

        okhttp3.Call localVarCall = updaterecurrenceValidateBeforeCall(recurrenceId, recurrenceUpdateRequest, _callback);
        Type localVarReturnType = new TypeToken<RecurrenceObject>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
