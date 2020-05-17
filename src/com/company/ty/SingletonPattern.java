package com.company.ty;

/**
 * @description:
 * @author: tangyu
 * @date: Created in 2020/5/17 21:12
 * @version: 0.1
 * @modified By:tangyu
 */
public class SingletonPattern {
    //饿汉模式
    public static class SingleObject {
        //创建 SingleObject 的一个对象
        private static SingleObject instance = new SingleObject();
        //让构造函数为 private，这样该类就不会被实例化
        private SingleObject(){}
        //获取唯一可用的对象
        public static SingleObject getInstance(){
            return instance;
        }
        //将获取的对象输出 这里是将此对象作为唯一输出对象
        public void showMessage(){
            System.out.println("啊这");
        }
    }
}
