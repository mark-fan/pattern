package com.pattern.strategy;

import org.springframework.stereotype.Component;

/**
 * @author luofan
 */
@Component
public class MingRenHandler extends AbstractHandler{

    @Override
    public void renshu(String nickName){
        System.out.println("我是旋涡鸣人");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("=========================");
        Factory.register("漩涡鸣人",this);
    }
}
