

# PrecheckResultResponse

Precheck result.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Precheck result type for Funding type. |  |
|**recommendation** | **Boolean** | A recommendation of whether the order should be passed to the Skip Pay.  true &#x3D; Application is going to be likely approved. false &#x3D; Application is going to be likely rejected. |  |
|**probabilityOfApproval** | **BigDecimal** | Probability of approval.  0 &#x3D; 0% to be approved 1 &#x3D; 100% to be approved  Partner can create custom logic not to follow the recommendation (be more strict or benevolent). |  |
|**completeness** | **BigDecimal** | Completness of the result. &lt;0, 1&gt; The lower is the value, the lower accuracy of the result. |  [optional] |
|**code** | [**CodeEnum**](#CodeEnum) | Result code. |  |
|**precheckResultResponseSerializer** | **PrecheckResultResponseSerializer** |  |  |
|**message** | **String** | Custom message for customer.  Examples: “V Skip Pay peněžence nemáte dostatečný limit.” “Uveďte do objednávky jméno a příjmení, které používáte ve službě Skip Pay.” etc. |  [optional] |
|**additionalData** | **List&lt;String&gt;** | List of additional data that customer has to send.  Possible values in array: &#x60;PERSONAL_ID&#x60;, &#x60;ID_CARD_NO&#x60;, &#x60;ID_CARD_EXPIRY_DATE&#x60;, &#x60;ID_CARD_SCAN&#x60;, &#x60;THIRD_PARTY_TELCO_CONSENT&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DEFERRED_PAYMENT | &quot;DEFERRED_PAYMENT&quot; |
| PAY_IN_THREE | &quot;PAY_IN_THREE&quot; |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| OK | &quot;OK&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot; |
| ADDITIONAL_DATA_SECURITY | &quot;ADDITIONAL_DATA_SECURITY&quot; |
| ADDITIONAL_DATA_LIMIT | &quot;ADDITIONAL_DATA_LIMIT&quot; |
| INSUFFICIENT_LIMIT | &quot;INSUFFICIENT_LIMIT&quot; |
| INSUFFICIENT_LIMIT_OPPORTUNITY | &quot;INSUFFICIENT_LIMIT_OPPORTUNITY&quot; |
| DETAILS_NOT_MATCHING | &quot;DETAILS_NOT_MATCHING&quot; |
| MANUAL_VERIFICATION | &quot;MANUAL_VERIFICATION&quot; |



