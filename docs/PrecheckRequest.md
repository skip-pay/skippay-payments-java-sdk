

# PrecheckRequest

Precheck data (has similar structure as `Application`).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customer** | [**PrecheckCustomerRequest**](PrecheckCustomerRequest.md) |  |  |
|**order** | [**PrecheckOrderRequest**](PrecheckOrderRequest.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Financing type, if type is not sent &#x60;DEFERRED_PAYMENT&#x60; is selected. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DEFERRED_PAYMENT | &quot;DEFERRED_PAYMENT&quot; |
| PAY_IN_THREE | &quot;PAY_IN_THREE&quot; |



