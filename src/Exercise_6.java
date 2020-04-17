/**
 * 位运算符
 * @author KFlun
 */

public class Exercise_6 {
    public static void main(String[] args){
        int a=3;
        int b=12;
        System.out.println("左移一位："+(3<<1));//左移一位，相当于×2
        System.out.println("右移一位："+(b>>1));//右移一位，相当于÷2
        System.out.println("按位取反："+(~3));//按位取反
        System.out.println("与运算符："+(a&b));//与运算符
        System.out.println("或运算符："+(a|b));//或运算符
        System.out.println("异或运算符："+(a^b));//异或运算符
    }
}
