

# VatAmount

Financial amount with VAT rate.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **BigDecimal** | Amount in minor units (12590 represents 125,90 CZK) [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) |  |
|**currency** | **String** | Amount currency. [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) (only CZK value is allowed) |  |
|**vatRate** | **BigDecimal** | VAT rate as positive number (ie. 15 represents 15% rate). 0 is allowed. |  |



