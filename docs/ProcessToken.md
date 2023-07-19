

# ProcessToken

A process token describes the state of a FlowNode during a specific point in its life (i.e. onEnter, onExit, etc.).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flowNodeInstanceId** | **String** | The ID of the FlowNodeInstance that this token belongs to. | 
**createdAt** | **String** | The point in time at which this token was created. | 
**type** | [**ProcessTokenType**](ProcessTokenType.md) |  | 
**payload** | [**Object**](.md) | The payload of the token. | 



