package com.ll.exam.FinalMutBooks.app.base.initData;

import com.ll.exam.FinalMutBooks.app.member.entity.Member;
import com.ll.exam.FinalMutBooks.app.member.service.MemberService;

public interface InitDataBefore {
    default void before(MemberService memberService) {
        Member member1 = memberService.join("user1", "1234", "jiwon","user1@test.com");
        Member member2 = memberService.join("user2", "1234", "jiwon2", "user2@test.com");
    }
}
