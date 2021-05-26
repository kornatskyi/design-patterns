package com.company.state;

public class Canvas {
    private Tool currentTool;

    public void mouseDown() {
        currentTool.moseDown();
    }

    public void mouseUp() {

        currentTool.moseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
