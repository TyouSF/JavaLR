public class Test
{
        void f(int i) {
                System.out.println("i=" + i);
        }

        void f(float f) {
                System.out.println("f=" + f);
        }

        void f(String s) {
                System.out.println("s=" + s);
        }

        void f(String s1, String s2){
                System.out.println("s1+s2="+(s1+s2));
        }

        void f(String s, int i){
                System.out.println("s="+s+",i="+i);
        }

        public static void main(String[] args) {
                Test test = new Test();
                test.f(3456);
                test.f(34.56f);
                test.f("abc");
                test.f("abc","def");
                test.f("abc",3456);
        }
}
