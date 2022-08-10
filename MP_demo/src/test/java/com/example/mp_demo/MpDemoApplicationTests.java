package com.example.mp_demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mp_demo.entity.Singer;
import com.example.mp_demo.mapper.SingerMapper;
import com.example.mp_demo.service.SingerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MpDemoApplicationTests {

    @Autowired
    private SingerMapper singerMapper;

    @Autowired
    private SingerService singerService;

    @Test
    void mapperInsert() {
        Singer singer = new Singer();
        singer.setName("陶喆");
        singer.setAge(22);
        singer.setOther("空无一人 这片沙滩~");
        int i = singerMapper.insert(singer);
        System.out.println("i = " + i);
    }

    @Test
    void mapperSelectById() {
        String id1 = "1556577794717298690";
        String id2 = "1556592930551185410";
        String id3 = "1556593922332053506";

        List<String> ids = new ArrayList<>();
        ids.add(id1);
        ids.add(id2);
        ids.add(id3);

        Singer singer = singerMapper.selectById(id1);
        System.out.println("===================根据单个id查询：\n" + singer.toString());

        List<Singer> singers = singerMapper.selectBatchIds(ids);
        System.out.println("===================根据多个id查询：");
        singers.forEach(System.out::println);
    }

    @Test
    void mapperSelectOne() {
        QueryWrapper<Singer> wrapper = new QueryWrapper<>();
        wrapper.eq("age",18);
        Singer singer = singerMapper.selectOne(wrapper);
        System.out.println("singer = " + singer.toString());
    }

    @Test
    void mapperSelectList() {
        List<Singer> singers = singerMapper.selectList(null);
        singers.forEach(System.out::println);
    }

    @Test
    void mapperSelectByMap() {
        Map map=new HashMap<>();
        map.put("age",18);
        List<Singer> singers = singerMapper.selectByMap(map);
        singers.forEach(System.out::println);
    }

    @Test
    void mapperSelectMaps() {
        List<Map<String, Object>> maps = singerMapper.selectMaps(null);
        maps.forEach(System.out::println);
    }

    @Test
    void mapperSelectObjs() {
        List<Object> objects = singerMapper.selectObjs(null);
        objects.forEach(System.out::println);
    }

    @Test
    void mapperSelectPage() {
        IPage<Singer> singerIPage = singerMapper.selectPage(new Page<>(1,10), null);
        singerIPage.getRecords().forEach(System.out::println);
    }

    @Test
    void mapperSelectMapsPage() {
        Page<Map<String, Object>> mapPage = singerMapper.selectMapsPage(new Page<>(1, 10), null);
        mapPage.getRecords().forEach(System.out::println);
    }

    @Test
    void mapperSelectCount() {
        Long count = singerMapper.selectCount(null);
        System.out.println("count = " + count);
    }

    @Test
    void mapperUpdate() {
        QueryWrapper<Singer> wrapper = new QueryWrapper<>();
        wrapper.eq("age",17);
        Singer singer = singerMapper.selectOne(wrapper);
        System.out.println("singer.toString() = " + singer.toString());
        singer.setOther("改一下");
        singerMapper.update(singer,wrapper);
        System.out.println("=============================update======================================");
        List<Singer> singers = singerMapper.selectList(null);
        singers.forEach(System.out::println);
    }

    @Test
    void mapperUpdateById() {
        QueryWrapper<Singer> wrapper = new QueryWrapper<>();
        wrapper.eq("age",17);
        Singer singer = singerMapper.selectOne(wrapper);
        System.out.println("singer.toString() = " + singer.toString());
        singer.setOther("改回来");
        singerMapper.updateById(singer);
        System.out.println("=============================update======================================");
        List<Singer> singers = singerMapper.selectList(null);
        singers.forEach(System.out::println);
    }

    @Test
    void mapperDelete(){
        QueryWrapper<Singer> wrapper = new QueryWrapper<>();
        wrapper.eq("age",22);
        singerMapper.delete(wrapper);
        System.out.println("=============================delete======================================");
        List<Singer> singers = singerMapper.selectList(null);
        singers.forEach(System.out::println);
    }

    @Test
    void mapperDeleteBatchsIds(){
        ArrayList<String> ids = new ArrayList<>();
        ids.add("1556830638657703938");
        singerMapper.deleteBatchIds(ids);
        System.out.println("=============================delete======================================");
        List<Singer> singers = singerMapper.selectList(null);
        singers.forEach(System.out::println);
    }

    @Test
    void mapperDeleteByMap(){
        Map<String,Object> map=new HashMap<>();
        map.put("age",22);
        singerMapper.deleteByMap(map);
        System.out.println("=============================delete======================================");
        List<Singer> singers = singerMapper.selectList(null);
        singers.forEach(System.out::println);
    }

    @Test
    void serviceSave() {
        Singer singer = new Singer();
        singer.setName("周杰伦2");
        singer.setAge(18);
        singer.setOther("爱你穿越时间，两行来自秋末的眼泪");
        boolean save = singerService.save(singer);
        System.out.println("save = " + save);
    }

    @Test
    void serviceSaveBatch() {
        Singer singer1 = new Singer();
        singer1.setName("周杰伦7");
        singer1.setAge(18);
        singer1.setOther("不懂你的黑色幽默");

        Singer singer2 = new Singer();
        singer2.setName("周杰伦8");
        singer2.setAge(18);
        singer2.setOther("周杰伦周杰伦周杰伦周杰伦周杰伦，你的完美主义太彻底");

        List<Singer> singers=new ArrayList<>();
        singers.add(singer1);
        singers.add(singer2);
        boolean save = singerService.saveBatch(singers,1);
        System.out.println("save = " + save);
        List<Singer> list = singerService.list();
        list.forEach(System.out::println);
    }

    @Test
    void serviceSaveOrUpdate(){
        Singer singer = new Singer();
        singer.setId("214124123");
        singer.setName("周杰伦001");
        singer.setAge(15);
        singer.setOther("爱像一阵风");
        singerService.saveOrUpdate(singer);
        singer.setAge(16);
       // singerService.saveOrUpdate(singer,null);
    }

    @Test
    void serviceSaveOrUpdateBatch(){

        Singer singer = new Singer();
        singer.setName("周杰伦2");
        singer.setAge(18);
        singer.setOther("爱你穿越时间，两行来自秋末的眼泪");

        Singer singer3 = new Singer();
        singer3.setName("周杰伦7");
        singer3.setAge(18);
        singer3.setOther("不懂你的黑色幽默");

        Singer singer2 = new Singer();
        singer2.setName("周杰伦8");
        singer2.setAge(18);
        singer2.setOther("周杰伦周杰伦周杰伦周杰伦周杰伦，你的完美主义太彻底");

        Singer singer4 = new Singer();
        singer4.setName("周杰伦9");
        singer4.setAge(16);
        singer4.setOther("我的城堡说欢迎光临");

        List list=new ArrayList();
        list.add(singer);
        list.add(singer2);
        list.add(singer3);
        list.add(singer4);
        singerService.saveOrUpdateBatch(list);
    }

    @Test
    void serviceGet(){
        QueryWrapper<Singer> wrapper=new QueryWrapper();
        Singer byId = singerService.getById("1556883204896604161");
        System.out.println("byId = " + byId);
        wrapper.eq("age",18);
        wrapper.last("LIMIT 1");
        singerService.getOne(wrapper,true);
        Singer one = singerService.getOne(wrapper);
        System.out.println("one = " + one);
    }

    @Test
    void serviceGetMap(){
        QueryWrapper<Singer> wrapper=new QueryWrapper();
        wrapper.eq("age",18);
        Map<String, Object> map = singerService.getMap(wrapper);
        System.out.println("map = " + map);
    }

    @Test
    void list(){
        List<Singer> list = singerService.list();
        QueryWrapper<Singer> wrapper=new QueryWrapper();
        wrapper.eq("age",18);
        List<Singer> list2 = singerService.list(wrapper);
        List<Map<String, Object>> maps = singerService.listMaps();
        maps.forEach(System.out::println);

        List<Map<String, Object>> maps2 = singerService.listMaps(wrapper);
        maps2.forEach(System.out::println);
    }

    @Test
    void page(){
        Page<Singer> page = singerService.page(new Page<>(1, 5));
        page.getRecords().forEach(System.out::println);
        Page<Map<String, Object>> mapPage = singerService.pageMaps(new Page<>(1, 5));
        mapPage.getRecords().forEach(System.out::println);
    }

    @Test
    void query(){
        Long count = singerService.query().eq("age", 18).count();
        List<Singer> list = singerService.lambdaQuery().eq(Singer::getName, "周杰伦").list();
        list.forEach(System.out::println);
    }

    @Test
    void update(){
        Singer singer = new Singer();
        singer.setName("周杰伦2");
        singer.setAge(18);
        singer.setOther("爱你穿越时间，两行来自秋末的眼泪");
        singerService.update().eq("age", 18).remove();
        singerService.lambdaUpdate().eq(Singer::getName,"周杰伦2").update(singer);
    }

    @Test
    void wrapper(){
        QueryWrapper<Singer> wrapper=new QueryWrapper();

        Map map=new HashMap();

        map.put("name","周杰伦9");
        map.put("age",16);

        List ages=new ArrayList();

        ages.add(18);
        ages.add(16);
        ages.add(15);

//        wrapper.allEq((k,v) -> k.indexOf("a") >= 0,map,false);

//        wrapper.in("age",ages);
//        wrapper.in("age",15,0,1);
//        wrapper.groupBy("id").having("sum(age)>10");
//        wrapper.select(i ->i.getProperty().startsWith(""));
        List<Singer> list = singerService.list(wrapper);
        list.forEach(System.out::println);
    }
}
