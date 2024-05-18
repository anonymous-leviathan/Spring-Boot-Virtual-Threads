package com.mgunawardhana.springbootvirtualthreads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootVirtualThreadsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootVirtualThreadsApplication.class, args);
    }

    /*
     * Customizes the Tomcat server's protocol handler to use a virtual thread executor.
     *
     * <p>This method is annotated with {@code @Bean}, which means it will be instantiated,
     * assembled, and managed by Spring IoC container. Inside this method, a
     * {@code TomcatProtocolHandlerCustomizer} object is returned. This is a functional
     * interface in Spring Boot that allows you to customize the protocol handler used by
     * the Tomcat server.</p>
     *
     * <p>The lambda expression provided as the implementation of the
     * {@code TomcatProtocolHandlerCustomizer} interface sets the executor of the protocol
     * handler to a new virtual thread executor. This executor creates a new virtual thread
     * for each task, which can be more efficient than using a fixed pool of OS threads,
     * especially when dealing with a large number of tasks that perform blocking operations.
     * This is part of the Project Loom feature in Java, which aims to make concurrency
     * easier by introducing lightweight, efficient threads managed by the Java runtime
     * rather than the operating system.</p>
     *
     * @return a {@code TomcatProtocolHandlerCustomizer} that sets the executor of the
     * protocol handler to a new virtual thread executor
     */

    /*
     * We don't need this bean to enable virtual threads in Spring Boot because
     * we can use this `spring.threads.virtual.enabled=true`.
     *
     * Spring Boot 2.6.0+ automatically enables virtual threads for Tomcat,
     * so we can remove this bean.
     *
     * If we want to enable virtual threads in Spring Boot 2.5.x or earlier versions,
     * we can use this bean.
     */

//    @Bean
//    public TomcatProtocolHandlerCustomizer<?> tomcatProtocolHandlerCustomizer() {
//        return (protocolHandler) -> {
//            protocolHandler.setExecutor(Executors.newVirtualThreadPerTaskExecutor());
//        };
//    }

}