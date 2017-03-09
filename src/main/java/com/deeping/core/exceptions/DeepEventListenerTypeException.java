package com.deeping.core.exceptions;

/**
 * Created by gezz on 2017/2/26.
 */
public class DeepEventListenerTypeException extends NestedRuntimeException {
    public DeepEventListenerTypeException(String msg) {
        super(msg);
    }

    public DeepEventListenerTypeException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
