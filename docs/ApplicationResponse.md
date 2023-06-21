

# ApplicationResponse

Financing application

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier in Skip Pay |  |
|**state** | [**StateEnum**](#StateEnum) | Application state. |  |
|**stateReason** | [**StateReasonEnum**](#StateReasonEnum) | Describes internal state of application, e.g. when state is PROCESSING - reason why application remains in processing state |  |
|**customer** | [**CustomerResponse**](CustomerResponse.md) |  |  |
|**order** | [**OrderResponse**](OrderResponse.md) |  |  |
|**type** | **FinancingType** |  |  |
|**agreementTermsAndConditions** | **Boolean** | Terms and conditions agreement |  |
|**gatewayRedirectUrl** | **String** | Gateway redirect URL. Redirect user to this URL if state is &#x60;PROCESSING&#x60; and stateReason is &#x60;PROCESSING_REDIRECT_NEEDED&#x60;. |  |
|**recurrence** | [**RecurrenceObject**](RecurrenceObject.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PROCESSING | &quot;PROCESSING&quot; |
| READY | &quot;READY&quot; |
| REJECTED | &quot;REJECTED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |



## Enum: StateReasonEnum

| Name | Value |
|---- | -----|
| PROCESSING_REDIRECT_NEEDED | &quot;PROCESSING_REDIRECT_NEEDED&quot; |
| PROCESSING_PREAPPROVED | &quot;PROCESSING_PREAPPROVED&quot; |
| PROCESSING_VALIDATION_IN_PROGRESS | &quot;PROCESSING_VALIDATION_IN_PROGRESS&quot; |
| REJECTED | &quot;REJECTED&quot; |
| CANCELLED_NOT_PAID | &quot;CANCELLED_NOT_PAID&quot; |
| READY_TO_SHIP | &quot;READY_TO_SHIP&quot; |
| READY_SHIPPED | &quot;READY_SHIPPED&quot; |
| READY_DELIVERED | &quot;READY_DELIVERED&quot; |
| READY_PAID | &quot;READY_PAID&quot; |
| CANCELLED_RETURNED | &quot;CANCELLED_RETURNED&quot; |



