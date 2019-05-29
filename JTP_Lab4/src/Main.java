import Lista_jednokierunkowa.Anchor;
import Lista_jednokierunkowa.Element;

public class Main {
    public static void main(String[] args){
        Anchor anchor = new Anchor(new Element(2));
        anchor.insertAtTheEnd(2);
        anchor.insertAtTheFront(3);
        anchor.insertAtTheEnd(23);
        anchor.insertAtTheFront(32);
        System.out.println(anchor.removeFirst().toString());
        anchor.removeFirst();
        anchor.removeLast();
        System.out.println(anchor.removeLast().toString());
    }
}
