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


import cz.skippay.model.HealthCheckResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class HealthCheckApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public HealthCheckApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HealthCheckApi(ApiClient apiClient) {
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
     * Build call for aPIhealthcheck
     * @param contentType Content Type (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is not available </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call aPIhealthcheckCall(String contentType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/health";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
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
    private okhttp3.Call aPIhealthcheckValidateBeforeCall(String contentType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling aPIhealthcheck(Async)");
        }

        return aPIhealthcheckCall(contentType, _callback);

    }

    /**
     * API health check
     * If the API back-end services are up and runing, you receive HTTP status code 200 with optional version info.  In other cases, you may receive errors similar to the following ones: | Status code | Description                                             | | ---         | ---                                                     | | 503         | &#x60;Service Unavailable&#x60; - there is planned service outage |  &gt; Note: resource DOES NOT require valid *access_token* in the HTTP header of the requestGet current state of the API
     * @param contentType Content Type (required)
     * @return HealthCheckResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is not available </td><td>  -  </td></tr>
     </table>
     */
    public HealthCheckResponse aPIhealthcheck(String contentType) throws ApiException {
        ApiResponse<HealthCheckResponse> localVarResp = aPIhealthcheckWithHttpInfo(contentType);
        return localVarResp.getData();
    }

    /**
     * API health check
     * If the API back-end services are up and runing, you receive HTTP status code 200 with optional version info.  In other cases, you may receive errors similar to the following ones: | Status code | Description                                             | | ---         | ---                                                     | | 503         | &#x60;Service Unavailable&#x60; - there is planned service outage |  &gt; Note: resource DOES NOT require valid *access_token* in the HTTP header of the requestGet current state of the API
     * @param contentType Content Type (required)
     * @return ApiResponse&lt;HealthCheckResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is not available </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HealthCheckResponse> aPIhealthcheckWithHttpInfo(String contentType) throws ApiException {
        okhttp3.Call localVarCall = aPIhealthcheckValidateBeforeCall(contentType, null);
        Type localVarReturnType = new TypeToken<HealthCheckResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * API health check (asynchronously)
     * If the API back-end services are up and runing, you receive HTTP status code 200 with optional version info.  In other cases, you may receive errors similar to the following ones: | Status code | Description                                             | | ---         | ---                                                     | | 503         | &#x60;Service Unavailable&#x60; - there is planned service outage |  &gt; Note: resource DOES NOT require valid *access_token* in the HTTP header of the requestGet current state of the API
     * @param contentType Content Type (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is not available </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call aPIhealthcheckAsync(String contentType, final ApiCallback<HealthCheckResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = aPIhealthcheckValidateBeforeCall(contentType, _callback);
        Type localVarReturnType = new TypeToken<HealthCheckResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
