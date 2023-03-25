package com.qingchen.mybatisplus.demo.service.impl;

import com.qingchen.mybatisplus.demo.entity.Singer;
import com.qingchen.mybatisplus.demo.mapper.SingerMapper;
import com.qingchen.mybatisplus.demo.service.SingerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 歌手表 服务实现类
 * </p>
 *
 * @author qingchen
 * @since 2022-08-08
 */
@Service
public class SingerServiceImpl extends ServiceImpl<SingerMapper, Singer> implements SingerService {

}
