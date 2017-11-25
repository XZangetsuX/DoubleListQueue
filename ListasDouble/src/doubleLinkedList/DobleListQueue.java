package doubleLinkedList;

import java.util.Iterator;

import NODO.nodo;
import Queue.QueueEmptyException;
import Queue.QueueFullException;

public class DobleListQueue <T extends Comparable <T>> implements Queue.iQueue<T>,Iterable <T> {

	private nodo<T> start = null, end = null;
	private int size=5;
	private int count=0;

	
	public DobleListQueue() { // Constructor de la clase padre
		start = new nodo();
		start.setIndex(-1); // Inisialisa los nodos de la lista start y end
		end = new nodo();
		end.setIndex(-1);
	}

	public DobleListQueue(T value) { // Constructor de la clase hijo
		this(); // Asina los get y next de start y end para crear
				// la lista.
		end.setBack(new nodo<T>(value));
		start.setNext(end.getBack());
		start.getNext().setIndex(0);
	}
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				nodo<T> sig = start;
				start = start.getNext();
				return (start != null) ? true : false;
			}

			@Override
			public T next() {
				// TODO Auto-generated method stub
				return start.getValue();
			}
		};
	}

	@Override
	public void enQueue(T value) throws QueueFullException {
		// TODO Auto-generated method stub
		if(isFull()) { throw new QueueFullException("Pila Llena!!");}
		nodo<T> tmp = end.getBack();
		end.setBack(new nodo<T>(value));
		if (tmp == null) {
			start.setNext(end.getBack());
		} else {
			end.getBack().setBack(tmp);
			tmp.setNext(end.getBack());
		}
		count++;
	}
	

	@Override
	public T deQueue() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(isEmpty()) { throw new QueueEmptyException("Pila vacia!!");}
		return deQueue(start);
	}
	private T deQueue(nodo<T> list) {
		nodo<T> tmp=list;
		T value=tmp.getNext().getValue();
		if(tmp.getNext()==null) {
			return null;
		}else {
		tmp.setNext(tmp.getNext().getNext());
		
		}
		count--;
		return value;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count<=0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return count == size ;
	}

	@Override
	public T front() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(isEmpty()) { throw new QueueEmptyException("Pila vacia!!");}
		nodo<T> tmp = start.getNext(); 
		return tmp.getValue();
		
		
	}

	@Override
	public T search(T value) throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(isEmpty()) { throw new QueueEmptyException("Pila vacia!!");}
		return search(value, start, end);
	}
	private T search(T value, nodo<T> start, nodo<T> end) {
		if (start.getNext() == null || end.getBack() == null) {
			// Metodo que returna el nodo del valor
			return null; // a buscar.
		} else if (start.getNext().getValue().equals(value)) {
			return start.getNext().getValue();
		} else if (end.getBack().getValue().equals(value)) {
			return end.getBack().getValue();
		} else if (start.getNext().equals(end) || start.equals(end)) {
			return null;
		}
		return search(value, start.getNext(), end.getBack());
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		nodo<T> tmp; // Metodo que elimina los nodos de la lista
		nodo<T> tmp1;
		while (start.getNext() != null) {
			tmp = start.getNext();
			tmp1 = end.getBack();
			start.setNext(null);
			end.setBack(null);
			start = tmp;
			end = tmp1;
		}
		System.gc();
		
	}

	@Override
	public boolean frontOf(T value, int priority) throws QueueFullException {
		// TODO Auto-generated method stub
		if(isFull()) { throw new QueueFullException("Pila Llena!!");}
		return false;
	}

	@Override
	public int isize() {
		// TODO Auto-generated method stub
		return count;
	}
	public void list(Iterator it) {

		while (it.hasNext()) {
			System.out.println(it.next());// Metodo que imprime la lista del primero al ultimo
		}
	}

}
