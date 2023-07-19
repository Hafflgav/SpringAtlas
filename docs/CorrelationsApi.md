# CorrelationsApi

All URIs are relative to *http://localhost/atlas_engine/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**correlationsCorrelationIdGet**](CorrelationsApi.md#correlationsCorrelationIdGet) | **GET** /correlations/{correlation_id} | 
[**correlationsGet**](CorrelationsApi.md#correlationsGet) | **GET** /correlations | 



## correlationsCorrelationIdGet

> Correlation correlationsCorrelationIdGet(correlationId)



Gets a Correlation by its ID.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.CorrelationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CorrelationsApi apiInstance = new CorrelationsApi(defaultClient);
        String correlationId = 123; // String | The ID of the Correlation to retrieve.
        try {
            Correlation result = apiInstance.correlationsCorrelationIdGet(correlationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorrelationsApi#correlationsCorrelationIdGet");
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
 **correlationId** | **String**| The ID of the Correlation to retrieve. |

### Return type

[**Correlation**](Correlation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the Correlation with the given ID. |  -  |


## correlationsGet

> CorrelationList correlationsGet(limit, offset)



Gets all Correlations.

### Example

```java
// Import classes:
import io.miragon.processcube.client.invoker.ApiClient;
import io.miragon.processcube.client.invoker.ApiException;
import io.miragon.processcube.client.invoker.Configuration;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.invoker.models.*;
import io.miragon.processcube.client.api.CorrelationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CorrelationsApi apiInstance = new CorrelationsApi(defaultClient);
        BigDecimal limit = 10; // BigDecimal | The maximum amount of Correlations to be returned.
        BigDecimal offset = 5; // BigDecimal | The index of the first Correlation to be returned.
        try {
            CorrelationList result = apiInstance.correlationsGet(limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorrelationsApi#correlationsGet");
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
 **limit** | **BigDecimal**| The maximum amount of Correlations to be returned. | [optional]
 **offset** | **BigDecimal**| The index of the first Correlation to be returned. | [optional]

### Return type

[**CorrelationList**](CorrelationList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns all Correlations. |  -  |

