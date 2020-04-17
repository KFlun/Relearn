
/**
 * 二进制，八进制，十六进制的表示
 * @author KFlun
 */

public class Exercise_5 {
    public static void main(String[] args){
        int a = 15;//正常表示十进制
        int b = 015;//以0开头，八进制
        int c = 0x15;//以0x开头，十六进制
        int d = 0b1101;//以0b开头，二进制

        System.out.println("十进制："+a);
        System.out.println("八进制："+b);
        System.out.println("十六进制："+c);
        System.out.println("二进制："+d);
    }
}
