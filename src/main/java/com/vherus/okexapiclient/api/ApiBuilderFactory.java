package com.vherus.okexapiclient.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Feign;
import feign.RequestInterceptor;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

class ApiBuilderFactory {
    private Context context;

    ApiBuilderFactory(Context context) {
        this.context = context;
    }

    Feign.Builder createBuilder() {
        ObjectMapper mapper = ObjectMapperFactory.make();
        Feign.Builder apiBuilder = Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder(mapper));

        RequestInterceptor interceptor = requestTemplate -> {
            requestTemplate.header("contentType", "application/x-www-form-urlencoded");
            requestTemplate.query("api_key", context.getKey());
        };

        apiBuilder.requestInterceptor(interceptor);

        return apiBuilder;
    }
}
