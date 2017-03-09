package com.deeping.core.exceptions;

/**
 * Created by gezz on 2017/2/26.
 */
public class ExistsSuchEventListenerException extends NestedRuntimeException {

    public ExistsSuchEventListenerException(String msg) {
        super(msg);
    }

    public ExistsSuchEventListenerException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
