

# ProcessInstance

A ProcessInstance.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**correlationId** | **String** | The id of the correlation in whichs context the process instance runs. | 
**processInstanceId** | **String** | The id of the process instance. | 
**processDefinitionId** | **String** | The id of the process definition which the process instance belongs to. | 
**processModelId** | **String** | The id of the executed process model. | 
**processModelName** | **String** | The name of the executed process model. |  [optional]
**parentProcessInstanceId** | **String** | The id of the parent process instance, if this process instance is a sub process. |  [optional]
**hash** | **String** | The hash of the used process model. | 
**xml** | **String** | The xml of the used process model. |  [optional]
**state** | [**ProcessInstanceState**](ProcessInstanceState.md) |  | 
**error** | [**Object**](.md) | The error that occured during execution of the process instance (if any). | 
**ownerId** | **String** | The id of the user who started the process instance. | 
**anonymousSessionId** | **String** | The id of the anonymous session that started the process instance (if any). |  [optional]
**startedByRootAccessToken** | **Boolean** | A flag indicating whether or not the process instance was started using a root access token. | 
**createdAt** | **String** | The date when the process instance was started. |  [optional]
**finishedAt** | **String** | The date when the process instance was finished. |  [optional]
**restartedAt** | **String** | The date when the process instance was restarted (if any). |  [optional]
**terminatedByUserId** | **String** | The id of the user who terminated the process instance (if any). |  [optional]
**durationInMilliseconds** | [**BigDecimal**](BigDecimal.md) | The duration of the process instance in milliseconds. |  [optional]
**startEventId** | **String** | The id of the start event that started the process instance. |  [optional]
**startEventType** | [**EventType**](EventType.md) |  |  [optional]
**startToken** | [**Object**](.md) | The token that was used to start the process instance |  [optional]
**endEventId** | **String** | The id of the end event that ended the process instance (if ended). |  [optional]
**endEventType** | [**EventType**](EventType.md) |  |  [optional]
**endToken** | [**Object**](.md) | The token that reached the end event (if ended). |  [optional]
**metadata** | [**Object**](.md) | Metadata for a ProcessInstance. |  [optional]
**correlation** | [**Correlation**](Correlation.md) |  |  [optional]
**triggeredByFlowNodeInstance** | [**FlowNodeInstance**](FlowNodeInstance.md) |  |  [optional]



