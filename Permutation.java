package cn.abs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Permutation {

    /**
     * 互不相同，无重复数字的组合
     * arg[0...(n-1)] 可用于组合的数
     * arg[n] 组合数的位数
     */
    public static void main(String[] args) {
        List<String> list = Arrays.stream(args).distinct().collect(Collectors.toList());
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer s1 = Integer.valueOf(o1);
                Integer s2 = Integer.valueOf(o2);
                return s1 < s2 ? -1 : s1 == s2 ? 0 : 1;
            }
        });
        arrange(null, list, 1, 3);
    }

    /**
     * @param stringBuilder 用于排列的拼接
     * @param list          排列数序列
     * @param level         目前位数
     * @param exceptedLevel 排列期待位数
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
