package test;

import com.yc.dao.ChildCategoryMapper;
import com.yc.domain.ChildCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test1 {

    @Autowired
    private ChildCategoryMapper childCategoryMapper;
    @Test
    public void test1(){
        ChildCategory childCategory = childCategoryMapper.selectByPrimaryKey(1);
        System.out.println(childCategory);
    }
}
