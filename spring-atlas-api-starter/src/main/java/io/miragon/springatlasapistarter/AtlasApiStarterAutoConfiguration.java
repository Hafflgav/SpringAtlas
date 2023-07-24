package io.miragon.springatlasapistarter;

import io.miragon.processcube.gen.ApiClient;
import io.miragon.processcube.gen.api.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AtlasApiStarterAutoConfiguration {

    @Bean
    AnonymousSessionsApi anonymousSessionsApi(final ApiClient apiClient) {
        return new AnonymousSessionsApi(apiClient);
    }

    @Bean
    ApplicationInfoApi applicationInfoApi(final ApiClient apiClient) {
        return new ApplicationInfoApi(apiClient);
    }

    @Bean
    CorrelationsApi correlationsApi(final ApiClient apiClient) {
        return new CorrelationsApi(apiClient);
    }

    @Bean
    CronjobsApi cronjobsApi(final ApiClient apiClient) {
        return new CronjobsApi(apiClient);
    }

    @Bean
    DataObjectInstancesApi dataObjectInstancesApi(final ApiClient apiClient) {
        return new DataObjectInstancesApi(apiClient);
    }

    @Bean
    EmptyActivitiesApi emptyActivitiesApi(final ApiClient apiClient) {
        return new EmptyActivitiesApi(apiClient);
    }

    @Bean
    EventsApi eventsApi(final ApiClient apiClient) {
        return new EventsApi(apiClient);
    }

    @Bean
    ExternalTasksApi externalTasksApi(final ApiClient apiClient) {
        return new ExternalTasksApi(apiClient);
    }

    @Bean
    FlowNodeInstancesApi flowNodeInstancesApi(final ApiClient apiClient) {
        return new FlowNodeInstancesApi(apiClient);
    }

    @Bean
    ManualTasksApi manualTasksApi(final ApiClient apiClient) {
        return new ManualTasksApi(apiClient);
    }

    @Bean
    NotificationsApi notificationsApi(final ApiClient apiClient) {
        return new NotificationsApi(apiClient);
    }

    @Bean
    ProcessDefinitionsApi processDefinitionsApi(final ApiClient apiClient) {
        return new ProcessDefinitionsApi(apiClient);
    }

    @Bean
    ProcessInstancesApi processInstancesApi(final ApiClient apiClient) {
        return new ProcessInstancesApi(apiClient);
    }

    @Bean
    ProcessModelsApi processModelsApi(final ApiClient apiClient) {
        return new ProcessModelsApi(apiClient);
    }

    @Bean
    UserMetadataApi userMetadataApi(final ApiClient apiClient) {
        return new UserMetadataApi(apiClient);
    }

    @Bean
    UserTasksApi userTasksApi(final ApiClient apiClient) {
        return new UserTasksApi(apiClient);
    }

    @Bean
    ApiClient atlasApiClient(final WebClient webClient) {
        var apiClient = new ApiClient(webClient);
        apiClient.setBasePath("http://localhost:56000/atlas_engine/api/v1");
        return apiClient;
    }

    @Bean
    WebClient webClient() {
        return WebClient.builder()
                .baseUrl("http://localhost:56000/atlas_engine/api/v1")
                .filter((request, next) -> next.exchange(
                        withBearerAuth(request, "ZHVtbXlfdG9rZW4=")))
                .build();
    }

    private static ClientRequest withBearerAuth(ClientRequest request,
                                                String token) {
        return ClientRequest.from(request)
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .build();
    }
}