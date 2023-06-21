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


import cz.skippay.model.ErrorsResponse;
import cz.skippay.model.PrecheckRequest;
import cz.skippay.model.PrecheckResultsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PrecheckApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PrecheckApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PrecheckApi(ApiClient apiClient) {
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
     * Build call for precheck
     * @param precheckRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Probability of approval </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error in processing request </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Error in processing request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call precheckCall(PrecheckRequest precheckRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = precheckRequest;

        // create path and map variables
        String localVarPath = "/financing/v1/precheck";

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
    private okhttp3.Call precheckValidateBeforeCall(PrecheckRequest precheckRequest, final ApiCallback _callback) throws ApiException {
        return precheckCall(precheckRequest, _callback);

    }

    /**
     * Precheck
     * Precheck *application*  Returns probability of *application&#39;s* approval and limits of particular customer, if known to Skip Pay  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  It has to be called with valid access token (see the [Security section](#reference/security)) from your server. If you plan to integrate it in client flow, you should implement REST endpoint bound to your shopping basket session, that will be used as a proxy to call Skip Pay API - **NEVER put access token directly to client side**.  Possible error codes explanation: | Status code | Code                  | Explanation                                                                     | | ---         | ---                   | ---                                                                             | | 400         | &#x60;INVALID_REQUEST&#x60;     | Request was not well formatted (malformed request syntax, size too large, etc.) | | 422         | &#x60;PERSONAL_ID_INVALID&#x60; | PersonalId is not valid                                                         |Returns probability of *application&#39;s* approval and limits of particular customer, if known to Skip Pay
     * @param precheckRequest  (optional)
     * @return PrecheckResultsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Probability of approval </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error in processing request </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Error in processing request </td><td>  -  </td></tr>
     </table>
     */
    public PrecheckResultsResponse precheck(PrecheckRequest precheckRequest) throws ApiException {
        ApiResponse<PrecheckResultsResponse> localVarResp = precheckWithHttpInfo(precheckRequest);
        return localVarResp.getData();
    }

    /**
     * Precheck
     * Precheck *application*  Returns probability of *application&#39;s* approval and limits of particular customer, if known to Skip Pay  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  It has to be called with valid access token (see the [Security section](#reference/security)) from your server. If you plan to integrate it in client flow, you should implement REST endpoint bound to your shopping basket session, that will be used as a proxy to call Skip Pay API - **NEVER put access token directly to client side**.  Possible error codes explanation: | Status code | Code                  | Explanation                                                                     | | ---         | ---                   | ---                                                                             | | 400         | &#x60;INVALID_REQUEST&#x60;     | Request was not well formatted (malformed request syntax, size too large, etc.) | | 422         | &#x60;PERSONAL_ID_INVALID&#x60; | PersonalId is not valid                                                         |Returns probability of *application&#39;s* approval and limits of particular customer, if known to Skip Pay
     * @param precheckRequest  (optional)
     * @return ApiResponse&lt;PrecheckResultsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Probability of approval </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error in processing request </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Error in processing request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PrecheckResultsResponse> precheckWithHttpInfo(PrecheckRequest precheckRequest) throws ApiException {
        okhttp3.Call localVarCall = precheckValidateBeforeCall(precheckRequest, null);
        Type localVarReturnType = new TypeToken<PrecheckResultsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Precheck (asynchronously)
     * Precheck *application*  Returns probability of *application&#39;s* approval and limits of particular customer, if known to Skip Pay  | Financing type     | Supported | | ---                | ---       | | &#x60;DEFERRED_PAYMENT&#x60; | YES       | | &#x60;PAY_IN_THREE&#x60;     | YES       |  It has to be called with valid access token (see the [Security section](#reference/security)) from your server. If you plan to integrate it in client flow, you should implement REST endpoint bound to your shopping basket session, that will be used as a proxy to call Skip Pay API - **NEVER put access token directly to client side**.  Possible error codes explanation: | Status code | Code                  | Explanation                                                                     | | ---         | ---                   | ---                                                                             | | 400         | &#x60;INVALID_REQUEST&#x60;     | Request was not well formatted (malformed request syntax, size too large, etc.) | | 422         | &#x60;PERSONAL_ID_INVALID&#x60; | PersonalId is not valid                                                         |Returns probability of *application&#39;s* approval and limits of particular customer, if known to Skip Pay
     * @param precheckRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Probability of approval </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error in processing request </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Error in processing request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call precheckAsync(PrecheckRequest precheckRequest, final ApiCallback<PrecheckResultsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = precheckValidateBeforeCall(precheckRequest, _callback);
        Type localVarReturnType = new TypeToken<PrecheckResultsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
