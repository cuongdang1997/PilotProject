package service;

import java.util.Map;

import bean.Product;
import service.base.BaseService;

public interface ProductManagementService extends BaseService<Product, Integer>{

	/**
	 * Search Book
	 * 
	 * @param item
	 * @return Map<String, Object>
	 */
	Map<String, Object> searchProduct(Product item);

	/**
	 * Add Book
	 * 
	 * @param item
	 * @return Map<String, Object>
	 */
	Map<String, Object> addProduct(Product item);

	/**
	 * Edit book
	 * 
	 * @param item
	 * @return Map<String, Object>
	 */
	Map<String, Object> editProduct(Product item);

	/**
	 * Delete Book
	 * 
	 * @param itemId
	 * @param imageUrl
	 * @return boolean
	 */
	boolean deleteProduct(int idProduct, String avatar);
}
