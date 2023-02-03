package com.nexigroup.ms.schemecompliance.pubsubconnector.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties("pubsub")
public class PubSubConfigProperties {

    private String host;
    private int port;
    private String topicRequest;
    private String topicResponse;
    private boolean usePlainText;
    private int subscribeLimit;

}
