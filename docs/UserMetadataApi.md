# UserMetadataApi

All URIs are relative to *http://localhost/atlas_engine/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userMetadataQueryGet**](UserMetadataApi.md#userMetadataQueryGet) | **GET** /user_metadata/query | 
[**userMetadataUserMetadataKeyDelete**](UserMetadataApi.md#userMetadataUserMetadataKeyDelete) | **DELETE** /user_metadata/{userMetadataKey} | 
[**userMetadataUserMetadataKeyGet**](UserMetadataApi.md#userMetadataUserMetadataKeyGet) | **GET** /user_metadata/{userMetadataKey} | 
[**userMetadataUserMetadataKeyPost**](UserMetadataApi.md#userMetadataUserMetadataKeyPost) | **POST** /user_metadata/{userMetadataKey} | 



## userMetadataQueryGet

> UserMetadataObject userMetadataQueryGet(keys, offset, limit, processInstanceScope, flowNodeInstanceScope)



Queries all values by the given keys

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.UserMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        UserMetadataApi apiInstance = new UserMetadataApi(defaultClient);
        OneOfstringarray keys = new OneOfstringarray(); // OneOfstringarray | The keys of the UserMetadata to query.
        BigDecimal offset = 0; // BigDecimal | The first index of the returned values.
        BigDecimal limit = 50; // BigDecimal | The maximum number of returned values.
        OneOfstringarray processInstanceScope = new OneOfstringarray(); // OneOfstringarray | The ProcessInstanceScope of the UserMetadata to query.
        OneOfstringarray flowNodeInstanceScope = new OneOfstringarray(); // OneOfstringarray | The FlowNodeInstanceScope of the UserMetadata to query.
        try {
            UserMetadataObject result = apiInstance.userMetadataQueryGet(keys, offset, limit, processInstanceScope, flowNodeInstanceScope);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserMetadataApi#userMetadataQueryGet");
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
 **keys** | [**OneOfstringarray**](.md)| The keys of the UserMetadata to query. | [optional] [default to null]
 **offset** | **BigDecimal**| The first index of the returned values. | [optional]
 **limit** | **BigDecimal**| The maximum number of returned values. | [optional]
 **processInstanceScope** | [**OneOfstringarray**](.md)| The ProcessInstanceScope of the UserMetadata to query. | [optional] [default to null]
 **flowNodeInstanceScope** | [**OneOfstringarray**](.md)| The FlowNodeInstanceScope of the UserMetadata to query. | [optional] [default to null]

### Return type

[**UserMetadataObject**](UserMetadataObject.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested metadata. |  -  |


## userMetadataUserMetadataKeyDelete

> userMetadataUserMetadataKeyDelete(userMetadataKey, processInstanceScope, flowNodeInstanceScope)



Removes a value for the given key

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.UserMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        UserMetadataApi apiInstance = new UserMetadataApi(defaultClient);
        String userMetadataKey = key1; // String | The key of the UserMetadata to remove.
        OneOfstringArraystring processInstanceScope = new OneOfstringArraystring(); // OneOfstringArraystring | The ProcessInstanceScope of the UserMetadata to remove.
        OneOfstringArraystring flowNodeInstanceScope = new OneOfstringArraystring(); // OneOfstringArraystring | The FlowNodeInstanceScope of the UserMetadata to remove.
        try {
            apiInstance.userMetadataUserMetadataKeyDelete(userMetadataKey, processInstanceScope, flowNodeInstanceScope);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserMetadataApi#userMetadataUserMetadataKeyDelete");
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
 **userMetadataKey** | **String**| The key of the UserMetadata to remove. |
 **processInstanceScope** | [**OneOfstringArraystring**](.md)| The ProcessInstanceScope of the UserMetadata to remove. | [optional] [default to null]
 **flowNodeInstanceScope** | [**OneOfstringArraystring**](.md)| The FlowNodeInstanceScope of the UserMetadata to remove. | [optional] [default to null]

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
| **204** | Indicates the UserMetadata was removed successfully. |  -  |


## userMetadataUserMetadataKeyGet

> UserMetadata userMetadataUserMetadataKeyGet(userMetadataKey, processInstanceScope, flowNodeInstanceScope)



Gets a value by the given key

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.UserMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        UserMetadataApi apiInstance = new UserMetadataApi(defaultClient);
        String userMetadataKey = key1; // String | The key of the UserMetadata to get.
        OneOfstringArraystring processInstanceScope = new OneOfstringArraystring(); // OneOfstringArraystring | The ProcessInstanceScope of the UserMetadata to get.
        OneOfstringArraystring flowNodeInstanceScope = new OneOfstringArraystring(); // OneOfstringArraystring | The FlowNodeInstanceScope of the UserMetadata to get.
        try {
            UserMetadata result = apiInstance.userMetadataUserMetadataKeyGet(userMetadataKey, processInstanceScope, flowNodeInstanceScope);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserMetadataApi#userMetadataUserMetadataKeyGet");
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
 **userMetadataKey** | **String**| The key of the UserMetadata to get. |
 **processInstanceScope** | [**OneOfstringArraystring**](.md)| The ProcessInstanceScope of the UserMetadata to get. | [optional] [default to null]
 **flowNodeInstanceScope** | [**OneOfstringArraystring**](.md)| The FlowNodeInstanceScope of the UserMetadata to get. | [optional] [default to null]

### Return type

[**UserMetadata**](UserMetadata.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested metadata. |  -  |


## userMetadataUserMetadataKeyPost

> userMetadataUserMetadataKeyPost(userMetadataKey, processInstanceScope, flowNodeInstanceScope, body)



Sets a value for the given key

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.UserMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        UserMetadataApi apiInstance = new UserMetadataApi(defaultClient);
        String userMetadataKey = key1; // String | The key of the UserMetadata to set.
        OneOfstringArraystring processInstanceScope = new OneOfstringArraystring(); // OneOfstringArraystring | The ProcessInstanceScope of the UserMetadata to set.
        OneOfstringArraystring flowNodeInstanceScope = new OneOfstringArraystring(); // OneOfstringArraystring | The FlowNodeInstanceScope of the UserMetadata to set.
        Object body = null; // Object | 
        try {
            apiInstance.userMetadataUserMetadataKeyPost(userMetadataKey, processInstanceScope, flowNodeInstanceScope, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserMetadataApi#userMetadataUserMetadataKeyPost");
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
 **userMetadataKey** | **String**| The key of the UserMetadata to set. |
 **processInstanceScope** | [**OneOfstringArraystring**](.md)| The ProcessInstanceScope of the UserMetadata to set. | [optional] [default to null]
 **flowNodeInstanceScope** | [**OneOfstringArraystring**](.md)| The FlowNodeInstanceScope of the UserMetadata to set. | [optional] [default to null]
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
| **201** | Indicates the UserMetadata was created successfully. |  -  |

