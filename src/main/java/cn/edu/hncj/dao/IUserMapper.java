package cn.edu.hncj.dao;

import cn.edu.hncj.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
public interface IUserMapper {
    @Select("select * from user where username = #{username} and password = #{password}")
    public User userLogin(@Param("username") String username, @Param("password") String password);
}
