package dao.impl;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

import bean.User;
import dao.base.BaseDaoImpl;


public class UserDaoImpl extends BaseDaoImpl<User, Integer> {

	protected static final Logger logger = (Logger) LoggerFactory.getLogger(UserDaoImpl.class);
	
	
	/*@Override
	public Optional<User> findByUsername(String username) {
		*//**
		 * logger.info("SSO : {}", sso);
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("ssoId", sso));
        User user = (User)crit.uniqueResult();
        if(user!=null){
            Hibernate.initialize(user.getUserProfiles());
        }
        return user;
		 *//*
		logger.info("UserName: {}");
		Criteria crit = getSession().createCriteria(daoType);
		crit.add(Restrictions.eq("userName", username));
		User user = (User) crit.uniqueResult();
		return Optional.of(user);
	}

	@Override
	public Boolean existsByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}*/
}
