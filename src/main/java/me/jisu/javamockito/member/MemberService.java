package me.jisu.javamockito.member;

import me.jisu.javamockito.domain.Member;

import java.util.Optional;

public interface MemberService {

    Optional<Member> findById(Long memberId);
}
