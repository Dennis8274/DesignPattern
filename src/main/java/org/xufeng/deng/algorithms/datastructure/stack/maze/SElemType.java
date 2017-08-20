package org.xufeng.deng.algorithms.datastructure.stack.maze;

/**
 * Created by deng.xufeng(一乐) on 2017/5/9.
 * <p>栈存放元素
 *
 * @author deng.xufeng
 */
public class SElemType {
    private int ord;//通道块在路劲挂上的序号
    private PosType seat;//通道快在迷宫中的坐标位置
    private int di;//从此通道快走向下一通道快的方向

    public int getOrd() {
        return ord;
    }

    public void setOrd(int ord) {
        this.ord = ord;
    }

    public PosType getSeat() {
        return seat;
    }

    public void setSeat(PosType seat) {
        this.seat = seat;
    }

    public int getDi() {
        return di;
    }

    public void setDi(int di) {
        this.di = di;
    }

    public SElemType() {
    }

    public SElemType(int ord, PosType seat, int di) {
        this.ord = ord;
        this.seat = seat;
        this.di = di;
    }
}
