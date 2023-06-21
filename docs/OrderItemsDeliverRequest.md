

# OrderItemsDeliverRequest

Object used to mark order items as delivered.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**items** | [**List&lt;ChangeOrderItemRequestSerializer&gt;**](ChangeOrderItemRequestSerializer.md) | List of changed items. All items are considered when empty. |  [optional] |
|**totalPrice** | [**OrderItemsChangeRequestTotalPrice**](OrderItemsChangeRequestTotalPrice.md) |  |  [optional] |
|**totalVat** | [**List&lt;VatAmount&gt;**](VatAmount.md) | Total VAT amounts of items (from orderItems array) split by their VAT rates. |  [optional] |
|**document** | [**DocumentRequest**](DocumentRequest.md) |  |  [optional] |
|**variableSymbol** | **String** | Required if was not specified earlier in &#39;&#39;Create application&#39;&#39; or &#39;&#39;Change application order&#39;&#39; operations. Symbol used for making the payment to your account. This string must contain only numbers, maximum length is 10 characters (digits). |  [optional] |
|**specificSymbol** | **String** | Symbol used for making the payment to your account. This string must contain only numbers, maximum length is 10 characters (digits). |  [optional] |
|**sentDate** | **LocalDate** | Shipping date |  [optional] |
|**deliveryCarrier** | **DeliveryCarrier** |  |  [optional] |
|**deliveryTrackingNumber** | **String** | Delivery tracking number |  [optional] |
|**deliveryDate** | **LocalDate** | Delivery date |  [optional] |



