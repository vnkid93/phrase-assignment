package com.phrase.assignment.backend.model;

import java.util.List;
import java.util.StringJoiner;

public class ProjectResponse {
    private String uid;
    private String id;
    private String name;
    private String sourceLang;
    private List<String> targetLangs;
    private String status;

    public ProjectResponse() {
        // empty on purpose
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourceLang() {
        return sourceLang;
    }

    public void setSourceLang(String sourceLang) {
        this.sourceLang = sourceLang;
    }

    public List<String> getTargetLangs() {
        return targetLangs;
    }

    public void setTargetLangs(List<String> targetLangs) {
        this.targetLangs = targetLangs;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ProjectResponse.class.getSimpleName() + "[", "]")
                .add("uid='" + uid + "'")
                .add("id='" + id + "'")
                .add("name='" + name + "'")
                .add("sourceLang='" + sourceLang + "'")
                .add("targetLangs=" + targetLangs)
                .add("status='" + status + "'")
                .toString();
    }
}
