package fun.learnlife.myapplication;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class PerformanceAop {
    @Around("execution(* fun.learnlife.myapplication.PerformanceApp.**(..))")
    public void getTime(ProceedingJoinPoint joinPoint) {
        Signature signature=joinPoint.getSignature();
        long start = System.currentTimeMillis();
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Log.e("time_cost", signature.toShortString()+" cost:" + (System.currentTimeMillis() - start));
    }
    @Around("call(* fun.learnlife.myapplication.MainActivity.**(..))")
    public void getTime2(ProceedingJoinPoint joinPoint) {
        Signature signature=joinPoint.getSignature();
        long start = System.currentTimeMillis();
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Log.e("time_cost", signature.toShortString()+" cost2:" + (System.currentTimeMillis() - start));
    }
//    @Around("call(* fun.learnlife.myapplication.MainActivity.**(..))")
//    public void getTime(ProceedingJoinPoint joinPoint) {
//        Signature signature=joinPoint.getSignature();
//        long start = System.currentTimeMillis();
//        try {
//            joinPoint.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//        Log.e("time_cost", signature.toShortString()+" cost2:" + (System.currentTimeMillis() - start));
//    }
}
