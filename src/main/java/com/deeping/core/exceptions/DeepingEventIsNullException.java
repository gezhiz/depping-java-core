package com.deeping.core.exceptions;

/**
 * Created by gezz on 2017/2/26.
 */
public class DeepingEventIsNullException extends NestedRuntimeException {
    public DeepingEventIsNullException(String msg) {
        super(msg);
    }

    public DeepingEventIsNullException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
