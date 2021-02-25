package com.hbu.myblog.mapper;

import com.hbu.myblog.entity.BlogLink;
import com.hbu.myblog.util.PageQueryUtil;

import java.util.List;

/**
 * @author vigilr
 * @since 2021/02/25
 */
public interface BlogLinkMapper {
    int deleteByPrimaryKey(Integer linkId);

    int insert(BlogLink record);

    int insertSelective(BlogLink record);

    BlogLink selectByPrimaryKey(Integer linkId);

    int updateByPrimaryKeySelective(BlogLink record);

    int updateByPrimaryKey(BlogLink record);

    List<BlogLink> findLinkList(PageQueryUtil pageUtil);

    int getTotalLinks(PageQueryUtil pageUtil);

    int deleteBatch(Integer[] ids);
}