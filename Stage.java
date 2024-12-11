package cn.abs;

public class Stage {

    /**
     * 求阶梯奖金总数
     * args[0] 利润
     */
    public static void main(String[] args) {
        System.out.println(calculate(Double.valueOf(args[0])));
    }

    public static double calculate(double num) {
        double result = 0;
        if (num > 1000000) {
            result += (num - 1000000) * 0.001;
            num = 1000000;
        }
        if (num > 600000) {
            result += (num - 600000) * 0.0015;
            num = 600000;
        }
        if (num > 400000) {
            result += (num - 400000) * 0.003;
            num = 400000;
        }
        if (num > 200000) {
            result += (num - 200000) * 0.005;
            num = 200000;
        }
        if (num > 100000) {
            result += (num - 100000) * 0.0075;
            num = 100000;
        }
        result += num * 0.01;
        return result;
    }
}
