package com.liu.boot.middleware.server.controller;

import com.liu.boot.middleware.api.StatusCode;
import com.liu.boot.middleware.api.response.BaseResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
     *基本功能controller
     */
@RestController
@RequestMapping("base")
public class BaseController {

    public BaseResponse info(){
        BaseResponse response = new BaseResponse(StatusCode.Success);

        try {
            response.setData("lxyxyyxyyxyxyxyxyxyyxyxyxxyxyxyyx");

        }catch (Exception e){
            response = new BaseResponse(StatusCode.Fail.getCode(),e.getMessage());
        }


        return response;
    }
}
