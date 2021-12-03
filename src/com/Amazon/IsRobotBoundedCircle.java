package com.Amazon;

/**
 * @Author chandra sekhar Polavarapu
 */
public class IsRobotBoundedCircle {
    public boolean isRobotBounded(String instructions) {
    if (instructions.substring(instructions.length()-1).equals(instructions.substring(0,1))){
        return true;
    }else {
        return false;
    }


    }
}
