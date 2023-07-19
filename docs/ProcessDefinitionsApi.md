# ProcessDefinitionsApi

All URIs are relative to *http://localhost/atlas_engine/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**processDefinitionsGet**](ProcessDefinitionsApi.md#processDefinitionsGet) | **GET** /process_definitions | 
[**processDefinitionsPost**](ProcessDefinitionsApi.md#processDefinitionsPost) | **POST** /process_definitions | 
[**processDefinitionsProcessDefinitionIdDelete**](ProcessDefinitionsApi.md#processDefinitionsProcessDefinitionIdDelete) | **DELETE** /process_definitions/{processDefinitionId} | 
[**processDefinitionsProcessDefinitionIdGet**](ProcessDefinitionsApi.md#processDefinitionsProcessDefinitionIdGet) | **GET** /process_definitions/{processDefinitionId} | 



## processDefinitionsGet

> ProcessDefinitionList processDefinitionsGet(offset, limit)



Gets all ProcessDefinitions the requesting user is allowed to see.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ProcessDefinitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProcessDefinitionsApi apiInstance = new ProcessDefinitionsApi(defaultClient);
        BigDecimal offset = 0; // BigDecimal | The index of the first ProcessDefinition to include.
        BigDecimal limit = 10; // BigDecimal | The maximum number of ProcessDefinitions to include.
        try {
            ProcessDefinitionList result = apiInstance.processDefinitionsGet(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessDefinitionsApi#processDefinitionsGet");
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
 **offset** | **BigDecimal**| The index of the first ProcessDefinition to include. | [optional]
 **limit** | **BigDecimal**| The maximum number of ProcessDefinitions to include. | [optional]

### Return type

[**ProcessDefinitionList**](ProcessDefinitionList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of ProcessDefinitions. |  -  |


## processDefinitionsPost

> processDefinitionsPost(persistProcessDefinitionsPayload)



Creates or updates a ProcessDefinition or a list of ProcessDefinitions.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ProcessDefinitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProcessDefinitionsApi apiInstance = new ProcessDefinitionsApi(defaultClient);
        PersistProcessDefinitionsPayload persistProcessDefinitionsPayload = new PersistProcessDefinitionsPayload(); // PersistProcessDefinitionsPayload | 
        try {
            apiInstance.processDefinitionsPost(persistProcessDefinitionsPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessDefinitionsApi#processDefinitionsPost");
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
 **persistProcessDefinitionsPayload** | [**PersistProcessDefinitionsPayload**](PersistProcessDefinitionsPayload.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Indicates the ProcessDefinition(s) was/were successfully persisted. |  -  |


## processDefinitionsProcessDefinitionIdDelete

> processDefinitionsProcessDefinitionIdDelete(processDefinitionId, deleteAllRelatedData)



Deletes the ProcessDefinition with the given ID.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ProcessDefinitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProcessDefinitionsApi apiInstance = new ProcessDefinitionsApi(defaultClient);
        String processDefinitionId = myProcess_12345678; // String | The ID of the ProcessDefinition to delete.
        Boolean deleteAllRelatedData = true; // Boolean | If set to true, all ProcessInstances and ProcessModels related to the ProcessDefinition will be deleted as well.
        try {
            apiInstance.processDefinitionsProcessDefinitionIdDelete(processDefinitionId, deleteAllRelatedData);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessDefinitionsApi#processDefinitionsProcessDefinitionIdDelete");
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
 **processDefinitionId** | **String**| The ID of the ProcessDefinition to delete. |
 **deleteAllRelatedData** | **Boolean**| If set to true, all ProcessInstances and ProcessModels related to the ProcessDefinition will be deleted as well. | [optional]

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Indicates the ProcessDefinition was successfully deleted. |  -  |


## processDefinitionsProcessDefinitionIdGet

> ProcessDefinition processDefinitionsProcessDefinitionIdGet(processDefinitionId)



Gets a ProcessDefinition by its id.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ProcessDefinitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProcessDefinitionsApi apiInstance = new ProcessDefinitionsApi(defaultClient);
        String processDefinitionId = myProcess_12345678; // String | The ID of the ProcessDefinition to retrieve.
        try {
            ProcessDefinition result = apiInstance.processDefinitionsProcessDefinitionIdGet(processDefinitionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessDefinitionsApi#processDefinitionsProcessDefinitionIdGet");
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
 **processDefinitionId** | **String**| The ID of the ProcessDefinition to retrieve. |

### Return type

[**ProcessDefinition**](ProcessDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A ProcessDefinitions. |  -  |

