package com.deeping.core.order.flow;


/**
 * Created by gezz on 2017/2/26.
 */
public interface EventListener<T extends EventSource> {
    void handler(T t);
    EventType getEventType();
}
