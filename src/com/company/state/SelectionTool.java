package com.company.state;

public class SelectionTool  implements  Tool{

    @Override
    public void moseDown() {
        System.out.println("Selection icon");
    }

    @Override
    public void moseUp() {
        System.out.println("Draw dashed rectangle");
    }
}
