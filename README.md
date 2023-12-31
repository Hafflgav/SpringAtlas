# spring-swagger-codegen-api-client

5Minds Engine API

- API version: 1.0

- Build date: 2023-07-19T14:39:29.278702+02:00[Europe/Berlin]

This is the swagger ui documentation of the 5Minds Engine API.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.miragon.processcube</groupId>
  <artifactId>spring-swagger-codegen-api-client</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.miragon.processcube:spring-swagger-codegen-api-client:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/spring-swagger-codegen-api-client-0.0.1-SNAPSHOT.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.miragon.processcube.client.invoker.*;
import io.miragon.processcube.client.invoker.auth.*;
import io.miragon.processcube.client.model.*;
import io.miragon.processcube.client.api.AnonymousSessionsApi;

public class AnonymousSessionsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/atlas_engine/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AnonymousSessionsApi apiInstance = new AnonymousSessionsApi(defaultClient);
        try {
            String result = apiInstance.anonymousSessionPost();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnonymousSessionsApi#anonymousSessionPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/atlas_engine/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnonymousSessionsApi* | [**anonymousSessionPost**](docs/AnonymousSessionsApi.md#anonymousSessionPost) | **POST** /anonymous_session | 
*AnonymousSessionsApi* | [**anonymousSessionSessionSessionIdGet**](docs/AnonymousSessionsApi.md#anonymousSessionSessionSessionIdGet) | **GET** /anonymous_session/session/{session_id} | 
*AnonymousSessionsApi* | [**anonymousSessionUserUserIdGet**](docs/AnonymousSessionsApi.md#anonymousSessionUserUserIdGet) | **GET** /anonymous_session/user/{user_id} | 
*ApplicationInfoApi* | [**authorityGet**](docs/ApplicationInfoApi.md#authorityGet) | **GET** /authority | 
*ApplicationInfoApi* | [**infoGet**](docs/ApplicationInfoApi.md#infoGet) | **GET** /info | 
*CorrelationsApi* | [**correlationsCorrelationIdGet**](docs/CorrelationsApi.md#correlationsCorrelationIdGet) | **GET** /correlations/{correlation_id} | 
*CorrelationsApi* | [**correlationsGet**](docs/CorrelationsApi.md#correlationsGet) | **GET** /correlations | 
*CronjobsApi* | [**cronjobsGet**](docs/CronjobsApi.md#cronjobsGet) | **GET** /cronjobs | 
*CronjobsApi* | [**cronjobsHistoryGet**](docs/CronjobsApi.md#cronjobsHistoryGet) | **GET** /cronjobs/history | 
*CronjobsApi* | [**cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdDisablePost**](docs/CronjobsApi.md#cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdDisablePost) | **POST** /cronjobs/process_models/{processModelId}/flow_node/{flowNodeId}/disable | 
*CronjobsApi* | [**cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdEnablePost**](docs/CronjobsApi.md#cronjobsProcessModelsProcessModelIdFlowNodeFlowNodeIdEnablePost) | **POST** /cronjobs/process_models/{processModelId}/flow_node/{flowNodeId}/enable | 
*CronjobsApi* | [**cronjobsQueryGet**](docs/CronjobsApi.md#cronjobsQueryGet) | **GET** /cronjobs/query | 
*DataObjectInstancesApi* | [**dataObjectInstancesQueryGet**](docs/DataObjectInstancesApi.md#dataObjectInstancesQueryGet) | **GET** /data_object_instances/query | 
*EmptyActivitiesApi* | [**emptyActivitiesEmptyActivityInstanceIdFinishPut**](docs/EmptyActivitiesApi.md#emptyActivitiesEmptyActivityInstanceIdFinishPut) | **PUT** /empty_activities/{emptyActivityInstanceId}/finish | 
*EventsApi* | [**messagesEventNameTriggerPost**](docs/EventsApi.md#messagesEventNameTriggerPost) | **POST** /messages/{eventName}/trigger | 
*EventsApi* | [**signalsEventNameTriggerPost**](docs/EventsApi.md#signalsEventNameTriggerPost) | **POST** /signals/{eventName}/trigger | 
*ExternalTasksApi* | [**externalTasksDeployedTopicsGet**](docs/ExternalTasksApi.md#externalTasksDeployedTopicsGet) | **GET** /external_tasks/deployed_topics | 
*ExternalTasksApi* | [**externalTasksExternalTaskIdErrorPut**](docs/ExternalTasksApi.md#externalTasksExternalTaskIdErrorPut) | **PUT** /external_tasks/{externalTaskId}/error | 
*ExternalTasksApi* | [**externalTasksExternalTaskIdExtendLockPut**](docs/ExternalTasksApi.md#externalTasksExternalTaskIdExtendLockPut) | **PUT** /external_tasks/{externalTaskId}/extend_lock | 
*ExternalTasksApi* | [**externalTasksExternalTaskIdFinishPut**](docs/ExternalTasksApi.md#externalTasksExternalTaskIdFinishPut) | **PUT** /external_tasks/{externalTaskId}/finish | 
*ExternalTasksApi* | [**externalTasksExternalTaskIdHandleBpmnErrorPut**](docs/ExternalTasksApi.md#externalTasksExternalTaskIdHandleBpmnErrorPut) | **PUT** /external_tasks/{externalTaskId}/handle_bpmn_error | 
*ExternalTasksApi* | [**externalTasksExternalTaskIdHandleServiceErrorPut**](docs/ExternalTasksApi.md#externalTasksExternalTaskIdHandleServiceErrorPut) | **PUT** /external_tasks/{externalTaskId}/handle_service_error | 
*ExternalTasksApi* | [**externalTasksFetchAndLockPost**](docs/ExternalTasksApi.md#externalTasksFetchAndLockPost) | **POST** /external_tasks/fetch_and_lock | 
*FlowNodeInstancesApi* | [**flowNodeInstancesGet**](docs/FlowNodeInstancesApi.md#flowNodeInstancesGet) | **GET** /flow_node_instances | 
*ManualTasksApi* | [**manualTasksManualTaskInstanceIdFinishPut**](docs/ManualTasksApi.md#manualTasksManualTaskInstanceIdFinishPut) | **PUT** /manual_tasks/{manualTaskInstanceId}/finish | 
*NotificationsApi* | [**notificationsLongPollingActivityFinishedGet**](docs/NotificationsApi.md#notificationsLongPollingActivityFinishedGet) | **GET** /notifications/long_polling/activity_finished | 
*NotificationsApi* | [**notificationsLongPollingActivityReachedGet**](docs/NotificationsApi.md#notificationsLongPollingActivityReachedGet) | **GET** /notifications/long_polling/activity_reached | 
*NotificationsApi* | [**notificationsLongPollingBoundaryEventTriggeredGet**](docs/NotificationsApi.md#notificationsLongPollingBoundaryEventTriggeredGet) | **GET** /notifications/long_polling/boundary_event_triggered | 
*NotificationsApi* | [**notificationsLongPollingCorrelationMetadataChangedGet**](docs/NotificationsApi.md#notificationsLongPollingCorrelationMetadataChangedGet) | **GET** /notifications/long_polling/correlation_metadata_changed | 
*NotificationsApi* | [**notificationsLongPollingCronjobCreatedGet**](docs/NotificationsApi.md#notificationsLongPollingCronjobCreatedGet) | **GET** /notifications/long_polling/cronjob_created | 
*NotificationsApi* | [**notificationsLongPollingCronjobEnabledChangedGet**](docs/NotificationsApi.md#notificationsLongPollingCronjobEnabledChangedGet) | **GET** /notifications/long_polling/cronjob_enabled_changed | 
*NotificationsApi* | [**notificationsLongPollingCronjobExecutedGet**](docs/NotificationsApi.md#notificationsLongPollingCronjobExecutedGet) | **GET** /notifications/long_polling/cronjob_executed | 
*NotificationsApi* | [**notificationsLongPollingCronjobRemovedGet**](docs/NotificationsApi.md#notificationsLongPollingCronjobRemovedGet) | **GET** /notifications/long_polling/cronjob_removed | 
*NotificationsApi* | [**notificationsLongPollingCronjobStoppedGet**](docs/NotificationsApi.md#notificationsLongPollingCronjobStoppedGet) | **GET** /notifications/long_polling/cronjob_stopped | 
*NotificationsApi* | [**notificationsLongPollingCronjobUpdatedGet**](docs/NotificationsApi.md#notificationsLongPollingCronjobUpdatedGet) | **GET** /notifications/long_polling/cronjob_updated | 
*NotificationsApi* | [**notificationsLongPollingEmptyActivityFinishedGet**](docs/NotificationsApi.md#notificationsLongPollingEmptyActivityFinishedGet) | **GET** /notifications/long_polling/empty_activity_finished | 
*NotificationsApi* | [**notificationsLongPollingEmptyActivityWaitingGet**](docs/NotificationsApi.md#notificationsLongPollingEmptyActivityWaitingGet) | **GET** /notifications/long_polling/empty_activity_waiting | 
*NotificationsApi* | [**notificationsLongPollingEndEventFinishedGet**](docs/NotificationsApi.md#notificationsLongPollingEndEventFinishedGet) | **GET** /notifications/long_polling/end_event_finished | 
*NotificationsApi* | [**notificationsLongPollingExternalTaskCreatedGet**](docs/NotificationsApi.md#notificationsLongPollingExternalTaskCreatedGet) | **GET** /notifications/long_polling/external_task_created | 
*NotificationsApi* | [**notificationsLongPollingExternalTaskExpiredGet**](docs/NotificationsApi.md#notificationsLongPollingExternalTaskExpiredGet) | **GET** /notifications/long_polling/external_task_expired | 
*NotificationsApi* | [**notificationsLongPollingExternalTaskLockedGet**](docs/NotificationsApi.md#notificationsLongPollingExternalTaskLockedGet) | **GET** /notifications/long_polling/external_task_locked | 
*NotificationsApi* | [**notificationsLongPollingExternalTaskUnlockedGet**](docs/NotificationsApi.md#notificationsLongPollingExternalTaskUnlockedGet) | **GET** /notifications/long_polling/external_task_unlocked | 
*NotificationsApi* | [**notificationsLongPollingFlowNodeEventRetrySendingGet**](docs/NotificationsApi.md#notificationsLongPollingFlowNodeEventRetrySendingGet) | **GET** /notifications/long_polling/flow_node_event_retry_sending | 
*NotificationsApi* | [**notificationsLongPollingIntermediateCatchEventFinishedGet**](docs/NotificationsApi.md#notificationsLongPollingIntermediateCatchEventFinishedGet) | **GET** /notifications/long_polling/intermediate_catch_event_finished | 
*NotificationsApi* | [**notificationsLongPollingIntermediateCatchEventReachedGet**](docs/NotificationsApi.md#notificationsLongPollingIntermediateCatchEventReachedGet) | **GET** /notifications/long_polling/intermediate_catch_event_reached | 
*NotificationsApi* | [**notificationsLongPollingIntermediateThrowEventTriggeredGet**](docs/NotificationsApi.md#notificationsLongPollingIntermediateThrowEventTriggeredGet) | **GET** /notifications/long_polling/intermediate_throw_event_triggered | 
*NotificationsApi* | [**notificationsLongPollingManualTaskFinishedGet**](docs/NotificationsApi.md#notificationsLongPollingManualTaskFinishedGet) | **GET** /notifications/long_polling/manual_task_finished | 
*NotificationsApi* | [**notificationsLongPollingManualTaskWaitingGet**](docs/NotificationsApi.md#notificationsLongPollingManualTaskWaitingGet) | **GET** /notifications/long_polling/manual_task_waiting | 
*NotificationsApi* | [**notificationsLongPollingMessageTriggeredGet**](docs/NotificationsApi.md#notificationsLongPollingMessageTriggeredGet) | **GET** /notifications/long_polling/message_triggered | 
*NotificationsApi* | [**notificationsLongPollingProcessDeployedGet**](docs/NotificationsApi.md#notificationsLongPollingProcessDeployedGet) | **GET** /notifications/long_polling/process_deployed | 
*NotificationsApi* | [**notificationsLongPollingProcessEndedGet**](docs/NotificationsApi.md#notificationsLongPollingProcessEndedGet) | **GET** /notifications/long_polling/process_ended | 
*NotificationsApi* | [**notificationsLongPollingProcessErrorGet**](docs/NotificationsApi.md#notificationsLongPollingProcessErrorGet) | **GET** /notifications/long_polling/process_error | 
*NotificationsApi* | [**notificationsLongPollingProcessInstanceMetadataChangedGet**](docs/NotificationsApi.md#notificationsLongPollingProcessInstanceMetadataChangedGet) | **GET** /notifications/long_polling/process_instance_metadata_changed | 
*NotificationsApi* | [**notificationsLongPollingProcessInstancesDeletedGet**](docs/NotificationsApi.md#notificationsLongPollingProcessInstancesDeletedGet) | **GET** /notifications/long_polling/process_instances_deleted | 
*NotificationsApi* | [**notificationsLongPollingProcessIsExecutableChangedGet**](docs/NotificationsApi.md#notificationsLongPollingProcessIsExecutableChangedGet) | **GET** /notifications/long_polling/process_is_executable_changed | 
*NotificationsApi* | [**notificationsLongPollingProcessOwnerChangedGet**](docs/NotificationsApi.md#notificationsLongPollingProcessOwnerChangedGet) | **GET** /notifications/long_polling/process_owner_changed | 
*NotificationsApi* | [**notificationsLongPollingProcessResumedGet**](docs/NotificationsApi.md#notificationsLongPollingProcessResumedGet) | **GET** /notifications/long_polling/process_resumed | 
*NotificationsApi* | [**notificationsLongPollingProcessStartedGet**](docs/NotificationsApi.md#notificationsLongPollingProcessStartedGet) | **GET** /notifications/long_polling/process_started | 
*NotificationsApi* | [**notificationsLongPollingProcessStartingGet**](docs/NotificationsApi.md#notificationsLongPollingProcessStartingGet) | **GET** /notifications/long_polling/process_starting | 
*NotificationsApi* | [**notificationsLongPollingProcessTerminatedGet**](docs/NotificationsApi.md#notificationsLongPollingProcessTerminatedGet) | **GET** /notifications/long_polling/process_terminated | 
*NotificationsApi* | [**notificationsLongPollingProcessUndeployedGet**](docs/NotificationsApi.md#notificationsLongPollingProcessUndeployedGet) | **GET** /notifications/long_polling/process_undeployed | 
*NotificationsApi* | [**notificationsLongPollingSignalTriggeredGet**](docs/NotificationsApi.md#notificationsLongPollingSignalTriggeredGet) | **GET** /notifications/long_polling/signal_triggered | 
*NotificationsApi* | [**notificationsLongPollingStartEventFinishedGet**](docs/NotificationsApi.md#notificationsLongPollingStartEventFinishedGet) | **GET** /notifications/long_polling/start_event_finished | 
*NotificationsApi* | [**notificationsLongPollingUserTaskFinishedGet**](docs/NotificationsApi.md#notificationsLongPollingUserTaskFinishedGet) | **GET** /notifications/long_polling/user_task_finished | 
*NotificationsApi* | [**notificationsLongPollingUserTaskReservationCanceledGet**](docs/NotificationsApi.md#notificationsLongPollingUserTaskReservationCanceledGet) | **GET** /notifications/long_polling/user_task_reservation_canceled | 
*NotificationsApi* | [**notificationsLongPollingUserTaskReservedGet**](docs/NotificationsApi.md#notificationsLongPollingUserTaskReservedGet) | **GET** /notifications/long_polling/user_task_reserved | 
*NotificationsApi* | [**notificationsLongPollingUserTaskWaitingGet**](docs/NotificationsApi.md#notificationsLongPollingUserTaskWaitingGet) | **GET** /notifications/long_polling/user_task_waiting | 
*ProcessDefinitionsApi* | [**processDefinitionsGet**](docs/ProcessDefinitionsApi.md#processDefinitionsGet) | **GET** /process_definitions | 
*ProcessDefinitionsApi* | [**processDefinitionsPost**](docs/ProcessDefinitionsApi.md#processDefinitionsPost) | **POST** /process_definitions | 
*ProcessDefinitionsApi* | [**processDefinitionsProcessDefinitionIdDelete**](docs/ProcessDefinitionsApi.md#processDefinitionsProcessDefinitionIdDelete) | **DELETE** /process_definitions/{processDefinitionId} | 
*ProcessDefinitionsApi* | [**processDefinitionsProcessDefinitionIdGet**](docs/ProcessDefinitionsApi.md#processDefinitionsProcessDefinitionIdGet) | **GET** /process_definitions/{processDefinitionId} | 
*ProcessInstancesApi* | [**processInstancesDelete**](docs/ProcessInstancesApi.md#processInstancesDelete) | **DELETE** /process_instances | 
*ProcessInstancesApi* | [**processInstancesProcessInstanceIdChangeOwnerPost**](docs/ProcessInstancesApi.md#processInstancesProcessInstanceIdChangeOwnerPost) | **POST** /process_instances/{processInstanceId}/change_owner | 
*ProcessInstancesApi* | [**processInstancesProcessInstanceIdProcessDefinitionGet**](docs/ProcessInstancesApi.md#processInstancesProcessInstanceIdProcessDefinitionGet) | **GET** /process_instances/{processInstanceId}/process_definition | 
*ProcessInstancesApi* | [**processInstancesProcessInstanceIdProcessModelGet**](docs/ProcessInstancesApi.md#processInstancesProcessInstanceIdProcessModelGet) | **GET** /process_instances/{processInstanceId}/process_model | 
*ProcessInstancesApi* | [**processInstancesProcessInstanceIdRetryPut**](docs/ProcessInstancesApi.md#processInstancesProcessInstanceIdRetryPut) | **PUT** /process_instances/{processInstanceId}/retry | 
*ProcessInstancesApi* | [**processInstancesProcessInstanceIdTerminatePut**](docs/ProcessInstancesApi.md#processInstancesProcessInstanceIdTerminatePut) | **PUT** /process_instances/{processInstanceId}/terminate | 
*ProcessInstancesApi* | [**processInstancesQueryGet**](docs/ProcessInstancesApi.md#processInstancesQueryGet) | **GET** /process_instances/query | 
*ProcessModelsApi* | [**processModelsGet**](docs/ProcessModelsApi.md#processModelsGet) | **GET** /process_models | 
*ProcessModelsApi* | [**processModelsProcessModelIdDelete**](docs/ProcessModelsApi.md#processModelsProcessModelIdDelete) | **DELETE** /process_models/{processModelId} | 
*ProcessModelsApi* | [**processModelsProcessModelIdDisablePost**](docs/ProcessModelsApi.md#processModelsProcessModelIdDisablePost) | **POST** /process_models/{processModelId}/disable | 
*ProcessModelsApi* | [**processModelsProcessModelIdEnablePost**](docs/ProcessModelsApi.md#processModelsProcessModelIdEnablePost) | **POST** /process_models/{processModelId}/enable | 
*ProcessModelsApi* | [**processModelsProcessModelIdGet**](docs/ProcessModelsApi.md#processModelsProcessModelIdGet) | **GET** /process_models/{processModelId}/ | 
*ProcessModelsApi* | [**processModelsProcessModelIdProcessDefinitionGet**](docs/ProcessModelsApi.md#processModelsProcessModelIdProcessDefinitionGet) | **GET** /process_models/{processModelId}/process_definition | 
*ProcessModelsApi* | [**processModelsProcessModelIdStartPost**](docs/ProcessModelsApi.md#processModelsProcessModelIdStartPost) | **POST** /process_models/{processModelId}/start | 
*UserMetadataApi* | [**userMetadataQueryGet**](docs/UserMetadataApi.md#userMetadataQueryGet) | **GET** /user_metadata/query | 
*UserMetadataApi* | [**userMetadataUserMetadataKeyDelete**](docs/UserMetadataApi.md#userMetadataUserMetadataKeyDelete) | **DELETE** /user_metadata/{userMetadataKey} | 
*UserMetadataApi* | [**userMetadataUserMetadataKeyGet**](docs/UserMetadataApi.md#userMetadataUserMetadataKeyGet) | **GET** /user_metadata/{userMetadataKey} | 
*UserMetadataApi* | [**userMetadataUserMetadataKeyPost**](docs/UserMetadataApi.md#userMetadataUserMetadataKeyPost) | **POST** /user_metadata/{userMetadataKey} | 
*UserTasksApi* | [**userTasksUserTaskInstanceIdCancelReservationDelete**](docs/UserTasksApi.md#userTasksUserTaskInstanceIdCancelReservationDelete) | **DELETE** /user_tasks/{userTaskInstanceId}/cancel-reservation | 
*UserTasksApi* | [**userTasksUserTaskInstanceIdFinishPut**](docs/UserTasksApi.md#userTasksUserTaskInstanceIdFinishPut) | **PUT** /user_tasks/{userTaskInstanceId}/finish | 
*UserTasksApi* | [**userTasksUserTaskInstanceIdReservePut**](docs/UserTasksApi.md#userTasksUserTaskInstanceIdReservePut) | **PUT** /user_tasks/{userTaskInstanceId}/reserve | 


## Documentation for Models

 - [ActiveCronjob](docs/ActiveCronjob.md)
 - [AnonymousSession](docs/AnonymousSession.md)
 - [ApplicationInfo](docs/ApplicationInfo.md)
 - [BaseElementViewModel](docs/BaseElementViewModel.md)
 - [BpmnType](docs/BpmnType.md)
 - [Correlation](docs/Correlation.md)
 - [CorrelationList](docs/CorrelationList.md)
 - [Cronjob](docs/Cronjob.md)
 - [CronjobEnabledChangedMessage](docs/CronjobEnabledChangedMessage.md)
 - [CronjobEvent](docs/CronjobEvent.md)
 - [CronjobEventMessage](docs/CronjobEventMessage.md)
 - [CronjobHistoryEntry](docs/CronjobHistoryEntry.md)
 - [CronjobHistoryList](docs/CronjobHistoryList.md)
 - [CronjobList](docs/CronjobList.md)
 - [DataObjectInstance](docs/DataObjectInstance.md)
 - [DataObjectInstanceList](docs/DataObjectInstanceList.md)
 - [DeployedCronjobList](docs/DeployedCronjobList.md)
 - [EndEventViewModel](docs/EndEventViewModel.md)
 - [EndEventViewModelAllOf](docs/EndEventViewModelAllOf.md)
 - [EventMessage](docs/EventMessage.md)
 - [EventType](docs/EventType.md)
 - [EventViewModel](docs/EventViewModel.md)
 - [ExtendLockRequestPayload](docs/ExtendLockRequestPayload.md)
 - [ExternalTask](docs/ExternalTask.md)
 - [ExternalTaskBpmnError](docs/ExternalTaskBpmnError.md)
 - [ExternalTaskCreatedMessage](docs/ExternalTaskCreatedMessage.md)
 - [ExternalTaskCreatedMessageAllOf](docs/ExternalTaskCreatedMessageAllOf.md)
 - [ExternalTaskError](docs/ExternalTaskError.md)
 - [ExternalTaskErrorMessage](docs/ExternalTaskErrorMessage.md)
 - [ExternalTaskErrorMessageAllOf](docs/ExternalTaskErrorMessageAllOf.md)
 - [ExternalTaskExpiredMessage](docs/ExternalTaskExpiredMessage.md)
 - [ExternalTaskLockedMessage](docs/ExternalTaskLockedMessage.md)
 - [ExternalTaskLockedMessageAllOf](docs/ExternalTaskLockedMessageAllOf.md)
 - [ExternalTaskReusableError](docs/ExternalTaskReusableError.md)
 - [ExternalTaskServiceError](docs/ExternalTaskServiceError.md)
 - [ExternalTaskState](docs/ExternalTaskState.md)
 - [ExternalTaskSuccessMessage](docs/ExternalTaskSuccessMessage.md)
 - [ExternalTaskSuccessMessageAllOf](docs/ExternalTaskSuccessMessageAllOf.md)
 - [ExternalTaskUnlockedMessage](docs/ExternalTaskUnlockedMessage.md)
 - [ExternalTaskUnlockedMessageAllOf](docs/ExternalTaskUnlockedMessageAllOf.md)
 - [FetchAndLockRequestPayload](docs/FetchAndLockRequestPayload.md)
 - [FinishExternalTaskRequestPayload](docs/FinishExternalTaskRequestPayload.md)
 - [FlowNodeInstance](docs/FlowNodeInstance.md)
 - [FlowNodeInstanceList](docs/FlowNodeInstanceList.md)
 - [FlowNodeInstanceState](docs/FlowNodeInstanceState.md)
 - [FlowNodeViewModel](docs/FlowNodeViewModel.md)
 - [FlowNodeViewModelAllOf](docs/FlowNodeViewModelAllOf.md)
 - [HandleBpmnErrorRequestPayload](docs/HandleBpmnErrorRequestPayload.md)
 - [HandleExternalTaskErrorRequestPayload](docs/HandleExternalTaskErrorRequestPayload.md)
 - [HandleServiceErrorRequestPayload](docs/HandleServiceErrorRequestPayload.md)
 - [Identity](docs/Identity.md)
 - [InlineObject](docs/InlineObject.md)
 - [InlineObject1](docs/InlineObject1.md)
 - [InlineObject2](docs/InlineObject2.md)
 - [InlineObject3](docs/InlineObject3.md)
 - [MetadataChangedMessage](docs/MetadataChangedMessage.md)
 - [MetadataChangedMessageAllOf](docs/MetadataChangedMessageAllOf.md)
 - [PersistProcessDefinitionsPayload](docs/PersistProcessDefinitionsPayload.md)
 - [ProcessDefinition](docs/ProcessDefinition.md)
 - [ProcessDefinitionList](docs/ProcessDefinitionList.md)
 - [ProcessDeploymentMessage](docs/ProcessDeploymentMessage.md)
 - [ProcessInstance](docs/ProcessInstance.md)
 - [ProcessInstanceList](docs/ProcessInstanceList.md)
 - [ProcessInstanceState](docs/ProcessInstanceState.md)
 - [ProcessIsExecutableChangedMessage](docs/ProcessIsExecutableChangedMessage.md)
 - [ProcessModel](docs/ProcessModel.md)
 - [ProcessModelList](docs/ProcessModelList.md)
 - [ProcessStartOptions](docs/ProcessStartOptions.md)
 - [ProcessStartRequest](docs/ProcessStartRequest.md)
 - [ProcessStartRequestAllOf](docs/ProcessStartRequestAllOf.md)
 - [ProcessStartResponse](docs/ProcessStartResponse.md)
 - [ProcessToken](docs/ProcessToken.md)
 - [ProcessTokenType](docs/ProcessTokenType.md)
 - [SearchParams](docs/SearchParams.md)
 - [SearchQuery](docs/SearchQuery.md)
 - [StartEventViewModel](docs/StartEventViewModel.md)
 - [StartEventViewModelAllOf](docs/StartEventViewModelAllOf.md)
 - [UserMetadata](docs/UserMetadata.md)
 - [UserMetadataObject](docs/UserMetadataObject.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth


- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



