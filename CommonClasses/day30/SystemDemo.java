import java.util.Arrays;

public class SystemDemo
{
        public static void main(String[] args) {
                int[] a = {7, 8, 9, 10, 11};
                int[] b = {1, 2, 3, 4, 5, 6};
                //从数组a的第二个元素开始，复制到b数组的第三个位置 复制的元素长度为3
                System.arraycopy(a, 1, b, 2, 3);
                //输出结果
                System.out.println(Arrays.toString(b));
                System.out.println("当前时间：" + System.currentTimeMillis());
                System.out.println("java版本信息：" + System.getProperty("java.version"));
                //运行垃圾收集器
                System.gc();
                //退出
                System.exit(0);
        }
}
