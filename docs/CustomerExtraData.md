

# CustomerExtraData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionsNumber** | **BigDecimal** | Historical count of customer&#39;s cash transactions made in partner&#39;s e-shop |  [optional] |
|**cashlessTransactionsNumber** | **BigDecimal** | Historical count of customer&#39;s cashless transactions made in partner&#39;s e-shop |  [optional] |
|**transactionsSum** | [**Amount**](Amount.md) |  |  [optional] |
|**cashlessTransactionsSum** | [**Amount**](Amount.md) |  |  [optional] |
|**latestTransactionDate** | **LocalDate** | Newest transaction date on partner e-shop. |  [optional] |
|**earliestTransactionDate** | **LocalDate** | Oldest transaction date on partner e-shop |  [optional] |
|**pageTotalTime** | **BigDecimal** | Total time spent on partners website (in seconds) |  [optional] |
|**pageReviewsTime** | **BigDecimal** | Total time spent on partners website in review and comments sections (in seconds) |  [optional] |
|**cartItemsRemoved** | **BigDecimal** | Total count of removed items form shopping basket during current shopping |  [optional] |
|**itemsViewed** | **BigDecimal** | Number of viewed pages with products |  [optional] |
|**tags** | **List&lt;String&gt;** | List of custom tags (ie. information, that customer is club member, vip customer, etc.) |  [optional] |



