package cn.abs;

import java.math.BigInteger;

public class Digit {

    /**
     * 位数转换
     * args[0]  被转换值
     * args[1]  源位数
     * args[2]  目标位数
     */
    public static void main(String[] args) {
        // from -2147483648 to 2147483647
        System.out.println(Integer.toString(Integer.parseInt(args[0], Integer.valueOf(args[1])), Integer.valueOf(args[2])));
        // from -9223372036854775808 to 9223372036854775807
        System.out.println(Long.toString(Long.parseLong(args[0], Integer.valueOf(args[1])), Integer.valueOf(args[2])));
        // Big Size
        System.out.println(new BigInteger(args[0], Integer.valueOf(args[1])).toString(Integer.valueOf(args[2])));
    }

}
