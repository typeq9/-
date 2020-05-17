package com.company.ty;

public class Main {

    public static void main(String[] args) {
        SingletonPattern.SingleObject zhe = SingletonPattern.SingleObject.getInstance();
        SingletonPattern.SingleObject zhe1 = SingletonPattern.SingleObject.getInstance();
        //显示消息
        if (zhe == zhe1){
            System.out.println("zhe 与 zhe1是同一个实例");
            zhe.showMessage();
        }
        else{
            System.out.println("zhe 与 zhe1不是同一个实例");
        }
        System.out.println("就这。");
    }
}
