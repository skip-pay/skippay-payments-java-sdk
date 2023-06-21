package cz.skippay;

import cz.skippay.api.ApplicationsApi;
import cz.skippay.api.HealthCheckApi;
import cz.skippay.api.MerchantsitesApi;
import cz.skippay.api.PrecheckApi;
import cz.skippay.api.SecurityApi;


public class SkipPaySdk {  
  private ApiClient apiClient;

  private ApplicationsApi _ApplicationsApi;
  private HealthCheckApi _HealthCheckApi;
  private MerchantsitesApi _MerchantsitesApi;
  private PrecheckApi _PrecheckApi;
  private SecurityApi _SecurityApi;
  
  
  public SkipPaySdk(ApiClient apiClient) {
    this.apiClient = apiClient;
    this._ApplicationsApi = new ApplicationsApi(apiClient);
    this._HealthCheckApi = new HealthCheckApi(apiClient);
    this._MerchantsitesApi = new MerchantsitesApi(apiClient);
    this._PrecheckApi = new PrecheckApi(apiClient);
    this._SecurityApi = new SecurityApi(apiClient);
    
  }

  public ApplicationsApi getApplicationsApi() {
    return _ApplicationsApi;
  }
  public HealthCheckApi getHealthCheckApi() {
    return _HealthCheckApi;
  }
  public MerchantsitesApi getMerchantsitesApi() {
    return _MerchantsitesApi;
  }
  public PrecheckApi getPrecheckApi() {
    return _PrecheckApi;
  }
  public SecurityApi getSecurityApi() {
    return _SecurityApi;
  }
  
}