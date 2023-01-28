package com.phrase.assignment.service.impl;

import com.phrase.assignment.backend.PhraseProjectService;
import com.phrase.assignment.backend.model.ProjectListResponse;
import com.phrase.assignment.backend.model.ProjectResponse;
import com.phrase.assignment.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    private final PhraseProjectService projectService;

    public ProjectServiceImpl(PhraseProjectService projectService) {
        this.projectService = projectService;
    }

    @Override
    public ProjectListResponse getProjectList(String token) {
        return projectService.getProjectList(token);
    }

    @Override
    public ProjectResponse getProject(String token, String projectUid) {
        return projectService.getProject(token, projectUid);
    }
}
