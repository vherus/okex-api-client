package com.vherus.okexapiclient.api;

class Context {
    private String baseUri;
    private String key;
    private String secret;

    Context(String baseUri, String key, String secret) {
        this.baseUri = baseUri;
        this.key = key;
        this.secret = secret;
    }

    String getBaseUri() {
        return baseUri;
    }

    String getKey() {
        return key;
    }

    String getSecret() {
        return secret;
    }
}
