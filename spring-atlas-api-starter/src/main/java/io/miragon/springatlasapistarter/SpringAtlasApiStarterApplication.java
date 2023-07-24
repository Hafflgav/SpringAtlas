package io.miragon.springatlasapistarter;

import io.miragon.processcube.gen.api.ExternalTasksApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringAtlasApiStarterApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(SpringAtlasApiStarterApplication.class, args);

        var externalTasksApi = context.getBean(ExternalTasksApi.class);
        var result = externalTasksApi.externalTasksDeployedTopicsGet().blockFirst();
        log.info("result: {}", result);
    }

}