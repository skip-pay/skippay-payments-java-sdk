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

import cz.skippay.model.ErrorsResponse;
import cz.skippay.model.PrecheckRequest;
import cz.skippay.model.PrecheckResultsResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class PrecheckOperationsApi {
  private ApiClient apiClient;

  public PrecheckOperationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PrecheckOperationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Precheck
   * Precheck *application*  Returns probability of *application's* approval and limits of particular customer, if known to Skip Pay  | Financing type     | Supported | | ---                | ---       | | `DEFERRED_PAYMENT` | YES       | | `PAY_IN_THREE`     | YES       |  It has to be called with valid access token (see the [Security section](https://developers.skippay.cz/docs/api-reference/security)) from your server. If you plan to integrate it in client flow, you should implement REST endpoint bound to your shopping basket session, that will be used as a proxy to call Skip Pay API - **NEVER put access token directly to client side**.  Possible error codes explanation:  | Status code | Code                  | Explanation                                                                     | | ---         | ---                   | ---                                                                             | | 400         | `INVALID_REQUEST`     | Request was not well formatted (malformed request syntax, size too large, etc.) | | 422         | `PERSONAL_ID_INVALID` | PersonalId is not valid                                                         |Returns probability of *application's* approval and limits of particular customer, if known to Skip Pay
   * @param precheckRequest  (optional)
   * @return PrecheckResultsResponse
   * @throws ApiException if fails to make API call
   */
  public PrecheckResultsResponse precheck(PrecheckRequest precheckRequest) throws ApiException {
    Object localVarPostBody = precheckRequest;
    
    // create path and map variables
    String localVarPath = "/financing/v1/precheck";

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

    GenericType<PrecheckResultsResponse> localVarReturnType = new GenericType<PrecheckResultsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
