

# ProcessStartResponse

Contains a response from the Engine, which will be send after a ProcessInstance was started. Depending on the type of start callback used, this will also contain information about the reached EndEvent. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processInstanceId** | **String** | The ID of the ProcessInstance. | 
**correlationId** | **String** | The ID of the Correlation in which the started ProcessInstance runs. | 
**endEventId** | **String** | If the Engine is set to wait for the ProcessInstance to finish, this will contain the ID of the EndEvent with which ProcessInstance was finished. |  [optional]
**tokenPayload** | [**Object**](.md) | If the Engine is set to wait for the ProcessInstance to finish, this will contain the final result with which ProcessInstance was finished. |  [optional]



