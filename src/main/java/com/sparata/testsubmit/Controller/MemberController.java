package com.sparata.testsubmit.Controller;

import com.sparata.testsubmit.Repository.MemberRepository;
import com.sparata.testsubmit.Service.MemberService;
import com.sparata.testsubmit.domain.Member;
import com.sparata.testsubmit.entity.MemberInfoResponseDto;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberController {
    //선언부
    private final MemberService memberService;
    private final MemberRepository memberRepository;

    static class CommonResponse{

    }

    @GetMapping("/member/{id}")
    public MemberInfoResponseDto getMemberInfo(@PathVariable Long id) {

    return memberService.findMember(id);
    }

    /**
     * 회원의 전체 목록을 조회하는 API
     */
    @GetMapping("/member")
    public List<Member> getMemberList() {
        return memberService.findAllMember();
    }

}
