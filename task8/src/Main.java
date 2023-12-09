import Memento.TextEditor;

public class Main {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();

        textEditor.addFile("file1.txt");
        textEditor.addFile("file2.txt");
        textEditor.setWindowLayout("Horizontal");

        System.out.println("Current session:");
        textEditor.showEditorState();

        textEditor.saveSession("session.ser");

        TextEditor restoredEditor = TextEditor.restoreSession("session.ser");

        if (restoredEditor != null) {
            System.out.println("\nRestored session:");
            restoredEditor.showEditorState();
        }
    }
}
