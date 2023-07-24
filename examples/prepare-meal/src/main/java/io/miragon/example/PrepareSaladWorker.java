package io.miragon.example;

import io.miragon.processcube.gen.api.ExternalTasksApi;
import io.miragon.processcube.gen.model.FetchAndLockRequestPayload;
import io.miragon.processcube.gen.model.FinishExternalTaskRequestPayload;
import io.miragon.springatlasapistarter.ExternalTaskResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Objects;

@Slf4j
@Component
@RequiredArgsConstructor
public class PrepareSaladWorker {

    private final ExternalTasksApi externalTaskApi;

    @Scheduled(fixedDelay = 1000L)
    public void prepareSalad() {
        FetchAndLockRequestPayload fetchAndLockRequestPayload = new FetchAndLockRequestPayload()
                .lockDuration(BigDecimal.valueOf(30000L))
                .workerId("prepareSalad")
                .topicName("prepareSalad")
                .maxTasks(BigDecimal.valueOf(1L));

        var externalTask = externalTaskApi.externalTasksFetchAndLockPost(fetchAndLockRequestPayload).blockFirst();

        if (Objects.nonNull(externalTask)) {
            log.info("externalTask: {}", externalTask);
            var finishExternalTaskPayload = new FinishExternalTaskRequestPayload()
                    .workerId("prepareSalad")
                    .result(new ExternalTaskResult("Status: Salad is ready"));

            externalTaskApi.externalTasksExternalTaskIdFinishPut(externalTask.getId(), finishExternalTaskPayload ).block();
        }
    }
}