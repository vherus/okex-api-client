package com.vherus.okexapiclient.api;

import feign.Feign;

public class OkexClient {
    public OkexClient(Context context) {
        ApiBuilderFactory builderFactory = new ApiBuilderFactory(context);
        Feign.Builder apiBuilder = builderFactory.createBuilder();
    }
}
