package behavioral.Memento;

import behavioral.Memento.Originator.Editor;

public class Main {
    public static void main(String[] args) {
        Editor editor=new Editor();
        EditorHistory history = new EditorHistory();
        //Initial state
        editor.setType("Image");
        editor.setAction("Remove Background");
        editor.setX(100);
        editor.setY(100);
        //A snapshot of the editor is saved
        history.save(editor.Save());
        //look at the current action performed
        System.out.println(editor.getAction());

        //next edit
        editor.setAction("Crop");
        history.save(editor.Save());
        
        editor.setAction("New Layer");
        history.save(editor.Save());

        editor.setAction("Alter Resolution");
        history.save(editor.Save());

        editor.restore(history.undo());
        editor.restore(history.undo());
        System.out.println(editor.getAction());
    }
}
