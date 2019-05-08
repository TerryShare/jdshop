package com.example.jdshop.controller;

import com.example.jdshop.domain.User;
import com.example.jdshop.vo.Result;
import com.example.jdshop.vo.ResultCode;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Greated by Terry on 2019/5/7
 * Time: 15:24
 */
@Controller
@RequestMapping("/")
public class UserController {

    @ApiOperation(value = "接口返回码测试", notes = "接口返回码测试")
    @PutMapping("testcode")
    @ResponseBody
    public Result testApiCode(@RequestBody int id) {
        if (id == 10) {
            return  Result.success(id);
        }else{
            return  Result.failure(ResultCode.USER_NOT_LOGGED_IN);
        }
    }


}
