package com.example.mp_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mp_demo.entity.Song;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author qingchen
 * @date 8/8/2022 下午 3:40
 */
@Mapper
public interface SongMapper extends BaseMapper<Song> {
}
