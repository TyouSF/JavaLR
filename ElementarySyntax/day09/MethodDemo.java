public class MethodDemo
{
        public static void main(String[] args) {
                // 通过 main 方法（mian 方法是 Java 程序的入口，所以需要用它来调用）来调用 method
                method();
        }
        // 这里要加上static关键字 应为静态方法只能调用静态方法
        public static void method(){
                System.out.println("方法调用");
        }
}
