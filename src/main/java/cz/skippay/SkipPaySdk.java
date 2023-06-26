package cz.skippay;

import cz.skippay.api.ApplicationOperationsApi;
import cz.skippay.api.HealthCheckApi;
import cz.skippay.api.PrecheckOperationsApi;
import cz.skippay.api.SecurityApi;


public class SkipPaySdk {  
  private ApiClient apiClient;

  private ApplicationOperationsApi _ApplicationOperationsApi;
  private HealthCheckApi _HealthCheckApi;
  private PrecheckOperationsApi _PrecheckOperationsApi;
  private SecurityApi _SecurityApi;
  
  
  public SkipPaySdk(ApiClient apiClient) {
    this.apiClient = apiClient;
    this._ApplicationOperationsApi = new ApplicationOperationsApi(apiClient);
    this._HealthCheckApi = new HealthCheckApi(apiClient);
    this._PrecheckOperationsApi = new PrecheckOperationsApi(apiClient);
    this._SecurityApi = new SecurityApi(apiClient);
    
  }

  public ApplicationOperationsApi getApplicationOperationsApi() {
    return _ApplicationOperationsApi;
  }
  public HealthCheckApi getHealthCheckApi() {
    return _HealthCheckApi;
  }
  public PrecheckOperationsApi getPrecheckOperationsApi() {
    return _PrecheckOperationsApi;
  }
  public SecurityApi getSecurityApi() {
    return _SecurityApi;
  }
  
}