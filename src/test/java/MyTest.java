import com.weitheshinobi.pojo.Books;
import com.weitheshinobi.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookServiceImpl = context.getBean("BookServiceImpl", BookServiceImpl.class);
        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);

        }
    }
}
