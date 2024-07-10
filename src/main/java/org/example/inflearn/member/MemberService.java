package org.example.inflearn.member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
