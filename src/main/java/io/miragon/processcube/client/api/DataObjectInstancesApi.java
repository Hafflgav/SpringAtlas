package io.miragon.processcube.client.api;

import io.miragon.processcube.client.invoker.ApiClient;

import java.math.BigDecimal;
import io.miragon.processcube.client.model.DataObjectInstanceList;

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
@Component("io.miragon.processcube.client.api.DataObjectInstancesApi")
public class DataObjectInstancesApi {
    private ApiClient apiClient;

    public DataObjectInstancesApi() {
        this(new ApiClient());
    }

    @Autowired
    public DataObjectInstancesApi(ApiClient apiClient) {
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
     * Gets the DataObjectInstances that match the given query.
     * <p><b>200</b> - Returns a list of DataObjectInstances.
     * @param limit The maximum amount of DataObjectInstances to be returned. (optional)
     * @param offset The index of the first DataObjectInstance to be returned. (optional)
     * @param dataObjectId The ID of the DataObject for which to retrieve DataObjectInstances. (optional)
     * @param processDefinitionId The ID of the ProcessDefinition for which to retrieve DataObjectInstances. (optional)
     * @param processModelId The ID of the ProcessModel for which to retrieve DataObjectInstances. (optional)
     * @param processInstanceId The ID of the ProcessInstance for which to retrieve DataObjectInstances. (optional)
     * @param flowNodeInstanceId The ID of the FlowNodeInstance for which to retrieve DataObjectInstances. (optional)
     * @param createdAt The createdAt date for which to retrieve DataObjectInstances. (optional)
     * @return DataObjectInstanceList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DataObjectInstanceList dataObjectInstancesQueryGet(BigDecimal limit, BigDecimal offset, String dataObjectId, String processDefinitionId, String processModelId, String processInstanceId, String flowNodeInstanceId, String createdAt) throws RestClientException {
        return dataObjectInstancesQueryGetWithHttpInfo(limit, offset, dataObjectId, processDefinitionId, processModelId, processInstanceId, flowNodeInstanceId, createdAt).getBody();
    }

    /**
     * 
     * Gets the DataObjectInstances that match the given query.
     * <p><b>200</b> - Returns a list of DataObjectInstances.
     * @param limit The maximum amount of DataObjectInstances to be returned. (optional)
     * @param offset The index of the first DataObjectInstance to be returned. (optional)
     * @param dataObjectId The ID of the DataObject for which to retrieve DataObjectInstances. (optional)
     * @param processDefinitionId The ID of the ProcessDefinition for which to retrieve DataObjectInstances. (optional)
     * @param processModelId The ID of the ProcessModel for which to retrieve DataObjectInstances. (optional)
     * @param processInstanceId The ID of the ProcessInstance for which to retrieve DataObjectInstances. (optional)
     * @param flowNodeInstanceId The ID of the FlowNodeInstance for which to retrieve DataObjectInstances. (optional)
     * @param createdAt The createdAt date for which to retrieve DataObjectInstances. (optional)
     * @return ResponseEntity&lt;DataObjectInstanceList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DataObjectInstanceList> dataObjectInstancesQueryGetWithHttpInfo(BigDecimal limit, BigDecimal offset, String dataObjectId, String processDefinitionId, String processModelId, String processInstanceId, String flowNodeInstanceId, String createdAt) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/data_object_instances/query", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dataObjectId", dataObjectId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processDefinitionId", processDefinitionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processModelId", processModelId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processInstanceId", processInstanceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flowNodeInstanceId", flowNodeInstanceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdAt", createdAt));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<DataObjectInstanceList> returnType = new ParameterizedTypeReference<DataObjectInstanceList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
