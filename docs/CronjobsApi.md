# CronjobsApi

All URIs are relative to *http://localhost/atlas_engine/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cronjobsGet**](CronjobsApi.md#cronjobsGet) | **GET** /cronjobs | 
[**cronjobsHistoryGet**](CronjobsApi.md#cronjobsHistoryGet) | **GET** /cronjobs/history | 
[**cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdDisablePost**](CronjobsApi.md#cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdDisablePost) | **POST** /cronjobs/process_models/{processModelId}/flow_node/{flowNodeId}/disable | 
[**cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdEnablePost**](CronjobsApi.md#cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdEnablePost) | **POST** /cronjobs/process_models/{processModelId}/flow_node/{flowNodeId}/enable | 
[**cronjobsQueryGet**](CronjobsApi.md#cronjobsQueryGet) | **GET** /cronjobs/query | 



## cronjobsGet

> CronjobList cronjobsGet(limit, offset)



Gets a list of all active Cronjobs.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.CronjobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CronjobsApi apiInstance = new CronjobsApi(defaultClient);
        BigDecimal limit = 10; // BigDecimal | The maximum amount of Cronjobs to be returned.
        BigDecimal offset = 5; // BigDecimal | The index of the first Cronjob to be returned.
        try {
            CronjobList result = apiInstance.cronjobsGet(limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CronjobsApi#cronjobsGet");
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
 **limit** | **BigDecimal**| The maximum amount of Cronjobs to be returned. | [optional]
 **offset** | **BigDecimal**| The index of the first Cronjob to be returned. | [optional]

### Return type

[**CronjobList**](CronjobList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of all active Cronjobs. |  -  |


## cronjobsHistoryGet

> CronjobHistoryList cronjobsHistoryGet(limit, offset, processDefinitionId, processModelId, startEventId, crontab, executedAt, createdAt, updatedAt)



Gets a list of all CronjobHistories.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.CronjobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CronjobsApi apiInstance = new CronjobsApi(defaultClient);
        BigDecimal limit = 10; // BigDecimal | The maximum amount of CronjobHistories to be returned.
        BigDecimal offset = 5; // BigDecimal | The index of the first CronjobHistory to be returned.
        String processDefinitionId = myProcess_12345678; // String | The ID of the ProcessDefinition for which to retrieve CronjobHistories.
        String processModelId = myProcessModel_12345678; // String | The ID of the ProcessModel for which to retrieve CronjobHistories.
        String startEventId = myStartEvent_12345678; // String | The ID of the StartEvent for which to retrieve CronjobHistories.
        String crontab = 0 0 1 * *; // String | The crontab expression for which to retrieve CronjobHistories.
        String executedAt = 2020-01-01T00:00:00.000Z; // String | The executedAt date for which to retrieve CronjobHistories.
        String createdAt = 2020-01-01T00:00:00.000Z; // String | The createdAt date for which to retrieve CronjobHistories.
        String updatedAt = 2020-01-01T00:00:00.000Z; // String | The updatedAt date for which to retrieve CronjobHistories.
        try {
            CronjobHistoryList result = apiInstance.cronjobsHistoryGet(limit, offset, processDefinitionId, processModelId, startEventId, crontab, executedAt, createdAt, updatedAt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CronjobsApi#cronjobsHistoryGet");
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
 **limit** | **BigDecimal**| The maximum amount of CronjobHistories to be returned. | [optional]
 **offset** | **BigDecimal**| The index of the first CronjobHistory to be returned. | [optional]
 **processDefinitionId** | **String**| The ID of the ProcessDefinition for which to retrieve CronjobHistories. | [optional]
 **processModelId** | **String**| The ID of the ProcessModel for which to retrieve CronjobHistories. | [optional]
 **startEventId** | **String**| The ID of the StartEvent for which to retrieve CronjobHistories. | [optional]
 **crontab** | **String**| The crontab expression for which to retrieve CronjobHistories. | [optional]
 **executedAt** | **String**| The executedAt date for which to retrieve CronjobHistories. | [optional]
 **createdAt** | **String**| The createdAt date for which to retrieve CronjobHistories. | [optional]
 **updatedAt** | **String**| The updatedAt date for which to retrieve CronjobHistories. | [optional]

### Return type

[**CronjobHistoryList**](CronjobHistoryList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of CronjobHistories. |  -  |


## cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdDisablePost

> cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdDisablePost(processModelId, flowNodeId)



Disables the given Cronjob for the given ProcessModel.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.CronjobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CronjobsApi apiInstance = new CronjobsApi(defaultClient);
        String processModelId = myProcessModel_12345678; // String | The ID of the ProcessModel for which to disable the Cronjob.
        String flowNodeId = myFlowNode_12345678; // String | The ID of the FlowNode for which to disable the Cronjob.
        try {
            apiInstance.cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdDisablePost(processModelId, flowNodeId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CronjobsApi#cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdDisablePost");
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
 **processModelId** | **String**| The ID of the ProcessModel for which to disable the Cronjob. |
 **flowNodeId** | **String**| The ID of the FlowNode for which to disable the Cronjob. |

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
| **204** | The Cronjob was successfully disabled. |  -  |


## cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdEnablePost

> cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdEnablePost(processModelId, flowNodeId)



Enables the given Cronjob for the given ProcessModel.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.CronjobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CronjobsApi apiInstance = new CronjobsApi(defaultClient);
        String processModelId = myProcessModel_12345678; // String | The ID of the ProcessModel for which to enable the Cronjob.
        String flowNodeId = myFlowNode_12345678; // String | The ID of the FlowNode for which to enable the Cronjob.
        try {
            apiInstance.cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdEnablePost(processModelId, flowNodeId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CronjobsApi#cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdEnablePost");
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
 **processModelId** | **String**| The ID of the ProcessModel for which to enable the Cronjob. |
 **flowNodeId** | **String**| The ID of the FlowNode for which to enable the Cronjob. |

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
| **204** | The Cronjob was successfully enabled. |  -  |


## cronjobsQueryGet

> CronjobList cronjobsQueryGet(limit, offset, processDefinitionId, processModelId, startEventId, crontab, enabled, nextExecution)



Queries a list of deployed Cronjobs.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.CronjobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CronjobsApi apiInstance = new CronjobsApi(defaultClient);
        BigDecimal limit = 10; // BigDecimal | The maximum amount of Cronjobs to be returned.
        BigDecimal offset = 5; // BigDecimal | The index of the first Cronjob to be returned.
        String processDefinitionId = myProcess_12345678; // String | The ID of the ProcessDefinition for which to retrieve Cronjobs.
        String processModelId = myProcessModel_12345678; // String | The ID of the ProcessModel for which to retrieve Cronjobs.
        String startEventId = myStartEvent_12345678; // String | The ID of the StartEvent for which to retrieve Cronjobs.
        String crontab = 0 0 1 * *; // String | The crontab expression for which to retrieve Cronjobs.
        Boolean enabled = true; // Boolean | The enabled state for which to retrieve Cronjobs.
        String nextExecution = 2020-01-01T00:00:00.000Z; // String | The nextExecution date for which to retrieve Cronjobs.
        try {
            CronjobList result = apiInstance.cronjobsQueryGet(limit, offset, processDefinitionId, processModelId, startEventId, crontab, enabled, nextExecution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CronjobsApi#cronjobsQueryGet");
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
 **limit** | **BigDecimal**| The maximum amount of Cronjobs to be returned. | [optional]
 **offset** | **BigDecimal**| The index of the first Cronjob to be returned. | [optional]
 **processDefinitionId** | **String**| The ID of the ProcessDefinition for which to retrieve Cronjobs. | [optional]
 **processModelId** | **String**| The ID of the ProcessModel for which to retrieve Cronjobs. | [optional]
 **startEventId** | **String**| The ID of the StartEvent for which to retrieve Cronjobs. | [optional]
 **crontab** | **String**| The crontab expression for which to retrieve Cronjobs. | [optional]
 **enabled** | **Boolean**| The enabled state for which to retrieve Cronjobs. | [optional]
 **nextExecution** | **String**| The nextExecution date for which to retrieve Cronjobs. | [optional]

### Return type

[**CronjobList**](CronjobList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Cronjobs. |  -  |

