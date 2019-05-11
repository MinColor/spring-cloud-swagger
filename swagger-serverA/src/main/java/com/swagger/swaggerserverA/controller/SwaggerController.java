package com.swagger.swaggerserverA.controller;

import com.alibaba.fastjson.JSONPObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


@Api(description = "Swagger2测试服务API接口")
@RestController
public class SwaggerController {

    @ApiOperation(value = "SwaggerController-测试", notes = "SwaggerController-测试9999")
    @RequestMapping(value="/querySwaggerInfo/{name}",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String QuerySwaggerInfo(@PathVariable(value = "name") String name){
        JSONPObject object =new JSONPObject();
        object.addParameter(name);
        object.addParameter("1000");
        return object.toJSONString();
    }


}
