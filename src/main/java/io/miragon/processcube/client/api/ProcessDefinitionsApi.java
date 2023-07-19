package io.miragon.processcube.client.api;

import io.miragon.processcube.client.invoker.ApiClient;

import java.math.BigDecimal;
import io.miragon.processcube.client.model.PersistProcessDefinitionsPayload;
import io.miragon.processcube.client.model.ProcessDefinition;
import io.miragon.processcube.client.model.ProcessDefinitionList;

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
@Component("io.miragon.processcube.client.api.ProcessDefinitionsApi")
public class ProcessDefinitionsApi {
    private ApiClient apiClient;

    public ProcessDefinitionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProcessDefinitionsApi(ApiClient apiClient) {
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
     * Gets all ProcessDefinitions the requesting user is allowed to see.
     * <p><b>200</b> - A list of ProcessDefinitions.
     * @param offset The index of the first ProcessDefinition to include. (optional)
     * @param limit The maximum number of ProcessDefinitions to include. (optional)
     * @return ProcessDefinitionList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProcessDefinitionList processDefinitionsGet(BigDecimal offset, BigDecimal limit) throws RestClientException {
        return processDefinitionsGetWithHttpInfo(offset, limit).getBody();
    }

    /**
     * 
     * Gets all ProcessDefinitions the requesting user is allowed to see.
     * <p><b>200</b> - A list of ProcessDefinitions.
     * @param offset The index of the first ProcessDefinition to include. (optional)
     * @param limit The maximum number of ProcessDefinitions to include. (optional)
     * @return ResponseEntity&lt;ProcessDefinitionList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProcessDefinitionList> processDefinitionsGetWithHttpInfo(BigDecimal offset, BigDecimal limit) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/process_definitions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ProcessDefinitionList> returnType = new ParameterizedTypeReference<ProcessDefinitionList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Creates or updates a ProcessDefinition or a list of ProcessDefinitions.
     * <p><b>201</b> - Indicates the ProcessDefinition(s) was/were successfully persisted.
     * @param persistProcessDefinitionsPayload  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void processDefinitionsPost(PersistProcessDefinitionsPayload persistProcessDefinitionsPayload) throws RestClientException {
        processDefinitionsPostWithHttpInfo(persistProcessDefinitionsPayload);
    }

    /**
     * 
     * Creates or updates a ProcessDefinition or a list of ProcessDefinitions.
     * <p><b>201</b> - Indicates the ProcessDefinition(s) was/were successfully persisted.
     * @param persistProcessDefinitionsPayload  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> processDefinitionsPostWithHttpInfo(PersistProcessDefinitionsPayload persistProcessDefinitionsPayload) throws RestClientException {
        Object postBody = persistProcessDefinitionsPayload;
        
        String path = apiClient.expandPath("/process_definitions", Collections.<String, Object>emptyMap());

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Deletes the ProcessDefinition with the given ID.
     * <p><b>204</b> - Indicates the ProcessDefinition was successfully deleted.
     * @param processDefinitionId The ID of the ProcessDefinition to delete. (required)
     * @param deleteAllRelatedData If set to true, all ProcessInstances and ProcessModels related to the ProcessDefinition will be deleted as well. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void processDefinitionsProcessDefinitionIdDelete(String processDefinitionId, Boolean deleteAllRelatedData) throws RestClientException {
        processDefinitionsProcessDefinitionIdDeleteWithHttpInfo(processDefinitionId, deleteAllRelatedData);
    }

    /**
     * 
     * Deletes the ProcessDefinition with the given ID.
     * <p><b>204</b> - Indicates the ProcessDefinition was successfully deleted.
     * @param processDefinitionId The ID of the ProcessDefinition to delete. (required)
     * @param deleteAllRelatedData If set to true, all ProcessInstances and ProcessModels related to the ProcessDefinition will be deleted as well. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> processDefinitionsProcessDefinitionIdDeleteWithHttpInfo(String processDefinitionId, Boolean deleteAllRelatedData) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'processDefinitionId' is set
        if (processDefinitionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processDefinitionId' when calling processDefinitionsProcessDefinitionIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("processDefinitionId", processDefinitionId);
        String path = apiClient.expandPath("/process_definitions/{processDefinitionId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "delete_all_related_data", deleteAllRelatedData));

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
     * Gets a ProcessDefinition by its id.
     * <p><b>200</b> - A ProcessDefinitions.
     * @param processDefinitionId The ID of the ProcessDefinition to retrieve. (required)
     * @return ProcessDefinition
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProcessDefinition processDefinitionsProcessDefinitionIdGet(String processDefinitionId) throws RestClientException {
        return processDefinitionsProcessDefinitionIdGetWithHttpInfo(processDefinitionId).getBody();
    }

    /**
     * 
     * Gets a ProcessDefinition by its id.
     * <p><b>200</b> - A ProcessDefinitions.
     * @param processDefinitionId The ID of the ProcessDefinition to retrieve. (required)
     * @return ResponseEntity&lt;ProcessDefinition&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProcessDefinition> processDefinitionsProcessDefinitionIdGetWithHttpInfo(String processDefinitionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'processDefinitionId' is set
        if (processDefinitionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processDefinitionId' when calling processDefinitionsProcessDefinitionIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("processDefinitionId", processDefinitionId);
        String path = apiClient.expandPath("/process_definitions/{processDefinitionId}", uriVariables);

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

        ParameterizedTypeReference<ProcessDefinition> returnType = new ParameterizedTypeReference<ProcessDefinition>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
