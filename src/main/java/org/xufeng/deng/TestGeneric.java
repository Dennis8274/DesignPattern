package org.xufeng.deng;

import com.google.common.collect.Lists;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

/**
 * @des  测试Generic
 * @author xufeng.deng
 * @date 16/9/29 下午4:22
 * @classname TestGeneric
 */
public class TestGeneric {

    public static void printList(List<?> list, PrintStream out){
        for (Iterator<?> iterator = list.iterator();iterator.hasNext();){
            out.println(iterator.next().toString());
        }
    }

    public static void main(String[] args){
        List<String> list = Lists.newArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        printList(list,System.out);
    }
}
