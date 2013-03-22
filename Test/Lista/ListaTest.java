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
        assertEquals("Puntatori dal primo al nuovo elemento elemento.",l.next.next.prev.next.nome,"Uno");
        assertEquals("Puntatori dal terzo al nuovo elemento elemento.",l.next.next.next.prev.nome,"Uno");
    }

    /**
     * Test of addLast method, of class Lista.
     */
    @Test
    public void testAddLast() {
        Lista l = new Lista();
        l.addLast("Uno");
        assertEquals("Puntatori dal primo al nuovo elemento elemento.",l.next.prev.next.prev.nome,"Uno");
        assertEquals("Puntatori dal penultimo al nuovo elemento elemento.",l.next.prev.prev.next.nome,"Uno");
    }

    /**
     * Test of offerFirst method, of class Lista.
     */
    @Test
    public void testOfferFirst() {
        Lista l = new Lista();
        l.offerFirst("Uno");
        assertEquals("Puntatori dal primo al nuovo elemento elemento.",l.next.next.prev.next.nome,"Uno");
        assertEquals("Puntatori dal terzo al nuovo elemento elemento.",l.next.next.next.prev.nome,"Uno");
    }

    /**
     * Test of offerLast method, of class Lista.
     */
    @Test
    public void testOfferLast() {
        Lista l = new Lista();
        l.offerLast("Uno");
        assertEquals("Puntatori dal primo al nuovo elemento elemento.",l.next.prev.next.prev.nome,"Uno");
        assertEquals("Puntatori dal penultimo al nuovo elemento elemento.",l.next.prev.prev.next.nome,"Uno");
    }

    /**
     * Test of removeFirst method, of class Lista.
     */
    @Test
    public void testRemoveFirst() {
        Lista l = new Lista();
        l.addLast("Uno");
        l.addLast("Due");
        l.removeFirst();
        assertEquals("Primo elemento.",l.next.prev.next.nome,"Due");
        l.removeFirst();
        assertEquals("Lista vuota.",l.next,null);
    }

    /**
     * Test of removeLast method, of class Lista.
     */
    @Test
    public void testRemoveLast() {
        Lista l = new Lista();
        l.addLast("Uno");
        l.addLast("Due");
        l.removeLast();
        assertEquals("Ultimo elemento.",l.next.prev.next.nome,"Uno");
        l.removeLast();
        assertEquals("Lista vuota.",l.next,null);
    }

    /**
     * Test of pollFirst method, of class Lista.
     */
    @Test
    public void testPollFirst() {
        System.out.println("pollFirst");
        Lista instance = new Lista();
        Object expResult = null;
        Object result = instance.pollFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pollLast method, of class Lista.
     */
    @Test
    public void testPollLast() {
        System.out.println("pollLast");
        Lista instance = new Lista();
        Object expResult = null;
        Object result = instance.pollLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class Lista.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        Lista instance = new Lista();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class Lista.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        Lista instance = new Lista();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peekFirst method, of class Lista.
     */
    @Test
    public void testPeekFirst() {
        System.out.println("peekFirst");
        Lista instance = new Lista();
        Object expResult = null;
        Object result = instance.peekFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peekLast method, of class Lista.
     */
    @Test
    public void testPeekLast() {
        System.out.println("peekLast");
        Lista instance = new Lista();
        Object expResult = null;
        Object result = instance.peekLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirstOccurrence method, of class Lista.
     */
    @Test
    public void testRemoveFirstOccurrence() {
        System.out.println("removeFirstOccurrence");
        Object o = null;
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.removeFirstOccurrence(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLastOccurrence method, of class Lista.
     */
    @Test
    public void testRemoveLastOccurrence() {
        System.out.println("removeLastOccurrence");
        Object o = null;
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.removeLastOccurrence(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Lista.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object e = null;
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of offer method, of class Lista.
     */
    @Test
    public void testOffer() {
        System.out.println("offer");
        Object e = null;
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.offer(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Lista.
     */
    @Test
    public void testRemove_0args() {
        System.out.println("remove");
        Lista instance = new Lista();
        Object expResult = null;
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of poll method, of class Lista.
     */
    @Test
    public void testPoll() {
        System.out.println("poll");
        Lista instance = new Lista();
        Object expResult = null;
        Object result = instance.poll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of element method, of class Lista.
     */
    @Test
    public void testElement() {
        System.out.println("element");
        Lista instance = new Lista();
        Object expResult = null;
        Object result = instance.element();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class Lista.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Lista instance = new Lista();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class Lista.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object e = null;
        Lista instance = new Lista();
        instance.push(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class Lista.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Lista instance = new Lista();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Lista.
     */
    @Test
    public void testRemove_Object() {
        System.out.println("remove");
        Object o = null;
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.remove(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Lista.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object o = null;
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.contains(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Lista.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Lista instance = new Lista();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Lista.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Lista instance = new Lista();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of descendingIterator method, of class Lista.
     */
    @Test
    public void testDescendingIterator() {
        System.out.println("descendingIterator");
        Lista instance = new Lista();
        Iterator expResult = null;
        Iterator result = instance.descendingIterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Lista.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class Lista.
     */
    @Test
    public void testToArray_0args() {
        System.out.println("toArray");
        Lista instance = new Lista();
        Object[] expResult = null;
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class Lista.
     */
    @Test
    public void testToArray_ObjectArr() {
        System.out.println("toArray");
        Object[] a = null;
        Lista instance = new Lista();
        Object[] expResult = null;
        Object[] result = instance.toArray(a);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsAll method, of class Lista.
     */
    @Test
    public void testContainsAll() {
        System.out.println("containsAll");
        Collection c = null;
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.containsAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class Lista.
     */
    @Test
    public void testAddAll() {
        System.out.println("addAll");
        Collection c = null;
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.addAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAll method, of class Lista.
     */
    @Test
    public void testRemoveAll() {
        System.out.println("removeAll");
        Collection c = null;
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.removeAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retainAll method, of class Lista.
     */
    @Test
    public void testRetainAll() {
        System.out.println("retainAll");
        Collection c = null;
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.retainAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Lista.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Lista instance = new Lista();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Lista.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Lista instance = new Lista();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
