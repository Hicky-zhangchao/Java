import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/8.
 */
public class java5 {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        Scanner VIP =new Scanner(System.in);
        System.out.print("请输入消费金额(元)：");
        double number=money.nextDouble();
        System.out.println("请选择：（1）是会员 （2）不是会员");
        int vip=VIP.nextInt();
        if(vip==1) {
            if (number >= 200) {
                System.out.println("打折后的消费金额为：" + number * 0.75);
            }
            else if (number >= 100) {
                System.out.println("打折后的消费金额为：" + number * 0.80);
            }
            else {
                System.out.println("消费金额不足100元，不予以打折。消费金额为："+ number);
            }
        }
        else{
            if (number >= 100) {
                System.out.println("打折后的消费金额为：" + number * 0.90);
            }
            else {
                System.out.println("消费金额不足100元，不予以打折。消费金额为：" + number);
            }
        }

    }
}
