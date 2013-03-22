/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.util.Collection;
import java.util.Iterator;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Eddy
 */
public class ListaTest {

    /**
     * Test of main method, of class Lista.
     */
    @Test
    public void testMain() {
        Lista l = new Lista();
        l.addLast("Uno");
    }

    /**
     * Test of addFirst method, of class Lista.
     */
    @Test
    public void testAddFirst() {
        Lista l = new Lista();
        l.addFirst("Uno");
        assertEquals("Puntatori dal primo al nuovo elemento elemento.","Uno",l.next.next.prev.next.nome);
        assertEquals("Puntatori dal terzo al nuovo elemento elemento.","Uno",l.next.next.next.prev.nome);
        // Manca il controllo se non riesce piu a inserire.
        // Manca il controllo se è vuota
    }

    /**
     * Test of addLast method, of class Lista.
     */
    @Test
    public void testAddLast() {
        Lista l = new Lista();
        l.addLast("Uno");
        assertEquals("Puntatori dal primo al nuovo elemento elemento.","Uno",l.next.prev.next.prev.nome);
        assertEquals("Puntatori dal penultimo al nuovo elemento elemento.","Uno",l.next.prev.prev.next.nome);
        // Manca il controllo se non riesce piu a inserire.
        // Manca il controllo se è vuota
    }

    /**
     * Test of offerFirst method, of class Lista.
     */
    @Test
    public void testOfferFirst() {
        Lista l = new Lista();
        l.offerFirst("Uno");
        assertEquals("Puntatori dal primo al nuovo elemento elemento.","Uno",l.next.next.prev.next.nome);
        assertEquals("Puntatori dal terzo al nuovo elemento elemento.","Uno",l.next.next.next.prev.nome);
        // Manca il controllo se non riesce piu a inserire.
        // Manca il controllo se è vuota
    }

    /**
     * Test of offerLast method, of class Lista.
     */
    @Test
    public void testOfferLast() {
        Lista l = new Lista();
        l.offerLast("Uno");
        assertEquals("Puntatori dal primo al nuovo elemento elemento.","Uno",l.next.prev.next.prev.nome);
        assertEquals("Puntatori dal penultimo al nuovo elemento elemento.","Uno",l.next.prev.prev.next.nome);
        // Manca il controllo se non riesce piu a inserire.
        // Manca il controllo se è vuota
    }

    /**
     * Test of removeFirst method, of class Lista.
     */
    @Test
    public void testRemoveFirst() throws Exception {
        Lista l = new Lista();
        l.addLast("Uno");
        l.addLast("Due");
        l.removeFirst();
        assertEquals("Primo elemento.","Due",l.next.prev.next.nome);
        l.removeFirst();
        assertEquals("Lista vuota.",null,l.next);
        // Manca il try-catch
    }

    /**
     * Test of removeLast method, of class Lista.
     */
    @Test
    public void testRemoveLast() throws Exception {
        Lista l = new Lista();
        l.addLast("Uno");
        l.addLast("Due");
        l.removeLast();
        assertEquals("Ultimo elemento.","Uno",l.next.prev.next.nome);
        l.removeLast();
        assertEquals("Lista vuota.",null,l.next);
        // Manca il try-catch
    }

    /**
     * Test of pollFirst method, of class Lista.
     */
    @Test
    public void testPollFirst() {
        Lista l = new Lista();
        l.addLast("Uno");
        l.addLast("Due");
        assertEquals("Valore di ritorno true.",true,l.removeLast());
        assertEquals("Primo elemento.","Due",l.next.prev.next.nome);
        assertEquals("Valore di ritorno false.",false,l.removeLast());
    }

    /**
     * Test of pollLast method, of class Lista.
     */
    @Test
    public void testPollLast() {
        Lista l = new Lista();
        l.addLast("Uno");
        l.addLast("Due");
        assertEquals("Valore di ritorno true.",true,l.removeLast());
        assertEquals("Ultimo elemento.","Uno",l.next.prev.next.nome);
        assertEquals("Valore di ritorno false.",false,l.removeLast());
    }

