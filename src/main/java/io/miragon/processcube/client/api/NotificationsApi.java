package io.miragon.processcube.client.api;

import io.miragon.processcube.client.invoker.ApiClient;

import io.miragon.processcube.client.model.CronjobEnabledChangedMessage;
import io.miragon.processcube.client.model.CronjobEventMessage;
import io.miragon.processcube.client.model.EventMessage;
import io.miragon.processcube.client.model.ExternalTaskCreatedMessage;
import io.miragon.processcube.client.model.ExternalTaskExpiredMessage;
import io.miragon.processcube.client.model.ExternalTaskLockedMessage;
import io.miragon.processcube.client.model.ExternalTaskUnlockedMessage;
import io.miragon.processcube.client.model.MetadataChangedMessage;
import io.miragon.processcube.client.model.ProcessDeploymentMessage;
import io.miragon.processcube.client.model.ProcessIsExecutableChangedMessage;

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
@Component("io.miragon.processcube.client.api.NotificationsApi")
public class NotificationsApi {
    private ApiClient apiClient;

    public NotificationsApi() {
        this(new ApiClient());
    }

    @Autowired
    public NotificationsApi(ApiClient apiClient) {
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
     * Wait for an ActivityFinished notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingActivityFinishedGet() throws RestClientException {
        return notificationsLongPollingActivityFinishedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for an ActivityFinished notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingActivityFinishedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/activity_finished", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for an ActivityReached notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingActivityReachedGet() throws RestClientException {
        return notificationsLongPollingActivityReachedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for an ActivityReached notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingActivityReachedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/activity_reached", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a BoundaryEventTriggered notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingBoundaryEventTriggeredGet() throws RestClientException {
        return notificationsLongPollingBoundaryEventTriggeredGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a BoundaryEventTriggered notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingBoundaryEventTriggeredGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/boundary_event_triggered", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a CorrelationMetadataChanged notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return MetadataChangedMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MetadataChangedMessage notificationsLongPollingCorrelationMetadataChangedGet() throws RestClientException {
        return notificationsLongPollingCorrelationMetadataChangedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a CorrelationMetadataChanged notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;MetadataChangedMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MetadataChangedMessage> notificationsLongPollingCorrelationMetadataChangedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/correlation_metadata_changed", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<MetadataChangedMessage> returnType = new ParameterizedTypeReference<MetadataChangedMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a CronjobCreated notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return CronjobEventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CronjobEventMessage notificationsLongPollingCronjobCreatedGet() throws RestClientException {
        return notificationsLongPollingCronjobCreatedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a CronjobCreated notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;CronjobEventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CronjobEventMessage> notificationsLongPollingCronjobCreatedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/cronjob_created", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CronjobEventMessage> returnType = new ParameterizedTypeReference<CronjobEventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a CronjobEnabledChanged notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return CronjobEnabledChangedMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CronjobEnabledChangedMessage notificationsLongPollingCronjobEnabledChangedGet() throws RestClientException {
        return notificationsLongPollingCronjobEnabledChangedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a CronjobEnabledChanged notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;CronjobEnabledChangedMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CronjobEnabledChangedMessage> notificationsLongPollingCronjobEnabledChangedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/cronjob_enabled_changed", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CronjobEnabledChangedMessage> returnType = new ParameterizedTypeReference<CronjobEnabledChangedMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a CronjobExecuted notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return CronjobEventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CronjobEventMessage notificationsLongPollingCronjobExecutedGet() throws RestClientException {
        return notificationsLongPollingCronjobExecutedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a CronjobExecuted notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;CronjobEventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CronjobEventMessage> notificationsLongPollingCronjobExecutedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/cronjob_executed", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CronjobEventMessage> returnType = new ParameterizedTypeReference<CronjobEventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a CronjobRemoved notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return CronjobEventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CronjobEventMessage notificationsLongPollingCronjobRemovedGet() throws RestClientException {
        return notificationsLongPollingCronjobRemovedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a CronjobRemoved notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;CronjobEventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CronjobEventMessage> notificationsLongPollingCronjobRemovedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/cronjob_removed", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CronjobEventMessage> returnType = new ParameterizedTypeReference<CronjobEventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a CronjobStopped notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return CronjobEventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CronjobEventMessage notificationsLongPollingCronjobStoppedGet() throws RestClientException {
        return notificationsLongPollingCronjobStoppedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a CronjobStopped notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;CronjobEventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CronjobEventMessage> notificationsLongPollingCronjobStoppedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/cronjob_stopped", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CronjobEventMessage> returnType = new ParameterizedTypeReference<CronjobEventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a CronjobUpdated notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return CronjobEventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CronjobEventMessage notificationsLongPollingCronjobUpdatedGet() throws RestClientException {
        return notificationsLongPollingCronjobUpdatedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a CronjobUpdated notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;CronjobEventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CronjobEventMessage> notificationsLongPollingCronjobUpdatedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/cronjob_updated", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CronjobEventMessage> returnType = new ParameterizedTypeReference<CronjobEventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for an EmptyActivityFinished notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingEmptyActivityFinishedGet() throws RestClientException {
        return notificationsLongPollingEmptyActivityFinishedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for an EmptyActivityFinished notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingEmptyActivityFinishedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/empty_activity_finished", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for an EmptyActivityWaiting notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingEmptyActivityWaitingGet() throws RestClientException {
        return notificationsLongPollingEmptyActivityWaitingGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for an EmptyActivityWaiting notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingEmptyActivityWaitingGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/empty_activity_waiting", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for an EndEventFinished notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingEndEventFinishedGet() throws RestClientException {
        return notificationsLongPollingEndEventFinishedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for an EndEventFinished notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingEndEventFinishedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/end_event_finished", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for an ExternalTaskCreated notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ExternalTaskCreatedMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalTaskCreatedMessage notificationsLongPollingExternalTaskCreatedGet() throws RestClientException {
        return notificationsLongPollingExternalTaskCreatedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for an ExternalTaskCreated notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;ExternalTaskCreatedMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExternalTaskCreatedMessage> notificationsLongPollingExternalTaskCreatedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/external_task_created", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ExternalTaskCreatedMessage> returnType = new ParameterizedTypeReference<ExternalTaskCreatedMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ExternalTaskExpired notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ExternalTaskExpiredMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalTaskExpiredMessage notificationsLongPollingExternalTaskExpiredGet() throws RestClientException {
        return notificationsLongPollingExternalTaskExpiredGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ExternalTaskExpired notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;ExternalTaskExpiredMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExternalTaskExpiredMessage> notificationsLongPollingExternalTaskExpiredGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/external_task_expired", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ExternalTaskExpiredMessage> returnType = new ParameterizedTypeReference<ExternalTaskExpiredMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ExternalTaskLocked notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ExternalTaskLockedMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalTaskLockedMessage notificationsLongPollingExternalTaskLockedGet() throws RestClientException {
        return notificationsLongPollingExternalTaskLockedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ExternalTaskLocked notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;ExternalTaskLockedMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExternalTaskLockedMessage> notificationsLongPollingExternalTaskLockedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/external_task_locked", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ExternalTaskLockedMessage> returnType = new ParameterizedTypeReference<ExternalTaskLockedMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ExternalTaskUnlocked notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ExternalTaskUnlockedMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalTaskUnlockedMessage notificationsLongPollingExternalTaskUnlockedGet() throws RestClientException {
        return notificationsLongPollingExternalTaskUnlockedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ExternalTaskUnlocked notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;ExternalTaskUnlockedMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExternalTaskUnlockedMessage> notificationsLongPollingExternalTaskUnlockedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/external_task_unlocked", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ExternalTaskUnlockedMessage> returnType = new ParameterizedTypeReference<ExternalTaskUnlockedMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a FlowNodeEventRetrySending notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingFlowNodeEventRetrySendingGet() throws RestClientException {
        return notificationsLongPollingFlowNodeEventRetrySendingGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a FlowNodeEventRetrySending notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingFlowNodeEventRetrySendingGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/flow_node_event_retry_sending", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a IntermediateCatchEventFinished notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingIntermediateCatchEventFinishedGet() throws RestClientException {
        return notificationsLongPollingIntermediateCatchEventFinishedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a IntermediateCatchEventFinished notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingIntermediateCatchEventFinishedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/intermediate_catch_event_finished", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for an IntermediateCatchEventReached notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingIntermediateCatchEventReachedGet() throws RestClientException {
        return notificationsLongPollingIntermediateCatchEventReachedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for an IntermediateCatchEventReached notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingIntermediateCatchEventReachedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/intermediate_catch_event_reached", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for an IntermediateThrowEventTriggered notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingIntermediateThrowEventTriggeredGet() throws RestClientException {
        return notificationsLongPollingIntermediateThrowEventTriggeredGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for an IntermediateThrowEventTriggered notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingIntermediateThrowEventTriggeredGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/intermediate_throw_event_triggered", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ManualTaskFinied notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingManualTaskFinishedGet() throws RestClientException {
        return notificationsLongPollingManualTaskFinishedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ManualTaskFinied notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingManualTaskFinishedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/manual_task_finished", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ManualTaskWaiting notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingManualTaskWaitingGet() throws RestClientException {
        return notificationsLongPollingManualTaskWaitingGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ManualTaskWaiting notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingManualTaskWaitingGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/manual_task_waiting", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for an MessageTriggered notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingMessageTriggeredGet() throws RestClientException {
        return notificationsLongPollingMessageTriggeredGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for an MessageTriggered notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingMessageTriggeredGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/message_triggered", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ProcessDeployed notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ProcessDeploymentMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProcessDeploymentMessage notificationsLongPollingProcessDeployedGet() throws RestClientException {
        return notificationsLongPollingProcessDeployedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ProcessDeployed notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;ProcessDeploymentMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProcessDeploymentMessage> notificationsLongPollingProcessDeployedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/process_deployed", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ProcessDeploymentMessage> returnType = new ParameterizedTypeReference<ProcessDeploymentMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ProcessEnded notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingProcessEndedGet() throws RestClientException {
        return notificationsLongPollingProcessEndedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ProcessEnded notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingProcessEndedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/process_ended", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ProcessError notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingProcessErrorGet() throws RestClientException {
        return notificationsLongPollingProcessErrorGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ProcessError notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingProcessErrorGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/process_error", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ProcessInstanceMetadataChanged notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return MetadataChangedMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MetadataChangedMessage notificationsLongPollingProcessInstanceMetadataChangedGet() throws RestClientException {
        return notificationsLongPollingProcessInstanceMetadataChangedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ProcessInstanceMetadataChanged notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;MetadataChangedMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MetadataChangedMessage> notificationsLongPollingProcessInstanceMetadataChangedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/process_instance_metadata_changed", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<MetadataChangedMessage> returnType = new ParameterizedTypeReference<MetadataChangedMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ProcessInstancesDeleted notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingProcessInstancesDeletedGet() throws RestClientException {
        return notificationsLongPollingProcessInstancesDeletedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ProcessInstancesDeleted notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingProcessInstancesDeletedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/process_instances_deleted", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ProcessIsExecutableChanged notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ProcessIsExecutableChangedMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProcessIsExecutableChangedMessage notificationsLongPollingProcessIsExecutableChangedGet() throws RestClientException {
        return notificationsLongPollingProcessIsExecutableChangedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ProcessIsExecutableChanged notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;ProcessIsExecutableChangedMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProcessIsExecutableChangedMessage> notificationsLongPollingProcessIsExecutableChangedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/process_is_executable_changed", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ProcessIsExecutableChangedMessage> returnType = new ParameterizedTypeReference<ProcessIsExecutableChangedMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ProcessOwnerChanged notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingProcessOwnerChangedGet() throws RestClientException {
        return notificationsLongPollingProcessOwnerChangedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ProcessOwnerChanged notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingProcessOwnerChangedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/process_owner_changed", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ProcessResumed notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingProcessResumedGet() throws RestClientException {
        return notificationsLongPollingProcessResumedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ProcessResumed notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingProcessResumedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/process_resumed", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ProcessStarted notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingProcessStartedGet() throws RestClientException {
        return notificationsLongPollingProcessStartedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ProcessStarted notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingProcessStartedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/process_started", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ProcessStarting notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingProcessStartingGet() throws RestClientException {
        return notificationsLongPollingProcessStartingGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ProcessStarting notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingProcessStartingGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/process_starting", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ProcessTerminated notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingProcessTerminatedGet() throws RestClientException {
        return notificationsLongPollingProcessTerminatedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ProcessTerminated notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingProcessTerminatedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/process_terminated", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a ProcessUndeployed notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ProcessDeploymentMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProcessDeploymentMessage notificationsLongPollingProcessUndeployedGet() throws RestClientException {
        return notificationsLongPollingProcessUndeployedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a ProcessUndeployed notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;ProcessDeploymentMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProcessDeploymentMessage> notificationsLongPollingProcessUndeployedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/process_undeployed", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ProcessDeploymentMessage> returnType = new ParameterizedTypeReference<ProcessDeploymentMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for an SignalTriggered notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingSignalTriggeredGet() throws RestClientException {
        return notificationsLongPollingSignalTriggeredGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for an SignalTriggered notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingSignalTriggeredGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/signal_triggered", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for an StartEventFinished notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingStartEventFinishedGet() throws RestClientException {
        return notificationsLongPollingStartEventFinishedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for an StartEventFinished notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingStartEventFinishedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/start_event_finished", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a UserTaskFinished notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingUserTaskFinishedGet() throws RestClientException {
        return notificationsLongPollingUserTaskFinishedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a UserTaskFinished notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingUserTaskFinishedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/user_task_finished", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a UserTaskReservationCanceled notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingUserTaskReservationCanceledGet() throws RestClientException {
        return notificationsLongPollingUserTaskReservationCanceledGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a UserTaskReservationCanceled notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingUserTaskReservationCanceledGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/user_task_reservation_canceled", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a UserTaskReserved notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingUserTaskReservedGet() throws RestClientException {
        return notificationsLongPollingUserTaskReservedGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a UserTaskReserved notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingUserTaskReservedGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/user_task_reserved", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Wait for a UserTaskWaiting notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return EventMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventMessage notificationsLongPollingUserTaskWaitingGet() throws RestClientException {
        return notificationsLongPollingUserTaskWaitingGetWithHttpInfo().getBody();
    }

    /**
     * 
     * Wait for a UserTaskWaiting notification and resolves with the notification&#39;s content.
     * <p><b>200</b>
     * @return ResponseEntity&lt;EventMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventMessage> notificationsLongPollingUserTaskWaitingGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/notifications/long_polling/user_task_waiting", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<EventMessage> returnType = new ParameterizedTypeReference<EventMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
