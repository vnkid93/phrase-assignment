package com.phrase.assignment.backend.impl;

import com.phrase.assignment.backend.PhraseProjectService;
import com.phrase.assignment.backend.PhraseRestAbstractService;
import com.phrase.assignment.backend.model.ProjectListResponse;
import com.phrase.assignment.backend.model.ProjectResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;


public class PhraseProjectServiceImpl extends PhraseRestAbstractService implements PhraseProjectService {

    public PhraseProjectServiceImpl(RestTemplate template, String url) {
        super(template, url);
    }

    @Override
    public ProjectResponse getProject(String token, String projectUid) {
        return null;
    }

    @Override
    public ProjectListResponse getProjectList(String token) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "ApiToken " + token);
        HttpEntity<Object> headerEntity = new HttpEntity<>(headers);
        return template.exchange(getUrl() + "/projects", HttpMethod.GET, headerEntity, ProjectListResponse.class).getBody();
    }
}
