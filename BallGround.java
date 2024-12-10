package cn.abs;

public class BallGround {

    public static void main(String[] args) {

        // 求第n次的反弹与共经过的距离
        /**
         * arg[0] 初始高度
         * arg[1] 反弹高度比
         * arg[2] 反弹的次数
         */
        Double height = Double.valueOf(args[0]);
        Double rate = Double.valueOf(args[1]);
        Integer count = Integer.valueOf(args[2]);
        Double sum = Double.valueOf(0);
        for (int i = 0; i < count; i++) {
            height = height * rate;
            sum += height;
        }
        System.out.println("高度是：" + height);
        System.out.println("总经过的距离是：" + sum);
    }

}
