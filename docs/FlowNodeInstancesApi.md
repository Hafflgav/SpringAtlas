# FlowNodeInstancesApi

All URIs are relative to *http://localhost/atlas_engine/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**flowNodeInstancesGet**](FlowNodeInstancesApi.md#flowNodeInstancesGet) | **GET** /flow_node_instances | 



## flowNodeInstancesGet

> FlowNodeInstanceList flowNodeInstancesGet(limit, offset, flowNodeInstanceId, flowNodeId, flowNodeName, flowNodeLane, flowNodeType, eventType, correlationId, processDefinitionId, processModelId, processInstanceId, ownerId, state, previousFlowNodeInstanceId, parentProcessInstanceId, createdAt, updatedAt, triggeredByFlowNodeInstance)



Gets all FlowNodeInstances that match the given query.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.FlowNodeInstancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FlowNodeInstancesApi apiInstance = new FlowNodeInstancesApi(defaultClient);
        BigDecimal limit = 100; // BigDecimal | The maximum amount of FlowNodeInstances to be returned.
        BigDecimal offset = 5; // BigDecimal | The index of the first FlowNodeInstance to be returned.
        String flowNodeInstanceId = myFlowNodeInstance_12345678; // String | The ID of the FlowNodeInstance to be returned.
        String flowNodeId = myFlowNode_12345678; // String | The ID of the FlowNode for which to retrieve FlowNodeInstances.
        String flowNodeName = myFlowNode; // String | The name of the FlowNode for which to retrieve FlowNodeInstances.
        String flowNodeLane = myLane; // String | The name of the Lane for which to retrieve FlowNodeInstances.
        String flowNodeType = bpmn:BoundaryEvent; // String | The type of the FlowNode for which to retrieve FlowNodeInstances.
        String eventType = messageEvent; // String | The event type of the FlowNodeInstance to be returned.
        String correlationId = myCorrelationId_12345678; // String | The correlationId of the FlowNodeInstance to be returned.
        String processDefinitionId = myProcessDefinition_12345678; // String | The ID of the ProcessDefinition for which to retrieve FlowNodeInstances.
        String processModelId = myProcessModel_12345678; // String | The ID of the ProcessModel for which to retrieve FlowNodeInstances.
        String processInstanceId = myProcessInstance_12345678; // String | The ID of the ProcessInstance for which to retrieve FlowNodeInstances.
        String ownerId = myOwner_12345678; // String | The ID of the FlowNodeInstance owner for which to retrieve FlowNodeInstances.
        String state = running; // String | The state of the FlowNodeInstance to be returned.
        String previousFlowNodeInstanceId = myPreviousFlowNodeInstance_12345678; // String | The ID of the previous FlowNodeInstance for which to retrieve FlowNodeInstances.
        String parentProcessInstanceId = myParentProcessInstance_12345678; // String | The ID of the parent ProcessInstance for which to retrieve FlowNodeInstances.
        String createdAt = 2020-01-01T00:00:00.000Z; // String | The createdAt date for which to retrieve FlowNodeInstances.
        String updatedAt = 2020-01-01T00:00:00.000Z; // String | The updatedAt date for which to retrieve FlowNodeInstances.
        OneOfArraystringstringSearchQuery triggeredByFlowNodeInstance = new OneOfArraystringstringSearchQuery(); // OneOfArraystringstringSearchQuery | The ID of the FlowNodeInstance that triggered the FlowNodeInstance to be returned.
        try {
            FlowNodeInstanceList result = apiInstance.flowNodeInstancesGet(limit, offset, flowNodeInstanceId, flowNodeId, flowNodeName, flowNodeLane, flowNodeType, eventType, correlationId, processDefinitionId, processModelId, processInstanceId, ownerId, state, previousFlowNodeInstanceId, parentProcessInstanceId, createdAt, updatedAt, triggeredByFlowNodeInstance);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FlowNodeInstancesApi#flowNodeInstancesGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **BigDecimal**| The maximum amount of FlowNodeInstances to be returned. | [optional]
 **offset** | **BigDecimal**| The index of the first FlowNodeInstance to be returned. | [optional]
 **flowNodeInstanceId** | **String**| The ID of the FlowNodeInstance to be returned. | [optional]
 **flowNodeId** | **String**| The ID of the FlowNode for which to retrieve FlowNodeInstances. | [optional]
 **flowNodeName** | **String**| The name of the FlowNode for which to retrieve FlowNodeInstances. | [optional]
 **flowNodeLane** | **String**| The name of the Lane for which to retrieve FlowNodeInstances. | [optional]
 **flowNodeType** | **String**| The type of the FlowNode for which to retrieve FlowNodeInstances. | [optional]
 **eventType** | **String**| The event type of the FlowNodeInstance to be returned. | [optional]
 **correlationId** | **String**| The correlationId of the FlowNodeInstance to be returned. | [optional]
 **processDefinitionId** | **String**| The ID of the ProcessDefinition for which to retrieve FlowNodeInstances. | [optional]
 **processModelId** | **String**| The ID of the ProcessModel for which to retrieve FlowNodeInstances. | [optional]
 **processInstanceId** | **String**| The ID of the ProcessInstance for which to retrieve FlowNodeInstances. | [optional]
 **ownerId** | **String**| The ID of the FlowNodeInstance owner for which to retrieve FlowNodeInstances. | [optional]
 **state** | **String**| The state of the FlowNodeInstance to be returned. | [optional]
 **previousFlowNodeInstanceId** | **String**| The ID of the previous FlowNodeInstance for which to retrieve FlowNodeInstances. | [optional]
 **parentProcessInstanceId** | **String**| The ID of the parent ProcessInstance for which to retrieve FlowNodeInstances. | [optional]
 **createdAt** | **String**| The createdAt date for which to retrieve FlowNodeInstances. | [optional]
 **updatedAt** | **String**| The updatedAt date for which to retrieve FlowNodeInstances. | [optional]
 **triggeredByFlowNodeInstance** | [**OneOfArraystringstringSearchQuery**](.md)| The ID of the FlowNodeInstance that triggered the FlowNodeInstance to be returned. | [optional] [default to null]

### Return type

[**FlowNodeInstanceList**](FlowNodeInstanceList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of FlowNodeInstances. |  -  |

