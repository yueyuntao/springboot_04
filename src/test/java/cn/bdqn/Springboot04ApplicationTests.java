package cn.bdqn;

import cn.bdqn.pojo.Users;
import cn.bdqn.service.UsersService;
import cn.bdqn.service.UsersServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot04ApplicationTests {
    @Resource
 UsersService usersService;
    @Test
    public void contextLoads() {
        List<Users> users = usersService.getUsers();
        for (Users list: users) {
            System.out.println(list.getName());
        }
    }

}
