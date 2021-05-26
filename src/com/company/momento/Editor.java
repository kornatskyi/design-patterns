package com.company.momento;

import java.util.ArrayList;

public class Editor {
    private String content;



    private ArrayList<String> history = new ArrayList<>();



    public void undo() {
        history.remove(history.size() - 1);
        content = history.get(history.size() - 1);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        setHistory(content);
    }

    private void setHistory(String content) {
        history.add(content);
    }
}
