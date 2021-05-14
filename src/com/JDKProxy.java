package com;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*使用proxy来创建接口代理对象*/
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces={UserDemo.class};
        UserDemo userDemo = (UserDemo) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,new UserDaoProxy(new UserDdemo()));
        int result = userDemo.add(1,2);
/*        System.out.println(result+userDemo.update("张三"));*/
    }
}
class  UserDaoProxy implements InvocationHandler {

    private  Object obj;

    public UserDaoProxy(Object obj) {
        this.obj=obj;
    }

    /*增强逻辑*/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("增强方法执行前"+method.getName()+".....");

        Object result = method.invoke(obj,args);

        System.out.println("增强方法执行后");
        return result;
    }
}