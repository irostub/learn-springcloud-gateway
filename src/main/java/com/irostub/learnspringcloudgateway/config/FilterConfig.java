package com.irostub.learnspringcloudgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;

/**
 * yml 설정 대신 bean 을 직접 등록하여 라우팅을 하는 방법
 * application.yml 을 통해 라우팅 하기 위해 component scan 대상에서 제외
 */

//@Configuration
public class FilterConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r
                        .path("/first/**")
                        // set pre, post filter
                        .filters(f -> f
                                .addRequestHeader("first-request-header", "first-request-header-value")
                                .addResponseHeader("first-response-header", "first-response-header-value"))
                        .uri(URI.create("http://localhost:8081")))
                .route(r -> r
                        .path("/second/**")
                        // set pre, post filter
                        .filters(f -> f
                                .addRequestHeader("second-request-header", "second-request-header-value")
                                .addResponseHeader("second-response-header", "second-response-header-value"))
                        .uri(URI.create("http://localhost:8082")))
                .build();
    }
}
