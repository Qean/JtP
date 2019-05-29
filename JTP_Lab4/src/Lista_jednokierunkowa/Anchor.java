package Lista_jednokierunkowa;

public class Anchor {
    Element first;

    public Anchor(Element first) {
        this.first = first;
    }

    public void insertAtTheFront(int x) {
        Element new_element = new Element(x);
        new_element.next = first;
        first = new_element;
    }

    public void insertAtTheEnd(int x) {
        Element temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Element(x);
    }

    public Element removeFirst() {
        Element temp = first;
        first = first.next;
        return temp;
    }

    public Element removeLast() {
        Element temp = first;
        Element temp_return;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp_return = temp.next;
        temp.next = null;
        return temp_return;
    }

    @Override
    public String toString() {
        return "Anchor{" +
                "first=" + first +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Anchor)
            return obj.toString().equals(this.toString());
        else
            return super.equals(obj);
    }
}
