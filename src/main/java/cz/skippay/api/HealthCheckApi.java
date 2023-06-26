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

import cz.skippay.model.HealthCheckResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class HealthCheckApi {
  private ApiClient apiClient;

  public HealthCheckApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HealthCheckApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * API health check
   * If the API back-end services are up and runing, you receive HTTP status code 200 with optional version info.  In other cases, you may receive errors similar to the following ones:    | Status code | Description                                             | | ---         | ---                                                     | | 503         | `Service Unavailable` - there is planned service outage |  > Note: resource DOES NOT require valid *access_token* in the HTTP header of the requestGet current state of the API
   * @param contentType Content Type (required)
   * @return HealthCheckResponse
   * @throws ApiException if fails to make API call
   */
  public HealthCheckResponse aPIhealthcheck(String contentType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling aPIhealthcheck");
    }
    
    // create path and map variables
    String localVarPath = "/v1/health";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (contentType != null)
      localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));

    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "httpBearer" };

    GenericType<HealthCheckResponse> localVarReturnType = new GenericType<HealthCheckResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
