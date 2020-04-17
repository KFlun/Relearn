import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * 方法的重载
 * 什么构成方法的重载：
 * 相同类型，相同名，不同形参
 * 方法重载的意义：
 * 同样的方法名，进行不同的操作，但是这一类才做的作用是大致相同的
 * 例如：
 * 该例子中，add方法即“加”的意思，那么不管我传值是多少，大致的意思都是“加”
 *
 * @author KFlun
 */
public class Exercise_9 {
    public static int add(int a){
        return a+1;
    }

    public static int add(int a,int b){
        return a+b;
    }

    public static int add(int a,int b,int c){
        return a+b+c;
    }

    public static int add(double a){
        return (int)(a+0.35435);
    }


    public  static void main(String[] args){
        int a=0;
        int b=5;
        int c=8;
        double d=0.9;
        System.out.println(add(a));
        System.out.println(add(d));
        System.out.println(add(a,b));;
        System.out.println(add(a,b,c));;

    }
}
