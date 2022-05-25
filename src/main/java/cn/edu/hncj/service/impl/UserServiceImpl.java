package cn.edu.hncj.service.impl;

import cn.edu.hncj.dao.IUserMapper;
import cn.edu.hncj.pojo.User;
import cn.edu.hncj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserMapper mapper;

    @Override
    public User userLogin(String username, String password) {
        User user = mapper.userLogin(username,password);
        return user;
    }
}
