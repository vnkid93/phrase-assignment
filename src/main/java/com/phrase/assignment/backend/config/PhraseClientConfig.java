package com.phrase.assignment.backend.config;

import com.phrase.assignment.backend.PhraseLoginService;
import com.phrase.assignment.backend.PhraseProjectService;
import com.phrase.assignment.backend.impl.PhraseLoginServiceImpl;
import com.phrase.assignment.backend.impl.PhraseProjectServiceImpl;
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
    public PhraseLoginService getPhraseBackendLoginService() {
        return new PhraseLoginServiceImpl(template, PHRASE_URL);
    }

    @Bean
    public PhraseProjectService getPhraseProjectService() {
        return new PhraseProjectServiceImpl(template, PHRASE_URL);
    }

}
