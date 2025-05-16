package cart;

public class CartItemNode {
	private CartItem data;
	private CartItemNode next;
	
	public CartItemNode(CartItem data, CartItemNode next) {
		this.data = data;
		this.next = next;
	}
	
	public CartItemNode(CartItem data) {
		this.data = data;
	} 
	
	public void setData(CartItem data) {
		this.data = data;
	}
	
	public void setNext(CartItemNode next) {
		this.next = next;
	}
	
	public CartItem getData() {
		return data;
	}
	
	public CartItemNode getNext() {
		return next;
	}
}
