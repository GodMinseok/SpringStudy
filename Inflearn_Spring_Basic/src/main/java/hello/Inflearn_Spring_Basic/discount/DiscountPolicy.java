package hello.Inflearn_Spring_Basic.discount;

import hello.Inflearn_Spring_Basic.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int prince);
}
