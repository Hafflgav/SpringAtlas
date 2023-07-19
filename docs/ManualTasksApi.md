# ManualTasksApi

All URIs are relative to *http://localhost/atlas_engine/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**manualTasksManualTaskInstanceIdFinishPut**](ManualTasksApi.md#manualTasksManualTaskInstanceIdFinishPut) | **PUT** /manual_tasks/{manualTaskInstanceId}/finish | 



## manualTasksManualTaskInstanceIdFinishPut

> manualTasksManualTaskInstanceIdFinishPut(manualTaskInstanceId)



Finishes a specific ManualTask by its ManualTaskInstanceId.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.ManualTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ManualTasksApi apiInstance = new ManualTasksApi(defaultClient);
        String manualTaskInstanceId = myManualTaskInstance_12345678; // String | The ID of the ManualTaskInstance to be finished.
        try {
            apiInstance.manualTasksManualTaskInstanceIdFinishPut(manualTaskInstanceId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManualTasksApi#manualTasksManualTaskInstanceIdFinishPut");
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
 **manualTaskInstanceId** | **String**| The ID of the ManualTaskInstance to be finished. |

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
| **204** | Indicates the ManualTaskInstance was successfully finished. |  -  |

