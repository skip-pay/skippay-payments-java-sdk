

# MerchantUrls

Collection of URLs used for redirection of a customer back to a partner website or as a notification endpoint. Services that should be developed and exposed by partner e-shops to allow Skip Pay to asynchronously inform these partners about important changes regarding particular applications and orders.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvedRedirect** | **String** | URL of the partner used for redirection of the customer back to partner website (from Skip Pay gateway) after application approval. Do not implement any business logic on accessing this URL by customer. Implement business logic to READY notification via &#x60;notificationEndpoint&#x60;. |  |
|**rejectedRedirect** | **String** | URL of the partner used for redirection of the customer back to partner website (from Skip Pay gateway) after application rejection.  Do not implement any business logic on accessing this URL by customer. Implement business logic to REJECTED notification via &#x60;notificationEndpoint&#x60;. |  |
|**notificationEndpoint** | **String** | URL of the partner used as a notification endpoint for obtaining important updates about application (approval, rejection, storno, etc.). |  |
|**paymentsEndpoint** | **String** | URL of the partner used as a notification endpoint for obtaining information about payments connected with application. |  [optional] |



