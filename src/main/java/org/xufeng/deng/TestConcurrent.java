package org.xufeng.deng;

import java.math.BigInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xufeng.deng on 16/10/8.
 *
 */
@SuppressWarnings("unused")
public class TestConcurrent {
    ExecutorService service = Executors.newFixedThreadPool(5);
    public BigInteger bigInteger;

    public static void main(String[] args){
        Executors.newScheduledThreadPool(5);
        Executors.newSingleThreadScheduledExecutor();
    }
}
