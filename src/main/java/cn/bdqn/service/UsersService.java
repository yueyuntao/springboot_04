package cn.bdqn.service;

import cn.bdqn.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersService {
    /**
     * 查询
     * @return
     */
    List<Users> getUsers() ;

    /**
     * 新增
     * @param users
     */
    void addUsers(Users users);
    /**
     * 删除
     */
    void deleteUsers(int id);
    /**
     * 修改
     */
    void updateUsers(Users users);
    Users getUsersById(int id);
}
