package cn.abs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {

    /**
     * 互不相同，无重复数字的组合
     * arg[0...(n-1)] 可用于组合的数
     * arg[n] 组合数的位数
     */
    public static void main(String[] args) {
        combine(null, new ArrayList<String>(Arrays.asList(args)), 1, 3);
    }

    public static void combine(StringBuffer stringBuffer, List<String> list, int count, int exceptCount) {
        for (int i = 0; i < list.size(); i++) {
            StringBuffer buffer = stringBuffer != null ? new StringBuffer(stringBuffer) : new StringBuffer();
            buffer.replace(count - 1, count, list.get(i));
            if (count == exceptCount) {
                System.out.println(buffer);
                continue;
            }
            combine(buffer, list.subList(i + 1, list.size()), count + 1, exceptCount);
        }
    }

}
