package org.example.inflearn.config;

import org.example.inflearn.discount.DiscountPolicy;
import org.example.inflearn.discount.FixDiscountPolicy;
import org.example.inflearn.discount.RateDiscountPolicy;
import org.example.inflearn.member.MemberRepository;
import org.example.inflearn.member.MemberService;
import org.example.inflearn.member.MemberServiceImpl;
import org.example.inflearn.member.MemoryMemberRepository;
import org.example.inflearn.order.OrderService;
import org.example.inflearn.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memoryMemberRepository(), discountPolicy());
    }

    public MemberRepository memoryMemberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
