

# ApplicationCancelRequest

Specification of the reason why the application is cancelled.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reason** | [**ReasonEnum**](#ReasonEnum) | Reason of cancellation. Considered as &#x60;APPLICATION_CANCELLED_OTHER&#x60; if not set. |  [optional] |
|**customReason** | **String** | Specification of &#x60;APPLICATION_CANCELLED_OTHER&#x60; reason |  [optional] |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| CARRIER_CHANGED | &quot;APPLICATION_CANCELLED_CARRIER_CHANGED&quot; |
| CART_CONTENT_CHANGED | &quot;APPLICATION_CANCELLED_CART_CONTENT_CHANGED&quot; |
| BY_CUSTOMER | &quot;APPLICATION_CANCELLED_BY_CUSTOMER&quot; |
| BY_ERP | &quot;APPLICATION_CANCELLED_BY_ERP&quot; |
| EXPIRED | &quot;APPLICATION_CANCELLED_EXPIRED&quot; |
| UNFINISHED | &quot;APPLICATION_CANCELLED_UNFINISHED&quot; |
| BY_ESHOP_RULES | &quot;APPLICATION_CANCELLED_BY_ESHOP_RULES&quot; |
| OTHER | &quot;APPLICATION_CANCELLED_OTHER&quot; |



