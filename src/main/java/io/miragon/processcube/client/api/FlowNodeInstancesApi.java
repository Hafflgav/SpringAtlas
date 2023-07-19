package io.miragon.processcube.client.api;

import io.miragon.processcube.client.invoker.ApiClient;

import java.math.BigDecimal;
import io.miragon.processcube.client.model.FlowNodeInstanceList;

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
@Component("io.miragon.processcube.client.api.FlowNodeInstancesApi")
public class FlowNodeInstancesApi {
    private ApiClient apiClient;

    public FlowNodeInstancesApi() {
        this(new ApiClient());
    }

    @Autowired
    public FlowNodeInstancesApi(ApiClient apiClient) {
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
     * Gets all FlowNodeInstances that match the given query.
     * <p><b>200</b> - Returns a list of FlowNodeInstances.
     * @param limit The maximum amount of FlowNodeInstances to be returned. (optional)
     * @param offset The index of the first FlowNodeInstance to be returned. (optional)
     * @param flowNodeInstanceId The ID of the FlowNodeInstance to be returned. (optional)
     * @param flowNodeId The ID of the FlowNode for which to retrieve FlowNodeInstances. (optional)
     * @param flowNodeName The name of the FlowNode for which to retrieve FlowNodeInstances. (optional)
     * @param flowNodeLane The name of the Lane for which to retrieve FlowNodeInstances. (optional)
     * @param flowNodeType The type of the FlowNode for which to retrieve FlowNodeInstances. (optional)
     * @param eventType The event type of the FlowNodeInstance to be returned. (optional)
     * @param correlationId The correlationId of the FlowNodeInstance to be returned. (optional)
     * @param processDefinitionId The ID of the ProcessDefinition for which to retrieve FlowNodeInstances. (optional)
     * @param processModelId The ID of the ProcessModel for which to retrieve FlowNodeInstances. (optional)
     * @param processInstanceId The ID of the ProcessInstance for which to retrieve FlowNodeInstances. (optional)
     * @param ownerId The ID of the FlowNodeInstance owner for which to retrieve FlowNodeInstances. (optional)
     * @param state The state of the FlowNodeInstance to be returned. (optional)
     * @param previousFlowNodeInstanceId The ID of the previous FlowNodeInstance for which to retrieve FlowNodeInstances. (optional)
     * @param parentProcessInstanceId The ID of the parent ProcessInstance for which to retrieve FlowNodeInstances. (optional)
     * @param createdAt The createdAt date for which to retrieve FlowNodeInstances. (optional)
     * @param updatedAt The updatedAt date for which to retrieve FlowNodeInstances. (optional)
     * @param triggeredByFlowNodeInstance The ID of the FlowNodeInstance that triggered the FlowNodeInstance to be returned. (optional, default to null)
     * @return FlowNodeInstanceList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FlowNodeInstanceList flowNodeInstancesGet(BigDecimal limit, BigDecimal offset, String flowNodeInstanceId, String flowNodeId, String flowNodeName, String flowNodeLane, String flowNodeType, String eventType, String correlationId, String processDefinitionId, String processModelId, String processInstanceId, String ownerId, String state, String previousFlowNodeInstanceId, String parentProcessInstanceId, String createdAt, String updatedAt, String triggeredByFlowNodeInstance) throws RestClientException {
        return flowNodeInstancesGetWithHttpInfo(limit, offset, flowNodeInstanceId, flowNodeId, flowNodeName, flowNodeLane, flowNodeType, eventType, correlationId, processDefinitionId, processModelId, processInstanceId, ownerId, state, previousFlowNodeInstanceId, parentProcessInstanceId, createdAt, updatedAt, triggeredByFlowNodeInstance).getBody();
    }

    /**
     * 
     * Gets all FlowNodeInstances that match the given query.
     * <p><b>200</b> - Returns a list of FlowNodeInstances.
     * @param limit The maximum amount of FlowNodeInstances to be returned. (optional)
     * @param offset The index of the first FlowNodeInstance to be returned. (optional)
     * @param flowNodeInstanceId The ID of the FlowNodeInstance to be returned. (optional)
     * @param flowNodeId The ID of the FlowNode for which to retrieve FlowNodeInstances. (optional)
     * @param flowNodeName The name of the FlowNode for which to retrieve FlowNodeInstances. (optional)
     * @param flowNodeLane The name of the Lane for which to retrieve FlowNodeInstances. (optional)
     * @param flowNodeType The type of the FlowNode for which to retrieve FlowNodeInstances. (optional)
     * @param eventType The event type of the FlowNodeInstance to be returned. (optional)
     * @param correlationId The correlationId of the FlowNodeInstance to be returned. (optional)
     * @param processDefinitionId The ID of the ProcessDefinition for which to retrieve FlowNodeInstances. (optional)
     * @param processModelId The ID of the ProcessModel for which to retrieve FlowNodeInstances. (optional)
     * @param processInstanceId The ID of the ProcessInstance for which to retrieve FlowNodeInstances. (optional)
     * @param ownerId The ID of the FlowNodeInstance owner for which to retrieve FlowNodeInstances. (optional)
     * @param state The state of the FlowNodeInstance to be returned. (optional)
     * @param previousFlowNodeInstanceId The ID of the previous FlowNodeInstance for which to retrieve FlowNodeInstances. (optional)
     * @param parentProcessInstanceId The ID of the parent ProcessInstance for which to retrieve FlowNodeInstances. (optional)
     * @param createdAt The createdAt date for which to retrieve FlowNodeInstances. (optional)
     * @param updatedAt The updatedAt date for which to retrieve FlowNodeInstances. (optional)
     * @param triggeredByFlowNodeInstance The ID of the FlowNodeInstance that triggered the FlowNodeInstance to be returned. (optional, default to null)
     * @return ResponseEntity&lt;FlowNodeInstanceList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FlowNodeInstanceList> flowNodeInstancesGetWithHttpInfo(BigDecimal limit, BigDecimal offset, String flowNodeInstanceId, String flowNodeId, String flowNodeName, String flowNodeLane, String flowNodeType, String eventType, String correlationId, String processDefinitionId, String processModelId, String processInstanceId, String ownerId, String state, String previousFlowNodeInstanceId, String parentProcessInstanceId, String createdAt, String updatedAt, String triggeredByFlowNodeInstance) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/flow_node_instances", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flowNodeInstanceId", flowNodeInstanceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flowNodeId", flowNodeId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flowNodeName", flowNodeName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flowNodeLane", flowNodeLane));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flowNodeType", flowNodeType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "eventType", eventType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "correlationId", correlationId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processDefinitionId", processDefinitionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processModelId", processModelId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processInstanceId", processInstanceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ownerId", ownerId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "state", state));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "previousFlowNodeInstanceId", previousFlowNodeInstanceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentProcessInstanceId", parentProcessInstanceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdAt", createdAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedAt", updatedAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "triggeredByFlowNodeInstance", triggeredByFlowNodeInstance));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<FlowNodeInstanceList> returnType = new ParameterizedTypeReference<FlowNodeInstanceList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
