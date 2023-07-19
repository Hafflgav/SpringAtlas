package io.miragon.processcube.client.api;

import io.miragon.processcube.client.invoker.ApiClient;

import java.math.BigDecimal;
import io.miragon.processcube.client.model.UserMetadata;
import io.miragon.processcube.client.model.UserMetadataObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-19T14:39:29.278702+02:00[Europe/Berlin]")
@Component("io.miragon.processcube.client.api.UserMetadataApi")
public class UserMetadataApi {
    private ApiClient apiClient;

    public UserMetadataApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserMetadataApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Queries all values by the given keys
     * <p><b>200</b> - Returns the requested metadata.
     * @param keys The keys of the UserMetadata to query. (optional, default to null)
     * @param offset The first index of the returned values. (optional)
     * @param limit The maximum number of returned values. (optional)
     * @param processInstanceScope The ProcessInstanceScope of the UserMetadata to query. (optional, default to null)
     * @param flowNodeInstanceScope The FlowNodeInstanceScope of the UserMetadata to query. (optional, default to null)
     * @return UserMetadataObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserMetadataObject userMetadataQueryGet(ArrayList<String> keys, BigDecimal offset, BigDecimal limit, String processInstanceScope, String flowNodeInstanceScope) throws RestClientException {
        return userMetadataQueryGetWithHttpInfo(keys, offset, limit, processInstanceScope, flowNodeInstanceScope).getBody();
    }

    /**
     * 
     * Queries all values by the given keys
     * <p><b>200</b> - Returns the requested metadata.
     * @param keys The keys of the UserMetadata to query. (optional, default to null)
     * @param offset The first index of the returned values. (optional)
     * @param limit The maximum number of returned values. (optional)
     * @param processInstanceScope The ProcessInstanceScope of the UserMetadata to query. (optional, default to null)
     * @param flowNodeInstanceScope The FlowNodeInstanceScope of the UserMetadata to query. (optional, default to null)
     * @return ResponseEntity&lt;UserMetadataObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserMetadataObject> userMetadataQueryGetWithHttpInfo(ArrayList<String> keys, BigDecimal offset, BigDecimal limit, String processInstanceScope, String flowNodeInstanceScope) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/user_metadata/query", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "keys", keys));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processInstanceScope", processInstanceScope));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flowNodeInstanceScope", flowNodeInstanceScope));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<UserMetadataObject> returnType = new ParameterizedTypeReference<UserMetadataObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Removes a value for the given key
     * <p><b>204</b> - Indicates the UserMetadata was removed successfully.
     * @param userMetadataKey The key of the UserMetadata to remove. (required)
     * @param processInstanceScope The ProcessInstanceScope of the UserMetadata to remove. (optional, default to null)
     * @param flowNodeInstanceScope The FlowNodeInstanceScope of the UserMetadata to remove. (optional, default to null)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void userMetadataUserMetadataKeyDelete(String userMetadataKey, String processInstanceScope, String flowNodeInstanceScope) throws RestClientException {
        userMetadataUserMetadataKeyDeleteWithHttpInfo(userMetadataKey, processInstanceScope, flowNodeInstanceScope);
    }

    /**
     * 
     * Removes a value for the given key
     * <p><b>204</b> - Indicates the UserMetadata was removed successfully.
     * @param userMetadataKey The key of the UserMetadata to remove. (required)
     * @param processInstanceScope The ProcessInstanceScope of the UserMetadata to remove. (optional, default to null)
     * @param flowNodeInstanceScope The FlowNodeInstanceScope of the UserMetadata to remove. (optional, default to null)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> userMetadataUserMetadataKeyDeleteWithHttpInfo(String userMetadataKey, String processInstanceScope, String flowNodeInstanceScope) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'userMetadataKey' is set
        if (userMetadataKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userMetadataKey' when calling userMetadataUserMetadataKeyDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userMetadataKey", userMetadataKey);
        String path = apiClient.expandPath("/user_metadata/{userMetadataKey}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processInstanceScope", processInstanceScope));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flowNodeInstanceScope", flowNodeInstanceScope));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets a value by the given key
     * <p><b>200</b> - Returns the requested metadata.
     * @param userMetadataKey The key of the UserMetadata to get. (required)
     * @param processInstanceScope The ProcessInstanceScope of the UserMetadata to get. (optional, default to null)
     * @param flowNodeInstanceScope The FlowNodeInstanceScope of the UserMetadata to get. (optional, default to null)
     * @return UserMetadata
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserMetadata userMetadataUserMetadataKeyGet(String userMetadataKey, String processInstanceScope, String flowNodeInstanceScope) throws RestClientException {
        return userMetadataUserMetadataKeyGetWithHttpInfo(userMetadataKey, processInstanceScope, flowNodeInstanceScope).getBody();
    }

    /**
     * 
     * Gets a value by the given key
     * <p><b>200</b> - Returns the requested metadata.
     * @param userMetadataKey The key of the UserMetadata to get. (required)
     * @param processInstanceScope The ProcessInstanceScope of the UserMetadata to get. (optional, default to null)
     * @param flowNodeInstanceScope The FlowNodeInstanceScope of the UserMetadata to get. (optional, default to null)
     * @return ResponseEntity&lt;UserMetadata&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserMetadata> userMetadataUserMetadataKeyGetWithHttpInfo(String userMetadataKey, String processInstanceScope, String flowNodeInstanceScope) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'userMetadataKey' is set
        if (userMetadataKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userMetadataKey' when calling userMetadataUserMetadataKeyGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userMetadataKey", userMetadataKey);
        String path = apiClient.expandPath("/user_metadata/{userMetadataKey}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processInstanceScope", processInstanceScope));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flowNodeInstanceScope", flowNodeInstanceScope));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<UserMetadata> returnType = new ParameterizedTypeReference<UserMetadata>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Sets a value for the given key
     * <p><b>201</b> - Indicates the UserMetadata was created successfully.
     * @param userMetadataKey The key of the UserMetadata to set. (required)
     * @param processInstanceScope The ProcessInstanceScope of the UserMetadata to set. (optional, default to null)
     * @param flowNodeInstanceScope The FlowNodeInstanceScope of the UserMetadata to set. (optional, default to null)
     * @param body  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void userMetadataUserMetadataKeyPost(String userMetadataKey, String processInstanceScope, String flowNodeInstanceScope, Object body) throws RestClientException {
        userMetadataUserMetadataKeyPostWithHttpInfo(userMetadataKey, processInstanceScope, flowNodeInstanceScope, body);
    }

    /**
     * 
     * Sets a value for the given key
     * <p><b>201</b> - Indicates the UserMetadata was created successfully.
     * @param userMetadataKey The key of the UserMetadata to set. (required)
     * @param processInstanceScope The ProcessInstanceScope of the UserMetadata to set. (optional, default to null)
     * @param flowNodeInstanceScope The FlowNodeInstanceScope of the UserMetadata to set. (optional, default to null)
     * @param body  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> userMetadataUserMetadataKeyPostWithHttpInfo(String userMetadataKey, String processInstanceScope, String flowNodeInstanceScope, Object body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'userMetadataKey' is set
        if (userMetadataKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userMetadataKey' when calling userMetadataUserMetadataKeyPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userMetadataKey", userMetadataKey);
        String path = apiClient.expandPath("/user_metadata/{userMetadataKey}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processInstanceScope", processInstanceScope));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flowNodeInstanceScope", flowNodeInstanceScope));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
