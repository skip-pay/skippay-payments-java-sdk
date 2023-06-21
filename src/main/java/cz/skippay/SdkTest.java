package cz.skippay;

import cz.skippay.api.SecurityApi;
import cz.skippay.model.ApplicationResponse;
import cz.skippay.model.PartnerLogin;
import cz.skippay.model.PartnerLoginResult;

public class SdkTest {
  public static void main(String[] args) {
    ApiClient client = new ApiClient();
    client.setBasePath("https://api.partner.mallyna.cz");

    SecurityApi authApi = new SecurityApi(client);

    PartnerLogin credentials = new PartnerLogin();
    credentials.setUsername("api.skippay@dxheroes.cz");
    credentials.setPassword("SkipPay2023");
    
    try {
      PartnerLoginResult login = authApi.loginpartner(credentials);

      client.setBearerToken(login.getAccessToken());
      SkipPaySdk sdk = new SkipPaySdk(client);

      ApplicationResponse response = sdk.getApplicationsApi().getapplicationdetail("522149");
      System.out.println(response.getId());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
