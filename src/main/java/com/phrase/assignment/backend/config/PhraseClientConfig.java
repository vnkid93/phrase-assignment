package com.phrase.assignment.backend.config;

import com.phrase.assignment.backend.PhraseBackendLoginService;
import com.phrase.assignment.backend.impl.PhraseBackendLoginServiceImpl;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class PhraseClientConfig {
    private static final String PHRASE_URL = "https://cloud.memsource.com/web/api2/v1/";

    private final RestTemplate template;

    public PhraseClientConfig(RestTemplateBuilder builder) {
        template = builder.build();
    }

    @Bean
    public PhraseBackendLoginService getPhraseBackendLoginService() {
        return new PhraseBackendLoginServiceImpl(template, PHRASE_URL);
    }

}
