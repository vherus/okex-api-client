package com.vherus.okexapiclient.api;

import feign.Feign;
import feign.RequestInterceptor;

class ApiBuilderFactory {
    private Context context;

    ApiBuilderFactory(Context context) {
        this.context = context;
    }

    Feign.Builder createBuilder() {
        Feign.Builder apiBuilder = Feign.builder();

        RequestInterceptor interceptor = requestTemplate -> {
            requestTemplate.header("contentType", "application/x-www-form-urlencoded");
            requestTemplate.query("api_key", context.getKey());
        };

        apiBuilder.requestInterceptor(interceptor);

        return apiBuilder;
    }
}
