# EventsApi

All URIs are relative to *http://localhost/atlas_engine/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**messagesEventNameTriggerPost**](EventsApi.md#messagesEventNameTriggerPost) | **POST** /messages/{eventName}/trigger | 
[**signalsEventNameTriggerPost**](EventsApi.md#signalsEventNameTriggerPost) | **POST** /signals/{eventName}/trigger | 



## messagesEventNameTriggerPost

> messagesEventNameTriggerPost(eventName, processInstanceId, inlineObject)



Triggers a MessageEvent by its name.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String eventName = myMessageEvent; // String | The name of the MessageEvent to be triggered.
        String processInstanceId = myProcessInstance_12345678; // String | The ID of the ProcessInstance for which to trigger the MessageEvent.
        InlineObject inlineObject = new InlineObject(); // InlineObject | 
        try {
            apiInstance.messagesEventNameTriggerPost(eventName, processInstanceId, inlineObject);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#messagesEventNameTriggerPost");
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
 **eventName** | **String**| The name of the MessageEvent to be triggered. |
 **processInstanceId** | **String**| The ID of the ProcessInstance for which to trigger the MessageEvent. | [optional]
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional]

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
| **204** | Indicates the MessageEvent was successfully triggered. |  -  |


## signalsEventNameTriggerPost

> signalsEventNameTriggerPost(eventName, processInstanceId)



Triggers a SignalEvent by its name.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String eventName = mySignalEvent; // String | The name of the SignalEvent to be triggered.
        String processInstanceId = myProcessInstance_12345678; // String | The ID of the ProcessInstance for which to trigger the SignalEvent.
        try {
            apiInstance.signalsEventNameTriggerPost(eventName, processInstanceId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#signalsEventNameTriggerPost");
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
 **eventName** | **String**| The name of the SignalEvent to be triggered. |
 **processInstanceId** | **String**| The ID of the ProcessInstance for which to trigger the SignalEvent. | [optional]

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
| **204** | Indicates the SignalEvent was successfully triggered. |  -  |

