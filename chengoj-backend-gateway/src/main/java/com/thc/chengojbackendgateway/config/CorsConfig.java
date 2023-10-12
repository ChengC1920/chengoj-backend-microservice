package com.thc.chengojbackendgateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

/**
 * 网关跨域
 *
 * @author Shier 2023/9/6 23:15
 */
@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter() {
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedMethod("*");
        config.addAllowedHeader("*");
        config.setAllowCredentials(true);
        // 设置线上前端项目地址
//       建议写成指定的地址：本地、线上 config.setAllowedOriginPatterns(Arrays.asList("http://localhost:8080", "http://127.0.0.1:8080", "http://oj.kongshier.top", "http://8.134.37.7:80"));
        config.setAllowedOriginPatterns(Arrays.asList("*"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return new CorsWebFilter(source);
    }
}
