package com.deeping.core.order.flow;


/**
 * 事件源
 * Created by gezz on 2017/2/26.
 */
public class EventSource {

    private EventType eventType;//事件类型

    public EventSource(EventType eventType) {
        this.eventType = eventType;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
