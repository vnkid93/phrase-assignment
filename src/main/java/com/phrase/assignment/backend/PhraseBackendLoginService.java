package com.phrase.assignment.backend;

import com.phrase.assignment.backend.model.UserLoginRequest;

import java.util.Optional;

public interface PhraseBackendLoginService {

    Optional<String> getUserToken(UserLoginRequest request);
}
