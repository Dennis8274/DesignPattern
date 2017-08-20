package org.xufeng.deng.algorithms.datastructure.stack.maze;

/**
 * Created by deng.xufeng(一乐) on 2017/5/10.
 * <p>
 *
 * @author deng.xufeng
 */
public class PosType {

    public static PosType START = new PosType(0,1,1);
    public static PosType END = new PosType(0,8,8);
    public static PosType DIAMONDS = new PosType(0,0,0);
    public static PosType OTHER = new PosType(-1,-1,-1);

    private int pos;//坐标位置
    private int x;
    private int y;

    public PosType(int pos, int x, int y){
        this.pos = pos;
        this.x = x;
        this.y = y;
    }

    public int getPos() {
        return pos;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PosType posType = (PosType) o;

        if (pos != posType.pos) return false;
        if (x != posType.x) return false;
        return y == posType.y;
    }

    @Override
    public int hashCode() {
        int result = pos;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }
}
