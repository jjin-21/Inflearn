package org.example.inflearn.order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
