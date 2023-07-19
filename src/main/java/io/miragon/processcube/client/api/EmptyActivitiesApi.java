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
@Component("io.miragon.processcube.client.api.EmptyActivitiesApi")
public class EmptyActivitiesApi {
    private ApiClient apiClient;

    public EmptyActivitiesApi() {
        this(new ApiClient());
    }

    @Autowired
    public EmptyActivitiesApi(ApiClient apiClient) {
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
     * Finishes a specific EmptyActivity by its EmptyActivityInstanceId.
     * <p><b>204</b> - Indicates the EmptyActivityInstance was successfully finished.
     * @param emptyActivityInstanceId The ID of the EmptyActivityInstance to be finished. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void emptyActivitiesEmptyActivityInstanceIdFinishPut(String emptyActivityInstanceId) throws RestClientException {
        emptyActivitiesEmptyActivityInstanceIdFinishPutWithHttpInfo(emptyActivityInstanceId);
    }

    /**
     * 
     * Finishes a specific EmptyActivity by its EmptyActivityInstanceId.
     * <p><b>204</b> - Indicates the EmptyActivityInstance was successfully finished.
     * @param emptyActivityInstanceId The ID of the EmptyActivityInstance to be finished. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> emptyActivitiesEmptyActivityInstanceIdFinishPutWithHttpInfo(String emptyActivityInstanceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'emptyActivityInstanceId' is set
        if (emptyActivityInstanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emptyActivityInstanceId' when calling emptyActivitiesEmptyActivityInstanceIdFinishPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("emptyActivityInstanceId", emptyActivityInstanceId);
        String path = apiClient.expandPath("/empty_activities/{emptyActivityInstanceId}/finish", uriVariables);

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
