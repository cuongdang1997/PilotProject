package dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import bean.Brand;
import dao.BrandManagementDao;
import dao.base.BaseDaoImpl;

@Repository("brandManagementDao")
@Transactional
public class BrandManagementDaoImpl extends BaseDaoImpl<Brand, Integer> implements BrandManagementDao {

}
