package com.example.mp_demo.mapper;

import com.example.mp_demo.entity.Singer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

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

}
