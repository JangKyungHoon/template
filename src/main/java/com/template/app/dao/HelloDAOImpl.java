package com.template.app.dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("helloDAO")
public class HelloDAOImpl implements HelloDAO {
	final String NAMESPACE = HelloDAO.class.getName();
	
	@Autowired
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public String hello() {
		return sqlSession.selectOne(this.NAMESPACE + ".selectHello");
	}
}
