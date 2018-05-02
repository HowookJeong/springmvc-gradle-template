package org.project.web.dao;

import org.apache.ibatis.session.SqlSession;
import org.project.web.model.ExampleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("exampleDAO")
public class ExampleDAOImpl implements ExampleDAO {

  @Autowired
  private SqlSession sqlSession;

  public void setSqlSession(SqlSession sqlSession) {
    this.sqlSession = sqlSession;
  }

  public ExampleModel getExample() {
    ExampleModel exampleModel = sqlSession.selectOne("getExample");

    return exampleModel;
  }
}
