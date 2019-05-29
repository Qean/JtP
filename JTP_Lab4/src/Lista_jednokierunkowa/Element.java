package Lista_jednokierunkowa;

public class Element {
    private int val;
    Element next;

    public int getVal() {
        return val;
    }

    public Element(int val) {
        this.val = val;
        next = null;
    }

    @Override
    public String toString() {
        return "Element{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Element) {
            return ((Element) obj).val == this.val;
        } else
            return super.equals(obj);
    }

}
