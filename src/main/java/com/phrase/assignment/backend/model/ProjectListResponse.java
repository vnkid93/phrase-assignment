package com.phrase.assignment.backend.model;

import java.util.List;
import java.util.StringJoiner;

public class ProjectListResponse {
    private int totalElements;
    private List<ProjectResponse> content;

    public ProjectListResponse(int numberOfElements, List<ProjectResponse> content) {
        this.totalElements = numberOfElements;
        this.content = content;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public List<ProjectResponse> getContent() {
        return content;
    }

    public void setContent(List<ProjectResponse> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ProjectListResponse.class.getSimpleName() + "[", "]")
                .add("totalElements=" + totalElements)
                .add("content=" + content)
                .toString();
    }
}
