import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {


    @org.junit.Test
    public void test(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:applicationContext_dao.xml");
        ItemsDao itemsDao = ioc.getBean(ItemsDao.class);
        List<Items> items = itemsDao.findAll();
        for (Items item : items) {
            System.out.println(item);
        }
    }
}
