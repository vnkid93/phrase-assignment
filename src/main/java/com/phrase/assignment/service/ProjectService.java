package com.phrase.assignment.service;

import com.phrase.assignment.backend.model.ProjectListResponse;
import com.phrase.assignment.backend.model.ProjectResponse;

import java.util.List;

public interface ProjectService {

    ProjectListResponse getProjectList(String token);

    ProjectResponse getProject(String token, String projectUid);
}
