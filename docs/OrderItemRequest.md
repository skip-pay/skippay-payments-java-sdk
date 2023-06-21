

# OrderItemRequest

Order item information, needed to create an application.

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
|**image** | **String** | Either URL to the file or base64 encoded file content |  [optional] |
|**unitPrice** | [**Amount**](Amount.md) |  |  [optional] |
|**unitVat** | [**VatAmount**](VatAmount.md) |  |  [optional] |
|**quantity** | **BigDecimal** | (positive float/decimal up to 3 decimal places) Item quantity. If empty, considered as 1. |  [optional] |



