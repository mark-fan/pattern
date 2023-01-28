package com.pattern.strategy;

/**
 * @author luofan
 */
public class Demo {
    public static void main(String[] args) {
        String nickName = "旋涡鸣人";
        if ("旋涡鸣人".equals(nickName)) {
            //业务逻辑
//            System.out.println("我是旋涡鸣人");
            new MingRenHandler().renshu("旋涡鸣人");
        }else  if ("宇智波佐助".equals(nickName)){
            //业务逻辑
//            System.out.println("我是宇智波佐助");
            new ZuoZhuHandler().renshu("宇智波佐助");
        }else  if ("旗木卡卡西".equals(nickName)){
            //业务逻辑
            System.out.println("我是旗木卡卡西");
            System.out.println("雷切~~~~~~");
        }


        AbstractHandler invokeStrategy = Factory.getInvokeStrategy(nickName);
        invokeStrategy.renshu(nickName);
    }

    public static void extracted() {
        String nickName = "旋涡鸣人";
        AbstractHandler invokeStrategy = Factory.getInvokeStrategy(nickName);
        invokeStrategy.renshu(nickName);
    }
}
