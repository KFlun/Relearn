import java.awt.datatransfer.StringSelection;

/**
 * java继承、方法重写、final关键字、组合、super关键字
 *
 * 1、父类动物
 * 2、远古动物  现代动物
 * 3、都是由细胞组成
 *
 * @author KFlun
 * @version 1.0
 */
public class AnimalVersion1_0 {
    public static void main(String[] args) {
        FlyingAnimal eagle = new FlyingAnimal("小鹰","食肉","女",10,3000);//用super调用父类的构造函数
        eagle.fly();
        eagle.eat();
        //ModernAnimal modernAnimal = new ModernAnimal("小鹰","食肉","女",10);
    }
}

class Cells {
    private String function;

    public void setFunction(String function) {
        this.function = function;
    }
}

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


    void setName(String name) {
        this.name = name;
    }
    void setDiets(String diets) {
        this.diets = diets;
    }
    void setSex(String sex) {
        this.sex = sex;
    }
    void setLife(int life) {
        this.life = life;
    }

    void eat() {
        System.out.println("进食！");
    }

    void breeding() {
        System.out.println("繁殖！");
    }

    void evolution() {
        System.out.println("进化！");
    }
}

final class Paleontology extends Animal {  //继承，final关键字，不可继承类
    void evolution() {
        System.out.println("我们已经灭绝了，不能继续进化了。");
    }
}

class ModernAnimal extends Animal {

    ModernAnimal(String name, String diets, String sex, int life){
        super(name, diets, sex, life);
    }

    void evolution() {  //重写
        System.out.println("坚强地活了下来！");
    }
}

class FlyingAnimal extends ModernAnimal {

    private int flyHeight;
    FlyingAnimal(String name, String diets, String sex, int life,int flyHeight) {//通过super调用父类的构造函数
        super(name, diets, sex, life);
        this.flyHeight = flyHeight;
    }

    void setFlyHeight() {
        this.flyHeight = flyHeight;
    }

    void fly() {
        System.out.println("我会飞！");
    }
}