package com.hbu.myblog.service;

import com.hbu.myblog.entity.BlogLink;
import com.hbu.myblog.util.PageQueryUtil;
import com.hbu.myblog.util.PageResult;

import java.util.List;
import java.util.Map;

/**
 * @author vigilr
 * @since 2021/02/24
 */
public interface LinkService {
    /**
     * 查询友链的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogLinkPage(PageQueryUtil pageUtil);

    int getTotalLinks();

    Boolean saveLink(BlogLink link);

    BlogLink selectById(Integer id);

    Boolean updateLink(BlogLink tempLink);

    Boolean deleteBatch(Integer[] ids);

    /**
     * 返回友链页面所需的所有数据
     *
     * @return
     */
    Map<Byte, List<BlogLink>> getLinksForLinkPage();
}
