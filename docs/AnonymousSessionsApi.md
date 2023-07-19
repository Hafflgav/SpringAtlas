# AnonymousSessionsApi

All URIs are relative to *http://localhost/atlas_engine/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**anonymousSessionPost**](AnonymousSessionsApi.md#anonymousSessionPost) | **POST** /anonymous_session | 
[**anonymousSessionSessionSessionIdGet**](AnonymousSessionsApi.md#anonymousSessionSessionSessionIdGet) | **GET** /anonymous_session/session/{session_id} | 
[**anonymousSessionUserUserIdGet**](AnonymousSessionsApi.md#anonymousSessionUserUserIdGet) | **GET** /anonymous_session/user/{user_id} | 



## anonymousSessionPost

> String anonymousSessionPost()



Creates a new anonymous session and returns its ID.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.AnonymousSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AnonymousSessionsApi apiInstance = new AnonymousSessionsApi(defaultClient);
        try {
            String result = apiInstance.anonymousSessionPost();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnonymousSessionsApi#anonymousSessionPost");
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

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the ID of the newly created anonymous session. |  -  |


## anonymousSessionSessionSessionIdGet

> AnonymousSession anonymousSessionSessionSessionIdGet(sessionId)



Returns the anonymous session with the given ID.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.AnonymousSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AnonymousSessionsApi apiInstance = new AnonymousSessionsApi(defaultClient);
        String sessionId = 123; // String | The ID of the session to retrieve.
        try {
            AnonymousSession result = apiInstance.anonymousSessionSessionSessionIdGet(sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnonymousSessionsApi#anonymousSessionSessionSessionIdGet");
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
 **sessionId** | **String**| The ID of the session to retrieve. |

### Return type

[**AnonymousSession**](AnonymousSession.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the anonymous session with the given ID. |  -  |


## anonymousSessionUserUserIdGet

> List&lt;AnonymousSession&gt; anonymousSessionUserUserIdGet(userId)



Returns all anonymous sessions of the given User ID.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.AnonymousSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AnonymousSessionsApi apiInstance = new AnonymousSessionsApi(defaultClient);
        String userId = MyUser; // String | The ID of the user whose anonymous sessions should be retrieved.
        try {
            List<AnonymousSession> result = apiInstance.anonymousSessionUserUserIdGet(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnonymousSessionsApi#anonymousSessionUserUserIdGet");
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
 **userId** | **String**| The ID of the user whose anonymous sessions should be retrieved. |

### Return type

[**List&lt;AnonymousSession&gt;**](AnonymousSession.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns all anonymous sessions of the given User ID. |  -  |

