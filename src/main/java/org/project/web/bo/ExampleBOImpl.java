package org.project.web.bo;

import javax.annotation.Resource;
import org.project.web.dao.ExampleDAO;
import org.project.web.model.ExampleModel;
import org.springframework.stereotype.Service;

@Service("exampleBO")
public class ExampleBOImpl implements ExampleBO {

  @Resource(name="exampleDAO")
  private ExampleDAO exampleDAO;

  public ExampleModel getExample() {
    return exampleDAO.getExample();
  }
}
