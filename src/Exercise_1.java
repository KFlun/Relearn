import java.math.*;

/**
 * 浮点型测试，关于金融计算
 * @author KFlun
 */

public class Exercise_1 {
    public static void main(String[] args) {
        //float c = 3.14; //报错，默认应为double型
        float c = 3.14F;
        double d = 6.28;
        double e = 628e-2;
        double f = 628e2;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        System.out.println("#############################################");
        //在java中浮点数值不适于禁止出现舍入误差的金融计算中。例如上述：2.0-1.1。其只要原因是浮点数采用二进制系统表示，而在二进制系统中无法精确的表示分户1/10。这就像十进制无法精确地表示1/3一样。如果需要在数值计算中不含有任何舍入误差，就应该使用BigDecimal类。
        //在java中变量的声明一般靠近变量第一次使用的地方
        double a=2.0;
        double b=1.1;
        System.out.println(a-b);

        /*在java类型中进行金融计算的时候，用math包中的BigInteger和BigDecimal
        BigInteger实现任意精度整数运算，BigDecimal实现任意精度浮点运算*/
        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd);
        System.out.println(1.0-0.1-0.1-0.1-0.1);

        BigDecimal bd2 = BigDecimal.valueOf(0.1);
        BigDecimal bd3 = BigDecimal.valueOf(1.0/10.0);
        System.out.println(bd2.equals(bd3));

        //1/10和1.0/10.0不同
        BigDecimal bd4 = BigDecimal.valueOf(1/10);
        System.out.println(bd3);
        System.out.println(bd4);//int型

    }
}
