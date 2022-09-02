package springorm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springorm.entity.Titan;
@EnableTransactionManagement
@Component("titandao")
public class Titandao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Autowired
	private Titan titan;
	public Titandao() {
		
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public Titan getTitan() {
		return titan;
	}
	public void setTitan(Titan titan) {
		this.titan = titan;
	}
	
	@Transactional()
	public int insert(Titan titan) {
		 Integer i=(Integer) this.hibernateTemplate.save(titan);
		return i;
	}
	
	public Titan gettitan(int id) {
		Titan t=this.hibernateTemplate.get(Titan.class,id);
		return t;
	}
	public List<Titan> getAllTitan(){
		List<Titan> t=this.hibernateTemplate.loadAll(Titan.class);
		
		return t;
	}
	@Transactional
	public void updatTitan(Titan t) {
		this.hibernateTemplate.update(t);
	}
	@Transactional
	public void deleteTitan(int id) {
		Titan titan=this.hibernateTemplate.get(Titan.class,id);
		this.hibernateTemplate.delete(titan);
	}

}
