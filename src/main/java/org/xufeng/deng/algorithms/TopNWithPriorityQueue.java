package org.xufeng.deng.algorithms;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by deng.xufeng(一乐) on 2017/4/14.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class TopNWithPriorityQueue<E extends Comparable> {
    private PriorityQueue<E> queue;
    private int maxSize;

    @SuppressWarnings("unchecked")
    public TopNWithPriorityQueue(int maxSize) {
        if(maxSize <= 0){
            throw new IllegalArgumentException();
        }
        this.maxSize = maxSize;
        this.queue = new PriorityQueue<>(maxSize, new Comparator<E>(){
            public int compare(E o1,E o2){
                return o2.compareTo(o1);
            }
        });
    }

    @SuppressWarnings("unchecked")
    public void add(E e){
        if (queue.size() < maxSize){
            queue.add(e);
        } else {
            E peek = queue.peek();
            if (e.compareTo(peek) < 0){
                queue.poll();
                queue.add(e);
            }
        }
    }

    public static void main(String[] args){
        final TopNWithPriorityQueue<Integer> myQueue = new TopNWithPriorityQueue<>(10);

        Random random = new Random(100);
        for (int i=0;i<100;++i){
            myQueue.add(random.nextInt());
        }

        Iterable<Integer> it = new Iterable<Integer>() {
            @Override
            public Iterator<Integer> iterator() {
                return myQueue.queue.iterator();
            }
        };
        for (Integer num : it){
            System.out.println("数值："+num);
        }
        System.out.println("----------------------------");

        while(!myQueue.queue.isEmpty()){
            System.out.println("数值："+myQueue.queue.poll());
        }
    }
}
