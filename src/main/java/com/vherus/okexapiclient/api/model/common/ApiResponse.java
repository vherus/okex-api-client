package com.vherus.okexapiclient.api.model.common;

import com.vherus.okexapiclient.api.model.common.exception.OkexApiException;
import java.util.Optional;

class ApiResponse<T> {
    private boolean success;
    private String message;
    private T result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public Optional<T> getResultAsOptional() {
        return Optional.ofNullable(result);
    }

    public T unwrap() throws OkexApiException {
        if (result == null) {
            throw new OkexApiException(String.format("%s", this.message));
        }

        return result;
    }
}
