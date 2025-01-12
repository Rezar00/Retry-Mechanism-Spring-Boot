package org.roro.retrymechanismspringboot.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Uncomment this code if your Spring Boot version is below 3.2 and uses at least Spring Framework 6.
    /*@Bean
    public AsyncTaskExecutor applicationTaskExecutor() {
        return new TaskExecutorAdapter(Executors.newVirtualThreadPerTaskExecutor());
    }


    @Bean
    public TomcatProtocolHandlerCustomizer<?> protocolHandlerVirtualThreadExecutorCustomizer() {
        return protocolHandler -> {
            protocolHandler.setExecutor(Executors.newVirtualThreadPerTaskExecutor());
        };
    }*/
}
