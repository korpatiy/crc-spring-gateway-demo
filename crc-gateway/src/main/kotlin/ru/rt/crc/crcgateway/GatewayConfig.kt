package ru.rt.crc.crcgateway

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.gateway.filter.GatewayFilter
import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.Buildable
import org.springframework.cloud.gateway.route.builder.GatewayFilterSpec
import org.springframework.cloud.gateway.route.builder.PredicateSpec
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/*
@Configuration
class GatewayConfig(
    private val filter: AuthorizationFilter
) {
    @Bean
    fun routes(builder: RouteLocatorBuilder): RouteLocator {
        return builder.routes()
            .route("calc-service") { r: PredicateSpec ->
                r.path("/calc/**")
                    .filters { f: GatewayFilter -> f.filter(filter) }
                    .uri("lb://calc-service")
            }
            .build()
    }
}
*/