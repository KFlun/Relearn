import sun.print.PSPrinterJob;

/**
 * Java类的初步练习
 * 功能描述：
 * (1)创建一个雇员类，包括雇员的ID、姓名、岗位、工龄、工作地点
 * (2)并且为雇员类添加动作：
 * 1、每天6点提交工作日志到上级邮箱
 * 2、添加变量赋值函数
 * (3)创建一个对象，并且为对象赋值，最后打印出对象的信息,最后提醒对象该提交工作日志了
 *
 * @author KFlun
 */
public class Exercise_11 {
    public static void main(String[] args){
        Employees littleDao = new Employees();
        littleDao.setID("15387695223");
        littleDao.setName("刀妍丹");
        littleDao.setPosition("兄弟会会长夫人");
        littleDao.setWorkDays("五年");
        littleDao.setWorkPlace("兄弟会");
        System.out.println("你的职员信息如下：");
        littleDao.print();
        littleDao.sendMessage();

        System.out.println("=========================第二个职员=========================");
        Employees noNameBoy = new Employees();
        noNameBoy.print();

        System.out.println("=========================第三个职员=========================");
        Employees boss = new Employees("15308144343","李卓伦","会长","5年","兄弟会");
        boss.print();
    }
}

class Employees{
    private String ID;
    private String name;
    private String position;
    private String workDays;
    private String workPlace;
    void sendMessage(){
        System.out.println("提醒事项："+name+",现在是下午6点，向上司提交工作日志！");
    }
    void setID(String ID){
        this.ID=ID;
    }
    void setName(String name){
        this.name=name;
    }
    void setPosition(String position){
        this.position=position;
    }
    void setWorkDays(String workDays){
        this.workDays=workDays;
    }
    void setWorkPlace(String workPlace){
        this.workPlace=workPlace;
    }
    void print(){
        System.out.println("ID："+ID);
        System.out.println("姓名："+name);
        System.out.println("地位："+position);
        System.out.println("工龄："+workDays);
        System.out.println("工作地点："+workPlace);
    }

    //依然是需要构造方法（构造函数）
    Employees (){
        ID="待录入";
        name="待录入";
        position="待录入";
        workDays="待录入";
        workPlace="待录入";
    }

    Employees(String ID,String name,String position,String workDays,String workPlace){
        this.ID=ID;
        this.name=name;
        this.position=position;
        this.workDays=workDays;
        this.workPlace=workPlace;
    }
}
