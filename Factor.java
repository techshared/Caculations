package cn.abs;

public class Factor {

    public static void main(String[] args) {

        /**
         * 求完数
         * arg[0] 范围
         */
        long s = System.nanoTime();
        Integer n = Integer.valueOf(args[0]);
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                System.out.println(i);
            }
        }
        long e = System.nanoTime();
        System.out.println(e - s + "ns");

        long st = System.nanoTime();
        Integer num = Integer.valueOf(args[0]);
        for (int m = 1; m <= num; m++) {
            int sum = 0;
            for (int p = 1; p < m; p++) {
                if (Math.floorMod(m, p) == 0) {
                    sum += p;
                }
            }
            if (m == sum) {
                System.out.println(m);
            }
        }
        long et = System.nanoTime();
        System.out.println(et - st + "ns");

    }

//    divisor iterator example
//    public static void main(String[] args) {
//        Integer num = Integer.valueOf(args[0]);
//        for (int i = 1; i <= num; i++) {
//            ArrayList<Integer> factors = new ArrayList<>();
//            int temp = i;
//            for (int j = 1; j <= temp && j < 10; ) {
//                if (Math.floorMod(temp, j) != 0) {
//                    j++;
//                    if (j == 9) {
//                        factors.add(temp);
//                    }
//                    continue;
//                }
//                factors.add(j);
//                temp = Math.floorDiv(temp, j);
//                if (temp == 1) break;
//                j = j == 1 ? ++j : j;
//            }
//            HashSet<Integer> distinctFactors = new HashSet<>();
//            for (int k = 0; k < factors.size(); k++) {
//                Integer factor = factors.get(k);
//                if (k < factors.size() - 1) {
//                    for (int m = 0; m < factors.size(); m++) {
//                        if (m != k) {
//                            int compositeFactor = Math.multiplyExact(factor, factors.get(m));
//                            if (compositeFactor != i) {
//                                distinctFactors.add(compositeFactor);
//                            }
//                        }
//                    }
//                }
//                distinctFactors.add(factor);
//            }
//            int newSize = 0;
//            int t = distinctFactors.size();
//            while (newSize != t) {
//                t = newSize;
//                distinctFactors = regression(distinctFactors, i);
//                newSize = distinctFactors.size();
//            }
//            HashSet<Integer> distinctFactorsSet = new HashSet<>();
//            for (int q = 0; q < distinctFactors.size(); q++) {
//                Iterator<Integer> iterator = distinctFactors.iterator();
//                while (iterator.hasNext()){
//                    Integer next = iterator.next();
//                    if (Math.floorMod(i, next) == 0){
//                        distinctFactorsSet.add(next);
//                    }
//                }
//            }
//            Stream<Integer> factorStream = distinctFactorsSet.stream();
//            final int[] sum = {0};
//            factorStream.forEach(new Consumer<Integer>() {
//                @Override
//                public void accept(Integer integer) {
//                    sum[0] += integer;
//                }
//            });
//            if (sum[0] == i) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static HashSet<Integer> regression(HashSet<Integer> distinctFactors, int max) {
//        HashSet<Integer> distinctFactorsSet = new HashSet<>();
//        Object[] distinctFactorsArray = distinctFactors.toArray();
//        List<Object> list = Arrays.asList(distinctFactorsArray);
//        for (int n = 0; n < distinctFactorsArray.length; n++) {
//            int di = (int) list.get(n);
//            if (n < distinctFactorsArray.length - 1) {
//                for (int p = 0; p < distinctFactorsArray.length; p++) {
//                    if (n != p) {
//                        int compositeFactor = Math.multiplyExact(di, (int) list.get(p));
//                        if (compositeFactor < max) {
//                            distinctFactorsSet.add(compositeFactor);
//                        }
//                    }
//                }
//            }
//            distinctFactorsSet.add(di);
//        }
//        return distinctFactorsSet;
//    }

}
