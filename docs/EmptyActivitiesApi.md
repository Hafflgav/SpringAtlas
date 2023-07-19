# EmptyActivitiesApi

All URIs are relative to *http://localhost/atlas_engine/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emptyActivitiesEmptyActivityInstanceIdFinishPut**](EmptyActivitiesApi.md#emptyActivitiesEmptyActivityInstanceIdFinishPut) | **PUT** /empty_activities/{emptyActivityInstanceId}/finish | 



## emptyActivitiesEmptyActivityInstanceIdFinishPut

> emptyActivitiesEmptyActivityInstanceIdFinishPut(emptyActivityInstanceId)



Finishes a specific EmptyActivity by its EmptyActivityInstanceId.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.EmptyActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmptyActivitiesApi apiInstance = new EmptyActivitiesApi(defaultClient);
        String emptyActivityInstanceId = myEmptyActivityInstance_12345678; // String | The ID of the EmptyActivityInstance to be finished.
        try {
            apiInstance.emptyActivitiesEmptyActivityInstanceIdFinishPut(emptyActivityInstanceId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmptyActivitiesApi#emptyActivitiesEmptyActivityInstanceIdFinishPut");
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
 **emptyActivityInstanceId** | **String**| The ID of the EmptyActivityInstance to be finished. |

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
| **204** | Indicates the EmptyActivityInstance was successfully finished. |  -  |

