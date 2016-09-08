import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/8.
 */
public class java6 {
    public static void main(String[] args) {
        Scanner money = new Scanner (System.in);
        Scanner VIP =new Scanner(System.in);
        Scanner integral =new Scanner(System.in);
        System.out.print("请输入购买商品的价格(元)：");
        double number=money.nextDouble();
        System.out.println("请选择：（1）会员 （2）不是会员");
        int vip=VIP.nextInt();
        if(vip==1) {
            System.out.print("请输入会员积分：");
            int index =integral.nextInt();
            if (index>=8000) {
                System.out.println("您所购买的商品打6折，折扣后的商品价格为：" + number * 0.60);
            }
            else if (index>=4000) {
                System.out.println("您所购买的商品打7折，折扣后的商品价格为：" + number * 0.70);
            }
            else if (index>=2000) {
                System.out.println("您所购买的商品打8折，折扣后的商品价格为：" + number * 0.80);
            }
            else {
                System.out.println("您所购买的商品打9折，折扣后的商品价格为：" + number * 0.90);
            }
        }
        else{
            System.out.println("您所购买的商品打9.5折，折扣后的商品价格为：" + number * 0.95);
        }

    }
}
