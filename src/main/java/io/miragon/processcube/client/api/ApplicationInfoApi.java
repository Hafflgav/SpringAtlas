package io.miragon.processcube.client.api;

import io.miragon.processcube.client.invoker.ApiClient;

import io.miragon.processcube.client.model.ApplicationInfo;

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
@Component("io.miragon.processcube.client.api.ApplicationInfoApi")
public class ApplicationInfoApi {
    private ApiClient apiClient;

    public ApplicationInfoApi() {
        this(new ApiClient());
    }

    @Autowired
    public ApplicationInfoApi(ApiClient apiClient) {
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
     * Gets the address of the authority that the host application uses for claim checks.
     * <p><b>200</b> - Returns the address of the authority.
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String authorityGet() throws RestClientException {
        return authorityGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Gets the address of the authority that the host application uses for claim checks.
     * <p><b>200</b> - Returns the address of the authority.
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> authorityGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/authority", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets some basic info about the host application.
     * <p><b>200</b> - Returns some basic info about the host application.
     * @return ApplicationInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApplicationInfo infoGet() throws RestClientException {
        return infoGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Gets some basic info about the host application.
     * <p><b>200</b> - Returns some basic info about the host application.
     * @return ResponseEntity&lt;ApplicationInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApplicationInfo> infoGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/info", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ApplicationInfo> returnType = new ParameterizedTypeReference<ApplicationInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
