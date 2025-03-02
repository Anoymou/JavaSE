package com.itheima.d1_abstract_case;

public  class SilverCard extends Card{

    public SilverCard(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void pay(double money) {
        System.out.println("尊贵的银卡用户您好！您享受加油八折优惠！");
        System.out.println("您当前余额为："+getBalance()+"元");
        System.out.println("你本次加油优惠前价格为："+money+"元");
        System.out.println("你本次加油优惠后价格为："+money*0.85+"元");
        setBalance(getBalance()-money*0.85);
        System.out.println("支付后您的余额为："+getBalance()+"元");
        System.out.println("欢迎您的下次光临！");
    }
}
