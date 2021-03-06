package org.yarlithub.yschool.repository.model.dao.yschool.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import org.yarlithub.yschool.repository.model.obj.yschool.Subject;
import org.springframework.stereotype.Repository;
import org.yarlithub.yschool.repository.model.dao.yschool.SubjectDao;
 
 
/**
 * DAO for table: Subject.
 * @author autogenerated
 */
@Repository
public class SubjectDaoImpl extends GenericHibernateDaoImpl<Subject, Integer> implements SubjectDao {
	
	/** Constructor method. */
		public SubjectDaoImpl() {
			super(Subject.class);
		}
	}

