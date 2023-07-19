package io.miragon.processcube.client.api;

import io.miragon.processcube.client.invoker.ApiClient;

import java.math.BigDecimal;
import io.miragon.processcube.client.model.Correlation;
import io.miragon.processcube.client.model.CorrelationList;

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
@Component("io.miragon.processcube.client.api.CorrelationsApi")
public class CorrelationsApi {
    private ApiClient apiClient;

    public CorrelationsApi() {
        this(new ApiClient());
    }

    @Autowired
    public CorrelationsApi(ApiClient apiClient) {
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
     * Gets a Correlation by its ID.
     * <p><b>200</b> - Returns the Correlation with the given ID.
     * @param correlationId The ID of the Correlation to retrieve. (required)
     * @return Correlation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Correlation correlationsCorrelationIdGet(String correlationId) throws RestClientException {
        return correlationsCorrelationIdGetWithHttpInfo(correlationId).getBody();
    }

    /**
     * 
     * Gets a Correlation by its ID.
     * <p><b>200</b> - Returns the Correlation with the given ID.
     * @param correlationId The ID of the Correlation to retrieve. (required)
     * @return ResponseEntity&lt;Correlation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Correlation> correlationsCorrelationIdGetWithHttpInfo(String correlationId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'correlationId' is set
        if (correlationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'correlationId' when calling correlationsCorrelationIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("correlation_id", correlationId);
        String path = apiClient.expandPath("/correlations/{correlation_id}", uriVariables);

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

        ParameterizedTypeReference<Correlation> returnType = new ParameterizedTypeReference<Correlation>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets all Correlations.
     * <p><b>200</b> - Returns all Correlations.
     * @param limit The maximum amount of Correlations to be returned. (optional)
     * @param offset The index of the first Correlation to be returned. (optional)
     * @return CorrelationList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorrelationList correlationsGet(BigDecimal limit, BigDecimal offset) throws RestClientException {
        return correlationsGetWithHttpInfo(limit, offset).getBody();
    }

    /**
     * 
     * Gets all Correlations.
     * <p><b>200</b> - Returns all Correlations.
     * @param limit The maximum amount of Correlations to be returned. (optional)
     * @param offset The index of the first Correlation to be returned. (optional)
     * @return ResponseEntity&lt;CorrelationList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorrelationList> correlationsGetWithHttpInfo(BigDecimal limit, BigDecimal offset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/correlations", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CorrelationList> returnType = new ParameterizedTypeReference<CorrelationList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
