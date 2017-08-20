package org.xufeng.deng.algorithms.datastructure.stack.maze;

import static org.xufeng.deng.algorithms.datastructure.stack.maze.CoordinateTypeEnum.REACHABLE;
import static org.xufeng.deng.algorithms.datastructure.stack.maze.CoordinateTypeEnum.UNREACHABLE;
import static org.xufeng.deng.algorithms.datastructure.stack.maze.PosType.*;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Stack;

/**
 * Created by deng.xufeng(一乐) on 2017/5/9.
 * <p>迷宫求解
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class Maze {
    private Stack<SElemType> stack = new Stack<>();

    private static CoordinateTypeEnum[][] maze = {
            {UNREACHABLE, UNREACHABLE, UNREACHABLE, UNREACHABLE, UNREACHABLE, UNREACHABLE, UNREACHABLE, UNREACHABLE, UNREACHABLE, UNREACHABLE},
            {UNREACHABLE, REACHABLE, REACHABLE, REACHABLE, REACHABLE, REACHABLE, REACHABLE, REACHABLE, UNREACHABLE, UNREACHABLE},
            {UNREACHABLE, REACHABLE, REACHABLE, REACHABLE, UNREACHABLE, REACHABLE, UNREACHABLE, UNREACHABLE, REACHABLE, UNREACHABLE},
            {UNREACHABLE, UNREACHABLE, UNREACHABLE, REACHABLE, UNREACHABLE, REACHABLE, REACHABLE, UNREACHABLE, REACHABLE, UNREACHABLE},
            {UNREACHABLE, REACHABLE, REACHABLE, REACHABLE, UNREACHABLE, UNREACHABLE, REACHABLE, UNREACHABLE, REACHABLE, UNREACHABLE},
            {UNREACHABLE, REACHABLE, REACHABLE, UNREACHABLE, REACHABLE, REACHABLE, REACHABLE, REACHABLE, REACHABLE, UNREACHABLE},
            {UNREACHABLE, REACHABLE, REACHABLE, UNREACHABLE, REACHABLE, REACHABLE, UNREACHABLE, UNREACHABLE, REACHABLE, UNREACHABLE},
            {UNREACHABLE, UNREACHABLE, UNREACHABLE, REACHABLE, REACHABLE, REACHABLE, REACHABLE, UNREACHABLE, REACHABLE, UNREACHABLE},
            {UNREACHABLE, REACHABLE, REACHABLE, REACHABLE, REACHABLE, REACHABLE, REACHABLE, REACHABLE, REACHABLE, UNREACHABLE},
            {UNREACHABLE, UNREACHABLE, UNREACHABLE, UNREACHABLE, UNREACHABLE, UNREACHABLE, UNREACHABLE, UNREACHABLE, UNREACHABLE, UNREACHABLE}
    };

    public boolean getMazePath(PosType start, PosType end) {
        //若迷宫maze中存在从入口start到出口end的通道，则求的一条存放在栈中（从栈底到栈顶），并返回true，否则false
        boolean result = false;
        PosType curPos = start;
        SElemType e;
        int curStep = 1;
        List<PosType> footPrint = Lists.newArrayList();
        do {
            if (pass(curPos, footPrint)) {
                //当前位置可以通过
                footPrint(footPrint, curPos);
                e = new SElemType(curStep, curPos, 1);
                stack.push(e);
                if (curPos.equals(end)){
                    result = true;
                    break;
                }
                curPos = nextPos(curPos,1);
                curStep++;
            } else {
                //当前位置不可以通过
                if (!stack.isEmpty()){
                    e = stack.peek();
                    while(e.getDi() == 4 && !stack.isEmpty()){
                        e = stack.pop();
                    }
                    if (e.getDi() < 4){
                        e.setDi(e.getDi()+1);
                        curPos = nextPos(e.getSeat(),e.getDi());
//                        stack.push(e);
                    }
                }
            }
        } while (!stack.isEmpty());

        return result;
    }

    private PosType nextPos(PosType curPos, int direction) {
        PosType nextPos = new PosType(0,0,0);
        if (direction > 4) {
            return OTHER;
        }

        switch (direction) {
            case 1:
                nextPos.setX(curPos.getX()+1);
                nextPos.setY(curPos.getY());
                break;
            case 2:
                nextPos.setX(curPos.getX());
                nextPos.setY(curPos.getY()+1);
                break;
            case 3:
                nextPos.setX(curPos.getX()-1);
                nextPos.setY(curPos.getY());
                break;
            case 4:
                nextPos.setX(curPos.getX());
                nextPos.setY(curPos.getY()-1);
                break;
            default:
                nextPos = OTHER;
                break;
        }
        return nextPos;
    }

    private void footPrint(List<PosType> footPrint, PosType curPos) {
        footPrint.add(curPos);
    }

    private boolean pass(PosType curPos, List<PosType> footPrint) {
        int curX = curPos.getX();
        int curY = curPos.getY();
        return maze[curX][curY] == REACHABLE && !footPrint.contains(curPos);
    }

    public static void main(String[] args) {
        System.out.println(new Maze().getMazePath(PosType.START, PosType.END));
    }

}
