

# ApplicationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**order** | [**OrderRequest**](OrderRequest.md) |  |  |
|**type** | **FinancingType** |  |  |
|**agreementTermsAndConditions** | **Boolean** | Terms and conditions agreement |  [optional] |
|**precheckIds** | **List&lt;String&gt;** | Array of all precheck ids related to this application. See [Precheck operation](#reference/precheck-operations/precheck) and it&#39;s response (PrecheckResultsResponse). |  [optional] |
|**merchantUrls** | [**MerchantUrls**](MerchantUrls.md) |  |  |
|**customer** | [**CustomerRequest**](CustomerRequest.md) |  |  |
|**isRecurring** | **Boolean** | Ensures recurrence ID in reponse. Default is &#x60;false&#x60; |  [optional] |



