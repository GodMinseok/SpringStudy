package hello.Inflearn_Spring_MVC_1.web.frontcontroller.v3.controller;

import hello.Inflearn_Spring_MVC_1.web.frontcontroller.ModelView;
import hello.Inflearn_Spring_MVC_1.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {

    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }

}
