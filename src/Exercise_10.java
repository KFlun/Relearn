/**
 * 展示递归爆栈
 *
 * @author KFlun
 */
public class Exercise_10 {
    static int i=0;
    public static void stackOver(){
        System.out.println(i);
        i++;
        stackOver();
    }
    public static void main(String[] args){
        stackOver();
    }
}
