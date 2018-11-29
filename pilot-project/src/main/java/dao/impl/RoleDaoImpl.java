package dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import bean.Role;
import dao.RoleDao;
import dao.base.BaseDaoImpl;

@Repository("roleDao")
@Transactional
public class RoleDaoImpl extends BaseDaoImpl<Role, Integer> implements RoleDao {

}
