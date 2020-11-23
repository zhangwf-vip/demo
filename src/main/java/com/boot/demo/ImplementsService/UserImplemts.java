package com.boot.demo.ImplementsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.entity.User;
import com.boot.demo.mapper.UserMapper;
import com.boot.demo.service.IUserImplemts;

import java.util.Optional;

@Service
public class UserImplemts implements IUserImplemts {

    @Autowired
    private UserMapper userMapper;

    /**
     * @Title: getUserInfo @Description: 获取用户信息 @author: @date:
     * 2019年12月20日 @param @return @throws
     */
    @Override
    public Optional<User> getUserInfo(String userId) {
        // TODO Auto-generated method stub
        return Optional.ofNullable(userMapper.getUserInfo(userId));
    }

    /**
     * @Title: userLogin @Description: 用户登录 @author: @date:
     * 2019年12月20日 @param @return @throws
     */
    @Override
    public Optional<User> userLogin(String userName, String passWord) {
        // TODO Auto-generated method stub
         return Optional.ofNullable(userMapper.userLogin(userName, passWord));
    }

    @Override
    /**
     *
     * @Title: insertUser @Description: 增加用户信息 @author: @date:
     *         2019年12月20日 @param @return @throws
     */
    public String insertUser(User user) {
        return null;
    }

    @Override
    /**
     *
     * @Title: updateUSer @Description: 修改用户信息 @author: @date:
     *         2019年12月20日 @param @return @throws
     */
    public String updateUSer(User user) {
        return null;
    }

    @Override
    /**
     *
     * @Title: deleteUser @Description: 删除用户信息 @author: @date:
     *         2019年12月20日 @param @return @throws
     */
    public String deleteUser(String userId) {
        return null;
    }


}