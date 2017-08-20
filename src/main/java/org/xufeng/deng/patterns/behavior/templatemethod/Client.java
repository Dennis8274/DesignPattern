package org.xufeng.deng.patterns.behavior.templatemethod;

/**
 * Created by deng.xufeng(一乐) on 2017/7/6.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        Person student = new Student();
        Person teacher = new Teacher();
        student.goSchool();
        System.out.println("===============");
        teacher.goSchool();
    }
}
