# DataObjectInstancesApi

All URIs are relative to *http://localhost/atlas_engine/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataObjectInstancesQueryGet**](DataObjectInstancesApi.md#dataObjectInstancesQueryGet) | **GET** /data_object_instances/query | 



## dataObjectInstancesQueryGet

> DataObjectInstanceList dataObjectInstancesQueryGet(limit, offset, dataObjectId, processDefinitionId, processModelId, processInstanceId, flowNodeInstanceId, createdAt)



Gets the DataObjectInstances that match the given query.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.DataObjectInstancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataObjectInstancesApi apiInstance = new DataObjectInstancesApi(defaultClient);
        BigDecimal limit = 100; // BigDecimal | The maximum amount of DataObjectInstances to be returned.
        BigDecimal offset = 5; // BigDecimal | The index of the first DataObjectInstance to be returned.
        String dataObjectId = myDataObject_12345678; // String | The ID of the DataObject for which to retrieve DataObjectInstances.
        String processDefinitionId = myProcessDefinition_12345678; // String | The ID of the ProcessDefinition for which to retrieve DataObjectInstances.
        String processModelId = myProcessModel_12345678; // String | The ID of the ProcessModel for which to retrieve DataObjectInstances.
        String processInstanceId = myProcessInstance_12345678; // String | The ID of the ProcessInstance for which to retrieve DataObjectInstances.
        String flowNodeInstanceId = myFlowNodeInstance_12345678; // String | The ID of the FlowNodeInstance for which to retrieve DataObjectInstances.
        String createdAt = 2020-01-01T00:00:00.000Z; // String | The createdAt date for which to retrieve DataObjectInstances.
        try {
            DataObjectInstanceList result = apiInstance.dataObjectInstancesQueryGet(limit, offset, dataObjectId, processDefinitionId, processModelId, processInstanceId, flowNodeInstanceId, createdAt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataObjectInstancesApi#dataObjectInstancesQueryGet");
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
 **limit** | **BigDecimal**| The maximum amount of DataObjectInstances to be returned. | [optional]
 **offset** | **BigDecimal**| The index of the first DataObjectInstance to be returned. | [optional]
 **dataObjectId** | **String**| The ID of the DataObject for which to retrieve DataObjectInstances. | [optional]
 **processDefinitionId** | **String**| The ID of the ProcessDefinition for which to retrieve DataObjectInstances. | [optional]
 **processModelId** | **String**| The ID of the ProcessModel for which to retrieve DataObjectInstances. | [optional]
 **processInstanceId** | **String**| The ID of the ProcessInstance for which to retrieve DataObjectInstances. | [optional]
 **flowNodeInstanceId** | **String**| The ID of the FlowNodeInstance for which to retrieve DataObjectInstances. | [optional]
 **createdAt** | **String**| The createdAt date for which to retrieve DataObjectInstances. | [optional]

### Return type

[**DataObjectInstanceList**](DataObjectInstanceList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of DataObjectInstances. |  -  |

