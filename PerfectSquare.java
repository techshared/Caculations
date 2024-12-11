package cn.abs;

import java.util.ArrayList;
import java.util.List;

public class PerfectSquare {

    /**
     * 求完全平方数
     * args[0] 查找完全平方数的范围
     * args[1...n] 叠加条件数组，叠加每一个数后都要达成完全平方数 || 相加条件数组，相加每一个数后都要达成完全平方数
     */
    public static void main(String[] args) {
        ArrayList<Integer> addendList = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            addendList.add(Integer.valueOf(args[i]));
        }
        searchPerfectSquare(Integer.valueOf(args[0]), addendList, 0);
    }

    public static void searchPerfectSquare(int range, List<Integer> addendList, int currentCount) {
        for (int i = 0; i < range; i++) {
            // composition
//            perfectSquare(i, addendList, currentCount);
            // singleAddend
            perfectSquareSingleAddend(i, addendList);
        }
    }

    public static void perfectSquare(int value, List<Integer> addendList, int currentCount) {
        if (currentCount == addendList.size()) {
            System.out.println(value);
        } else {
            int num = value + addendList.get(currentCount);
            double sqrt = Math.sqrt(num);
            if ((sqrt - Math.floor(sqrt)) == 0) {
                perfectSquare(num, addendList, ++currentCount);
            }
        }
    }

    public static void perfectSquareSingleAddend(int value, List<Integer> addendList) {
        for (int i = 0; i < addendList.size(); i++) {
            int num = value + addendList.get(i);
            double sqrt = Math.sqrt(num);
            if ((sqrt - Math.floor(sqrt)) == 0) {
                if (i != addendList.size() - 1) {
                    continue;
                } else {
                    System.out.println(num);
                }
            }
            break;
        }
    }

}
