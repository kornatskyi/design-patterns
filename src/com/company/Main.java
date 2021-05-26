package com.company;

import com.company.momento.Caretaker;
import com.company.momento.Editor;
import com.company.momento.Memento;
import com.company.momento.Originator;

public class Main {


    public static void main(String[] args) {
         var editor = new Originator();
         var caretaker = new Caretaker();
         editor.setContent("a");
         caretaker.push(editor.createState());
         editor.setContent("b");
        caretaker.push(editor.createState());
        editor.setContent("c");
        editor.restore(caretaker.pop());
        System.out.println(editor.getContent());

    }


}
