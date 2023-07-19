

# ProcessModel

A ProcessModel.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processDefinitionId** | **String** | The ID of the ProcessDefinition that contains the ProcessModel. | 
**processModelId** | **String** | The ID of the ProcessModel. | 
**processModelName** | **String** | The name of the ProcessModel. |  [optional]
**version** | **String** | The version of the ProcessModel. |  [optional]
**isExecutable** | **Boolean** | A flag indicating whether the ProcessModel can be started. | 
**startEvents** | [**List&lt;StartEventViewModel&gt;**](StartEventViewModel.md) | The StartEvents contained in the ProcessModel. | 
**endEvents** | [**List&lt;EndEventViewModel&gt;**](EndEventViewModel.md) | The EndEvents contained in the ProcessModel. | 
**flowNodes** | [**List&lt;FlowNodeViewModel&gt;**](FlowNodeViewModel.md) | The FlowNodes contained in the ProcessModel. | 



