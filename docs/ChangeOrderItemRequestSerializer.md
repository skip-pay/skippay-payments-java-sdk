

# ChangeOrderItemRequestSerializer

Order item base information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Internal code for item (internal to e-shop). Used to better identify the item for future changes |  [optional] |
|**ean** | **String** | EAN code. |  [optional] |
|**name** | **String** | Item name |  [optional] |
|**type** | **ItemType** |  |  [optional] |
|**quantity** | **BigDecimal** | (positive float/decimal up to 3 decimal places) Item quantity. If empty, considered as whole item quantity is selected |  [optional] |



