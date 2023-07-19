

# Cronjob

Describes a cronjob.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processDefinitionId** | **String** | The ID of the ProcessDefinition that contains the cronjob. | 
**processModelId** | **String** | The ID of the ProcessModel that contains the cronjob. | 
**startEventId** | **String** | The ID of the StartEvent that contains the cronjob. | 
**enabled** | **Boolean** | Flag indicating whether or not the cronjob is enabled. | 
**crontab** | **String** | The crontab that describs the cronjob. | 
**startedProcessInstances** | [**BigDecimal**](BigDecimal.md) | The number of ProcessInstances that have been started by this cronjob. |  [optional]
**lastStartedProcessInstance** | **String** | The ID of the last ProcessInstance that has been started by this cronjob. |  [optional]
**lastTriggerDate** | **String** | The date of the last time the cronjob was triggered. |  [optional]
**nextTriggerDate** | **String** | The date of the next time the cronjob will be triggered. |  [optional]



