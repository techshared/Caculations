package cn.abs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {

    /**
     * 互不相同，无重复数字的组合
     * arg[0...(n-1)] 可用于组合的数
     * arg[n] 组合数的位数
     */
    public static void main(String[] args) {
        arrange(null, new ArrayList<String>(Arrays.asList(args)), 1, 3);
    }

    /**
     * @param stringBuilder 用于组合的拼接
     * @param list          组合数序列
     * @param level         目前位数
     * @param exceptedLevel 组合期待位数
     */
    public static void arrange(StringBuilder stringBuilder, List<String> list, int level, int exceptedLevel) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder builder = stringBuilder != null ? new StringBuilder(stringBuilder) : new StringBuilder();
            builder.replace(level - 1, level, list.get(i));
            if (level == exceptedLevel) {
                System.out.println(builder);
                continue;
            }
            arrange(builder, list.subList(i + 1, list.size()), level + 1, exceptedLevel);
        }
    }

}
