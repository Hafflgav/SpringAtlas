

# ProcessStartRequest

The request object to use for starting a ProcessInstance.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processModelId** | **String** | The ID of the ProcessModel to start. | 
**startEventId** | **String** | The ID of a StartEvent at which the ProcessInstance should start. |  [optional]
**correlationId** | **String** | A correlation ID to use for the ProcessInstance. |  [optional]
**initialToken** | [**Object**](.md) | The token to use for an initial ProcessToken. |  [optional]
**returnOn** | **Integer** |  |  [optional]
**endEventId** | **String** | The ID of an EndEvent that should be awaited. Must be provided, of \&quot;returnOn\&quot; is set to \&quot;CallbackOnEndEventReached\&quot;. |  [optional]



