package Lista_jednokierunkowa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnchorTest {
    private Anchor anchor = new Anchor(new Element(0));

    @Test
    void insertAtTheFront() {
        anchor.insertAtTheFront(2);
        assertEquals(2, anchor.removeFirst().getVal());
        anchor.insertAtTheFront(10);
        assertEquals(10, anchor.removeFirst().getVal());
    }

    @Test
    void insertAtTheEnd() {
        anchor.insertAtTheEnd(-2);
        assertEquals(-2, anchor.removeLast().getVal());
        anchor.insertAtTheEnd(4);
        assertEquals(4, anchor.removeLast().getVal());
    }

    @Test
    void equals(){
        Anchor new_anchor = new Anchor(new Element(0));
        anchor.insertAtTheEnd(2);
        anchor.insertAtTheEnd(3);
        new_anchor.insertAtTheEnd(2);
        new_anchor.insertAtTheEnd(3);
        assertEquals(anchor, new_anchor);
        anchor.insertAtTheEnd(3);
        anchor.insertAtTheEnd(2);
        new_anchor.insertAtTheEnd(2);
        new_anchor.insertAtTheEnd(3);
        assertNotEquals(anchor, new_anchor);
    }
}