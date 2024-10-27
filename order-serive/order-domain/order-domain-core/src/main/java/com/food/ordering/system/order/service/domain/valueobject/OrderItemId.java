package com.food.ordering.system.order.service.domain.valueobject;

import com.food.ordering.system.domain.valueobject.BaseId;

// OrderItem의 고유성은 오직 이 aggregate 내에서만 유효하다. 때문에 그냥 Long을 사용해도 된다.
public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long id) {
        super(id);
    }
}