    /**
     * Test of getFirst method, of class Lista.
     */
    @Test
    public void testGetFirst() throws Exception {
        Lista l = new Lista();
        // Manca il try-catch
        l.addLast("Uno");
        assertEquals("Un elemento","Uno",l.getFirst());
        l.addLast("Due");
        assertEquals("Piu elementi","Uno",l.getFirst());
    }

    /**
     * Test of getLast method, of class Lista.
     */
    @Test
    public void testGetLast() throws Exception {
        Lista l = new Lista();
        // Manca il try-catch
        l.addLast("Uno");
        assertEquals("Un elemento","Uno",l.getLast());
        l.addLast("Due");
        assertEquals("Piu elementi","Due",l.getLast());
    }

    /**
     * Test of peekFirst method, of class Lista.
     */
    @Test
    public void testPeekFirst() {
        Lista l = new Lista();
        assertEquals("Valore di ritorno false.",false,l.peekFirst());
        l.addLast("Uno");
        assertEquals("Valore di ritorno true.",true,l.peekFirst());
        assertEquals("Un elemento.","Uno",l.peekFirst());
        l.addLast("Due");
        assertEquals("Secondo test valore di ritorno true.",true,l.peekFirst());
        assertEquals("Piu elementi.","Uno",l.peekFirst());
    }

    /**
     * Test of peekLast method, of class Lista.
     */
    @Test
    public void testPeekLast() {
        Lista l = new Lista();
        assertEquals("Valore di ritorno false.",false,l.peekLast());
        l.addLast("Uno");
        assertEquals("Valore di ritorno true.",true,l.peekLast());
        assertEquals("Un elemento.","Uno",l.peekLast());
        l.addLast("Due");
        assertEquals("Secondo test valore di ritorno true.",true,l.peekLast());
        assertEquals("Piu elementi.","Due",l.peekLast());
    }

    /**
     * Test of removeFirstOccurrence method, of class Lista.
     */
    
    public void testRemoveFirstOccurrence() {
    }

    /**
     * Test of removeLastOccurrence method, of class Lista.
     */
    
    public void testRemoveLastOccurrence() {
    }

    /**
     * Test of add method, of class Lista.
     */
    
    public void testAdd() {
    }

    /**
     * Test of offer method, of class Lista.
     */
    
    public void testOffer() {
    }

    /**
     * Test of remove method, of class Lista.
     */
    
    public void testRemove_0args() {
    }

    /**
     * Test of poll method, of class Lista.
     */
    
    public void testPoll() {
    }

    /**
     * Test of element method, of class Lista.
     */
    
    public void testElement() {
    }

    /**
     * Test of peek method, of class Lista.
     */
    
    public void testPeek() {
    }

    /**
     * Test of push method, of class Lista.
     */
    
    public void testPush() {
    }

    /**
     * Test of pop method, of class Lista.
     */
    
    public void testPop() {
    }

    /**
     * Test of remove method, of class Lista.
     */
    
    public void testRemove_Object() {
    }

    /**
     * Test of contains method, of class Lista.
     */
    
    public void testContains() {
    }

    /**
     * Test of size method, of class Lista.
     */
    
    public void testSize() {
    }

    /**
     * Test of iterator method, of class Lista.
     */
    
    public void testIterator() {
    }

    /**
     * Test of descendingIterator method, of class Lista.
     */
    
    public void testDescendingIterator() {
    }

    /**
     * Test of isEmpty method, of class Lista.
     */
    
    public void testIsEmpty() {
    }

    /**
     * Test of toArray method, of class Lista.
     */
    
    public void testToArray_0args() {
    }

    /**
     * Test of toArray method, of class Lista.
     */
    
    public void testToArray_ObjectArr() {
    }

    /**
     * Test of containsAll method, of class Lista.
     */
    
    public void testContainsAll() {
    }

    /**
     * Test of addAll method, of class Lista.
     */
    
    public void testAddAll() {
    }

    /**
     * Test of removeAll method, of class Lista.
     */
    
    public void testRemoveAll() {
    }

    /**
     * Test of retainAll method, of class Lista.
     */
    
    public void testRetainAll() {
    }

    /**
     * Test of clear method, of class Lista.
     */
    
    public void testClear() {
    }

    /**
     * Test of toString method, of class Lista.
     */
    
    public void testToString() {
    }
}
