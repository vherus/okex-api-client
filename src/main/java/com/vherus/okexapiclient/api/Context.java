package com.vherus.okexapiclient.api;

public class Context {
    private String baseUri;
    private String key;
    private String secret;

    Context(String baseUri, String key, String secret) {
        this.baseUri = baseUri;
        this.key = key;
        this.secret = secret;
    }

    public String getBaseUri() {
        return baseUri;
    }

    public String getKey() {
        return key;
    }

    public String getSecret() {
        return secret;
    }
}
