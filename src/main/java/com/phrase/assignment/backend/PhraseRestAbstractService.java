package com.phrase.assignment.backend;

import org.springframework.web.client.RestTemplate;

import java.util.StringJoiner;

public abstract class PhraseRestAbstractService {
    protected String url;
    protected RestTemplate template;

    protected PhraseRestAbstractService(RestTemplate template, String url) {
        this.template = template;
        this.url = url;
    }

    public RestTemplate getTemplate() {
        return template;
    }

    public void setTemplate(RestTemplate template) {
        this.template = template;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PhraseRestAbstractService.class.getSimpleName() + "[", "]")
                .add("url='" + url + "'")
                .add("template=" + template)
                .toString();
    }
}
