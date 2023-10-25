package edu.miu.cs.acs.integration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

@MessageEndpoint
public class Channels {

    public static final String INPUT_CHANNEL = "NEWAPI";
    public static final String SUCCESSFUL_API_CHANNEL = "HealthyAPI";
    public static final String UNAUTHORIZED_API_CHANNEL = "UnauthorizedAPI";
    public static final String FAILED_API_CHANNEL = "UnsureAPI";
    public static final String ROUTING_CHANNEL = "routingChannel";

    @Bean(INPUT_CHANNEL)
    public MessageChannel inputChannel() {
        return new DirectChannel();
    }

    @Bean(ROUTING_CHANNEL)
    public MessageChannel routingChannel() {
        return new DirectChannel();
    }

    @Bean(SUCCESSFUL_API_CHANNEL)
    public MessageChannel successfulApiChannel() {
        return new DirectChannel();
    }

    @Bean(UNAUTHORIZED_API_CHANNEL)
    public MessageChannel unauthorizedApiChannel() {
        return new DirectChannel();
    }

    @Bean(FAILED_API_CHANNEL)
    public MessageChannel failedApiChannel() {
        return new DirectChannel();
    }
}
