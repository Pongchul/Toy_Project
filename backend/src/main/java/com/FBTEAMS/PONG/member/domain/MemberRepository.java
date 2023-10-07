package com.FBTEAMS.PONG.member.domain;

import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface MemberRepository extends Repository<Member, Long> {

    Member save(Member member);

    Optional<Member> findByUserIdAndPassword(UserId userId, Password password);

    Optional<Member> findByUserId(UserId userId);

    boolean existsByUserId(UserId userId);
}
