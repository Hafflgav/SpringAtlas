# UserTasksApi

All URIs are relative to *http://localhost/atlas_engine/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userTasksUserTaskInstanceIdCancelReservationDelete**](UserTasksApi.md#userTasksUserTaskInstanceIdCancelReservationDelete) | **DELETE** /user_tasks/{userTaskInstanceId}/cancel-reservation | 
[**userTasksUserTaskInstanceIdFinishPut**](UserTasksApi.md#userTasksUserTaskInstanceIdFinishPut) | **PUT** /user_tasks/{userTaskInstanceId}/finish | 
[**userTasksUserTaskInstanceIdReservePut**](UserTasksApi.md#userTasksUserTaskInstanceIdReservePut) | **PUT** /user_tasks/{userTaskInstanceId}/reserve | 



## userTasksUserTaskInstanceIdCancelReservationDelete

> userTasksUserTaskInstanceIdCancelReservationDelete(userTaskInstanceId)



Cancels the reservation of the given UserTask instance.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.UserTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        UserTasksApi apiInstance = new UserTasksApi(defaultClient);
        String userTaskInstanceId = myUserTaskInstance_12345678; // String | The ID of the UserTaskInstance for which to cancel the reservation.
        try {
            apiInstance.userTasksUserTaskInstanceIdCancelReservationDelete(userTaskInstanceId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserTasksApi#userTasksUserTaskInstanceIdCancelReservationDelete");
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
 **userTaskInstanceId** | **String**| The ID of the UserTaskInstance for which to cancel the reservation. |

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
| **204** | Indicates the UserTaskInstance reservation was successfully canceled. |  -  |


## userTasksUserTaskInstanceIdFinishPut

> userTasksUserTaskInstanceIdFinishPut(userTaskInstanceId, body)



Finishes a specific UserTask by its UserTaskInstanceId.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.UserTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        UserTasksApi apiInstance = new UserTasksApi(defaultClient);
        String userTaskInstanceId = myUserTaskInstance_12345678; // String | The ID of the UserTaskInstance to be finished.
        Object body = null; // Object | 
        try {
            apiInstance.userTasksUserTaskInstanceIdFinishPut(userTaskInstanceId, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserTasksApi#userTasksUserTaskInstanceIdFinishPut");
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
 **userTaskInstanceId** | **String**| The ID of the UserTaskInstance to be finished. |
 **body** | **Object**|  | [optional]

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
| **204** | Indicates the UserTaskInstance was successfully finished. |  -  |


## userTasksUserTaskInstanceIdReservePut

> userTasksUserTaskInstanceIdReservePut(userTaskInstanceId, inlineObject1)



Reserves a UserTask for a specific User.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.UserTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        UserTasksApi apiInstance = new UserTasksApi(defaultClient);
        String userTaskInstanceId = myUserTaskInstance_12345678; // String | The ID of the UserTaskInstance to be reserved.
        InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
        try {
            apiInstance.userTasksUserTaskInstanceIdReservePut(userTaskInstanceId, inlineObject1);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserTasksApi#userTasksUserTaskInstanceIdReservePut");
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
 **userTaskInstanceId** | **String**| The ID of the UserTaskInstance to be reserved. |
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

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
| **204** | Indicates the UserTaskInstance was successfully reserved. |  -  |

