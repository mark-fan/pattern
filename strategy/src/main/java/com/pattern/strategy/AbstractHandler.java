package com.pattern.strategy;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author luofan
 */
public abstract class AbstractHandler implements InitializingBean {

    public void renshu(String nickName){
        throw new UnsupportedOperationException();
    }
}
