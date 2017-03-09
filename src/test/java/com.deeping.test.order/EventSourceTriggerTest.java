package com.deeping.test.order;

import com.deeping.core.order.beans.Order;
import com.deeping.core.order.flow.EventTrigger;
import org.junit.Test;

/**
 * Created by gezz on 2017/2/26.
 */
public class EventSourceTriggerTest {

    @Test
    public void test() {
        Order order = new Order();
        order.setItemName("小吃");
        order.setId(12324432434l);
        order.setStatus("new");
        EventTrigger eventTrigger = new EventTrigger();
        eventTrigger.registerListener(new NewOrderEventHandler());
//        eventTrigger.unRegisterListener(OrderEventType.NEW_ORDER);
        OrderEvent orderEvent = new OrderEvent(order,OrderEventType.NEW_ORDER, "gezz");
        eventTrigger.trigger(orderEvent);
    }



}
