package com.deeping.test.order;

import com.deeping.core.order.beans.Order;
import com.deeping.core.order.flow.EventSource;
import com.deeping.core.order.flow.EventType;

/**
 * Created by gezz on 2017/2/26.
 */
public class OrderEvent extends EventSource {

    private String username;
    private Order order;

    public OrderEvent(Order order, EventType eventType, String username) {
        super(eventType);
        this.order = order;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
