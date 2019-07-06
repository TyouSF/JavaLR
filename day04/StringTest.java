public class StringTest
{
        public static void main(String[] args) {
                String s = new String("Java");
                String m = "java";
                System.out.println("用equals()比较，java和Java结果为" + s.equals(m));
                System.out.println("用equalsIgnoreCase()比较，java和Java结果为" + s.equalsIgnoreCase(m));

                String s1 = "abc";
                String s2 = new String("abc");
                boolean b = (s1 == s2);
                System.out.println("双等号 == 比较的是两个对象在内存中存储的地址是否一样");
                System.out.println("字面之为‘abc’的变量 s1 与 s2 双等比较结果为：" + b);

                // 字符串拼接
                String s00 = new String("Hello ");
                String s01 = "World" + "!"; //+号连接
                String s02 = s00.concat(s01); //concat()方法连接
                System.out.println(s02);

                // 索引取值
                String ss = "abc";
                char c = ss.charAt(1);
                System.out.println("charAt 索引取值，取索引1的值为：" + c);

                String sqq = "abcdefabc";
                System.out.println("字符a第一次出现的位置为"+sqq.indexOf('a'));
                System.out.println("字符串bc第一次出现的位置为"+sqq.indexOf("bc"));
                System.out.println("字符a最后一次出现的位置为"+sqq.lastIndexOf('a'));
                System.out.println("从位置3开始到结束的字符串"+sqq.substring(3));
                System.out.println("从位置3开始到6之间的字符串"+sqq.substring(3,6));
        }
}
