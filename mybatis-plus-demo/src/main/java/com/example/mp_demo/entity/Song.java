package com.example.mp_demo.entity;

import lombok.Data;

/**
 * @author qingchen
 * @date 8/8/2022 下午 3:37
 */
@Data
public class Song {
    private String id;
    private String createUser;
    private String createTime;
    private String name;
    private String author;
    private String duration;
    private String lyric;
}
