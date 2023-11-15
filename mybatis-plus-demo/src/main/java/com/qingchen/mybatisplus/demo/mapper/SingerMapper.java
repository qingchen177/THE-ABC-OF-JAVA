package com.qingchen.mybatisplus.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.qingchen.mybatisplus.demo.entity.Singer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 歌手表 Mapper 接口
 * </p>
 *
 * @author qingchen
 * @since 2022-08-08
 */
@Mapper
public interface SingerMapper extends BaseMapper<Singer> {

    void updateCustomSql(@Param(Constants.WRAPPER) LambdaQueryWrapper<Singer> wrapper);
}
