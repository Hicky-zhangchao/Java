import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/8.
 */
public class java7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入名次");
        int mc = input.nextInt();
        switch(mc) {
            case 1:
                System.out.println("夏令营");
                break;
            case 2:
                System.out.println("笔记本电脑");
                break;
            case 3:
                System.out.println("硬盘");
                break;
            default:
                System.out.println("没有奖励");
        }
        System.out.println("奖励是："+mc);
    }
}

