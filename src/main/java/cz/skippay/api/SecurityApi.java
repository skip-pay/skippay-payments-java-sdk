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
import cz.skippay.model.PartnerLogin;
import cz.skippay.model.PartnerLoginResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SecurityApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SecurityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SecurityApi(ApiClient apiClient) {
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
     * Build call for loginpartner
     * @param partnerLogin  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Partner acces token issued </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to authenticate partner </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call loginpartnerCall(PartnerLogin partnerLogin, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = partnerLogin;

        // create path and map variables
        String localVarPath = "/authentication/v1/partner";

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
    private okhttp3.Call loginpartnerValidateBeforeCall(PartnerLogin partnerLogin, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'partnerLogin' is set
        if (partnerLogin == null) {
            throw new ApiException("Missing the required parameter 'partnerLogin' when calling loginpartner(Async)");
        }

        return loginpartnerCall(partnerLogin, _callback);

    }

    /**
     * Login partner
     * Partner authenticate himself and obtain access token
     * @param partnerLogin  (required)
     * @return PartnerLoginResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Partner acces token issued </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to authenticate partner </td><td>  -  </td></tr>
     </table>
     */
    public PartnerLoginResult loginpartner(PartnerLogin partnerLogin) throws ApiException {
        ApiResponse<PartnerLoginResult> localVarResp = loginpartnerWithHttpInfo(partnerLogin);
        return localVarResp.getData();
    }

    /**
     * Login partner
     * Partner authenticate himself and obtain access token
     * @param partnerLogin  (required)
     * @return ApiResponse&lt;PartnerLoginResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Partner acces token issued </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to authenticate partner </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PartnerLoginResult> loginpartnerWithHttpInfo(PartnerLogin partnerLogin) throws ApiException {
        okhttp3.Call localVarCall = loginpartnerValidateBeforeCall(partnerLogin, null);
        Type localVarReturnType = new TypeToken<PartnerLoginResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Login partner (asynchronously)
     * Partner authenticate himself and obtain access token
     * @param partnerLogin  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Partner acces token issued </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to authenticate partner </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call loginpartnerAsync(PartnerLogin partnerLogin, final ApiCallback<PartnerLoginResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = loginpartnerValidateBeforeCall(partnerLogin, _callback);
        Type localVarReturnType = new TypeToken<PartnerLoginResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
