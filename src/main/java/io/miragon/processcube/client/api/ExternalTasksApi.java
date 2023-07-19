package io.miragon.processcube.client.api;

import io.miragon.processcube.client.invoker.ApiClient;

import io.miragon.processcube.client.model.ExtendLockRequestPayload;
import io.miragon.processcube.client.model.ExternalTask;
import io.miragon.processcube.client.model.FetchAndLockRequestPayload;
import io.miragon.processcube.client.model.FinishExternalTaskRequestPayload;
import io.miragon.processcube.client.model.HandleBpmnErrorRequestPayload;
import io.miragon.processcube.client.model.HandleExternalTaskErrorRequestPayload;
import io.miragon.processcube.client.model.HandleServiceErrorRequestPayload;

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
@Component("io.miragon.processcube.client.api.ExternalTasksApi")
public class ExternalTasksApi {
    private ApiClient apiClient;

    public ExternalTasksApi() {
        this(new ApiClient());
    }

    @Autowired
    public ExternalTasksApi(ApiClient apiClient) {
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
     * Fetches a list of all ExternalTask topics from all deployed Process Models.
     * <p><b>200</b> - A list of all ExternalTask topics from all deployed Process Models.
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> externalTasksDeployedTopicsGet() throws RestClientException {
        return externalTasksDeployedTopicsGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Fetches a list of all ExternalTask topics from all deployed Process Models.
     * <p><b>200</b> - A list of all ExternalTask topics from all deployed Process Models.
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> externalTasksDeployedTopicsGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/external_tasks/deployed_topics", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Finishes the given External Task with the given Error.
     * <p><b>204</b> - Indicates the ExternalTask was successfully finished with an Error.
     * @param externalTaskId The ID of the ExternalTask for which to finish with an Error. (required)
     * @param handleExternalTaskErrorRequestPayload  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void externalTasksExternalTaskIdErrorPut(String externalTaskId, HandleExternalTaskErrorRequestPayload handleExternalTaskErrorRequestPayload) throws RestClientException {
        externalTasksExternalTaskIdErrorPutWithHttpInfo(externalTaskId, handleExternalTaskErrorRequestPayload);
    }

    /**
     * 
     * Finishes the given External Task with the given Error.
     * <p><b>204</b> - Indicates the ExternalTask was successfully finished with an Error.
     * @param externalTaskId The ID of the ExternalTask for which to finish with an Error. (required)
     * @param handleExternalTaskErrorRequestPayload  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> externalTasksExternalTaskIdErrorPutWithHttpInfo(String externalTaskId, HandleExternalTaskErrorRequestPayload handleExternalTaskErrorRequestPayload) throws RestClientException {
        Object postBody = handleExternalTaskErrorRequestPayload;
        
        // verify the required parameter 'externalTaskId' is set
        if (externalTaskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalTaskId' when calling externalTasksExternalTaskIdErrorPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("externalTaskId", externalTaskId);
        String path = apiClient.expandPath("/external_tasks/{externalTaskId}/error", uriVariables);

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
     * Extends the lock duration of an ExternalTask by a given amount of time.
     * <p><b>204</b> - Indicates the ExternalTask lock was successfully extended.
     * @param externalTaskId The ID of the ExternalTask for which to extend the lock duration. (required)
     * @param extendLockRequestPayload  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void externalTasksExternalTaskIdExtendLockPut(String externalTaskId, ExtendLockRequestPayload extendLockRequestPayload) throws RestClientException {
        externalTasksExternalTaskIdExtendLockPutWithHttpInfo(externalTaskId, extendLockRequestPayload);
    }

    /**
     * 
     * Extends the lock duration of an ExternalTask by a given amount of time.
     * <p><b>204</b> - Indicates the ExternalTask lock was successfully extended.
     * @param externalTaskId The ID of the ExternalTask for which to extend the lock duration. (required)
     * @param extendLockRequestPayload  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> externalTasksExternalTaskIdExtendLockPutWithHttpInfo(String externalTaskId, ExtendLockRequestPayload extendLockRequestPayload) throws RestClientException {
        Object postBody = extendLockRequestPayload;
        
        // verify the required parameter 'externalTaskId' is set
        if (externalTaskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalTaskId' when calling externalTasksExternalTaskIdExtendLockPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("externalTaskId", externalTaskId);
        String path = apiClient.expandPath("/external_tasks/{externalTaskId}/extend_lock", uriVariables);

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
     * Finishes the ExternalTask with the given ID.
     * <p><b>204</b> - Indicates the ExternalTask was successfully finished.
     * @param externalTaskId The ID of the ExternalTask to finish. (required)
     * @param finishExternalTaskRequestPayload  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void externalTasksExternalTaskIdFinishPut(String externalTaskId, FinishExternalTaskRequestPayload finishExternalTaskRequestPayload) throws RestClientException {
        externalTasksExternalTaskIdFinishPutWithHttpInfo(externalTaskId, finishExternalTaskRequestPayload);
    }

    /**
     * 
     * Finishes the ExternalTask with the given ID.
     * <p><b>204</b> - Indicates the ExternalTask was successfully finished.
     * @param externalTaskId The ID of the ExternalTask to finish. (required)
     * @param finishExternalTaskRequestPayload  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> externalTasksExternalTaskIdFinishPutWithHttpInfo(String externalTaskId, FinishExternalTaskRequestPayload finishExternalTaskRequestPayload) throws RestClientException {
        Object postBody = finishExternalTaskRequestPayload;
        
        // verify the required parameter 'externalTaskId' is set
        if (externalTaskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalTaskId' when calling externalTasksExternalTaskIdFinishPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("externalTaskId", externalTaskId);
        String path = apiClient.expandPath("/external_tasks/{externalTaskId}/finish", uriVariables);

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
     * DEPRECATED - Use &#x60;PUT /external_tasks/:external_task_id/error&#x60; instead.
     * <p><b>204</b> - Indicates the ExternalTask was successfully finished with a BPMN Error.
     * @param externalTaskId The ID of the ExternalTask for which to finish with a BPMN Error. (required)
     * @param handleBpmnErrorRequestPayload  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public void externalTasksExternalTaskIdHandleBpmnErrorPut(String externalTaskId, HandleBpmnErrorRequestPayload handleBpmnErrorRequestPayload) throws RestClientException {
        externalTasksExternalTaskIdHandleBpmnErrorPutWithHttpInfo(externalTaskId, handleBpmnErrorRequestPayload);
    }

    /**
     * 
     * DEPRECATED - Use &#x60;PUT /external_tasks/:external_task_id/error&#x60; instead.
     * <p><b>204</b> - Indicates the ExternalTask was successfully finished with a BPMN Error.
     * @param externalTaskId The ID of the ExternalTask for which to finish with a BPMN Error. (required)
     * @param handleBpmnErrorRequestPayload  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<Void> externalTasksExternalTaskIdHandleBpmnErrorPutWithHttpInfo(String externalTaskId, HandleBpmnErrorRequestPayload handleBpmnErrorRequestPayload) throws RestClientException {
        Object postBody = handleBpmnErrorRequestPayload;
        
        // verify the required parameter 'externalTaskId' is set
        if (externalTaskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalTaskId' when calling externalTasksExternalTaskIdHandleBpmnErrorPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("externalTaskId", externalTaskId);
        String path = apiClient.expandPath("/external_tasks/{externalTaskId}/handle_bpmn_error", uriVariables);

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
     * DEPRECATED - Use &#x60;PUT /external_tasks/:external_task_id/error&#x60; instead.
     * <p><b>204</b> - Indicates the ExternalTask was successfully finished with a Service Error.
     * @param externalTaskId The ID of the ExternalTask for which to finish with a Service Error. (required)
     * @param handleServiceErrorRequestPayload  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public void externalTasksExternalTaskIdHandleServiceErrorPut(String externalTaskId, HandleServiceErrorRequestPayload handleServiceErrorRequestPayload) throws RestClientException {
        externalTasksExternalTaskIdHandleServiceErrorPutWithHttpInfo(externalTaskId, handleServiceErrorRequestPayload);
    }

    /**
     * 
     * DEPRECATED - Use &#x60;PUT /external_tasks/:external_task_id/error&#x60; instead.
     * <p><b>204</b> - Indicates the ExternalTask was successfully finished with a Service Error.
     * @param externalTaskId The ID of the ExternalTask for which to finish with a Service Error. (required)
     * @param handleServiceErrorRequestPayload  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<Void> externalTasksExternalTaskIdHandleServiceErrorPutWithHttpInfo(String externalTaskId, HandleServiceErrorRequestPayload handleServiceErrorRequestPayload) throws RestClientException {
        Object postBody = handleServiceErrorRequestPayload;
        
        // verify the required parameter 'externalTaskId' is set
        if (externalTaskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalTaskId' when calling externalTasksExternalTaskIdHandleServiceErrorPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("externalTaskId", externalTaskId);
        String path = apiClient.expandPath("/external_tasks/{externalTaskId}/handle_service_error", uriVariables);

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
     * Fetches the tasks available for an ExternalTaskWorker and locks them for a defined time.
     * <p><b>204</b> - A list of locked ExternalTasks.
     * @param fetchAndLockRequestPayload  (optional)
     * @return List&lt;ExternalTask&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ExternalTask> externalTasksFetchAndLockPost(FetchAndLockRequestPayload fetchAndLockRequestPayload) throws RestClientException {
        return externalTasksFetchAndLockPostWithHttpInfo(fetchAndLockRequestPayload).getBody();
    }

    /**
     * 
     * Fetches the tasks available for an ExternalTaskWorker and locks them for a defined time.
     * <p><b>204</b> - A list of locked ExternalTasks.
     * @param fetchAndLockRequestPayload  (optional)
     * @return ResponseEntity&lt;List&lt;ExternalTask&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ExternalTask>> externalTasksFetchAndLockPostWithHttpInfo(FetchAndLockRequestPayload fetchAndLockRequestPayload) throws RestClientException {
        Object postBody = fetchAndLockRequestPayload;
        
        String path = apiClient.expandPath("/external_tasks/fetch_and_lock", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<ExternalTask>> returnType = new ParameterizedTypeReference<List<ExternalTask>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
