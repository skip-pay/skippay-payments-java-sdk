

# ErrorsResponseErrorsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Unique internal error code |  |
|**message** | **String** | Human readable error description (non-localized) |  |
|**severity** | [**SeverityEnum**](#SeverityEnum) |  |  |
|**attribute** | **String** | JSON path of request attribute that caused the error (if applicable) |  [optional] |
|**ticketId** | **String** | Internal ticket ID, used for error backtracking |  [optional] |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| ERROR | &quot;ERROR&quot; |
| WARN | &quot;WARN&quot; |
| INFO | &quot;INFO&quot; |



