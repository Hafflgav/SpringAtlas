

# FlowNodeInstance

A FlowNodeInstance.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flowNodeInstanceId** | **String** | The ID of the FlowNodeInstance | 
**flowNodeId** | **String** | The ID of the FlowNode | 
**flowNodeName** | **String** | The name of the FlowNode |  [optional]
**flowNodeLane** | **String** | The name of the FlowNode&#39;s lane that contains this FlowNodeInstance |  [optional]
**flowNodeType** | [**BpmnType**](BpmnType.md) |  | 
**eventType** | [**EventType**](EventType.md) |  |  [optional]
**previousFlowNodeInstanceId** | **String** | The ID of the FlowNodeInstance that was executed before this one. |  [optional]
**parentProcessInstanceId** | **String** | The ID of the parent ProcessInstance, if this FlowNodeInstance within is a sub process. |  [optional]
**state** | [**FlowNodeInstanceState**](FlowNodeInstanceState.md) |  | 
**processDefinitionId** | **String** | The ID of the ProcessDefinition that contains this FlowNodeInstance | 
**processModelId** | **String** | The ID of the ProcessModel that contains this FlowNodeInstance | 
**processInstanceId** | **String** | The ID of the ProcessInstance that contains this FlowNodeInstance | 
**correlationId** | **String** | The ID of the Correlation that contains this FlowNodeInstance | 
**tokens** | [**List&lt;ProcessToken&gt;**](ProcessToken.md) | The ProcessToken of the FlowNodeInstance | 
**ownerId** | **String** | The ID of the user that owns this FlowNodeInstance | 
**error** | [**Object**](.md) | The error that occured during execution of the FlowNodeInstance (if any). |  [optional]
**startedAt** | **String** | The date when the FlowNodeInstance was started. |  [optional]
**finishedAt** | **String** | The date when the FlowNodeInstance was finished. |  [optional]
**triggeredByFlowNodeInstance** | [**FlowNodeInstance**](FlowNodeInstance.md) |  |  [optional]



