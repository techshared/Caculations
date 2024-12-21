package cn.abs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Consumer;

public class IPMessageHeader {

    /**
     * IP报文头
     * args[n]  IP报文头数据
     */
    public static void main(String[] args) {
        LinkedList<String> ipHeaderData = new LinkedList<>(Arrays.asList(args));
        if (20 != (ipHeaderData.size())) {
            throw new IllegalArgumentException("IP header is illegal size.");
        }
        ArrayList<String> tempList = new ArrayList<>();
        tempList.add(ipHeaderData.get(2));
        tempList.add(ipHeaderData.get(3));
        tempList.add(ipHeaderData.get(6));
        tempList.add(ipHeaderData.pollLast());
        tempList.add(ipHeaderData.pollLast());
        tempList.add(ipHeaderData.pollLast());
        tempList.add(ipHeaderData.pollLast());
        LinkedList<Integer> resultList = new LinkedList<>();
        tempList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                resultList.add(Integer.valueOf(Integer.toString(Integer.valueOf(s, 16), 10)));
            }
        });
        System.out.println((resultList.pollFirst() << 8) + resultList.pollFirst() + "," + (resultList.pollFirst() >> 5) + "," + resultList.pollLast() + "." + resultList.pollLast() + "." + resultList.pollLast() + "." + resultList.pollLast());
    }

}
