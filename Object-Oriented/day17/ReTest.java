public class ReTest
{
        public static void main(String args[]){
                Animal a = new Animal(); // Animal 对象
                Dog d = new Dog(); // Dog 对象

                Animal b = new Dog(); // Dog 对象,向上转型为Animal类型，具体会在后面的内容进行详解

                a.bark();// 执行 Animal 类的方法
                d.bark();//执行 Dog 类的方法
                b.bark();//执行 Dog 类的方法
        }
}
