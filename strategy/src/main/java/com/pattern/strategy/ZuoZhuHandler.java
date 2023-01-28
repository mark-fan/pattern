package com.pattern.strategy;

import org.springframework.stereotype.Component;

/**
 * @author luofan
 */
@Component
public class ZuoZhuHandler extends AbstractHandler{

    @Override
    public void renshu(String nickName){
        System.out.println("我是宇智波佐助");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Factory.register("宇智波佐助",this);
    }
}
