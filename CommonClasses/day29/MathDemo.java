public class MathDemo
{
        public static void main(String[] args) {
                System.out.println(Math.abs(-12.7));
                System.out.println(Math.ceil(12.7));
                System.out.println(Math.rint(12.4));
                System.out.println(Math.random());
                System.out.println("sin30 = " + Math.sin(Math.PI / 6));
                // 计算30°的正弦值，参数是用弧度表示的角，即π的六分之一
                System.out.println("cos30 = " + Math.cos(Math.PI / 6));
                // 计算30°的余弦值，这些计算三角函数的方法，其参数和返回值的类型都为double
                System.out.println("tan30 = " + Math.tan(Math.PI / 6));
                // 计算30°的正切值
        }
}
