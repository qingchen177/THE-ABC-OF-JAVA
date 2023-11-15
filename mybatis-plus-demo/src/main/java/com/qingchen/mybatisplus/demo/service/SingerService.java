package com.qingchen.mybatisplus.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.qingchen.mybatisplus.demo.entity.Singer;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 歌手表 服务类
 * </p>
 *
 * @author qingchen
 * @since 2022-08-08
 */
public interface SingerService extends IService<Singer> {

    void updateCustomSql(LambdaQueryWrapper<Singer> wrapper);
}
