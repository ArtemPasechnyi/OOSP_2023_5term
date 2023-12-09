package Memento;

import java.io.*;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TextEditor implements Serializable {
    private SessionManager sessionManager;

    public TextEditor() {
        this.sessionManager = new SessionManager();
    }

    public void addFile(String fileName) {
        sessionManager.addFile(new File(fileName));
    }

    public void setWindowLayout(String layout) {
        sessionManager.setWindowLayout(new WindowLayout(layout));
    }

    public void showEditorState() {
        sessionManager.showSessionState();
    }

    public void saveSession(String filePath) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(sessionManager);
            System.out.println("Session saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static TextEditor restoreSession(String filePath) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            TextEditor textEditor = new TextEditor();
            textEditor.sessionManager = (SessionManager) inputStream.readObject();
            return textEditor;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }


}