package com.boot.demo.service;

import org.springframework.stereotype.Service;

import com.boot.demo.entity.User;

import java.util.Optional;

@Service
public interface IUserImplemts {

    /**
     * @return 参数 @return User 返回类型 @throws
     * @Title: getUserInfo @Description: TODO(获取用户信息) @author: Administrator @date:
     * 2019年12月20日 上午10:25:43 @param @param userId @param @param
     */
    Optional<User> getUserInfo(String userId);

    /**
     * @Title: userLogin @Description: TODO(用户登录) @author: Administrator @date:
     * 2019年12月20日 上午10:26:16 @param @param userName @param @param
     * passWord @param @return 参数 @return User 返回类型 @throws
     */
    Optional<User> userLogin(String userName, String passWord);

    /**
     * @Title: insertUser @Description: TODO(添加用户) @author: Administrator @date:
     * 2019年12月20日 上午10:26:45 @param @param user @param @return 参数 @return
     * String 返回类型 @throws
     */
    String insertUser(User user);

    /**
     * @Title: updateUSer @Description: TODO(修改用户) @author: Administrator @date:
     * 2019年12月20日 上午10:26:58 @param @param user @param @return 参数 @return
     * String 返回类型 @throws
     */

    String updateUSer(User user);


    /**
     * @Title: deleteUser @Description: TODO(删除用户) @author: Administrator @date:
     * 2019年12月20日 上午10:27:09 @param @param userId @param @return 参数 @return
     * String 返回类型 @throws
     */

    String deleteUser(String userId);

}