package cn.abs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Combination {

    /**
     * 互不相同，无重复数字的排列
     * arg[0...(n-1)] 可用于排列的数
     * arg[n] 排列数的位数
     */
    public static void main(String[] args) {
        combine(null, Arrays.stream(args).distinct().collect(Collectors.toList()), 1, 3);
    }

    /**
     * @param stringBuilder 用于组合的拼接
     * @param list          组合数序列
     * @param level         目前位数
     * @param exceptedLevel 组合期待位数
     */
    public static void combine(StringBuilder stringBuilder, List<String> list, int level, int exceptedLevel) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder builder = stringBuilder != null ? new StringBuilder(stringBuilder) : new StringBuilder();
            builder.replace(level - 1, level, list.get(i));
            if (level == exceptedLevel) {
                System.out.println(builder);
                continue;
            }
            ArrayList<String> arrayList = new ArrayList<>(list);
            arrayList.remove(i);
            combine(builder, arrayList, level + 1, exceptedLevel);
        }
    }

}
