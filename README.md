# Exercise_1  
如何进行精确的金融计算——BigDecimal类
**************************************************************************
# Exercise_2
if ; else if ; switch
**************************************************************************
# Exercise_3
数据类型转换
**************************************************************************
# Exercise_4
static 关键字与内存的联系
## 说明：
有static关键字修饰的变量和方法，在编译过程中就会分配内存，所以静态方法在调用的时候也不需要建立对象（实例）  
没有static关键字修饰的变量和方法，只有在建立对象的时候才会进行编译  
**另外：**  
当一个对象建立第二个实例的时候，及时是非静态方法，也不会再分配一次内存，建立对象的实质是建立了指向方法区的地址，同一个类的对象将会指向同一个方法区。
**************************************************************************
# Exercise_5
二进制、八进制、十六进制的表示
**************************************************************************
# Exercise_6
位运算符号
**************************************************************************
# Exercise_7
关于计算溢出的问题
**************************************************************************
# Exercise_8
名称：年薪计算器_version-1.0  
功能：  
1、输入月薪，领薪月数，计算输出年薪  
2、假如年薪超过20W，则再输出“你超过全国90%的人”，否则“你还需要继续努力”  
3、每次输出过后，选择“exit”退出程序，选择“next”计算下一个人  
## 说明：
1、用Scanner获取输入流的时候，注意缓存区中上一次调用Scanner对象获取的内容还未清除，可能造成输入错误。  
2、一个问题：类中的方法是用static修饰好，还是不用好？
***************************************************************************
# Exercise_9
方法的重载
***************************************************************************
# Exercise_10
展示递归爆栈
***************************************************************************
# Exercise_11
Java类的初步练习  
功能描述：  
1.创建一个雇员类，包括雇员的ID、姓名、岗位、工龄、工作地点  
2.并且为雇员类添加动作：  
(1)每天6点提交工作日志到上级邮箱  
(2)添加变量赋值函数  
3.创建一个对象，并且为对象赋值，最后打印出对象的信息,最后提醒对象该提交工作日志了  
***************************************************************************
# Exercise_12
初始化块
一个问题：初始化块存在的意义是什么
***************************************************************************
# AnimalVersion1_0
java类的进一步练习
java继承、方法重写、final关键字、组合、super关键字  
1、父类动物  
2、远古动物&emsp&emsp现代动物  
3、都是由细胞组成  
## 说明
1、继承  
（1）子类会继承父类 **除构造方法** 外的所有变量和方法，但是继承了不一定代表可以直接使用（例如：Private修饰的方法或成员变量）  
（2）final关键字可修饰方法，成员变量，类。对于方法和成员变量来说，即不可修改；对于类来说，就是不可再产生子类。  
2、super关键字  
子类通过super关键字可以调用父类的构造方法， **（即使不使用super关键字，子类也会依次向上调用父类的无参构造方法）** 。子类在调用无参的构造方法的时候，不能直接调用到父类的父类的构造方法，只能通过直接父类，一步一步向上调用。  

```
class Animal {
    private String name;
    private String diets;
    private String sex;
    private int life;
    Cells cells = new Cells();  //组合

    Animal() {
    }

    Animal(String name, String diets, String sex, int life) {
        this.name = name;
        this.diets = diets;
        this.sex = sex;
        this.life = life;
    }  
}
    
    class ModernAnimal extends Animal {
    ModernAnimal(String name, String diets, String sex, int life){
        super(name, diets, sex, life);
    }
}  

class FlyingAnimal extends ModernAnimal {
    private int flyHeight;
    FlyingAnimal(String name, String diets, String sex, int life,int flyHeight) {//通过super调用父类的构造函数
        super(name, diets, sex, life);
        this.flyHeight = flyHeight;
    }
}
```
在以上的例子中，继承关系为：**Animal--->ModernAnimal--->FlyingAnimal** 。FlyingAnimal在进行构造函数的调用时，只能通过super语句调用ModernAnimal的构造方法，ModernAnimal在向上调用Animal的构造方法。
```
 FlyingAnimal(String name, String diets, String sex, int life,int flyHeight) {//通过super调用父类的构造函数
        super(name, diets, sex, life);
        this.flyHeight = flyHeight;
    }  
    
 ModernAnimal(String name, String diets, String sex, int life){
        super(name, diets, sex, life);
    }  
    
 Animal(String name, String diets, String sex, int life) {
        this.name = name;
        this.diets = diets;
        this.sex = sex;
        this.life = life;
     }      
```
