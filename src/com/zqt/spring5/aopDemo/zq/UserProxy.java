package com.zqt.spring5.aopDemo.zq;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
public class UserProxy {
    @Pointcut(value = "execution(* com.zqt.spring5.aopDemo.beizq.User.add(..))")
    public  void  pointcut(){

    }
    @Before(value ="pointcut()" )
    public  void before(){
        System.out.println("before......");
    }
    @AfterReturning(value = "pointcut()")
    public void aberration(){
        System.out.println("AfterReturning....");
    }
    @After(value = "pointcut()")
    public void after(){
        System.out.println("after....");
    }
    @AfterThrowing(value = "pointcut()")
    public void afterglow(){
        System.out.println("AfterThrowing....");
    }
    @Around(value = "pointcut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object target = proceedingJoinPoint.getTarget().getClass().getName();

        System.out.println("调用者+"+target);
//通过joinPoint.getArgs()获取Args参数
        Object[] args = proceedingJoinPoint.getArgs();//2.传参
        System.out.println("2.传参:----"+args[0]);
        for (Object object : args) {
            System.out.println(object instanceof HttpServletRequest);
        }

        return proceedingJoinPoint.proceed();
    }
}