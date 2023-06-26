

# OrderItemsSendRequestAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**document** | [**DocumentRequest**](DocumentRequest.md) |  |  [optional] |
|**variableSymbol** | **String** | Required if was not specified earlier in &#39;&#39;Create application&#39;&#39; or &#39;&#39;Change application order&#39;&#39; operations. Symbol used for making the payment to your account. This string must contain only numbers, maximum length is 10 characters (digits). |  [optional] |
|**specificSymbol** | **String** | Symbol used for making the payment to your account. This string must contain only numbers, maximum length is 10 characters (digits). |  [optional] |
|**sentDate** | **LocalDate** | Shipping date |  [optional] |
|**deliveryCarrier** | [**DeliveryCarrier**](DeliveryCarrier.md) |  |  [optional] |
|**deliveryTrackingNumber** | **String** | Delivery tracking number |  [optional] |



