package io.miragon.processcube.client.api;

import io.miragon.processcube.client.invoker.ApiClient;

import java.math.BigDecimal;
import io.miragon.processcube.client.model.CronjobHistoryList;
import io.miragon.processcube.client.model.CronjobList;

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
@Component("io.miragon.processcube.client.api.CronjobsApi")
public class CronjobsApi {
    private ApiClient apiClient;

    public CronjobsApi() {
        this(new ApiClient());
    }

    @Autowired
    public CronjobsApi(ApiClient apiClient) {
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
     * Gets a list of all active Cronjobs.
     * <p><b>200</b> - Returns a list of all active Cronjobs.
     * @param limit The maximum amount of Cronjobs to be returned. (optional)
     * @param offset The index of the first Cronjob to be returned. (optional)
     * @return CronjobList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public CronjobList cronjobsGet(BigDecimal limit, BigDecimal offset) throws RestClientException {
        return cronjobsGetWithHttpInfo(limit, offset).getBody();
    }

    /**
     * 
     * Gets a list of all active Cronjobs.
     * <p><b>200</b> - Returns a list of all active Cronjobs.
     * @param limit The maximum amount of Cronjobs to be returned. (optional)
     * @param offset The index of the first Cronjob to be returned. (optional)
     * @return ResponseEntity&lt;CronjobList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<CronjobList> cronjobsGetWithHttpInfo(BigDecimal limit, BigDecimal offset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/cronjobs", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CronjobList> returnType = new ParameterizedTypeReference<CronjobList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets a list of all CronjobHistories.
     * <p><b>200</b> - Returns a list of CronjobHistories.
     * @param limit The maximum amount of CronjobHistories to be returned. (optional)
     * @param offset The index of the first CronjobHistory to be returned. (optional)
     * @param processDefinitionId The ID of the ProcessDefinition for which to retrieve CronjobHistories. (optional)
     * @param processModelId The ID of the ProcessModel for which to retrieve CronjobHistories. (optional)
     * @param startEventId The ID of the StartEvent for which to retrieve CronjobHistories. (optional)
     * @param crontab The crontab expression for which to retrieve CronjobHistories. (optional)
     * @param executedAt The executedAt date for which to retrieve CronjobHistories. (optional)
     * @param createdAt The createdAt date for which to retrieve CronjobHistories. (optional)
     * @param updatedAt The updatedAt date for which to retrieve CronjobHistories. (optional)
     * @return CronjobHistoryList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public CronjobHistoryList cronjobsHistoryGet(BigDecimal limit, BigDecimal offset, String processDefinitionId, String processModelId, String startEventId, String crontab, String executedAt, String createdAt, String updatedAt) throws RestClientException {
        return cronjobsHistoryGetWithHttpInfo(limit, offset, processDefinitionId, processModelId, startEventId, crontab, executedAt, createdAt, updatedAt).getBody();
    }

    /**
     * 
     * Gets a list of all CronjobHistories.
     * <p><b>200</b> - Returns a list of CronjobHistories.
     * @param limit The maximum amount of CronjobHistories to be returned. (optional)
     * @param offset The index of the first CronjobHistory to be returned. (optional)
     * @param processDefinitionId The ID of the ProcessDefinition for which to retrieve CronjobHistories. (optional)
     * @param processModelId The ID of the ProcessModel for which to retrieve CronjobHistories. (optional)
     * @param startEventId The ID of the StartEvent for which to retrieve CronjobHistories. (optional)
     * @param crontab The crontab expression for which to retrieve CronjobHistories. (optional)
     * @param executedAt The executedAt date for which to retrieve CronjobHistories. (optional)
     * @param createdAt The createdAt date for which to retrieve CronjobHistories. (optional)
     * @param updatedAt The updatedAt date for which to retrieve CronjobHistories. (optional)
     * @return ResponseEntity&lt;CronjobHistoryList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<CronjobHistoryList> cronjobsHistoryGetWithHttpInfo(BigDecimal limit, BigDecimal offset, String processDefinitionId, String processModelId, String startEventId, String crontab, String executedAt, String createdAt, String updatedAt) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/cronjobs/history", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processDefinitionId", processDefinitionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processModelId", processModelId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startEventId", startEventId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "crontab", crontab));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "executedAt", executedAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdAt", createdAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedAt", updatedAt));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CronjobHistoryList> returnType = new ParameterizedTypeReference<CronjobHistoryList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Disables the given Cronjob for the given ProcessModel.
     * <p><b>204</b> - The Cronjob was successfully disabled.
     * @param processModelId The ID of the ProcessModel for which to disable the Cronjob. (required)
     * @param flowNodeId The ID of the FlowNode for which to disable the Cronjob. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdDisablePost(String processModelId, String flowNodeId) throws RestClientException {
        cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdDisablePostWithHttpInfo(processModelId, flowNodeId);
    }

    /**
     * 
     * Disables the given Cronjob for the given ProcessModel.
     * <p><b>204</b> - The Cronjob was successfully disabled.
     * @param processModelId The ID of the ProcessModel for which to disable the Cronjob. (required)
     * @param flowNodeId The ID of the FlowNode for which to disable the Cronjob. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdDisablePostWithHttpInfo(String processModelId, String flowNodeId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'processModelId' is set
        if (processModelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processModelId' when calling cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdDisablePost");
        }
        
        // verify the required parameter 'flowNodeId' is set
        if (flowNodeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'flowNodeId' when calling cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdDisablePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("processModelId", processModelId);
        uriVariables.put("flowNodeId", flowNodeId);
        String path = apiClient.expandPath("/cronjobs/process_models/{processModelId}/flow_node/{flowNodeId}/disable", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Enables the given Cronjob for the given ProcessModel.
     * <p><b>204</b> - The Cronjob was successfully enabled.
     * @param processModelId The ID of the ProcessModel for which to enable the Cronjob. (required)
     * @param flowNodeId The ID of the FlowNode for which to enable the Cronjob. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdEnablePost(String processModelId, String flowNodeId) throws RestClientException {
        cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdEnablePostWithHttpInfo(processModelId, flowNodeId);
    }

    /**
     * 
     * Enables the given Cronjob for the given ProcessModel.
     * <p><b>204</b> - The Cronjob was successfully enabled.
     * @param processModelId The ID of the ProcessModel for which to enable the Cronjob. (required)
     * @param flowNodeId The ID of the FlowNode for which to enable the Cronjob. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdEnablePostWithHttpInfo(String processModelId, String flowNodeId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'processModelId' is set
        if (processModelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processModelId' when calling cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdEnablePost");
        }
        
        // verify the required parameter 'flowNodeId' is set
        if (flowNodeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'flowNodeId' when calling cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdEnablePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("processModelId", processModelId);
        uriVariables.put("flowNodeId", flowNodeId);
        String path = apiClient.expandPath("/cronjobs/process_models/{processModelId}/flow_node/{flowNodeId}/enable", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Queries a list of deployed Cronjobs.
     * <p><b>200</b> - Returns a list of Cronjobs.
     * @param limit The maximum amount of Cronjobs to be returned. (optional)
     * @param offset The index of the first Cronjob to be returned. (optional)
     * @param processDefinitionId The ID of the ProcessDefinition for which to retrieve Cronjobs. (optional)
     * @param processModelId The ID of the ProcessModel for which to retrieve Cronjobs. (optional)
     * @param startEventId The ID of the StartEvent for which to retrieve Cronjobs. (optional)
     * @param crontab The crontab expression for which to retrieve Cronjobs. (optional)
     * @param enabled The enabled state for which to retrieve Cronjobs. (optional)
     * @param nextExecution The nextExecution date for which to retrieve Cronjobs. (optional)
     * @return CronjobList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CronjobList cronjobsQueryGet(BigDecimal limit, BigDecimal offset, String processDefinitionId, String processModelId, String startEventId, String crontab, Boolean enabled, String nextExecution) throws RestClientException {
        return cronjobsQueryGetWithHttpInfo(limit, offset, processDefinitionId, processModelId, startEventId, crontab, enabled, nextExecution).getBody();
    }

    /**
     * 
     * Queries a list of deployed Cronjobs.
     * <p><b>200</b> - Returns a list of Cronjobs.
     * @param limit The maximum amount of Cronjobs to be returned. (optional)
     * @param offset The index of the first Cronjob to be returned. (optional)
     * @param processDefinitionId The ID of the ProcessDefinition for which to retrieve Cronjobs. (optional)
     * @param processModelId The ID of the ProcessModel for which to retrieve Cronjobs. (optional)
     * @param startEventId The ID of the StartEvent for which to retrieve Cronjobs. (optional)
     * @param crontab The crontab expression for which to retrieve Cronjobs. (optional)
     * @param enabled The enabled state for which to retrieve Cronjobs. (optional)
     * @param nextExecution The nextExecution date for which to retrieve Cronjobs. (optional)
     * @return ResponseEntity&lt;CronjobList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CronjobList> cronjobsQueryGetWithHttpInfo(BigDecimal limit, BigDecimal offset, String processDefinitionId, String processModelId, String startEventId, String crontab, Boolean enabled, String nextExecution) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/cronjobs/query", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processDefinitionId", processDefinitionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processModelId", processModelId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startEventId", startEventId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "crontab", crontab));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enabled", enabled));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nextExecution", nextExecution));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CronjobList> returnType = new ParameterizedTypeReference<CronjobList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
