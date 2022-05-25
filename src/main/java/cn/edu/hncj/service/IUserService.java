package cn.edu.hncj.service;

import cn.edu.hncj.pojo.User;

public interface IUserService {
    User userLogin(String username,String password);
}
