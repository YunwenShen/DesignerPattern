package com.cucci.proxy;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 地产开发商
 *
 * @author shenyw
 **/
public class HouseFactory {

    public static void main(String[] args) {
        Customer customer = new Customer();
        // 普通代理
        System.out.println("普通代理-开始");
        Proxy proxy = new Proxy(customer);
        proxy.buy();
        System.out.println("普通代理-结束");
        System.out.println();
        System.out.println("JDK动态代理-开始");
        // JDK动态代理
        BuyHouse jdkProxy = (BuyHouse) java.lang.reflect.Proxy.newProxyInstance(customer.getClass().getClassLoader(), new Class[]{BuyHouse.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("buy")) {
                    System.out.println("客户你好，请你付钱");
                    Object invoke = method.invoke(customer, args);
                    System.out.println("买房成功，这是你的房产证");
                    return invoke;
                }
                return method.invoke(customer, args);
            }
        });
        jdkProxy.buy();
        System.out.println("JDK动态代理-结束");
        System.out.println();
        System.out.println("CGLIB动态代理-开始");
        // cglib代理
        MethodInterceptor methodInterceptor = new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("客户你好，请你付钱");
                methodProxy.invokeSuper(o, objects);
                System.out.println("买房成功，这是你的房产证");
                return null;
            }
        };
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "C:\\WorkPlatform\\project\\JavaProject\\DesignerPattern\\src\\com\\cucci\\proxy");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(customer.getClass());
        enhancer.setCallback(methodInterceptor);
        Customer cglibProxy = (Customer) enhancer.create();
        cglibProxy.buy();
        System.out.println("CGLIB动态代理-结束");
    }
}
