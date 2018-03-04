package com.yy;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Song on 2017/2/15.
 * 官方示例工程中的测试代码
 */
@Controller
public class CJController {
    @RequestMapping("/cj/ilove")
    @ResponseBody
    public String home() {
        return "i love yy!";
    }

}