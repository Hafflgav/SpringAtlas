# ProcessModelsApi

All URIs are relative to *http://localhost/atlas_engine/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**processModelsGet**](ProcessModelsApi.md#processModelsGet) | **GET** /process_models | 
[**processModelsProcessModelIdDelete**](ProcessModelsApi.md#processModelsProcessModelIdDelete) | **DELETE** /process_models/{processModelId} | 
[**processModelsProcessModelIdDisablePost**](ProcessModelsApi.md#processModelsProcessModelIdDisablePost) | **POST** /process_models/{processModelId}/disable | 
[**processModelsProcessModelIdEnablePost**](ProcessModelsApi.md#processModelsProcessModelIdEnablePost) | **POST** /process_models/{processModelId}/enable | 
[**processModelsProcessModelIdGet**](ProcessModelsApi.md#processModelsProcessModelIdGet) | **GET** /process_models/{processModelId}/ | 
[**processModelsProcessModelIdProcessDefinitionGet**](ProcessModelsApi.md#processModelsProcessModelIdProcessDefinitionGet) | **GET** /process_models/{processModelId}/process_definition | 
[**processModelsProcessModelIdStartPost**](ProcessModelsApi.md#processModelsProcessModelIdStartPost) | **POST** /process_models/{processModelId}/start | 



## processModelsGet

> ProcessModelList processModelsGet()



Gets all currently deployed Process Models.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ProcessModelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProcessModelsApi apiInstance = new ProcessModelsApi(defaultClient);
        try {
            ProcessModelList result = apiInstance.processModelsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessModelsApi#processModelsGet");
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

[**ProcessModelList**](ProcessModelList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## processModelsProcessModelIdDelete

> processModelsProcessModelIdDelete(processModelId, deleteAllRelatedData)



Deletes the ProcessDefinition that contains the Process Model with the given ID.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ProcessModelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProcessModelsApi apiInstance = new ProcessModelsApi(defaultClient);
        String processModelId = myProcess_12345678; // String | The ID of the ProcessModel for which to delete the ProcessDefinition.
        Boolean deleteAllRelatedData = true; // Boolean | If set to true, all ProcessInstances related to the ProcessDefinition will be deleted as well.
        try {
            apiInstance.processModelsProcessModelIdDelete(processModelId, deleteAllRelatedData);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessModelsApi#processModelsProcessModelIdDelete");
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
 **processModelId** | **String**| The ID of the ProcessModel for which to delete the ProcessDefinition. |
 **deleteAllRelatedData** | **Boolean**| If set to true, all ProcessInstances related to the ProcessDefinition will be deleted as well. | [optional]

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


## processModelsProcessModelIdDisablePost

> processModelsProcessModelIdDisablePost(processModelId)



Disables the given Process Model.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ProcessModelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProcessModelsApi apiInstance = new ProcessModelsApi(defaultClient);
        String processModelId = myProcess_12345678; // String | The ID of the ProcessModel to disable.
        try {
            apiInstance.processModelsProcessModelIdDisablePost(processModelId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessModelsApi#processModelsProcessModelIdDisablePost");
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
 **processModelId** | **String**| The ID of the ProcessModel to disable. |

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
| **204** | Indicates the ProcessModel was successfully disabled |  -  |


## processModelsProcessModelIdEnablePost

> processModelsProcessModelIdEnablePost(processModelId)



Enables the given Process Model.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ProcessModelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProcessModelsApi apiInstance = new ProcessModelsApi(defaultClient);
        String processModelId = myProcess_12345678; // String | The ID of the ProcessModel to enable.
        try {
            apiInstance.processModelsProcessModelIdEnablePost(processModelId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessModelsApi#processModelsProcessModelIdEnablePost");
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
 **processModelId** | **String**| The ID of the ProcessModel to enable. |

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
| **204** | Indicates the ProcessModel was successfully enabled. |  -  |


## processModelsProcessModelIdGet

> ProcessModel processModelsProcessModelIdGet(processModelId)



Gets a deployed Process Model by its ID.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ProcessModelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProcessModelsApi apiInstance = new ProcessModelsApi(defaultClient);
        String processModelId = myProcess_12345678; // String | The ID of the ProcessModel to retrieve.
        try {
            ProcessModel result = apiInstance.processModelsProcessModelIdGet(processModelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessModelsApi#processModelsProcessModelIdGet");
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
 **processModelId** | **String**| The ID of the ProcessModel to retrieve. |

### Return type

[**ProcessModel**](ProcessModel.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## processModelsProcessModelIdProcessDefinitionGet

> ProcessDefinition processModelsProcessModelIdProcessDefinitionGet(processModelId)



Gets a ProcessDefinition for a given ProcessModel.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ProcessModelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProcessModelsApi apiInstance = new ProcessModelsApi(defaultClient);
        String processModelId = myProcess_12345678; // String | The ID of the ProcessModel for which to retrieve the ProcessDefinition.
        try {
            ProcessDefinition result = apiInstance.processModelsProcessModelIdProcessDefinitionGet(processModelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessModelsApi#processModelsProcessModelIdProcessDefinitionGet");
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
 **processModelId** | **String**| The ID of the ProcessModel for which to retrieve the ProcessDefinition. |

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
| **200** |  |  -  |


## processModelsProcessModelIdStartPost

> ProcessStartResponse processModelsProcessModelIdStartPost(processModelId, processStartRequest)



Starts a new instance from the given set of parameters.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ProcessModelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProcessModelsApi apiInstance = new ProcessModelsApi(defaultClient);
        String processModelId = myProcess_12345678; // String | The ID of the ProcessModel for which to start a new instance.
        ProcessStartRequest processStartRequest = new ProcessStartRequest(); // ProcessStartRequest | 
        try {
            ProcessStartResponse result = apiInstance.processModelsProcessModelIdStartPost(processModelId, processStartRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessModelsApi#processModelsProcessModelIdStartPost");
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
 **processModelId** | **String**| The ID of the ProcessModel for which to start a new instance. |
 **processStartRequest** | [**ProcessStartRequest**](ProcessStartRequest.md)|  | [optional]

### Return type

[**ProcessStartResponse**](ProcessStartResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

