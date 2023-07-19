package io.miragon.processcube.client.api;

import io.miragon.processcube.client.invoker.ApiClient;

import io.miragon.processcube.client.model.InlineObject1;

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
@Component("io.miragon.processcube.client.api.UserTasksApi")
public class UserTasksApi {
    private ApiClient apiClient;

    public UserTasksApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserTasksApi(ApiClient apiClient) {
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
     * Cancels the reservation of the given UserTask instance.
     * <p><b>204</b> - Indicates the UserTaskInstance reservation was successfully canceled.
     * @param userTaskInstanceId The ID of the UserTaskInstance for which to cancel the reservation. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void userTasksUserTaskInstanceIdCancelReservationDelete(String userTaskInstanceId) throws RestClientException {
        userTasksUserTaskInstanceIdCancelReservationDeleteWithHttpInfo(userTaskInstanceId);
    }

    /**
     * 
     * Cancels the reservation of the given UserTask instance.
     * <p><b>204</b> - Indicates the UserTaskInstance reservation was successfully canceled.
     * @param userTaskInstanceId The ID of the UserTaskInstance for which to cancel the reservation. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> userTasksUserTaskInstanceIdCancelReservationDeleteWithHttpInfo(String userTaskInstanceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'userTaskInstanceId' is set
        if (userTaskInstanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userTaskInstanceId' when calling userTasksUserTaskInstanceIdCancelReservationDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userTaskInstanceId", userTaskInstanceId);
        String path = apiClient.expandPath("/user_tasks/{userTaskInstanceId}/cancel-reservation", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

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
     * Finishes a specific UserTask by its UserTaskInstanceId.
     * <p><b>204</b> - Indicates the UserTaskInstance was successfully finished.
     * @param userTaskInstanceId The ID of the UserTaskInstance to be finished. (required)
     * @param body  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void userTasksUserTaskInstanceIdFinishPut(String userTaskInstanceId, Object body) throws RestClientException {
        userTasksUserTaskInstanceIdFinishPutWithHttpInfo(userTaskInstanceId, body);
    }

    /**
     * 
     * Finishes a specific UserTask by its UserTaskInstanceId.
     * <p><b>204</b> - Indicates the UserTaskInstance was successfully finished.
     * @param userTaskInstanceId The ID of the UserTaskInstance to be finished. (required)
     * @param body  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> userTasksUserTaskInstanceIdFinishPutWithHttpInfo(String userTaskInstanceId, Object body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'userTaskInstanceId' is set
        if (userTaskInstanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userTaskInstanceId' when calling userTasksUserTaskInstanceIdFinishPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userTaskInstanceId", userTaskInstanceId);
        String path = apiClient.expandPath("/user_tasks/{userTaskInstanceId}/finish", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Reserves a UserTask for a specific User.
     * <p><b>204</b> - Indicates the UserTaskInstance was successfully reserved.
     * @param userTaskInstanceId The ID of the UserTaskInstance to be reserved. (required)
     * @param inlineObject1  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void userTasksUserTaskInstanceIdReservePut(String userTaskInstanceId, InlineObject1 inlineObject1) throws RestClientException {
        userTasksUserTaskInstanceIdReservePutWithHttpInfo(userTaskInstanceId, inlineObject1);
    }

    /**
     * 
     * Reserves a UserTask for a specific User.
     * <p><b>204</b> - Indicates the UserTaskInstance was successfully reserved.
     * @param userTaskInstanceId The ID of the UserTaskInstance to be reserved. (required)
     * @param inlineObject1  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> userTasksUserTaskInstanceIdReservePutWithHttpInfo(String userTaskInstanceId, InlineObject1 inlineObject1) throws RestClientException {
        Object postBody = inlineObject1;
        
        // verify the required parameter 'userTaskInstanceId' is set
        if (userTaskInstanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userTaskInstanceId' when calling userTasksUserTaskInstanceIdReservePut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userTaskInstanceId", userTaskInstanceId);
        String path = apiClient.expandPath("/user_tasks/{userTaskInstanceId}/reserve", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
