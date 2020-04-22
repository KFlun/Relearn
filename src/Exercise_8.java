import java.util.Scanner;

/**
     * 名称：年薪计算器_version-1.0
     * 功能：
     * 1、输入月薪，领薪月数，计算输出年薪
     * 2、假如年薪超过20W，则再输出“你超过全国90%的人”，否则“你还需要继续努力”
     * 3、每次输出过后，选择“exit”退出程序，选择“next”计算下一个人
 *
 * =====================================================================================
 *
 * 思考:
 * 1、使用Scanner类获取输入，连续获取int类型和String类型数据时候，发生错误
 * 2、类中的方法是用static修饰好，还是不用好
 * 3、设计交互，始终有反应
 *
 * @author KFlun
 */

public class Exercise_8 {

    //static private Scanner sc = new Scanner(System.in);
    //使用Scanner类获取输入，连续获取int类型和String类型数据时候，发生错误

    public static void main(String[] args){
        Exercise_8 excersice_8 = new Exercise_8();
        boolean flag = true;
        while (flag){
            excersice_8.salaryCount();
            flag = excersice_8.ifContinue();
        }
    }

    //计算年薪
    public void salaryCount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的月薪：");
        int monthly_Salary = scanner.nextInt();

        System.out.println("请输入你的领薪月数：");
        int month = scanner.nextInt();

        int salary = monthly_Salary * month;
        System.out.println("你的年薪是：" + salary);

        if (salary>=200000)
            System.out.println("你超过了全国90%的人！");
        else
            System.out.println("你的年薪没有超过20W，你还需要继续努力！\n");
    }


    public boolean ifContinue(){
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        System.out.println("exit or continue?");
        String choose = scanner.nextLine();
        if (choose.equals("exit")){
            flag = false;
            System.out.println("退出程序");//注意交互的完整性
        }
        else{
            flag = true;
            System.out.println("输入新的数据.....");
        }

        return flag;
    }

}
