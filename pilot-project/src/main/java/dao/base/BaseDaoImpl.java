package dao.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

@NoRepositoryBean
@SuppressWarnings("unchecked")
@Transactional
public class BaseDaoImpl<E, K extends Serializable> implements BaseDao<E, K> {

	protected Logger logger = Logger.getLogger(getClass());

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Class<? extends E> daoType;
	
	public BaseDaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		daoType = (Class<? extends E>) pt.getActualTypeArguments()[0];
	}
	
	/**
	 * Get Session
	 * 
	 * @return session
	 */
	public Session getSession() {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.setFlushMode(FlushMode.MANUAL);
		return currentSession;
	}
	
	public K save(E entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(E entity) {
		// TODO Auto-generated method stub
		
	}

	public void saveOrUpdate(E entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(E entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(K key) {
		// TODO Auto-generated method stub
		
	}

	public Object uniqueResult(Criteria criteria) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public long countAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	public long countCriteria(Map<String, Object> mapCriteria) {
		// TODO Auto-generated method stub
		return 0;
	}

	public long countQuery(String query) {
		// TODO Auto-generated method stub
		return 0;
	}

	public E find(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<E> search(Criteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Get Record in the Table
	 * 
	 * @return List<E>
	 */
	@Override
	public List<E> getAll() {
		return getSession().createCriteria(daoType).list();
	}

	
}
