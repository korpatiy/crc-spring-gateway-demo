package ru.rt.crc.crcgateway

import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.cloud.gateway.filter.GatewayFilter
import org.springframework.cloud.gateway.filter.factory.GatewayFilterFactory
import org.springframework.stereotype.Component

@RefreshScope
@Component
class AuthorizationFilter : GatewayFilterFactory<AuthorizationFilter> {

    override fun apply(config: AuthorizationFilter): GatewayFilter {

        return GatewayFilter { exchange, chain ->
            val request = exchange.request

           /* if (!request.headers.containsKey(HttpHeaders.AUTHORIZATION))
                throw RuntimeException("Missing authorization information")

            //bearer check...
            val token = request.headers[HttpHeaders.AUTHORIZATION]!![0]*/

            request.mutate().header("roles", "admin").build()

            chain.filter(exchange)
        }
    }

    override fun getConfigClass(): Class<AuthorizationFilter> {
        return this::javaClass.get()
    }

    override fun newConfig(): AuthorizationFilter {
        return this
    }
}