package com.deeping.core.order.flow;

import com.deeping.core.exceptions.DeepingEventIsNullException;
import com.deeping.core.exceptions.DeepingEventListenerUndefinedException;
import com.deeping.core.exceptions.ExistsSuchEventListenerException;
import com.deeping.core.utils.DeepingStringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 监听器触发器：每一个监听器类智能注册一次
 * 重复注册：不允许重复注册
 * Created by gezz on 2017/2/26.
 */
public class EventTrigger {

    private Map<String,EventListener> listenerMap = new HashMap<String, EventListener>();

    public EventTrigger() {}

    public void registerListener(EventListener listener) {
        String listenerKey = generateListenerMapKey(listener);
        if (containsKey(listener)) {
            throw new ExistsSuchEventListenerException(
                    DeepingStringUtils.combineString("监听器【"
                            , listenerKey
                            , "】已经注册过了，请勿重新注册。如果想支持注册覆盖，请查看配置supportCoverRegister参数为true"));
        }
        listenerMap.put(listenerKey, listener);
    }

    public void unRegisterListener(EventType eventType) {
        listenerMap.remove(eventType.name());
    }

    public void trigger(EventSource eventSource) {
        if (eventSource == null) {
            throw new DeepingEventIsNullException("时间源为空异常");
        }
        if (eventSource.getEventType() == null) {
            throw new DeepingEventIsNullException("时间源的类型为空异常");
        }
        EventListener eventListener = listenerMap.get(eventSource.getEventType().name());
        if (eventListener == null) {
            throw new DeepingEventListenerUndefinedException(DeepingStringUtils.combineString("未找到名为【"
                    , eventSource.getEventType().name(), "】的监听器"));
        }
        eventListener.handler(eventSource);
    }

    private boolean containsKey(EventListener eventListener) {
        return this.listenerMap.containsKey(generateListenerMapKey(eventListener));
    }

    private String generateListenerMapKey(EventListener eventListener) {
        return eventListener.getEventType().name();
    }

}
