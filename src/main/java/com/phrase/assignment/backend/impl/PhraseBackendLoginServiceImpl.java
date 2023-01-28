package com.phrase.assignment.backend.impl;

import com.phrase.assignment.backend.PhraseBackendLoginService;
import com.phrase.assignment.backend.model.UserLoginRequest;
import com.phrase.assignment.backend.model.UserLoginResponse;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

public class PhraseBackendLoginServiceImpl implements PhraseBackendLoginService {
    private static final String ACTION = "/auth/login";
    private final RestTemplate template;
    private final String url;

    public PhraseBackendLoginServiceImpl(RestTemplate template, String url) {
        this.template = template;
        this.url = url;
    }

    @Override
    public Optional<String> getUserToken(UserLoginRequest request) {
        UserLoginResponse userLogin = template.postForObject(url + ACTION, request, UserLoginResponse.class);
        return Optional.of(userLogin.getToken());
    }
}
