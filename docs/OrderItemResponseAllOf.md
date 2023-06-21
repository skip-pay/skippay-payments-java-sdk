

# OrderItemResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | **OrderDeliveryState** |  |  |
|**sentDate** | **LocalDate** | Date when item was sent. Only when the whole order was NOT sent at once. |  |
|**deliveryDate** | **LocalDate** | Date when item was delivered. Only when the whole order was NOT sent at once. |  |
|**deliveryTrackingNumber** | **String** | Tracking number for the item. Only when the whole order was NOT sent at once. |  |
|**image** | [**FileResponse**](FileResponse.md) |  |  [optional] |
|**unitPrice** | [**Amount**](Amount.md) |  |  |
|**unitVat** | [**VatAmount**](VatAmount.md) |  |  |
|**quantity** | **BigDecimal** | (positive float/decimal up to 3 decimal places) Item quantity. |  |



