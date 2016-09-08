/**
 * Created by Administrator on 2016/9/8.
 */
public class java8 {
    public static void main(String[] args){


            int sum=2;//1既不是质数2是质数
            int i,j;
            for(i=3;i<10000;i++)
            {
                for(j=2;j<i;j++)
                {
                    if(i%j==0)
                        break;

                }
                if(j==i)
                    sum=sum+i;
            }
            System.out.println(sum);
        }

}
