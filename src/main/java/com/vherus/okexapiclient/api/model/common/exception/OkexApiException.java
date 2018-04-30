package com.vherus.okexapiclient.api.model.common.exception;

public class OkexApiException extends RuntimeException {
    public OkexApiException() {
    }

    public OkexApiException(String message) {
        super(message);
    }

    public OkexApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public OkexApiException(Throwable cause) {
        super(cause);
    }

    public OkexApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
