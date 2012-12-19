package org.feeloc.vo;

import java.util.List;

/**
 * create by: jianmeng.hu
 * create time: 12-12-19 下午2:41
 */
public class StateList {

    public List<State> getStateList() {
        return stateList;
    }

    public void setStateList(List<State> stateList) {
        this.stateList = stateList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count;
    private List<State> stateList;

}
