public class ArrayTest
{
        public static void main(String[] args) {
                Test();
                JudePrime();
                DoubleDimensionArray();
        }

        // 数据练习
        public static void Test(){
                int [] a1 = {1,2,3};
                int [] a2;
                // 将一个数组赋值给另一个数组
                // 这里只是复制了一个引用，即 a2 和 a1 是相同数组的不同名称
                a2 = a1;
                for(int i = 0; i < a2.length; i++) {
                        a2[i]++;
                }
                for(int i = 0; i < a1.length; i++) {
                        System.out.println(a1[i]);
                }

                // 数据遍历
                int [] ages = {12, 18, 9, 33, 45, 60};
                for(int i = 0; i < ages.length; i++) { //ages.length是获取数组的长度
                        System.out.println("数组中第"+(i+1)+"个元素是 "+ages[i]); //数组下标是从零开始，一定要注意
                }
        }

        // for 的快速遍历形式
        public static void JudePrime(){
                int [] ages = {12, 18, 9, 33, 45, 60};
                int i = 1;
                for(int age:ages) {
                        System.out.println("数组中第"+i+"个元素是"+age);
                        i++;
                }
        }

        // 二维数组练习
        public static void DoubleDimensionArray(){
                String[][] name = {{"ZhaoYi", "QianEr", "SunSan"},
                                   {"LiSi", "ZhouWu", "WuLiu"}};
                for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 3; j++) {
                                System.out.println(name[i][j]);
                        }
                }
        }

}
