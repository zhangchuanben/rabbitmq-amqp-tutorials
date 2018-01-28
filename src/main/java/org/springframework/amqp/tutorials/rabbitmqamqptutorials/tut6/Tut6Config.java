package org.springframework.amqp.tutorials.rabbitmqamqptutorials.tut6;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"tut6","rpc"})
@Configuration
public class Tut6Config {
    @Bean
    public DirectExchange exchange() {
        return new DirectExchange("tut.rpc");
    }

    @Profile("server")
    private static class ServerConfig {
        @Bean
        public Queue queue() {
            return new Queue("tut.rpc.requests");
        }

        @Bean
        public Binding binding(DirectExchange exchange, Queue queue) {
            return BindingBuilder.bind(queue)
                    .to(exchange)
                    .with("rpc");
        }

        @Bean
        public Tut6Server server() {
            return new Tut6Server();
        }
    }

    @Profile("client")
    @Bean
    public Tut6Client client() {
        return new Tut6Client();
    }
}
