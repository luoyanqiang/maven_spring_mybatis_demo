package cn.fish.ssm.mapper;

import cn.fish.ssm.po.Items;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class ItemsMapperTest {

    @Autowired
    ItemsMapper itemsMapper;

    @Test
    public void countByExample() {
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByExampleWithBLOBs() {
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void selectByPrimaryKey() {
        Items items = itemsMapper.selectByPrimaryKey(1);
        System.out.println(items);
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void updateByExampleWithBLOBs() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKeyWithBLOBs() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}