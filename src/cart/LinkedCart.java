package cart;

import shop.ClothingItem;

public class LinkedCart {
	private CartItemNode first;
	private int size;
	
	public LinkedCart() {
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public int find(String name, char size) {
		if (size == 0) {
			return -1;
		}
		CartItemNode temp = first;
		int i = 0;
		while (temp != null && temp.getData() != null ) {
			ClothingItem ci = temp.getData().getClothingItem();
			if (ci.getName().equals(name) && ci.getSize() == size) {
				return i;
			}
			i++;
			temp = temp.getNext();
		} 
		
		return -1;
	}
	
	public CartItem find(int index) {
		if (index == -1 || index >= size) {
			return null;
		}
		CartItemNode temp = first;
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		
		return temp.getData();
	}
	
	public int size() {
		return size;
	}
	
	public void insert(int index, CartItem item) {
		if (index > size) {
			return;
		}
		if (index == 0) {
			CartItemNode newCin = new CartItemNode(item, first);
			first = newCin;
			size++;
			return;
		}
		CartItemNode temp = first;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.getNext();
		}
		CartItemNode newCin = new CartItemNode(item, temp.getNext());
		size++;
		temp.setNext(newCin);
	}
	
	public CartItem remove(int index) {
		if (index > size) {
			return null;
		}
		CartItem ci;
		if (index == 0) {
			ci = first.getData();
			first = first.getNext();
			size--;
			return ci;
		}
		CartItemNode temp = first;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.getNext();
		}
		CartItemNode toRemove = temp.getNext();
		ci = toRemove.getData();
		temp.setNext(toRemove.getNext());
		size--;
		return ci;
	}
}
