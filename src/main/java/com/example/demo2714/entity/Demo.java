package com.example.demo2714.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author zhongjiahua
 * @date 2023-08-17
 */
@Setter
@Getter
@ToString
@TableName("demo")
public class Demo {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("text_str")
    private String textStr;
}
