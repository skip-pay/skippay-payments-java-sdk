

# OrderItemsChangeRequest

Object used to change order items.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**items** | [**List&lt;ChangeOrderItemRequestSerializer&gt;**](ChangeOrderItemRequestSerializer.md) | List of changed items. All items are considered when empty. |  [optional] |
|**totalPrice** | [**OrderItemsChangeRequestTotalPrice**](OrderItemsChangeRequestTotalPrice.md) |  |  [optional] |
|**totalVat** | [**List&lt;VatAmount&gt;**](VatAmount.md) | Total VAT amounts of items (from orderItems array) split by their VAT rates. |  [optional] |



