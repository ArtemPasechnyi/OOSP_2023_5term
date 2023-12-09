package Memento;

import java.io.Serializable;

class WindowLayout implements Serializable {
    private String layout;

    public WindowLayout(String layout) {
        this.layout = layout;
    }

    public String getLayout() {
        return layout;
    }

    @Override
    public String toString() {
        return layout;
    }
}