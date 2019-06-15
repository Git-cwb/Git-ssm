import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ServiceTest {



    @Test
    public void test01(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:applicationContext_service.xml");
        ItemsService itemsService = ioc.getBean(ItemsService.class);
        List<Items> items = itemsService.findAll();
        for (Items item : items) {
            System.out.println(item);
        }
    }
}
