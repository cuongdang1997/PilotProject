package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bean.Brand;
import dao.base.BaseDao;
import service.BrandManagementService;
import service.base.BaseServiceImpl;

@Service("brandManagementService")
@Transactional
public class BrandManagementServiceImpl extends BaseServiceImpl<Brand, Integer> implements BrandManagementService {

	@Autowired
	public BrandManagementServiceImpl(@Qualifier("brandManagementDao") BaseDao<Brand, Integer> baseDao) {
		super(baseDao);
	}
	
	
}
