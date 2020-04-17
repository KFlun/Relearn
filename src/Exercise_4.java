
/**
 * 该练习关于Java的变量分类和一部分内存分配的知识
 * @author KFLun
 */

public class Exercise_4 {
    static int memberTest=20;//静态成员变量，只进行一次内存分配
    int memberTest1;//实例成员变量，每次实例化对象的是时候都要分配一次内存，有几个实例就分配几次内存

    int t=3;

    int T=t*memberTest;
    int T1=t*memberTest1;//不管是静态成员变量还是实例成员变量都可以直接在方法外使用

    public static void main(String[] args){
        System.out.println(memberTest);
        //System.out.println(memberTest1);
        /*在静态main方法中，只能访问自身所处类中的静态成员变量，不能访问实例成员变量
        其根本原因：只有静态成员变量才会随着类的定义而被分配和字啊如内存中*/
    }
}
