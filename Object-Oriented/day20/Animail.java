// Animal.java
interface Animal
{
        //int x;
        //编译错误,x需要初始化，因为是 static final 类型
        int y = 5;
        public void eat();
        public void travel();
}
