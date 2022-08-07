package me.jisu.javamockito.member;

import me.jisu.javamockito.domain.Member;
import me.jisu.javamockito.domain.Study;

import java.util.Optional;

public interface MemberService {

    Optional<Member> findById(Long memberId);

    void validate(Long memberId);

    void notify(Study newStudy);

    void notify(Member member);
}
