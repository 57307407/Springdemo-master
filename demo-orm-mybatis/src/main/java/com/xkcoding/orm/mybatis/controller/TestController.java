package com.xkcoding.orm.mybatis.controller;


import com.xkcoding.orm.mybatis.entity.User;
import com.xkcoding.orm.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 测试Controller
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-10-02 20:49
 */
@Controller
public class TestController {
    @Autowired
    UserMapper userMapper;
    @GetMapping("/json")
    @ResponseBody
    public List jsonException() {
      List<User> users = userMapper.selectAllUser();
      return users;
    }


}
