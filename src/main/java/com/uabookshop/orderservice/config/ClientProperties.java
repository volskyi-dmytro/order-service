package com.uabookshop.orderservice.config;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.URI;

@ConfigurationProperties(prefix = "uabook")
public record ClientProperties(
        @NotNull
        URI catalogServiceURI
) {}
