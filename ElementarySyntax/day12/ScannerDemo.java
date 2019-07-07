import java.util.Scanner;

public class ScannerDemo
{
        public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
                //获取用户输入的一行数据  返回为字符串
                String s = in.nextLine();
                System.out.println(s);
                //返回用户输入的int值
                int i = in.nextInt();
                System.out.println(i);
                //循环读取int数据，当输入exit时退出循环
                while (!in.hasNext("exit")) {
                        System.out.println(in.nextInt());
                }
                //关闭输入
                in.close();
        }
}
