package org.example.inflearn.discount;

import org.example.inflearn.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
