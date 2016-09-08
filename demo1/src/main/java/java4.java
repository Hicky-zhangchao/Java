import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/8.
 */
public class java4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入消费金额");
        int money =input.nextInt();

        System.out.println("是否参加优惠购换活动");
        System.out.println("1：满50元，加2元可乐一瓶,2:满100，加3块;3.满150，加10块;4.满200加十块;5.满200加20.0：不参加");
        System.out.println("请选择");
        int num =input.nextInt();

        System.out.println("你本次的消费总金额是："+  money+ 2 );
        if(money>50){
            switch (num){
                case 1:
                    System.out.println("你可以参加优惠换购");

                    break;
            }
        }
        else if(money>=100){
            switch (num){
                case 2:
                    System.out.println( "成功换区500ml可乐");

                    break;
            }
        }
        else if(money>150){
            switch (num){
                case 3:
                    System.out.println( "成功换取面粉");

                    break;
            }
        }
        else if(money>200){
            switch (num){
                case 4:
                    System.out.println( "换取炒菜锅");

                    break;
                default:
                    System.out.println( "成功换取爽肤水");
                    break;
            }
        }
        else{
            System.out.println( "没有参加活动");
        }
    }
}
