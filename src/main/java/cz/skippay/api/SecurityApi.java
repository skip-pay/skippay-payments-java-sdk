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
import cz.skippay.model.PartnerLogin;
import cz.skippay.model.PartnerLoginResult;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class SecurityApi {
  private ApiClient apiClient;

  public SecurityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SecurityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Login partner
   * Partner authenticate himself and obtain access token
   * @param partnerLogin  (required)
   * @return PartnerLoginResult
   * @throws ApiException if fails to make API call
   */
  public PartnerLoginResult loginpartner(PartnerLogin partnerLogin) throws ApiException {
    Object localVarPostBody = partnerLogin;
    
    // verify the required parameter 'partnerLogin' is set
    if (partnerLogin == null) {
      throw new ApiException(400, "Missing the required parameter 'partnerLogin' when calling loginpartner");
    }
    
    // create path and map variables
    String localVarPath = "/authentication/v1/partner";

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

    GenericType<PartnerLoginResult> localVarReturnType = new GenericType<PartnerLoginResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
