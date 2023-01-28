package com.phrase.assignment.view;

import com.phrase.assignment.backend.model.ProjectListResponse;
import com.phrase.assignment.service.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/project")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/list")
    public ProjectListResponse getProjectList(@RequestParam String token) {
        return projectService.getProjectList(token);
    }

}
