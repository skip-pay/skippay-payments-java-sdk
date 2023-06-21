

# CustomerResponse

Customer data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**titleBefore** | **String** | Academical degree, in front of the name |  [optional] |
|**titleAfter** | **String** | Academical degree, behind name |  [optional] |
|**email** | **String** | E-mail address of customer |  |
|**addresses** | [**List&lt;Address&gt;**](Address.md) | Addresses. All types are allowed. |  [optional] |
|**tin** | **String** | Tax identification number (ICO) |  [optional] |
|**vatin** | **String** | VAT identification number |  [optional] |
|**extraData** | [**CustomerExtraData**](CustomerExtraData.md) |  |  [optional] |
|**firstName** | **String** | Customer first (given) name. Must be paired with &#x60;lastName&#x60;. Required if &#x60;fullName&#x60; is empty. |  |
|**lastName** | **String** | Customer last (family) name. Must be paired with &#x60;firstName&#x60;. Required if &#x60;fullName&#x60; is empty. |  |
|**fullName** | **String** | Customer full name, including academical degrees and salutation. Required only if &#x60;firstName&#x60; or &#x60;lastName&#x60; are empty. |  |
|**phone** | **String** | Phone number with country code (including leading &#x60;+&#x60;). |  |
|**precheckResultResponseSerializer** | **PrecheckResultResponseSerializer** |  |  [optional] |



