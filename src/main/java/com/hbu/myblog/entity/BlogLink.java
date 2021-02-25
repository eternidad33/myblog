package com.hbu.myblog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 文章链接
 * @author vigilr
 * @since 2021/02/24
 */
@Data
public class BlogLink {
    private Integer linkId;
    private Byte linkType;
    private String linkName;
    private String linkUrl;
    private String linkDescription;
    private Integer linkRank;
    private Byte isDeleted;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT")
    private Date createTime;
}
