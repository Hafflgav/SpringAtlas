package io.miragon.processcube.client.api;

import io.miragon.processcube.client.invoker.ApiClient;


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
@Component("io.miragon.processcube.client.api.ManualTasksApi")
public class ManualTasksApi {
    private ApiClient apiClient;

    public ManualTasksApi() {
        this(new ApiClient());
    }

    @Autowired
    public ManualTasksApi(ApiClient apiClient) {
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
     * Finishes a specific ManualTask by its ManualTaskInstanceId.
     * <p><b>204</b> - Indicates the ManualTaskInstance was successfully finished.
     * @param manualTaskInstanceId The ID of the ManualTaskInstance to be finished. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void manualTasksManualTaskInstanceIdFinishPut(String manualTaskInstanceId) throws RestClientException {
        manualTasksManualTaskInstanceIdFinishPutWithHttpInfo(manualTaskInstanceId);
    }

    /**
     * 
     * Finishes a specific ManualTask by its ManualTaskInstanceId.
     * <p><b>204</b> - Indicates the ManualTaskInstance was successfully finished.
     * @param manualTaskInstanceId The ID of the ManualTaskInstance to be finished. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> manualTasksManualTaskInstanceIdFinishPutWithHttpInfo(String manualTaskInstanceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'manualTaskInstanceId' is set
        if (manualTaskInstanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'manualTaskInstanceId' when calling manualTasksManualTaskInstanceIdFinishPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("manualTaskInstanceId", manualTaskInstanceId);
        String path = apiClient.expandPath("/manual_tasks/{manualTaskInstanceId}/finish", uriVariables);

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
}
