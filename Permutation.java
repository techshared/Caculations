package cn.abs;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {

    /**
     * 互不相同，无重复数字的排列
     * arg[0...(n-1)] 可用于排列的数
     * arg[n] 排列数的位数
     */
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException {
        arrange(null, new ArrayList<String>(Arrays.asList(args)), 1, 3);
    }

    public static void arrange(StringBuffer stringBuffer, ArrayList<String> list, int count, int exceptCount) {
        for (int i = 0; i < list.size(); i++) {
            StringBuffer buffer = stringBuffer != null ? new StringBuffer(stringBuffer) : new StringBuffer();
            buffer.replace(count - 1, count, list.get(i));
            if (count == exceptCount) {
                System.out.println(buffer);
                continue;
            }
            ArrayList<String> arrayList = new ArrayList<>(list);
            arrayList.remove(i);
            arrange(buffer, arrayList, count + 1, exceptCount);
        }
    }

}
