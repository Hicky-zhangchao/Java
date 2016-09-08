import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/8.
 */
public class java1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 从控制台输入
        int jf = sc.nextInt();

        System.out.println("请选择：（1）是会员 （2）不是会员");
        int vip = sc.nextInt();
        if (vip == 1) {
            if (jf < 2000) {
                System.out.println("0.9折");
            } else if (jf >= 2000 && jf < 4000) {
                System.out.println("0.8折");
            } else if (jf >= 4000 && jf < 8000) {
                System.out.println("0.7折");
            } else if (jf > 8000) {
                System.out.println("0.6折");
            }
            else{
                System.out.println("0.95折");
            }
        }
    }
}
