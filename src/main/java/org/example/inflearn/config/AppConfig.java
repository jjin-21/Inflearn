package org.example.inflearn.config;

import org.example.inflearn.discount.FixDiscountPolicy;
import org.example.inflearn.member.MemberService;
import org.example.inflearn.member.MemberServiceImpl;
import org.example.inflearn.member.MemoryMemberRepository;
import org.example.inflearn.order.OrderService;
import org.example.inflearn.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
