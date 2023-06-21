<img src="./docs/logo.webp" width="200" />

 - Java client for 
API documentation for Skip Pay partners.

- API version: 1.0
- Package version: 
- Build date: 2023-06-16T13:07:32.599404+02:00[Europe/Prague]

For more information, please visit [https://www.skippay.cz](https://www.skippay.cz)

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

### For Maven

```
mvn install:install-file -DgroupId="cz.skippay" -DartifactId="skippay-java-sdk" -Dversion="1.0.0" -Dpackaging="packaging"
```

### For Gradle

```
gradle skippay-java-sdk
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
package cz.my.skippay;

import cz.skippay.api.SecurityApi;
import cz.skippay.model.ApplicationResponse;
import cz.skippay.model.PartnerLogin;
import cz.skippay.model.PartnerLoginResult;

public class SdkDemo {
  public static void main(String[] args) {
    ApiClient client = new ApiClient();

    SecurityApi authApi = new SecurityApi(client);

    PartnerLogin credentials = new PartnerLogin();
    credentials.setUsername("USERNAME");
    credentials.setPassword("PASSWORD");
    
    try {
      PartnerLoginResult login = authApi.loginpartner(credentials);

      client.setBearerToken(login.getAccessToken());
      SkipPaySdk sdk = new SkipPaySdk(client);

      ApplicationResponse response = sdk.getApplicationsApi().getapplicationdetail("APPLICATION_ID");
      System.out.println(response.getId());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.partner.mallpay.cz*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*.ApplicationsApi* | **cancelapplication** | **PUT** /financing/v1/applications/{applicationId}/cancel | Cancel application
*.ApplicationsApi* | **changeapplicationorder** | **PUT** /financing/v1/applications/{applicationId}/order | Change application order
*.ApplicationsApi* | **createapplication** | **POST** /financing/v1/applications | Create application
*.ApplicationsApi* | **createapplicationfromrecurrence** | **POST** /financing/v1/recurrences/{recurrenceId}/applications | Create application from recurrence
*.ApplicationsApi* | **getapplicationdetail** | **GET** /financing/v1/applications/{applicationId} | Get application detail
*.ApplicationsApi* | **getorder** | **GET** /financing/v1/orders | Get order
*.ApplicationsApi* | **getpaymentsonspecificapplication** | **GET** /financing/v1/applications/{applicationId}/payments | Get payments on specific application
*.ApplicationsApi* | **getrecurrence** | **GET** /financing/v1/recurrences/{recurrenceId} | Get recurrence
*.ApplicationsApi* | **markorderitemsascancelled** | **PUT** /financing/v1/applications/{applicationId}/order/cancel | Mark order items as cancelled
*.ApplicationsApi* | **markorderitemsasdelivered** | **PUT** /financing/v1/applications/{applicationId}/order/deliver | Mark order items as delivered
*.ApplicationsApi* | **markorderitemsasreturned** | **PUT** /financing/v1/applications/{applicationId}/order/return | Mark order items as returned
*.ApplicationsApi* | **markorderitemsassent** | **PUT** /financing/v1/applications/{applicationId}/order/send | Mark order items as sent
*.ApplicationsApi* | **updaterecurrence** | **PATCH** /financing/v1/recurrences/{recurrenceId} | Update recurrence
*.HealthCheckApi* | **aPIhealthcheck** | **GET** /v1/health | API health check
*.MerchantsitesApi* | **applicationnotification** | **POST** /financing/v1/{application.merchantUrls.notificationEndpoint} | Application notification
*.MerchantsitesApi* | **paymentnotification** | **POST** /financing/v1/{application.merchantUrls.paymentEndpoint} | Payment notification
*.PrecheckApi* | **precheck** | **POST** /financing/v1/precheck | Precheck
*.SecurityApi* | **loginpartner** | **POST** /authentication/v1/partner | Login partner


## Documentation for Authorization




### httpBearer


- **Type**: Bearer authentication


## Author

info@skippay.cz

