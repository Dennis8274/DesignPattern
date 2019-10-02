package org.xufeng.deng.test;

import java.util.Random;

/**
 * Created by deng.xufeng on 2016/12/1.
 * For
 */
public class Test {
    public static void main(String[] args) {
//        String str = "";
//        int bits[] = {1, 2, 4, 8, 16};
//        int mask[] = {
//                0x55555555,  //01
//                0x33333333,  //0011
//                0x0f0f0f0f,  //00001111
//                0x00ff00ff,  //0000000011111111
//                0x0000ffff   //00000000000000001111111111111111
//        };
//        int n = 185;
//        int count = (n & mask[0]) + ((n >> bits[0]) & mask[0]);
//
//        int temp = n-((n>>1)&mask[0]);
//        count += (count & mask[1]) + ((count >> bits[1]) & mask[1]);
//        count += (count & mask[2]) + ((count >> bits[2]) & mask[2]);
//        System.out.println("count:"+count);
//
//
////        int n = 185;
////        for(int i=0;i<32;++i){
////            if(n!=0){
////                int temp += (n>>1)&1;
////            }
////        }
////
//        int countJDK = Integer.bitCount(185);
////        System.out.println(countJDK);

        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12};
        int randNum;
        int[][] result = new int[6][arr.length];
//        System.out.println(random.nextInt(12) == 1);

        for (int v=0;v<10;++v){
            for (int i=0;i<6;++i){
                Random random = new Random();
                int[] indexs = new int[12];
                int count = 0;
                while (count<12){
                    randNum = random.nextInt(arr.length);
                    if (!isExist(randNum,indexs)){
                        indexs[count] = randNum;
                        result[i][count] = randNum;
                        System.out.print(arr[randNum]+" ");
                        count += 1;
                    }
                }
                System.out.println();
            }
            System.out.println("--------------------------");
        }

    }

    private static boolean isExist(int randNum,int[] indexs){
        boolean flag = false;
        for (int index : indexs) {
            if (index == randNum) {
                flag = true;
                break;
            }
        }
        return flag;

    }
}
