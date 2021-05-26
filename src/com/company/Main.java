package com.company;

import com.company.momento.Caretaker;
import com.company.momento.Editor;
import com.company.momento.Memento;
import com.company.momento.Originator;
import com.company.state.Canvas;
import com.company.state.SelectionTool;

public class Main {


    public static void main(String[] args) {
            var canvas = new Canvas();
            canvas.setCurrentTool(new SelectionTool());
            canvas.mouseDown();
            canvas.mouseUp();

    }


}
