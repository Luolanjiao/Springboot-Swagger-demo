package com.mydemo.swagger.controller;

import com.mydemo.swagger.model.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * @author lanjiao.luo
 * @date 2019/4/10 10:03
 **/
@RestController
@Api("HelloController|Swagger的demo")
public class HelloController {

    /***
     *别天真了，Swagger不会显示java代码注释
     * @param name 名字
     * @return
     */
    @RequestMapping(value = "/getHi",method = RequestMethod.GET)
    @ApiOperation("打招呼get测试")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "query", name = "name",value = "名字")})
    public String hello(@RequestParam(value = "name") String name){
        System.out.println("你好");
        return  "你好 "+name;
    }

    @RequestMapping(value = "/postHi",method = RequestMethod.POST)
    @ApiOperation("打招呼post测试")
    public String postHello(@RequestBody User user){
        System.out.println("你好");
        return  "你好 "+user.getName();
    }

    @RequestMapping(value = "/postHiError",method = RequestMethod.POST)
    @ApiOperation("打招呼post测试错误配置-paramType参数不匹配，应该是\"body\"")
    @ApiImplicitParam(paramType = "query",name="name",value = "名字")
    public String postHello2(@RequestBody String name){
        System.out.println("你好");
        return  "你好 "+name;
    }

}
