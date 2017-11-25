package Queue;

import java.lang.reflect.Array;
import java.util.Iterator;

public class Queue<T extends Comparable<T>> implements iQueue<T>, Iterable<T> {
	private T[] data = null;
	private Class<T> type = null;
	private int front = -1;// salida
	private int back = 0;// guardar
	private int count = 0;

	public Queue(Class<T> type) {
		data = (T[]) Array.newInstance(type, 10);
		this.type = type;
	}

	public Queue(Class<T> type, int size) {
		data = (T[]) Array.newInstance(type, size);
		this.type = type;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enQueue(T value) throws QueueFullException {
		if (isFull())
			throw new QueueFullException("sta` ieena goe");
		data[back++ % data.length] = value;
		count++;
	}

	@Override
	public T deQueue() throws QueueEmptyException {
		if (isEmpty())
			throw new QueueEmptyException("sss echale algo goe");
		count--;
		return data[++front % data.length];
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public boolean isFull() {
		return (count == data.length);
	}

	@Override
	public T front() throws QueueEmptyException {
		if (isEmpty())
			throw new QueueEmptyException("sss echale algo goe");
		return data[(front+1) % data.length];
	}

	@Override
	public T search(T value) throws QueueEmptyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean frontOf(T value, int priority) throws QueueFullException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int isize() {
		// TODO Auto-generated method stub
		return 0;
	}


}