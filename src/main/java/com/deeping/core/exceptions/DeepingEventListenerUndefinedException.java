package com.deeping.core.exceptions;

/**
 * Created by gezz on 2017/2/26.
 */
public class DeepingEventListenerUndefinedException extends NestedRuntimeException {
    public DeepingEventListenerUndefinedException(String msg) {
        super(msg);
    }

    public DeepingEventListenerUndefinedException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
