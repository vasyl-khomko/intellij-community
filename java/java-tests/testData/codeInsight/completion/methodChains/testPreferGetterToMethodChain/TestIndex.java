class EditorFactory {

  static EditorFactory getInstance() {
    return null;
  }

  Editor getEditor() {
    return null;
  }
}

class Editor {
}

class Main {


  void stats() {
    EditorFactory.getInstance().getEditor();
    EditorFactory.getInstance().getEditor();
    EditorFactory.getInstance().getEditor();
    EditorFactory.getInstance().getEditor();
    EditorFactory.getInstance().getEditor();
    EditorFactory.getInstance().getEditor();
    EditorFactory.getInstance().getEditor();
  }

}