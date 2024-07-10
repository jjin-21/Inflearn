package org.example.inflearn.order;

import org.assertj.core.api.Assertions;
import org.example.inflearn.member.Grade;
import org.example.inflearn.member.Member;
import org.example.inflearn.member.MemberService;
import org.example.inflearn.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }
}
