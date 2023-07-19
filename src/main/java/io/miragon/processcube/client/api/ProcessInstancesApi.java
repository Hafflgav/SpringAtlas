package io.miragon.processcube.client.api;

import io.miragon.processcube.client.invoker.ApiClient;

import java.math.BigDecimal;
import io.miragon.processcube.client.model.InlineObject2;
import io.miragon.processcube.client.model.InlineObject3;
import io.miragon.processcube.client.model.ProcessDefinition;
import io.miragon.processcube.client.model.ProcessInstanceList;
import io.miragon.processcube.client.model.ProcessModel;

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
@Component("io.miragon.processcube.client.api.ProcessInstancesApi")
public class ProcessInstancesApi {
    private ApiClient apiClient;

    public ProcessInstancesApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProcessInstancesApi(ApiClient apiClient) {
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
     * Deletes the given Set of Process Instances. Multiple ProcessInstanceIds can be provided with \&quot;;\&quot; as separator.
     * <p><b>204</b> - Indicates the ProcessInstances were deleted successfully.
     * @param processInstanceIds The IDs of the ProcessInstances to delete. (required)
     * @param deleteAllRelatedData Flag to indicate whether all related data should be deleted as well. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void processInstancesDelete(ArrayList<String> processInstanceIds, Boolean deleteAllRelatedData) throws RestClientException {
        processInstancesDeleteWithHttpInfo(processInstanceIds, deleteAllRelatedData);
    }

    /**
     * 
     * Deletes the given Set of Process Instances. Multiple ProcessInstanceIds can be provided with \&quot;;\&quot; as separator.
     * <p><b>204</b> - Indicates the ProcessInstances were deleted successfully.
     * @param processInstanceIds The IDs of the ProcessInstances to delete. (required)
     * @param deleteAllRelatedData Flag to indicate whether all related data should be deleted as well. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> processInstancesDeleteWithHttpInfo(ArrayList<String> processInstanceIds, Boolean deleteAllRelatedData) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'processInstanceIds' is set
        if (processInstanceIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processInstanceIds' when calling processInstancesDelete");
        }
        
        String path = apiClient.expandPath("/process_instances", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "process_instance_ids", processInstanceIds));
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
     * Changes the owner of the ProcessInstance with the given ID.
     * <p><b>204</b> - Indicates the ProcessInstance owner was changed successfully.
     * @param processInstanceId The ID of the ProcessInstance for which the owner should be changed. (required)
     * @param inlineObject2  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void processInstancesProcessInstanceIdChangeOwnerPost(String processInstanceId, InlineObject2 inlineObject2) throws RestClientException {
        processInstancesProcessInstanceIdChangeOwnerPostWithHttpInfo(processInstanceId, inlineObject2);
    }

    /**
     * 
     * Changes the owner of the ProcessInstance with the given ID.
     * <p><b>204</b> - Indicates the ProcessInstance owner was changed successfully.
     * @param processInstanceId The ID of the ProcessInstance for which the owner should be changed. (required)
     * @param inlineObject2  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> processInstancesProcessInstanceIdChangeOwnerPostWithHttpInfo(String processInstanceId, InlineObject2 inlineObject2) throws RestClientException {
        Object postBody = inlineObject2;
        
        // verify the required parameter 'processInstanceId' is set
        if (processInstanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processInstanceId' when calling processInstancesProcessInstanceIdChangeOwnerPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("processInstanceId", processInstanceId);
        String path = apiClient.expandPath("/process_instances/{processInstanceId}/change_owner", uriVariables);

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
     * Gets the ProcessDefinition for a given ProcessInstance.
     * <p><b>200</b>
     * @param processInstanceId The ID of the ProcessInstance for which the ProcessDefinition should be retrieved. (required)
     * @return ProcessDefinition
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProcessDefinition processInstancesProcessInstanceIdProcessDefinitionGet(String processInstanceId) throws RestClientException {
        return processInstancesProcessInstanceIdProcessDefinitionGetWithHttpInfo(processInstanceId).getBody();
    }

    /**
     * 
     * Gets the ProcessDefinition for a given ProcessInstance.
     * <p><b>200</b>
     * @param processInstanceId The ID of the ProcessInstance for which the ProcessDefinition should be retrieved. (required)
     * @return ResponseEntity&lt;ProcessDefinition&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProcessDefinition> processInstancesProcessInstanceIdProcessDefinitionGetWithHttpInfo(String processInstanceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'processInstanceId' is set
        if (processInstanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processInstanceId' when calling processInstancesProcessInstanceIdProcessDefinitionGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("processInstanceId", processInstanceId);
        String path = apiClient.expandPath("/process_instances/{processInstanceId}/process_definition", uriVariables);

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
    /**
     * 
     * Gets the ProcessModel for a given ProcessInstance.
     * <p><b>200</b>
     * @param processInstanceId The ID of the ProcessInstance for which the ProcessModel should be retrieved. (required)
     * @return ProcessModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProcessModel processInstancesProcessInstanceIdProcessModelGet(String processInstanceId) throws RestClientException {
        return processInstancesProcessInstanceIdProcessModelGetWithHttpInfo(processInstanceId).getBody();
    }

    /**
     * 
     * Gets the ProcessModel for a given ProcessInstance.
     * <p><b>200</b>
     * @param processInstanceId The ID of the ProcessInstance for which the ProcessModel should be retrieved. (required)
     * @return ResponseEntity&lt;ProcessModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProcessModel> processInstancesProcessInstanceIdProcessModelGetWithHttpInfo(String processInstanceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'processInstanceId' is set
        if (processInstanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processInstanceId' when calling processInstancesProcessInstanceIdProcessModelGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("processInstanceId", processInstanceId);
        String path = apiClient.expandPath("/process_instances/{processInstanceId}/process_model", uriVariables);

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

        ParameterizedTypeReference<ProcessModel> returnType = new ParameterizedTypeReference<ProcessModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retries a failed or terminated Process Instance from the original point of failure.
     * <p><b>204</b> - Indicates the ProcessInstance was retried successfully.
     * @param processInstanceId The ID of the ProcessInstance to retry. (required)
     * @param flowNodeInstanceId The ID of the FlowNodeInstance to retry from. (optional)
     * @param inlineObject3  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void processInstancesProcessInstanceIdRetryPut(String processInstanceId, String flowNodeInstanceId, InlineObject3 inlineObject3) throws RestClientException {
        processInstancesProcessInstanceIdRetryPutWithHttpInfo(processInstanceId, flowNodeInstanceId, inlineObject3);
    }

    /**
     * 
     * Retries a failed or terminated Process Instance from the original point of failure.
     * <p><b>204</b> - Indicates the ProcessInstance was retried successfully.
     * @param processInstanceId The ID of the ProcessInstance to retry. (required)
     * @param flowNodeInstanceId The ID of the FlowNodeInstance to retry from. (optional)
     * @param inlineObject3  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> processInstancesProcessInstanceIdRetryPutWithHttpInfo(String processInstanceId, String flowNodeInstanceId, InlineObject3 inlineObject3) throws RestClientException {
        Object postBody = inlineObject3;
        
        // verify the required parameter 'processInstanceId' is set
        if (processInstanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processInstanceId' when calling processInstancesProcessInstanceIdRetryPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("processInstanceId", processInstanceId);
        String path = apiClient.expandPath("/process_instances/{processInstanceId}/retry", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flow_node_instance_id", flowNodeInstanceId));

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
     * Terminates the ProcessInstance with the given ID.
     * <p><b>204</b> - Indicates the ProcessInstance was terminated successfully.
     * @param processInstanceId The ID of the ProcessInstance to terminate. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void processInstancesProcessInstanceIdTerminatePut(String processInstanceId) throws RestClientException {
        processInstancesProcessInstanceIdTerminatePutWithHttpInfo(processInstanceId);
    }

    /**
     * 
     * Terminates the ProcessInstance with the given ID.
     * <p><b>204</b> - Indicates the ProcessInstance was terminated successfully.
     * @param processInstanceId The ID of the ProcessInstance to terminate. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> processInstancesProcessInstanceIdTerminatePutWithHttpInfo(String processInstanceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'processInstanceId' is set
        if (processInstanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processInstanceId' when calling processInstancesProcessInstanceIdTerminatePut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("processInstanceId", processInstanceId);
        String path = apiClient.expandPath("/process_instances/{processInstanceId}/terminate", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets all ProcessInstances that match the given query.
     * <p><b>200</b>
     * @param offset The index of the first ProcessInstance to include in the result set. (optional)
     * @param limit The maximum number of ProcessInstances to return. (optional)
     * @param correlationId Filter by the CorrelationId of the ProcessInstances. (optional, default to null)
     * @param processInstanceId Filter by the ID of the ProcessInstances. (optional, default to null)
     * @param processDefinitionId Filter by the ID of the ProcessDefinition that the ProcessInstances belong to. (optional, default to null)
     * @param processModelId Filter by the ID of the ProcessModel that the ProcessInstances belong to. (optional, default to null)
     * @param processModelName Filter by the name of the ProcessModel that the ProcessInstances belong to. (optional, default to null)
     * @param processModelHash Filter by the hash of the ProcessModel that the ProcessInstances belong to. (optional, default to null)
     * @param ownerId Filter by the ID of the User that owns the ProcessInstances. (optional, default to null)
     * @param state Filter by the state of the ProcessInstances. (optional, default to null)
     * @param parentProcessInstanceId Filter by the ID of the parent ProcessInstance. (optional, default to null)
     * @param terminatedByUserId Filter by the ID of the User that terminated the ProcessInstances. (optional, default to null)
     * @param createdBefore The maximum created date of the ProcessInstances to include in the results. (optional)
     * @param createdAt The minimum created date of the ProcessInstances to include in the results. (optional, default to null)
     * @param createdAfter The minimum created date of the ProcessInstances to include in the results. (optional)
     * @param updatedBefore The maximum updated date of the ProcessInstances to include in the results. (optional)
     * @param updatedAt The exact updated date of the ProcessInstances to include in the results. (optional, default to null)
     * @param updatedAfter The minimum updated date of the ProcessInstances to include in the results. (optional)
     * @param finishedBefore The maximum finished date of the ProcessInstances to include in the results. (optional)
     * @param finishedAt The exact finished date of the ProcessInstances to include in the results. (optional, default to null)
     * @param finishedAfter The minimum finished date of the ProcessInstances to include in the results. (optional)
     * @param triggeredByFlowNodeInstance Filter by the ID of the FlowNodeInstance that triggered the ProcessInstance. (optional, default to null)
     * @return ProcessInstanceList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProcessInstanceList processInstancesQueryGet(BigDecimal offset, BigDecimal limit, String correlationId, String processInstanceId, String processDefinitionId, String processModelId, String processModelName, String processModelHash, String ownerId, String state, String parentProcessInstanceId, String terminatedByUserId, String createdBefore, String createdAt, String createdAfter, String updatedBefore, String updatedAt, String updatedAfter, String finishedBefore, String finishedAt, String finishedAfter, String triggeredByFlowNodeInstance) throws RestClientException {
        return processInstancesQueryGetWithHttpInfo(offset, limit, correlationId, processInstanceId, processDefinitionId, processModelId, processModelName, processModelHash, ownerId, state, parentProcessInstanceId, terminatedByUserId, createdBefore, createdAt, createdAfter, updatedBefore, updatedAt, updatedAfter, finishedBefore, finishedAt, finishedAfter, triggeredByFlowNodeInstance).getBody();
    }

    /**
     * 
     * Gets all ProcessInstances that match the given query.
     * <p><b>200</b>
     * @param offset The index of the first ProcessInstance to include in the result set. (optional)
     * @param limit The maximum number of ProcessInstances to return. (optional)
     * @param correlationId Filter by the CorrelationId of the ProcessInstances. (optional, default to null)
     * @param processInstanceId Filter by the ID of the ProcessInstances. (optional, default to null)
     * @param processDefinitionId Filter by the ID of the ProcessDefinition that the ProcessInstances belong to. (optional, default to null)
     * @param processModelId Filter by the ID of the ProcessModel that the ProcessInstances belong to. (optional, default to null)
     * @param processModelName Filter by the name of the ProcessModel that the ProcessInstances belong to. (optional, default to null)
     * @param processModelHash Filter by the hash of the ProcessModel that the ProcessInstances belong to. (optional, default to null)
     * @param ownerId Filter by the ID of the User that owns the ProcessInstances. (optional, default to null)
     * @param state Filter by the state of the ProcessInstances. (optional, default to null)
     * @param parentProcessInstanceId Filter by the ID of the parent ProcessInstance. (optional, default to null)
     * @param terminatedByUserId Filter by the ID of the User that terminated the ProcessInstances. (optional, default to null)
     * @param createdBefore The maximum created date of the ProcessInstances to include in the results. (optional)
     * @param createdAt The minimum created date of the ProcessInstances to include in the results. (optional, default to null)
     * @param createdAfter The minimum created date of the ProcessInstances to include in the results. (optional)
     * @param updatedBefore The maximum updated date of the ProcessInstances to include in the results. (optional)
     * @param updatedAt The exact updated date of the ProcessInstances to include in the results. (optional, default to null)
     * @param updatedAfter The minimum updated date of the ProcessInstances to include in the results. (optional)
     * @param finishedBefore The maximum finished date of the ProcessInstances to include in the results. (optional)
     * @param finishedAt The exact finished date of the ProcessInstances to include in the results. (optional, default to null)
     * @param finishedAfter The minimum finished date of the ProcessInstances to include in the results. (optional)
     * @param triggeredByFlowNodeInstance Filter by the ID of the FlowNodeInstance that triggered the ProcessInstance. (optional, default to null)
     * @return ResponseEntity&lt;ProcessInstanceList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProcessInstanceList> processInstancesQueryGetWithHttpInfo(BigDecimal offset, BigDecimal limit, String correlationId, String processInstanceId, String processDefinitionId, String processModelId, String processModelName, String processModelHash, String ownerId, String state, String parentProcessInstanceId, String terminatedByUserId, String createdBefore, String createdAt, String createdAfter, String updatedBefore, String updatedAt, String updatedAfter, String finishedBefore, String finishedAt, String finishedAfter, String triggeredByFlowNodeInstance) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/process_instances/query", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "correlationId", correlationId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processInstanceId", processInstanceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processDefinitionId", processDefinitionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processModelId", processModelId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processModelName", processModelName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processModelHash", processModelHash));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ownerId", ownerId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "state", state));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentProcessInstanceId", parentProcessInstanceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "terminatedByUserId", terminatedByUserId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdBefore", createdBefore));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdAt", createdAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdAfter", createdAfter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedBefore", updatedBefore));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedAt", updatedAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedAfter", updatedAfter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "finishedBefore", finishedBefore));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "finishedAt", finishedAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "finishedAfter", finishedAfter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "triggeredByFlowNodeInstance", triggeredByFlowNodeInstance));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ProcessInstanceList> returnType = new ParameterizedTypeReference<ProcessInstanceList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
