package com.nexigroup.ms.schemecompliance.pubsubconnector.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties("sfdc.authenticated")
@Validated
public class SfdcAuthenticatedProperties {
    @NotNull
    private String host;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String clientId;
    @NotNull
    private String secret;
}
