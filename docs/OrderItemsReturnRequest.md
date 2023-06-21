

# OrderItemsReturnRequest

Object used to mark order items as returned.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**items** | [**List&lt;ChangeOrderItemRequestSerializer&gt;**](ChangeOrderItemRequestSerializer.md) | List of changed items. All items are considered when empty. |  [optional] |
|**totalPrice** | [**OrderItemsChangeRequestTotalPrice**](OrderItemsChangeRequestTotalPrice.md) |  |  [optional] |
|**totalVat** | [**List&lt;VatAmount&gt;**](VatAmount.md) | Total VAT amounts of items (from orderItems array) split by their VAT rates. |  [optional] |
|**document** | [**DocumentRequest**](DocumentRequest.md) |  |  [optional] |
|**variableSymbol** | **String** | Variable symbol of the new document (credit note, ...). This symbols is used by Skip Pay to pair payment from e-shop. |  [optional] |



