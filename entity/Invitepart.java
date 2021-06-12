package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 孙宏宇
 * @since 2021-06-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("invitepart")
@XStreamAlias("Invite_Part")
public class Invitepart implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("DialStr")
    @XStreamAlias("DialStr")
    private String DialStr;

    @TableField("PartName")
    @XStreamAlias("PartName")
    private String PartName;

    @TableField("ProtocolType")
    @XStreamAlias("ProtocolType")
    private String ProtocolType;


}
