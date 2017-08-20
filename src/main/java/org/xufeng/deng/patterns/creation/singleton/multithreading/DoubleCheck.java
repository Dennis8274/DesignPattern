package org.xufeng.deng.patterns.creation.singleton.multithreading;

/**
 * Created by deng.xufeng(一乐) on 2017/4/28.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class DoubleCheck {
    private DoubleCheck(){
    }

    private static DoubleCheck doubleCheck;

    public static DoubleCheck getInstance(){
        if (null == doubleCheck){
            synchronized (DoubleCheck.class){
                if (null == doubleCheck){
                    //初始化过程中可能instance已经不为null，所以加临时变量，确保初始化完成之后再赋值给instance
//                    DoubleCheck temp = new DoubleCheck();
//                    doubleCheck = temp;

                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}
