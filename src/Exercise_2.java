import java.util.Scanner;//Scanner 需要导入该Java包

/**
 * if elseif elseif else 多重选择结构
 * switch 语句
 * @author KFlun
 */


public class Exercise_2 {
    public static void main(String[] args){

//        int a=1;
//        if(a=0){
//
//        }
        //在C++中，数值或指针可以代替boolean值。整数0相当于布尔值false，非0值相当于布尔值true。上述if判断，在C++中可以通过编译，且结果总是false，但是在java中，不能通过编译，因为整数表达式x=0不能转换为布尔值

        Scanner sc=new Scanner(System.in);
        double cj=sc.nextDouble();
        if (cj >= 90) {
            System.out.println("优");
        } else if (cj >= 80){
            System.out.println("良");
        } else if (cj >= 70) {
            System.out.println("中");
        } else if (cj >=60){
            System.out.println("及格");
        } else{
            System.out.println("不及格");
        }
        //if 、 else if 、 else的运用

//        switch (Integer.parseInt(String.valueOf(cj/10))){
//            case 9:
//                System.out.println("优");
//                break;
//            case 8:
//                System.out.println("良");
//                break;
//            case 7:
//                System.out.println("中");
//                break;
//            case 6:
//                System.out.println("及格");
//                break;
//            default:
//                System.out.println("xxx");
//        }
        //switch ()的运用
    }
}
