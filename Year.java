package cn.abs;

public class Year {

    /**
     * 求这一天是这一年的多少天
     * args[0] 年
     * args[1] 月
     * args[2] 日
     */
    public static void main(String[] args) {
        Integer month = Integer.valueOf(args[1]);
        int totalDate = 0;
        int div = Math.floorDiv(month, 2);
        int mod = Math.floorMod(month, 2) * div;
        totalDate = Integer.valueOf(args[2]) + (mod == 0 ? 0 : (mod - 1)) * 30 + div * 31;
        totalDate += (mod >= 2) ? (Integer.valueOf(args[0]) % 4 == 0) ? 29 : 28 : 0;
        System.out.println(totalDate);
    }

}
