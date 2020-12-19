package com.woniu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.woniu.domain.Music;
import com.woniu.mapper.MusicMapper;
import com.woniu.service.MusicService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class MusicServiceImpl extends ServiceImpl<MusicMapper, Music> implements MusicService {
    @Resource
    private MusicMapper musicMapper;
    @Resource
    private RedisTemplate<String,Object> redisTemplate;
}
