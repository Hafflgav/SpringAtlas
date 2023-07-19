

# ExternalTask

Describes an ExternalTask that the Engine has delegated to an ExternalTask worker for processing.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the ExternalTask. | 
**workerId** | **String** | The ID of the worker that has most recently locked the ExternalTask for processing. | 
**topic** | **String** | The topic of the ExternalTask. | 
**isSingleTry** | **Boolean** | A flag indicating whether or not the ExternalTask is a single try task. | 
**flowNodeInstanceId** | **String** | The ID of the FlowNodeInstance that the ExternalTask belongs to. | 
**correlationId** | **String** | The ID of the Correlation that the ExternalTask belongs to. | 
**processDefinitionId** | **String** | The ID of the ProcessDefinition that contains the ExternalTask. | 
**processModelId** | **String** | The ID of the ProcessModel that contains the ExternalTask. |  [optional]
**processInstanceId** | **String** | The ID of the ProcessInstance the ExternalTask belongs to. | 
**ownerId** | **String** | The ID of the user that owns the ExternalTask. | 
**payload** | [**Object**](.md) | The payload containing all relevant data the worker needs to execute the ExternalTask. | 
**lockExpirationTime** | **String** | The lock expiration time. On expiration, the task is released to be processed by other workers. If not set, the ExternalTask is not locked. | 
**state** | [**ExternalTaskState**](ExternalTaskState.md) |  | 
**finishedAt** | **String** | The date when the ExternalTask was finished. |  [optional]
**result** | [**Object**](.md) | The result of the ExternalTask. |  [optional]
**error** | [**Object**](.md) | The error that occurred during processing of the ExternalTask (if any). |  [optional]
**createdAt** | **String** | The date when the ExternalTask was created. |  [optional]



