package com.example.javaplay.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;

@Getter
@RequiredArgsConstructor
public enum OrderStatus {
    ORDER_REQUEST("주문요청", "최초 주문 요청"),
    ORDER_COMPLETE("주문완료", "모든 주문처리 완료"),
    CANCEL_REQUEST("취소요청", "사용자 취소요청"),
    CANCEL_REJECT("취소거절", "판매자에서 취소거절"),
    CANCEL_COMPLETE("취소완료", "환불처리까지 완료"),;

    private final String code;
    private final String desc;

    public boolean isOrderRequest(OrderStatus validateStatus) {
        return Arrays.stream(values())
                .anyMatch(status -> validateStatus == ORDER_REQUEST);
    }

    public EnumMap<OrderStatus, String> getMap() {
        EnumMap<OrderStatus, String> map = new EnumMap<>(OrderStatus.class);
        return map;
    }

    public EnumSet<OrderStatus> getValidStatus() {
        EnumSet<OrderStatus> validStatus = EnumSet.noneOf(OrderStatus.class);
        return validStatus;
    }
}
