package service;

import dao.CartDAO;

public class CartService {

	@SuppressWarnings("unused")
	public void getAllBooks() {
		CartDAO cartDAO = new CartDAO();
		cartDAO.getAll();
		
	}
}
