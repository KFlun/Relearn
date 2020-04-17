/**
 * 静态初始化块/初始化块
 *
 * 1、初始化块的使用
 * 2、初始化块存在的意义
 *
 * @author KFlun
 */
public class Exercise_12 {
    public static void main(String[] args){
        Me me1 = new Me();
        Me me2 = new Me();
        Me.print();;
        me1.print();
        me2.print();
    }
}

class Me{
    static String name = "李卓伦";
    static{
        name = "李卓伦_静态初始化块";
        System.out.println("李卓伦_静态初始化块");
    }
    Me(){
        name = "李卓伦_构造器";
    }

    static void print(){
        System.out.println(name);
    }

}
