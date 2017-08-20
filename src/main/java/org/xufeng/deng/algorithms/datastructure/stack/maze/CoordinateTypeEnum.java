package org.xufeng.deng.algorithms.datastructure.stack.maze;

/**
 * Created by deng.xufeng(一乐) on 2017/5/9.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public enum CoordinateTypeEnum {
    REACHABLE(1,"通道"),
    UNREACHABLE(0,"s石头");

    private int type; // 0-石头，1-通道
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    CoordinateTypeEnum(int type, String msg) {
        this.type = type;
        this.msg = msg;
    }
}
