package com.berry.storage.dto;

import lombok.Data;

/**
 * Title BucketInfoVo
 * Description
 *
 * @author berry_cooper
 * @version 1.0
 * @date 2019/6/14 15:41
 */
@Data
public class BucketInfo {
    /**
     * Bucket名称
     */
    private String name;

    /**
     * 读写权限
     */
    private String acl;

    /**
     * 区域 代码
     */
    private String region;

    /**
     * 区域名
     */
    private String regionName;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;
}
