package se.omegapoint.micro.client;

import com.google.common.collect.Lists;
import org.springframework.cloud.client.loadbalancer.LoadBalancerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
    @Bean
    public RestTemplate restTemplate(final LoadBalancerInterceptor loadBalancerInterceptor) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors(Lists.newArrayList(loadBalancerInterceptor));

        return restTemplate;
    }
}
