package com.deeping.test.order;

import com.deeping.core.order.flow.EventListener;
import com.deeping.core.order.flow.EventType;


/**
 * Created by gezz on 2017/2/26.
 */
public class NewOrderEventHandler implements EventListener<OrderEvent> {

    public void handler(OrderEvent orderEvent) {
        String username = orderEvent.getUsername();
        System.out.println(username);
        System.out.println("NEW_ORDER is occurred");
        System.out.println(orderEvent.getOrder());
    }

    public EventType getEventType() {
        return OrderEventType.NEW_ORDER;
    }
}
