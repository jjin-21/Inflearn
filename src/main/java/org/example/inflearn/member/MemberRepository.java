package org.example.inflearn.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
