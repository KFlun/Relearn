/**
 * 关于计算溢出
 * @author KFlun
 */
public class Exercise_7 {
    public static void main(String[] args){
        int a=200000;
        int b=200000;
        int c=a*b;
        System.out.println("发生溢出："+c);

        long d=a*b;
        System.out.println("仍然发生溢出："+d);//因为int c=a*b;表达式的右侧已经溢出

        d=a*(long)b;
        System.out.println("不再溢出："+d);
    }
}
