

# PrecheckOrderItemRequest

Order item information for precheck validation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Internal code for item (internal to e-shop). Used to better identify the item for future changes |  [optional] |
|**ean** | **String** | EAN code |  [optional] |
|**name** | **String** | Item name |  [optional] |
|**type** | **ItemType** |  |  [optional] |
|**variant** | **String** | Item variant |  [optional] |
|**description** | **String** |  |  [optional] |
|**producer** | **String** | Producer name |  [optional] |
|**categories** | **List&lt;String&gt;** | List of item categories |  [optional] |
|**totalPrice** | [**Amount**](Amount.md) |  |  [optional] |
|**totalVat** | [**VatAmount**](VatAmount.md) |  |  [optional] |
|**productUrl** | **String** | URL of the item in e-shop |  [optional] |
|**unitPrice** | [**Amount**](Amount.md) |  |  [optional] |
|**unitVat** | [**VatAmount**](VatAmount.md) |  |  [optional] |
|**quantity** | **BigDecimal** | (positive float/decimal up to 3 decimal places) Item quantity. If empty, considered as 1. |  [optional] |



