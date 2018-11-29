package service.impl;

import org.springframework.stereotype.Service;

import bean.Role;
import service.RoleService;
import service.base.BaseServiceImpl;

@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<Role, Integer> implements RoleService {

}
