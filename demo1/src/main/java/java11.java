/**
 * Created by Administrator on 2016/9/8.
 */
public class java11 {
    public static void main(String[] args) {
        int i = 1;
        int h = 0;
        for (; i < 100001; i++) {

            if (i % 13 == 0 && i % 15 == 0) {
                h = h + i;
            }
        }
        System.out.println(h);
    }

}

