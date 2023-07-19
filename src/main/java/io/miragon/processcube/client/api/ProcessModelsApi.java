package io.miragon.processcube.client.api;

import io.miragon.processcube.client.invoker.ApiClient;

import io.miragon.processcube.client.model.ProcessDefinition;
import io.miragon.processcube.client.model.ProcessModel;
import io.miragon.processcube.client.model.ProcessModelList;
import io.miragon.processcube.client.model.ProcessStartRequest;
import io.miragon.processcube.client.model.ProcessStartResponse;

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
@Component("io.miragon.processcube.client.api.ProcessModelsApi")
public class ProcessModelsApi {
    private ApiClient apiClient;

    public ProcessModelsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProcessModelsApi(ApiClient apiClient) {
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
     * Gets all currently deployed Process Models.
     * <p><b>200</b>
     * @return ProcessModelList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProcessModelList processModelsGet() throws RestClientException {
        return processModelsGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Gets all currently deployed Process Models.
     * <p><b>200</b>
     * @return ResponseEntity&lt;ProcessModelList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProcessModelList> processModelsGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/process_models", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ProcessModelList> returnType = new ParameterizedTypeReference<ProcessModelList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Deletes the ProcessDefinition that contains the Process Model with the given ID.
     * <p><b>204</b> - Indicates the ProcessDefinition was successfully deleted.
     * @param processModelId The ID of the ProcessModel for which to delete the ProcessDefinition. (required)
     * @param deleteAllRelatedData If set to true, all ProcessInstances related to the ProcessDefinition will be deleted as well. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void processModelsProcessModelIdDelete(String processModelId, Boolean deleteAllRelatedData) throws RestClientException {
        processModelsProcessModelIdDeleteWithHttpInfo(processModelId, deleteAllRelatedData);
    }

    /**
     * 
     * Deletes the ProcessDefinition that contains the Process Model with the given ID.
     * <p><b>204</b> - Indicates the ProcessDefinition was successfully deleted.
     * @param processModelId The ID of the ProcessModel for which to delete the ProcessDefinition. (required)
     * @param deleteAllRelatedData If set to true, all ProcessInstances related to the ProcessDefinition will be deleted as well. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> processModelsProcessModelIdDeleteWithHttpInfo(String processModelId, Boolean deleteAllRelatedData) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'processModelId' is set
        if (processModelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processModelId' when calling processModelsProcessModelIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("processModelId", processModelId);
        String path = apiClient.expandPath("/process_models/{processModelId}", uriVariables);

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
     * Disables the given Process Model.
     * <p><b>204</b> - Indicates the ProcessModel was successfully disabled
     * @param processModelId The ID of the ProcessModel to disable. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void processModelsProcessModelIdDisablePost(String processModelId) throws RestClientException {
        processModelsProcessModelIdDisablePostWithHttpInfo(processModelId);
    }

    /**
     * 
     * Disables the given Process Model.
     * <p><b>204</b> - Indicates the ProcessModel was successfully disabled
     * @param processModelId The ID of the ProcessModel to disable. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> processModelsProcessModelIdDisablePostWithHttpInfo(String processModelId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'processModelId' is set
        if (processModelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processModelId' when calling processModelsProcessModelIdDisablePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("processModelId", processModelId);
        String path = apiClient.expandPath("/process_models/{processModelId}/disable", uriVariables);

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
     * Enables the given Process Model.
     * <p><b>204</b> - Indicates the ProcessModel was successfully enabled.
     * @param processModelId The ID of the ProcessModel to enable. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void processModelsProcessModelIdEnablePost(String processModelId) throws RestClientException {
        processModelsProcessModelIdEnablePostWithHttpInfo(processModelId);
    }

    /**
     * 
     * Enables the given Process Model.
     * <p><b>204</b> - Indicates the ProcessModel was successfully enabled.
     * @param processModelId The ID of the ProcessModel to enable. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> processModelsProcessModelIdEnablePostWithHttpInfo(String processModelId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'processModelId' is set
        if (processModelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processModelId' when calling processModelsProcessModelIdEnablePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("processModelId", processModelId);
        String path = apiClient.expandPath("/process_models/{processModelId}/enable", uriVariables);

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
     * Gets a deployed Process Model by its ID.
     * <p><b>200</b>
     * @param processModelId The ID of the ProcessModel to retrieve. (required)
     * @return ProcessModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProcessModel processModelsProcessModelIdGet(String processModelId) throws RestClientException {
        return processModelsProcessModelIdGetWithHttpInfo(processModelId).getBody();
    }

    /**
     * 
     * Gets a deployed Process Model by its ID.
     * <p><b>200</b>
     * @param processModelId The ID of the ProcessModel to retrieve. (required)
     * @return ResponseEntity&lt;ProcessModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProcessModel> processModelsProcessModelIdGetWithHttpInfo(String processModelId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'processModelId' is set
        if (processModelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processModelId' when calling processModelsProcessModelIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("processModelId", processModelId);
        String path = apiClient.expandPath("/process_models/{processModelId}/", uriVariables);

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
     * Gets a ProcessDefinition for a given ProcessModel.
     * <p><b>200</b>
     * @param processModelId The ID of the ProcessModel for which to retrieve the ProcessDefinition. (required)
     * @return ProcessDefinition
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProcessDefinition processModelsProcessModelIdProcessDefinitionGet(String processModelId) throws RestClientException {
        return processModelsProcessModelIdProcessDefinitionGetWithHttpInfo(processModelId).getBody();
    }

    /**
     * 
     * Gets a ProcessDefinition for a given ProcessModel.
     * <p><b>200</b>
     * @param processModelId The ID of the ProcessModel for which to retrieve the ProcessDefinition. (required)
     * @return ResponseEntity&lt;ProcessDefinition&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProcessDefinition> processModelsProcessModelIdProcessDefinitionGetWithHttpInfo(String processModelId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'processModelId' is set
        if (processModelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processModelId' when calling processModelsProcessModelIdProcessDefinitionGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("processModelId", processModelId);
        String path = apiClient.expandPath("/process_models/{processModelId}/process_definition", uriVariables);

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
     * Starts a new instance from the given set of parameters.
     * <p><b>200</b>
     * @param processModelId The ID of the ProcessModel for which to start a new instance. (required)
     * @param processStartRequest  (optional)
     * @return ProcessStartResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProcessStartResponse processModelsProcessModelIdStartPost(String processModelId, ProcessStartRequest processStartRequest) throws RestClientException {
        return processModelsProcessModelIdStartPostWithHttpInfo(processModelId, processStartRequest).getBody();
    }

    /**
     * 
     * Starts a new instance from the given set of parameters.
     * <p><b>200</b>
     * @param processModelId The ID of the ProcessModel for which to start a new instance. (required)
     * @param processStartRequest  (optional)
     * @return ResponseEntity&lt;ProcessStartResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProcessStartResponse> processModelsProcessModelIdStartPostWithHttpInfo(String processModelId, ProcessStartRequest processStartRequest) throws RestClientException {
        Object postBody = processStartRequest;
        
        // verify the required parameter 'processModelId' is set
        if (processModelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'processModelId' when calling processModelsProcessModelIdStartPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("processModelId", processModelId);
        String path = apiClient.expandPath("/process_models/{processModelId}/start", uriVariables);

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

        ParameterizedTypeReference<ProcessStartResponse> returnType = new ParameterizedTypeReference<ProcessStartResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
