package java1702.javase.oop;

/**
 * Created by zhoumeng on
 * 2017/4/1.
 * 8:59.
 */
public class Human {
    private String name;
    private char gender;
    private int age;
    private double height;
    private double weight;

    // constructor

    // void adj.\ 空的；无效的；无人的

    public String study(int studyTime) {
        System.out.println(name + "学习了" + studyTime + "小时。");
        return "全部练习";
    }
    public void work(boolean b) {
        if (b) {
            //...
            return;
        }
        //...
        //...
        //...
        //...
        //...
        //...
        if (b) {

        } else {
        }
    }
    public void eat(String foods,double amount) {
        System.out.println(name + "吃了" + amount + foods );

    }
    public int sleep(boolean isPlayGame) {
        return isPlayGame ? 1 : 8 ;
    }
}
