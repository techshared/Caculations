package cn.abs;

public class Year {

    /**
     * 求这一天是这一年的多少天
     * args[0] 年
     * args[1] 月
     * args[2] 日
     */
    public static void main(String[] args) throws InterruptedException {
        constantCalculate(args);
        calculate(args);
    }

    /**
     * Method 1 constant pool
     */
    public static void constantCalculate(String[] args) {
        int[] month_date = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        Integer year = Integer.valueOf(args[0]);
        if (year % 4 == 0) {
            month_date[2] = 29;
        }
        int totalDate = 0;
        for (int i = 0; i < Integer.valueOf(args[1]); i++) {
            totalDate += month_date[i];
        }
        System.out.println(totalDate + Integer.valueOf(args[2]));
    }

    /**
     * Method 2 variable definition
     */
    public static void calculate(String[] args) {
        Integer month = Integer.valueOf(args[1]);
        int odds = Math.floorDiv(month, 2);
        int evens = (Math.floorMod(month, 2) == 0) ? (odds - 1) : odds;
        int repEvent2OddCount = evens > 2 ? evens - 3 : 0;
        int repOdd2EventCount = odds > 3 ? odds - 4 : 0;
        System.out.println(Integer.valueOf(args[2]) + repOdd2EventCount * 30 + (odds - repOdd2EventCount) * 31 + ((evens >= 1 ? (Integer.valueOf(args[0]) % 4 == 0 ? 29 : 28) + repEvent2OddCount * 31 + (evens - 1 - repEvent2OddCount) * 30 : 0)));
    }

}
