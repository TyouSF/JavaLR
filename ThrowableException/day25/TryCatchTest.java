public class TryCatchTest {
        public static void main (String[] args) {
                TryCatchTest tct = new TryCatchTest();
                int result = tct.test();
                System.out.println("test() 方法执行完毕，返回值为：" + result);
                int result2 = tct.test2();
                System.out.println("test2() 方法执行完毕");
                int result3 = tct.test3();
                System.out.println("test3() 方法执行完毕，异常捕获之外返回结果确认，值为：" + result3);
        }

        /**
         * divider(除数)
         * result(结果)
         * try-catch 捕获 while 循环
         * 每次循环，divider 减1，result = result + 100/divider
         * 如果：捕获异常，打印输出“抛出异常了！”，返回 -1
         * 否则：返回 result
         */
        public int test() {
                int divider = 10;
                int result = 100;
                try {
                        while (divider>-1) {
                                divider--;
                                result = result + 100/divider;
                        }
                        return result;
                } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("循环抛出异常了");
                        return -1;
                }
        }

        /**
         * divider(除数)
         * result(结果)
         * try-catch 捕获 while 循环
         * 每次循环，divider 减1，result = result + 100/divider
         * 如果：捕获异常，打印输出“抛出异常了！”，返回 result = 999
         * 否则：返回 result
         * finally：打印输出“这是 finally 语句块儿！”，同时打印输出 result
         */
        public int test2() {
                int divider = 10;
                int result = 100;
                try {
                        while (divider>-1) {
                                divider--;
                                result = result + 100/divider;
                        }
                        return result;
                } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("循环抛出异常了");
                        return result = 999;
                } finally {
                        System.out.println("这是 finally 语句块儿");
                        System.out.println("result 的值为：" + result);
                }
        }

        /**
         * divider(除数)
         * result(结果)
         * try-catch 捕获 while 循环
         * 每次循环，divider 减1，result = result + 100/divider
         * 如果：捕获异常，打印输出“抛出异常了！”，返回 result = 999
         * 否则：返回 result
         * finally：打印输出“这是 finally 语句块儿！”，同时打印输出 result
         * finally 之外返回值 1000
         */
        public int test3() {
                int divider = 10;
                int result = 100;
                try {
                        while (divider>-1) {
                                divider--;
                                result = result + 100/divider;
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("循环抛出异常了");
                } finally {
                        System.out.println("这是 finally 语句块儿");
                        System.out.println("result 的值为：" + result);
                }
                System.out.println("异常捕获之外进行结果返回，确认我是执行的");
                return 1000;
        }
}
