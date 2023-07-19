# ExternalTasksApi

All URIs are relative to *http://localhost/atlas_engine/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**externalTasksDeployedTopicsGet**](ExternalTasksApi.md#externalTasksDeployedTopicsGet) | **GET** /external_tasks/deployed_topics | 
[**externalTasksExternalTaskIdErrorPut**](ExternalTasksApi.md#externalTasksExternalTaskIdErrorPut) | **PUT** /external_tasks/{externalTaskId}/error | 
[**externalTasksExternalTaskIdExtendLockPut**](ExternalTasksApi.md#externalTasksExternalTaskIdExtendLockPut) | **PUT** /external_tasks/{externalTaskId}/extend_lock | 
[**externalTasksExternalTaskIdFinishPut**](ExternalTasksApi.md#externalTasksExternalTaskIdFinishPut) | **PUT** /external_tasks/{externalTaskId}/finish | 
[**externalTasksExternalTaskIdHandleBpmnErrorPut**](ExternalTasksApi.md#externalTasksExternalTaskIdHandleBpmnErrorPut) | **PUT** /external_tasks/{externalTaskId}/handle_bpmn_error | 
[**externalTasksExternalTaskIdHandleServiceErrorPut**](ExternalTasksApi.md#externalTasksExternalTaskIdHandleServiceErrorPut) | **PUT** /external_tasks/{externalTaskId}/handle_service_error | 
[**externalTasksFetchAndLockPost**](ExternalTasksApi.md#externalTasksFetchAndLockPost) | **POST** /external_tasks/fetch_and_lock | 



## externalTasksDeployedTopicsGet

> List&lt;String&gt; externalTasksDeployedTopicsGet()



Fetches a list of all ExternalTask topics from all deployed Process Models.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ExternalTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalTasksApi apiInstance = new ExternalTasksApi(defaultClient);
        try {
            List<String> result = apiInstance.externalTasksDeployedTopicsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalTasksApi#externalTasksDeployedTopicsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of all ExternalTask topics from all deployed Process Models. |  -  |


## externalTasksExternalTaskIdErrorPut

> externalTasksExternalTaskIdErrorPut(externalTaskId, handleExternalTaskErrorRequestPayload)



Finishes the given External Task with the given Error.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ExternalTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalTasksApi apiInstance = new ExternalTasksApi(defaultClient);
        String externalTaskId = myExternalTask_12345678; // String | The ID of the ExternalTask for which to finish with an Error.
        HandleExternalTaskErrorRequestPayload handleExternalTaskErrorRequestPayload = new HandleExternalTaskErrorRequestPayload(); // HandleExternalTaskErrorRequestPayload | 
        try {
            apiInstance.externalTasksExternalTaskIdErrorPut(externalTaskId, handleExternalTaskErrorRequestPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalTasksApi#externalTasksExternalTaskIdErrorPut");
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
 **externalTaskId** | **String**| The ID of the ExternalTask for which to finish with an Error. |
 **handleExternalTaskErrorRequestPayload** | [**HandleExternalTaskErrorRequestPayload**](HandleExternalTaskErrorRequestPayload.md)|  | [optional]

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
| **204** | Indicates the ExternalTask was successfully finished with an Error. |  -  |


## externalTasksExternalTaskIdExtendLockPut

> externalTasksExternalTaskIdExtendLockPut(externalTaskId, extendLockRequestPayload)



Extends the lock duration of an ExternalTask by a given amount of time.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ExternalTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalTasksApi apiInstance = new ExternalTasksApi(defaultClient);
        String externalTaskId = myExternalTask_12345678; // String | The ID of the ExternalTask for which to extend the lock duration.
        ExtendLockRequestPayload extendLockRequestPayload = new ExtendLockRequestPayload(); // ExtendLockRequestPayload | 
        try {
            apiInstance.externalTasksExternalTaskIdExtendLockPut(externalTaskId, extendLockRequestPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalTasksApi#externalTasksExternalTaskIdExtendLockPut");
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
 **externalTaskId** | **String**| The ID of the ExternalTask for which to extend the lock duration. |
 **extendLockRequestPayload** | [**ExtendLockRequestPayload**](ExtendLockRequestPayload.md)|  | [optional]

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
| **204** | Indicates the ExternalTask lock was successfully extended. |  -  |


## externalTasksExternalTaskIdFinishPut

> externalTasksExternalTaskIdFinishPut(externalTaskId, finishExternalTaskRequestPayload)



Finishes the ExternalTask with the given ID.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ExternalTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalTasksApi apiInstance = new ExternalTasksApi(defaultClient);
        String externalTaskId = myExternalTask_12345678; // String | The ID of the ExternalTask to finish.
        FinishExternalTaskRequestPayload finishExternalTaskRequestPayload = new FinishExternalTaskRequestPayload(); // FinishExternalTaskRequestPayload | 
        try {
            apiInstance.externalTasksExternalTaskIdFinishPut(externalTaskId, finishExternalTaskRequestPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalTasksApi#externalTasksExternalTaskIdFinishPut");
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
 **externalTaskId** | **String**| The ID of the ExternalTask to finish. |
 **finishExternalTaskRequestPayload** | [**FinishExternalTaskRequestPayload**](FinishExternalTaskRequestPayload.md)|  | [optional]

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
| **204** | Indicates the ExternalTask was successfully finished. |  -  |


## externalTasksExternalTaskIdHandleBpmnErrorPut

> externalTasksExternalTaskIdHandleBpmnErrorPut(externalTaskId, handleBpmnErrorRequestPayload)



DEPRECATED - Use &#x60;PUT /external_tasks/:external_task_id/error&#x60; instead.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ExternalTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalTasksApi apiInstance = new ExternalTasksApi(defaultClient);
        String externalTaskId = myExternalTask_12345678; // String | The ID of the ExternalTask for which to finish with a BPMN Error.
        HandleBpmnErrorRequestPayload handleBpmnErrorRequestPayload = new HandleBpmnErrorRequestPayload(); // HandleBpmnErrorRequestPayload | 
        try {
            apiInstance.externalTasksExternalTaskIdHandleBpmnErrorPut(externalTaskId, handleBpmnErrorRequestPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalTasksApi#externalTasksExternalTaskIdHandleBpmnErrorPut");
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
 **externalTaskId** | **String**| The ID of the ExternalTask for which to finish with a BPMN Error. |
 **handleBpmnErrorRequestPayload** | [**HandleBpmnErrorRequestPayload**](HandleBpmnErrorRequestPayload.md)|  | [optional]

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
| **204** | Indicates the ExternalTask was successfully finished with a BPMN Error. |  -  |


## externalTasksExternalTaskIdHandleServiceErrorPut

> externalTasksExternalTaskIdHandleServiceErrorPut(externalTaskId, handleServiceErrorRequestPayload)



DEPRECATED - Use &#x60;PUT /external_tasks/:external_task_id/error&#x60; instead.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ExternalTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalTasksApi apiInstance = new ExternalTasksApi(defaultClient);
        String externalTaskId = myExternalTask_12345678; // String | The ID of the ExternalTask for which to finish with a Service Error.
        HandleServiceErrorRequestPayload handleServiceErrorRequestPayload = new HandleServiceErrorRequestPayload(); // HandleServiceErrorRequestPayload | 
        try {
            apiInstance.externalTasksExternalTaskIdHandleServiceErrorPut(externalTaskId, handleServiceErrorRequestPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalTasksApi#externalTasksExternalTaskIdHandleServiceErrorPut");
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
 **externalTaskId** | **String**| The ID of the ExternalTask for which to finish with a Service Error. |
 **handleServiceErrorRequestPayload** | [**HandleServiceErrorRequestPayload**](HandleServiceErrorRequestPayload.md)|  | [optional]

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
| **204** | Indicates the ExternalTask was successfully finished with a Service Error. |  -  |


## externalTasksFetchAndLockPost

> List&lt;ExternalTask&gt; externalTasksFetchAndLockPost(fetchAndLockRequestPayload)



Fetches the tasks available for an ExternalTaskWorker and locks them for a defined time.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ExternalTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalTasksApi apiInstance = new ExternalTasksApi(defaultClient);
        FetchAndLockRequestPayload fetchAndLockRequestPayload = new FetchAndLockRequestPayload(); // FetchAndLockRequestPayload | 
        try {
            List<ExternalTask> result = apiInstance.externalTasksFetchAndLockPost(fetchAndLockRequestPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalTasksApi#externalTasksFetchAndLockPost");
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
 **fetchAndLockRequestPayload** | [**FetchAndLockRequestPayload**](FetchAndLockRequestPayload.md)|  | [optional]

### Return type

[**List&lt;ExternalTask&gt;**](ExternalTask.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A list of locked ExternalTasks. |  -  |

