package io.miragon.springatlasapistarter;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "io.miragon.processcube.atlas")
@Getter
@Setter
public class AtlasProperties {

    private String baseUrl;
}