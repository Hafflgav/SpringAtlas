package io.miragon.processcube.client.api;

import io.miragon.processcube.client.invoker.ApiClient;

import io.miragon.processcube.client.model.InlineObject;

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
@Component("io.miragon.processcube.client.api.EventsApi")
public class EventsApi {
    private ApiClient apiClient;

    public EventsApi() {
        this(new ApiClient());
    }

    @Autowired
    public EventsApi(ApiClient apiClient) {
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
     * Triggers a MessageEvent by its name.
     * <p><b>204</b> - Indicates the MessageEvent was successfully triggered.
     * @param eventName The name of the MessageEvent to be triggered. (required)
     * @param processInstanceId The ID of the ProcessInstance for which to trigger the MessageEvent. (optional)
     * @param inlineObject  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void messagesEventNameTriggerPost(String eventName, String processInstanceId, InlineObject inlineObject) throws RestClientException {
        messagesEventNameTriggerPostWithHttpInfo(eventName, processInstanceId, inlineObject);
    }

    /**
     * 
     * Triggers a MessageEvent by its name.
     * <p><b>204</b> - Indicates the MessageEvent was successfully triggered.
     * @param eventName The name of the MessageEvent to be triggered. (required)
     * @param processInstanceId The ID of the ProcessInstance for which to trigger the MessageEvent. (optional)
     * @param inlineObject  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> messagesEventNameTriggerPostWithHttpInfo(String eventName, String processInstanceId, InlineObject inlineObject) throws RestClientException {
        Object postBody = inlineObject;
        
        // verify the required parameter 'eventName' is set
        if (eventName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventName' when calling messagesEventNameTriggerPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("eventName", eventName);
        String path = apiClient.expandPath("/messages/{eventName}/trigger", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "processInstanceId", processInstanceId));

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
     * Triggers a SignalEvent by its name.
     * <p><b>204</b> - Indicates the SignalEvent was successfully triggered.
     * @param eventName The name of the SignalEvent to be triggered. (required)
     * @param processInstanceId The ID of the ProcessInstance for which to trigger the SignalEvent. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void signalsEventNameTriggerPost(String eventName, String processInstanceId) throws RestClientException {
        signalsEventNameTriggerPostWithHttpInfo(eventName, processInstanceId);
    }

    /**
     * 
     * Triggers a SignalEvent by its name.
     * <p><b>204</b> - Indicates the SignalEvent was successfully triggered.
     * @param eventName The name of the SignalEvent to be triggered. (required)
     * @param processInstanceId The ID of the ProcessInstance for which to trigger the SignalEvent. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> signalsEventNameTriggerPostWithHttpInfo(String eventName, String processInstanceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'eventName' is set
        if (eventName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventName' when calling signalsEventNameTriggerPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("eventName", eventName);
        String path = apiClient.expandPath("/signals/{eventName}/trigger", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "process_instance_id", processInstanceId));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
