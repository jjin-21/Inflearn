package org.example.inflearn.member;

import org.assertj.core.api.Assertions;
import org.example.inflearn.config.AppConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberSerivceTest {

    MemberService memberSerivce;
    @BeforeEach
public void beforeEach() {
    AppConfig appConfig = new AppConfig();
    memberSerivce = appConfig.memberService();
    }
    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberSerivce.join(member);
        Member findMember = memberSerivce.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
