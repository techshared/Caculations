package cn.abs;

import java.math.BigInteger;

public class AddMultiplyPow {

    public static void main(String[] args) {

        /**
         * 求 s = a + aa + aaa + aaaa + aa...a 的值
         * arg[0] a
         * arg[1] 加数个数
         */

        int baseLength = args[0].startsWith("-") ? args[0].length() - 1 : args[0].length();
        int exponentLength = args[1].startsWith("-") ? args[1].length() -1 : args[1].length();
        if (baseLength + exponentLength > 2) {
            Long base = Long.valueOf(args[0]);
            Long size = Long.valueOf(args[1]);
            BigInteger bigBase = BigInteger.valueOf(base);
            BigInteger sum = BigInteger.valueOf(0);
            for (int i = 0; i < size; i++) {
                sum = sum.add(bigBase.multiply(BigInteger.valueOf((long) Math.pow(10, i))));
            }
            System.out.println("结果是： " + sum);
        } else {
            Integer base = Integer.valueOf(args[0]);
            Integer size = Integer.valueOf(args[1]);
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum = Math.addExact(sum, Math.multiplyExact(base, (int) Math.pow(10, i)));
            }
            System.out.println("结果是： " + sum);
        }
    }

}
