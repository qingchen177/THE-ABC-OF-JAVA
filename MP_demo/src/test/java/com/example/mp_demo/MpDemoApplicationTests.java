package com.example.mp_demo;

import com.example.mp_demo.entity.Song;
import com.example.mp_demo.mapper.SongMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MpDemoApplicationTests {

    @Autowired
    private SongMapper songMapper;

    @Test
    void contextLoads() {
        List<Song> songList = songMapper.selectList(null);
        songList.forEach(System.out::println);
    }

}
