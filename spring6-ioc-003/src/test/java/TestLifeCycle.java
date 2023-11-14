import com.lingyu.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {

    // 具体的生命周期过程**
    //- bean对象创建（调用无参构造器）
    //- 给bean对象设置属性
    //- bean的后置处理器（初始化之前）
    //- bean对象初始化（需在配置bean时指定初始化方法）
    //- bean的后置处理器（初始化之后）
    //- bean对象就绪可以使用
    //- bean对象销毁（需在配置bean时指定销毁方法）  **destroy-method 指定对象的销毁方法(仅对单例模式有效)**
    //- IOC容器关闭
    @Test
    public void testLife(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        User bean = ac.getBean(User.class);
        System.out.println("生命周期：4、通过IOC容器获取bean并使用");
        ac.close();
    }


    @Test
    public void testUserFactoryBean(){
        //获取IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }
}
