import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/8.
 */
public class java3 {
    public static void main(String[] args){
        Scanner as = new Scanner(System.in);
        System.out.println("y合格，n不合格(y/n):");
        String answer = as.next();
        while(!"y".equals(answer)){
            System.out.println("不行,继续练");
            System.out.println("上午理论，下午实践");

            answer=as.next();
        }
        System.out.println("很好");
    }
}

