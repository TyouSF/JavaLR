public class ThrowException {
        /**
         * test1():抛出自定义异常“喝大了”
         * test2():调用 test1()，并捕获异常，包装成运行时异常，继续抛出
         * main():调用 test2()，尝试捕获 test2() 抛出的异常
         */
        public static void main(String[] args) {
                ThrowException te = new ThrowException();
                try {
                        te.test2();
                } catch(Exception e) {
                        e.printStackTrace();
                }
        }

        public void test1() throws DrunkException {
                throw new DrunkException("喝酒别开车");
        }

        public void test2(){
                try {
                        test1();
                } catch (DrunkException e) {
                        // RuntimeException newEXC = new RuntimeException("道路千万条，安全第一条");
                        RuntimeException newEXC = new RuntimeException(e);
                        // newEXC.initCause(e);
                        throw newEXC;
                }
        }
}
