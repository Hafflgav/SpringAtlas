

# ExternalTaskCreatedMessage

Message that is sent whenever an ExternalTask encountered an error.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**correlationId** | **String** | The ID of the correlation that the event belongs to. | 
**processDefinitionId** | **String** | The ID of the ProcessDefinition that the event belongs to. | 
**processModelId** | **String** | The ID of the ProcessModel that the event belongs to. | 
**processModelName** | **String** | The name of the ProcessModel that the event belongs to. |  [optional]
**processInstanceId** | **String** | The ID of the ProcessInstance that the event belongs to. | 
**parentProcessInstanceId** | **String** | The ID of the parent ProcessInstance (if event occured in a sub process) |  [optional]
**flowNodeId** | **String** | The ID of the FlowNode that the event belongs to. |  [optional]
**flowNodeName** | **String** | The name of the FlowNode that the event belongs to. |  [optional]
**flowNodeType** | [**BpmnType**](BpmnType.md) |  |  [optional]
**flowNodeInstanceId** | **String** | The ID of the FlowNodeInstance that the event belongs to. |  [optional]
**ownerId** | **String** | The ID of the user that owns the ProcessInstance that the event belongs to. | 
**previousFlowNodeInstanceId** | **String** | The ID of the FlowNodeInstance that was executed before. |  [optional]
**currentToken** | [**Object**](.md) | The current token of the ProcessInstance. | 
**eventType** | [**EventType**](EventType.md) |  |  [optional]
**eventName** | **String** | The name of the event. |  [optional]
**customCorrelationId** | **String** | Process Instances triggered by this Message will use the following Correlation ID. |  [optional]
**externalTaskId** | **String** | The ID of the ExternalTask. | 
**topic** | **String** | The topic of the ExternalTask. | 
**isSingleTry** | **Boolean** | Flag indicating whether the ExternalTask is a SingleTry ExternalTask. | 



