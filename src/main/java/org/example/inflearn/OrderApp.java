package org.example.inflearn;

import org.example.inflearn.member.Grade;
import org.example.inflearn.member.Member;
import org.example.inflearn.member.MemberService;
import org.example.inflearn.member.MemberServiceImpl;
import org.example.inflearn.order.Order;
import org.example.inflearn.order.OrderService;
import org.example.inflearn.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice = " + order.calculatePrice());
    }
}