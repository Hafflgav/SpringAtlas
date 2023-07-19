

# FetchAndLockRequestPayload

Describes the payload that must be send with a fetchAndLock HTTP POST request.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**workerId** | **String** | The ID of the worker that wants to fetch and lock tasks. | 
**topicName** | [**OneOfstringarray**](OneOfstringarray.md) | The topic of the tasks to fetch and lock. | 
**maxTasks** | [**BigDecimal**](BigDecimal.md) | The maximum number of tasks to fetch and lock. | 
**longPollingTimeout** | [**BigDecimal**](BigDecimal.md) | The timeout for the long polling request. | 
**lockDuration** | [**BigDecimal**](BigDecimal.md) | The duration for which the tasks should be locked. | 
**payloadFilter** | **String** | A filter for the payload of the tasks. | 



