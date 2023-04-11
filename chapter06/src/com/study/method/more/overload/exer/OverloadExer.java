package com.study.method.more.overload.exer;

/**
 * ClassName: OverloadExer
 * Package: com.study.method.more.overload.exer
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/11 10:30
 * @Version 1.0
 */
public class OverloadExer {
    //    练习2：
//    编写程序，定义三个重载方法并调用。方法名为mOL。
//    三个方法分别接收一个int参数、两个int参数、一个字符串参数。
//    分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
    public void mOL(int num) {
        System.out.println(num * num);
    }

    public void mOL(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public void mOL(String message) {
        System.out.println(message);
    }

    //    练习3：
//    定义三个重载方法max()：
//    第一个方法求两个int值中的最大值，
//    第二个方法求两个double值中的最大值，
//    第三个方法求三个double值中的最大值，并分别调用三个方法。
    public int max(int i, int j) {
        return (i >= j) ? i : j;
    }

    public double max(double d1, double d2) {
        return (d1 >= d2) ? d1 : d2;
    }

    public double max(double d1, double d2, double d3) {
//        double tempMax = max(d1,d2);
//        return max(tempMax,d3);

        return (max(d1, d2) > d3) ? max(d1, d2) : d3;
    }
}
