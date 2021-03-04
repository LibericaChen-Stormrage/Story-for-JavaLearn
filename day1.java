/*
对第一个java程序进行总结
1.Java程序编写-编译-执行的过程
编写：将编写的java代码保存在.java文件中
编译：javac
执行：Java

2.在一个java源文件汇中可以声明多个class，但最多只能声明一个public修饰的类
且声明为public类的类名和文件名相同

3.程序的入口是main方法，格式是固定的。括号中的参数是可以改变的。

4.输出语句
System.out.println（）；先输出数组再换行
System.out.print();

6.每一行执行语句都已分号结束

7.编译过程：编译后源文件生成一个或多个字节码文件，名称与类名一致。

 */
public class day1 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
