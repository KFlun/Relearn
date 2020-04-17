/**
 * 类型转换
 * @author KFlun
 */

public class Exercise_3 {
    public static void main(String[] args){
        int a1=123456789;
        float b1=a1;
        double c1=a1;
        System.out.println(a1+","+b1+","+c1);
        //数值的转换中有九个合法转换，由容量小的转化为容量大的，叫做自动类型转换
        // 其中6个无信息丢失，3个可能有信息丢失

        //必要的时候也会进行强制数值转换（语法同C++）
        double a2=3.9446546;
        int b2=(int)a2;
        System.out.print(a2+","+b2+",");
        //假如要进行四舍五入，取最接近的整数,有Math.round()方法
        int c2=(int)Math.round(a2);
        System.out.println(c2);
    }
}
