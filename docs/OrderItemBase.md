

# OrderItemBase

Order item base information, needed to identify order item

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



