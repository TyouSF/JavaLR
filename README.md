# JavaLR

Learning record for Java

# Java 环境

Java 是由 Sun Microsystems 公司于1995年5月推出的 Java 面向对象程序设计语言和 Java 平台的总称。由 James Gosling 和同事们共同研发，并在1995年正式推出。

Java 这门语言体系当中，最基础的部分就是 Java SE 部分，Java 的标准版本。它包括 Java 最基础的一些结构，包括面向对象的一些特性等等，同时它也是 Java 技术基础和核心。在 Java SE 的基础之上，又分为了 Java EE（Java 的企业版），应用于大型企业级应用的开发。Java ME 主要用于嵌入式开发。初学的时候我们都是从 Java SE 开始的。

JVM 叫 Java 虚拟机，它也是整个 Java 技术的核心。Java 语言的跨平台就多亏了 JVM。

JVM 叫 Java 虚拟机，它也是整个 Java 技术的核心。Java 语言的跨平台就多亏了 JVM。

JDK 叫 Java 开发工具包，没有 JDK 就没有办法进行 Java 程序的开发。

JRE 叫 Java 运行环境，如果我们需要运行一个 Java 程序，就得安装 JRE。

## 官网下载

安装 Java SE 环境，官网下载安装即可

**Win 环境变量问题**：

-   变量名：`JAVA_HOME`；变量值：`C:\Program Files (x86)\Java\jdk1.8.0_91`（此处为示例，实际修改为自己安装的本地路径）
-   变量名：`CLASSPATH`；变量值：`.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;`
-   变量名：`Path`；变量值：`%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;`

# 学习记录简要

## 第一个 `Hello World`

> 文件：[HelloWorld](./day01/HelloWorld.java)

<span style="color:red">Java 中所有的代码都必须包含在 class 中，main 方法是程序的入口，</span>
并且 Java 是区分大小写的，如果写成 Main，那么程序将不能运行。
<span style="color:red">使用 public 修饰的 class 必须和源代码文件名相同。</span>

## 变量

> 文件：[VarTest](./day02/VarTest.java)

变量声明格式：`数据类型 变量名称；`
例如：`int a=1;`

在该语法格式中，数据类型可以是 Java 语言中任意的类型，如int。变量名称是该变量的标识符，需要符合标识符的命名规则，数据类型和变量名称之间使用空格进行间隔，使用;作为结束。

## 常量

> 文件：[VarTest](./day02/VarTest.java)

可看作特殊的变量，只是它们在程序的运行过程中是不允许改变的。**常量的值是不能被修改的**。

声明关键字：`final`，可以用于声明属性（常量），方法和类。

final修饰属性时，代表该属性一旦被分配内存空间就必须初始化, 它的含义是“这是无法改变的”或者“终态的”。在变量前面添加关键字final即可声明一个常量。在 Java 编码规范中，**要求常量名必须大写**。

语法格式：`final 数据类型 常量名 = 值;`
例如：`final double PI = 3.14;`
常量也可以先声明，再进行赋值，但只能赋值一次，比如： ​

```java
  final int FINAL_VARIABLE; ​
  FINAL_VARIABLE = 100;
```

## 数据类型

![八种基本数据类型](./img/java数据类型.png)

整数
byte、short、int、long 四种基本数据类型表示整数，需要注意的是 long 类型，**使用 long 修饰的变量需要在数值后面加上 L 或者 l，比如`long num=1L;`，一般使用大写 L，为了避免小写 l 与数值 1 混淆**。

浮点数
float 和 double 类型表示浮点数，即可以表示小数部分。需要注意的是 float 类型，**其数值后面需要加上 F 或者 f，否则会被当成 double 类型处理。** double 类型的数值可以加上 D 或 d，也可以不加。

char 类型
char 类型用于表示单个字符。需要将字符用单引号括起来`char a='a'`，char 可以和整数互相转换，如果字符a也可以写成`char a=97`。也可以用十六进制表示`char a = '\\u0061'`。

boolean 类型
boolean 类型（布尔类型）用于表示真值 true 或者假值 false，Java 中布尔值不能和整数类型或者其它类型互相转换。
