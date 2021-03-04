/*
1.Java的三种注释：单行注释、多行注释、文档注释

2.单行注释和多行注释的作用：
    对所写程序进行解释说明，怎强可读性。方便他人和自己。
    调试所写的代码

3.特点：单行注释和多行注释不参与编译，生成的字节码文件不包含注释内容.

4.文档注释：可用Javadoc解析生成网页格式的说明文档（默认为GBK编码，出错请指定编码方式）
javadoc （encoding GBK）-d 文件名  .java文件

5.多行注释不能嵌套

 */

/**
 * @author Libericachen-Stormrage
 * @version 1.1
 * 这是一个关于文档注释的实例
 */
public class HelloComment {
    /*
    多行注释：
    main方法是程序的入口，格式固定
     */
    public static void main(String[] args) {
        //单行注释：以下语句表示输出指定语句到控制台
        System.out.println("Hello Comment");
    }
}
