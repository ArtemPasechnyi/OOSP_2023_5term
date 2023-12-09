package Memento;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class SessionManager implements Serializable {
    private List<File> openFiles;
    private WindowLayout windowLayout;

    public SessionManager() {
        this.openFiles = new ArrayList<>();
        this.windowLayout = new WindowLayout("Default");
    }

    public void addFile(File file) {
        openFiles.add(file);
    }

    public void setWindowLayout(WindowLayout layout) {
        windowLayout = layout;
    }

    public void showSessionState() {
        System.out.println("Open Files: " + openFiles);
        System.out.println("Window Layout: " + windowLayout);
    }
}
