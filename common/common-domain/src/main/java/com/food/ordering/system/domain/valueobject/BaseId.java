package com.food.ordering.system.domain.valueobject;

import java.util.Objects;

public abstract class BaseId<T> {
    private final T value; // final로 선언하였기 때문에, contruct할 때 무조건 할당해주어야한다.

    // protected를 설정해줌으러써, 외부에서 이 생성자에 대한 접근을 막아버린다. subclass에서만 접근이 가능하다.
    protected BaseId(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseId<?> baseId = (BaseId<?>) o;
        return Objects.equals(value, baseId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
