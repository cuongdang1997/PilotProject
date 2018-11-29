package service.impl;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bean.Product;
import service.ProductManagementService;
import service.base.BaseServiceImpl;

@Service("productManagementService")
@Transactional
public class ProductManagementServiceImpl extends BaseServiceImpl<Product, Integer> implements ProductManagementService {

	protected static Logger LOGGER = Logger.getLogger(ProductManagementServiceImpl.class);

	@Override
	public Map<String, Object> searchProduct(Product item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> addProduct(Product item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> editProduct(Product item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProduct(int idProduct, String avatar) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
