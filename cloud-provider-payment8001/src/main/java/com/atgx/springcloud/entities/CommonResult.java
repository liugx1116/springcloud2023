package com.atgx.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: liugx
 * @CreateTime: 2023-02-27  11:51
 * @Description: Json封装实体
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult <T>{
    private Integer code;
    private String messae;
    private  T data;

    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }

}
