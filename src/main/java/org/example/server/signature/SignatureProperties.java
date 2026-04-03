package org.example.server.signature;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "signature")
public class SignatureProperties {

    private String keyStorePath;

    private String keyStoreType = "JKS";

    private String keyStorePassword;

    private String keyAlias;

    private String keyPassword;
}