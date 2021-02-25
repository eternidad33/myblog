package com.hbu.myblog.service;

import java.util.Map;

/**
 * @author vigilr
 * @since 2021/02/24
 */
public interface ConfigService {
    /**
     * 修改配置项
     *
     * @param configName
     * @param configValue
     * @return
     */
    int updateConfig(String configName, String configValue);

    /**
     * 获取所有的配置项
     *
     * @return
     */
    Map<String,String> getAllConfigs();
}
