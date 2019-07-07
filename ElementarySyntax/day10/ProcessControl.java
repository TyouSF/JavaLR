public class ProcessControl
{
        public static void main(String[] args) {
                ScoreJudge();
                Draw();
                SumofEven();
                SumofAdd();
                Jump();
        }

        // if 语句练习
        public static void ScoreJudge(){
                int score = 78;
                if(score >= 60) {
                        if(score >= 80) {
                                if(score >= 90) {
                                        System.out.println("成绩优秀");
                                }
                                else{
                                        System.out.println("成绩良好");
                                }
                        }
                        else{
                                System.out.println("成绩及格");
                        }
                }
                else{
                        System.out.println("需要补考");
                }
        }

        // switch 语句练习
        public static void Draw(){
                int num = 2;
                switch(num) {
                case 1:
                        System.out.println("恭喜你，获得了一等奖");
                        break;
                case 2:
                        System.out.println("恭喜你，获得了二等奖");
                        break;
                case 3:
                        System.out.println("恭喜你，获得了三等奖");
                        break;
                default:
                        System.out.println("很遗憾，下次再来");
                }
        }

        // while 和 do-while 语句练习
        public static void SumofEven(){
                int i1 = 1, i2 = 1;
                int sum1 = 0, sum2 = 0;

                while (i1 <= 1000) { //循环1000次
                        if(0 == i1 % 2) { //判断是否为偶数
                                sum1 += i1; //将偶数加入到总数里
                        }
                        i1++;  //i自增1
                }
                System.out.println("用while，1到1000中，所有偶数的和为："+sum1);

                do {
                        if (0 == i2 % 2) { //在条件语句中，将数值写在前面是为了防止将==写成了=
                                sum2 += i2;
                        }
                        i2++;
                } while(i2 <= 1000);
                System.out.println("用do-while，1到1000中，所有偶数的和为："+sum2);
        }

        // for 语句练习
        public static void SumofAdd(){
                int sum = 0; // 保存不能被3整除的数之和
                // 循环变量 i 初始值为 1 ,每执行一次对变量加 1，只要小于等于 100 就重复执行循环
                for (int i = 1; i<=100; i++) {
                        // 变量 i 与 3 进行求模（取余），如果不等于 0 ，则表示不能被 3 整除
                        if (i % 3 != 0) {
                                sum = sum + i; // 累加求和
                        }
                }
                System.out.println("1到100之间不能被3整除的数之和为：" + sum);

                int sum1 = 0;
                for(int i = 1; i <= 1000; i++) {
                        if(0 == i % 2) {
                                sum1 += i;
                        }
                }
                System.out.println("用for，1到1000中，所有偶数和为："+sum1);
        }

        // break & continue 练习
        public static void Jump(){
                //break 练习
                for(int i = 1; i <= 10; i++) {
                        System.out.println("循环第"+i+"次");
                        if(0 == i % 3) {
                                break;
                        }
                        if(0 == i % 5) {
                                System.out.println("我进来了！");
                        }
                }
                //continue练习 打印10以内的所有奇数
                for(int i = 1; i <= 10; i++) {
                        if(0 == i % 2) //判断i是否为偶数
                                continue; //通过continue结束本次循环
                        System.out.println(i);
                }
        }
}
