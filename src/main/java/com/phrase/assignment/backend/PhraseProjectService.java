package com.phrase.assignment.backend;

import com.phrase.assignment.backend.model.ProjectListResponse;
import com.phrase.assignment.backend.model.ProjectResponse;

import java.util.List;

public interface PhraseProjectService {

    ProjectResponse getProject(String token, String projectUid);

    ProjectListResponse getProjectList(String token);
}
