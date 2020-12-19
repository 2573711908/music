package com.woniu.controller;

import com.woniu.domain.Music;
import com.woniu.dto.Result;
import com.woniu.service.MusicService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/music")
public class MusicController {
    @Resource
    private MusicService musicService;

    @PutMapping("/addMusic/{name}")
    public Result saveMusic (@PathVariable String name){


        return new Result();
    }
}
