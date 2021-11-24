package homework3.collection;

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {

    private class Node<E> {

        private E element;
        private Node<E> nextNode = null;
        private Node<E> prevNode = null;

        public Node(E element, Node<E> nextNode, Node<E> prevNode) {
            this.element = element;
            this.nextNode = nextNode;
            this.prevNode = prevNode;
        }
    }

    private int size = 0;
    private Node<E> firstElement = null;
    private Node<E> lastElement = null;

    private Node<E> getElementByIndex(int index) {
        Node<E> node = firstElement;
        for (int i = 0; i < index; ++i) {
            node = node.nextNode;
        }
        return node;
    }

    private Node<E> getElementByIndexReverse(int index) {
        Node<E> node = lastElement;
        for (int i = size; i < index; --i) {
            node = node.prevNode;
        }
        return node;
    }


    @Override
    public void add(E element) {
        Node<E> node = new Node<>(element, null, null);
        if (size == 0) {
            firstElement = node;
        } else {
            lastElement.nextNode = node;
            node.prevNode = lastElement;
        }
        lastElement = node;
        size++;
    }

    @Override
    public void add(int index, E element) {
        Node<E> node = new Node<>(element, null, null);
        if (index == 0) {
            if (this.size == 0) {
                firstElement = node;
                lastElement = node;
            } else {
                firstElement.prevNode = node;
                node.nextNode = firstElement;
                firstElement = node;
            }
            size++;

        } else if (index < size && index > 0) {
            Node<E> currentElement = getElementByIndex(index);
            node.prevNode = currentElement.prevNode;
            node.nextNode = currentElement;
            currentElement.prevNode = node;
            node.prevNode.nextNode = node;
            size++;
        } else {
            add(element);
        }
    }

    @Override
    public void clear() {
        for (Node<E> node = firstElement; node != null; ) {
            Node<E> next = node.nextNode;
            node.nextNode = null;
            node.prevNode = null;
            node.element = null;
            node = next;
        }
        firstElement = null;
        lastElement = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        if (size > index && index >= 0) {
            if (index > size / 2) {
                return getElementByIndexReverse(index).element;
            } else {
                return getElementByIndex(index).element;
            }
        } else return null;
    }

    @Override
    public int indexOf(E element) {
        int indexElement = 0;
        if (element == null) {
            for (Node<E> x = (Node<E>) firstElement; x != null; x = x.nextNode) {
                if (x.element == null)
                    return indexElement;
                indexElement++;
            }
        } else {
            for (Node<E> x = (Node<E>) firstElement; x != null; x = x.nextNode) {
                if (element.equals(x.element))
                    return indexElement;
                indexElement++;
            }
        }
        return -1;
    }


    @Override
    public E remove(int index) {
        if (size > index && index >= 0) {
            Node<E> nodeRemove;
            if (index == 0) {
                nodeRemove = firstElement;
                firstElement = firstElement.nextNode;
            } else if (index == size - 1) {
                nodeRemove = lastElement;
                lastElement = lastElement.prevNode;
                lastElement.nextNode = null;
            } else {
                nodeRemove = getElementByIndex(index);
                nodeRemove.prevNode.nextNode = nodeRemove.nextNode;
                nodeRemove.nextNode.prevNode = nodeRemove.prevNode;
            }
            E element = nodeRemove.element;
            nodeRemove.element = null;
            nodeRemove.prevNode = null;
            nodeRemove.nextNode = null;
            size--;
            return element;
        } else return null;
    }

    @Override
    public E set(int index, E element) {
        if (size > index && index >= 0) {
            Node<E> node = getElementByIndex(index);
            E oldValue = node.element;
            node.element = element;
            return oldValue;
        } else return null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private Node<E> node = firstElement;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public E next() {
                E element = node.element;
                node = node.nextNode;
                return element;
            }
        };
    }

    @SuppressWarnings("unchecked")
    @Override
    public <E> E[] toArray(E[] a) {
        if (a.length < size)
            a = (E[]) java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = a;
        for (Node<E> x = (Node<E>) firstElement; x != null; x = x.nextNode) {
            result[i++] = x.element;
        }

        if (a.length > size)
            a[size] = null;

        return a;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[this.size];
        int i = 0;
        for (E elem : this) {
            result[i] = elem;
            i++;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (E elem : this) {
            if (elem.equals(this.lastElement.element)) {
                result.append(elem);
            } else {
                result.append(elem).append(",");
            }
        }
        result.append("]");

        return result.toString();
    }


}
