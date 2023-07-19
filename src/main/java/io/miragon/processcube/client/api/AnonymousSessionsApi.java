package io.miragon.processcube.client.api;

import io.miragon.processcube.client.invoker.ApiClient;

import io.miragon.processcube.client.model.AnonymousSession;

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
@Component("io.miragon.processcube.client.api.AnonymousSessionsApi")
public class AnonymousSessionsApi {
    private ApiClient apiClient;

    public AnonymousSessionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AnonymousSessionsApi(ApiClient apiClient) {
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
     * Creates a new anonymous session and returns its ID.
     * <p><b>200</b> - Returns the ID of the newly created anonymous session.
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String anonymousSessionPost() throws RestClientException {
        return anonymousSessionPostWithHttpInfo().getBody();
    }

    /**
     * 
     * Creates a new anonymous session and returns its ID.
     * <p><b>200</b> - Returns the ID of the newly created anonymous session.
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> anonymousSessionPostWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/anonymous_session", Collections.<String, Object>emptyMap());

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the anonymous session with the given ID.
     * <p><b>200</b> - Returns the anonymous session with the given ID.
     * @param sessionId The ID of the session to retrieve. (required)
     * @return AnonymousSession
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AnonymousSession anonymousSessionSessionSessionIdGet(String sessionId) throws RestClientException {
        return anonymousSessionSessionSessionIdGetWithHttpInfo(sessionId).getBody();
    }

    /**
     * 
     * Returns the anonymous session with the given ID.
     * <p><b>200</b> - Returns the anonymous session with the given ID.
     * @param sessionId The ID of the session to retrieve. (required)
     * @return ResponseEntity&lt;AnonymousSession&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AnonymousSession> anonymousSessionSessionSessionIdGetWithHttpInfo(String sessionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling anonymousSessionSessionSessionIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("session_id", sessionId);
        String path = apiClient.expandPath("/anonymous_session/session/{session_id}", uriVariables);

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

        ParameterizedTypeReference<AnonymousSession> returnType = new ParameterizedTypeReference<AnonymousSession>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns all anonymous sessions of the given User ID.
     * <p><b>200</b> - Returns all anonymous sessions of the given User ID.
     * @param userId The ID of the user whose anonymous sessions should be retrieved. (required)
     * @return List&lt;AnonymousSession&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AnonymousSession> anonymousSessionUserUserIdGet(String userId) throws RestClientException {
        return anonymousSessionUserUserIdGetWithHttpInfo(userId).getBody();
    }

    /**
     * 
     * Returns all anonymous sessions of the given User ID.
     * <p><b>200</b> - Returns all anonymous sessions of the given User ID.
     * @param userId The ID of the user whose anonymous sessions should be retrieved. (required)
     * @return ResponseEntity&lt;List&lt;AnonymousSession&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AnonymousSession>> anonymousSessionUserUserIdGetWithHttpInfo(String userId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling anonymousSessionUserUserIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        String path = apiClient.expandPath("/anonymous_session/user/{user_id}", uriVariables);

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

        ParameterizedTypeReference<List<AnonymousSession>> returnType = new ParameterizedTypeReference<List<AnonymousSession>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
