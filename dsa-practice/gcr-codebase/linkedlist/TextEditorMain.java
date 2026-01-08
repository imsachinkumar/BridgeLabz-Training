// Text state node
class TextNode{
    String text;
    TextNode next,prev;

    TextNode(String text){
        this.text=text;
        next=prev=null;
    }
}

// Text editor
class TextEditor{
    TextNode current;
    // Add new state
    void addState(String text){
        TextNode newNode=new TextNode(text);
        if(current!=null){
            current.next=newNode;
            newNode.prev=current;
        }
        current=newNode;
    }

    // Undo
    void undo(){
        if(current!=null&&current.prev!=null)
            current=current.prev;
    }
    // Redo
    void redo(){
        if(current!=null&&current.next!=null)
            current=current.next;
    }
    // Display
    void display(){
        if(current!=null)
            System.out.println("Text: "+current.text);
    }
}
public class TextEditorMain{
    public static void main(String[] args){
        TextEditor te=new TextEditor();

        te.addState("Hello");
        te.addState("Hello World");
        te.display();

        te.undo();
        te.display();
        te.redo();
        te.display();
    }
}
