package APP;

import java.util.Iterator;

import Queue.QueueEmptyException;
import Queue.QueueFullException;
import doubleLinkedList.DobleListQueue;

public class app {

	public static void main(String[] args) throws QueueEmptyException {
		/*doubleLinkedList<String> name=new doubleLinkedList<String>();
		doubleLinkedList<String> name2=new doubleLinkedList<String>();
		doubleLinkedList<Integer> num1=new doubleLinkedList<Integer>();
		doubleLinkedList<Integer> num2=new doubleLinkedList<Integer>();
		doubleLinkedList<Integer> Newnum=new doubleLinkedList<Integer>();
		ListIterator <Integer>lit=Newnum.listiterator();*/
		DobleListQueue <String> names=new DobleListQueue<String>();
		Iterator <String> it=names.iterator();
		
		try {
			names.enQueue("Gustavo");
			names.enQueue("Ana");
			names.enQueue("Roxana");
			names.enQueue("Alberto");
			names.enQueue("Andrea");
			names.deQueue();
			names.enQueue("Luis");
			//System.out.println("Front: "+names.front());
			//System.out.println("Search: "+names.search("Alberto"));
			//names.clear();
			
			System.out.println("----------Lista----------");
			names.list(it);
		}catch (QueueEmptyException | QueueFullException a ) {
			a.printStackTrace();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		
		
		
		
		
		
		/*name.addFirst("Kurosaki");
		name.addFirst("Matsumoto");
		name.addFirst("Ishimaru");
		name.addFirst("Toshiro");
		name.addLast("GUS");
		
		name2.addFirst("Kurosaki");
		name2.addFirst("Matsumoto");
		name2.addFirst("Ishimaru");
		name2.addFirst("Toshiro");
		name2.addLast("GUS");
		
		num1.addFirst(5);
		num1.addFirst(4);
		num1.addFirst(3);
		num1.addFirst(2);
		num1.addFirst(1);
		
		num2.addFirst(10);
		num2.addFirst(9);
		num2.addFirst(8);
		num2.addFirst(7);
		num2.addFirst(6);
		
		
		//name.Remove("GUS");
		//name.removeFirst();
		//name.removeLast();
		//name.removeBefore("Ishimaru");
		//name.removeAfter("Kurosaki");
		//System.out.println(name.size());
		//name.clear();
		
		
		//System.out.println(name.SonIguales(name2));
		//System.out.println(name2.ExisteElemento("Matsumoto"));
		//System.out.println(name.Ocurrencia("Matsumoto"));
		//System.out.println(num.Suma());
		
		Newnum=Newnum.merge(num1, num2);
		
		System.out.println(Newnum.isEmpty());
		
		Newnum.list(lit);
		System.out.println("-------------------");
		
		Newnum.listB(lit);
		System.out.println("-------------------");
		*/
		
	}

}
