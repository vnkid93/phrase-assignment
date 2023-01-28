package com.phrase.assignment.backend.impl;

import com.phrase.assignment.backend.PhraseLoginService;
import com.phrase.assignment.backend.PhraseRestAbstractService;
import com.phrase.assignment.backend.model.UserLoginRequest;
import com.phrase.assignment.backend.model.UserLoginResponse;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

public class PhraseLoginServiceImpl extends PhraseRestAbstractService implements PhraseLoginService {
    private static final String ACTION = "/auth/login";

    public PhraseLoginServiceImpl(RestTemplate template, String url) {
        super(template, url);
    }

    @Override
    public Optional<String> getUserToken(UserLoginRequest request) {
        UserLoginResponse userLogin = template.postForObject(url + ACTION, request, UserLoginResponse.class);
        return Optional.of(userLogin.getToken());
    }
}
