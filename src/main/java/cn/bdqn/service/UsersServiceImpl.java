package cn.bdqn.service;
import cn.bdqn.mapper.UsersMapper;
import cn.bdqn.pojo.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;
    @Override
    public List<Users> getUsers() {
        return usersMapper.getUsers();
    }

    @Override
    public void addUsers(Users users) {
        usersMapper.addUsers(users);
    }

    @Override
    public void deleteUsers(int id) {
        usersMapper.deleteUsers(id);
    }

    @Override
    public void updateUsers(Users users) {
        usersMapper.updateUsers(users);
    }

    @Override
    public Users getUsersById(int id) {
        return usersMapper.getUsersById(id);
    }
}
