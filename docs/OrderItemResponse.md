

# OrderItemResponse

Order item information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Internal code for item (internal to e-shop). Used to better identify the item for future changes |  |
|**ean** | **String** | EAN code. |  [optional] |
|**name** | **String** | Item name |  |
|**type** | **ItemType** |  |  [optional] |
|**variant** | **String** | Item variant |  [optional] |
|**description** | **String** |  |  [optional] |
|**producer** | **String** | Producer name |  [optional] |
|**categories** | **List&lt;String&gt;** | List of item categories |  [optional] |
|**totalPrice** | [**Amount**](Amount.md) |  |  |
|**totalVat** | [**VatAmount**](VatAmount.md) |  |  |
|**productUrl** | **String** | URL of the item in e-shop |  [optional] |
|**state** | **OrderDeliveryState** |  |  |
|**sentDate** | **LocalDate** | Date when item was sent. Only when the whole order was NOT sent at once. |  |
|**deliveryDate** | **LocalDate** | Date when item was delivered. Only when the whole order was NOT sent at once. |  |
|**deliveryTrackingNumber** | **String** | Tracking number for the item. Only when the whole order was NOT sent at once. |  |
|**image** | [**FileResponse**](FileResponse.md) |  |  [optional] |
|**unitPrice** | [**Amount**](Amount.md) |  |  |
|**unitVat** | [**VatAmount**](VatAmount.md) |  |  |
|**quantity** | **BigDecimal** | (positive float/decimal up to 3 decimal places) Item quantity. |  |



