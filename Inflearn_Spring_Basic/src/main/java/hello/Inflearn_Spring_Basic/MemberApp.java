package hello.Inflearn_Spring_Basic;

import hello.Inflearn_Spring_Basic.member.Grade;
import hello.Inflearn_Spring_Basic.member.Member;
import hello.Inflearn_Spring_Basic.member.MemberService;
import hello.Inflearn_Spring_Basic.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("findMember: " + findMember);
        System.out.println("member = " + member);
    }
}
