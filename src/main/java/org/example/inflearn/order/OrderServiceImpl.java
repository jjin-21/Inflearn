package org.example.inflearn.order;

import org.example.inflearn.discount.DiscountPolicy;
import org.example.inflearn.discount.FixDiscountPolicy;
import org.example.inflearn.member.Member;
import org.example.inflearn.member.MemberRepository;
import org.example.inflearn.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);

    }
}
