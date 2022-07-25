package me.jisu.javamockito.member;

import me.whiteship.inflearnthejavatest.domain.Member;

public interface MemberService {
    void validate(Long memberId) throws InvalidMemberException;

    Member findById(Long memberId) throws MemberNotFoundException;
}
