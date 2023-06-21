

# OrderResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | **OrderDeliveryState** |  |  |
|**deliveryDate** | **LocalDate** | Date and time of delivery |  |
|**deliveryTrackingNumber** | **String** | Delivery tracking number |  |
|**sentDate** | **LocalDate** | Date and time of order shipping |  |
|**documents** | [**List&lt;DocumentResponse&gt;**](DocumentResponse.md) | Attached documents (invoices etc.) |  [optional] |
|**items** | [**List&lt;OrderItemResponse&gt;**](OrderItemResponse.md) | Order items |  |
|**merchantId** | **String** | Merchant identification |  |



