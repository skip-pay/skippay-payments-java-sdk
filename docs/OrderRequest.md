

# OrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **String** | Order number (internal for e-shop) |  |
|**variableSymbols** | **List&lt;String&gt;** | Variable symbols for pairing. First symbol in array is used for making the payment to your account (if not specified later in &#x60;Mark order items as sent&#x60; or &#x60;Mark order items as delivered&#x60;) or we expect you make payment on our account with this symbol (if not specified later in &#x60;Mark order items as returned&#x60; operation). Strings must contain only numbers, maximum length is 10 characters (digits). |  [optional] |
|**totalPrice** | [**Amount**](Amount.md) |  |  |
|**totalVat** | [**List&lt;VatAmount&gt;**](VatAmount.md) | Total VAT amounts split by their VAT rates. |  |
|**addresses** | [**List&lt;Address&gt;**](Address.md) | Addresses. Only &#x60;BILLING&#x60; and &#x60;DELIVERY&#x60; types are allowed. |  [optional] |
|**deliveryType** | **DeliveryType** |  |  [optional] |
|**deliveryCarrier** | [**DeliveryCarrier**](DeliveryCarrier.md) |  |  [optional] |
|**reservationDate** | **String** | Date and time until order is reserved.  Until &#39;reservationDate&#39; Skip Pay will try to notify partner with Application notification about approval or rejection.  After this date and time, e-shop does not guarantee items availability (if application processing is longer, it may endanger order fullfillment). |  [optional] |
|**documents** | [**List&lt;DocumentRequest&gt;**](DocumentRequest.md) | Attached documents (invoices etc.) |  [optional] |
|**items** | [**List&lt;OrderItemRequest&gt;**](OrderItemRequest.md) | Order items |  |
|**merchantId** | **String** | Merchant identification (ie. in case of multiple e-shops managed by one credentials) |  [optional] |



