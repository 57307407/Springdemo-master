package com.xkcoding.orm.mybatis.plus.controller;


import com.xkcoding.orm.mybatis.plus.entity.User;
import com.xkcoding.orm.mybatis.plus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {
  @Autowired
  UserMapper userMapper;

  @GetMapping("/json")
  @ResponseBody
  public List select()
  {
    System.out.println("qwew");
    List<User> users = userMapper.selectList(null);
    return users;
  }
}
