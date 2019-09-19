package cn.bdqn.mapper;

import cn.bdqn.pojo.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper {


 //查询
    @Select("select * from users")
    List<Users> getUsers();

    /**
     * 新增
     * @param users
     */
    @Insert("INSERT INTO users VALUES(NULL,#{name},#{pwd})")
    void addUsers(Users users);
    /**
     * 删除
     */
    @Delete("DELETE FROM users WHERE id=#{id}")
    void deleteUsers(int id);
    /**
     * 修改
     */
    @Update("UPDATE users SET `name`=#{name},pwd=#{pwd}  WHERE id=#{id}")
    void updateUsers(Users users);
    @Select("select * from users where id=#{id}")
    Users getUsersById(int id);
}
