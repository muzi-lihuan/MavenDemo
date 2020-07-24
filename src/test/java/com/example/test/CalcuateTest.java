package com.example.test;


import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class CalcuateTest {

    Calcuate calcuate; // 全局变量
    @Before // 每次测试都执行一次 ，一般用于初始化
    public void setUp () {
        calcuate = new Calcuate();
    }

    @Test
    public void mul() {
        fail("not yet implemented");
    }

    @Test(expected = ArithmeticException.class) // 表示这个方法一定会抛出某个异常；如果没有抛出该异常则测试失败
    public void div() {
        int result = calcuate.div(6, 0);
    }

    @Test(timeout = 3000) // 表示这个方法执行的超时时间，单位毫秒；如果这个方法在规定时内还没结果，则测试失败。
    public void testTimeout () {
        while (true) {
            try {
                Thread.sleep(500);
                break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void add() {
        int result = calcuate.add(2, 3);
        //通过断言assertEquals看上面得到的结果是不是期望的结果
        assertEquals(6,result);
    }

    @Test
    public void sub() {
        fail("not yet implemented"); // 测试失败的函数
    }

    @Test
    @Ignore
    public void testIgnore () {
        System.out.println("我会被忽略，不会执行");
    }
}
