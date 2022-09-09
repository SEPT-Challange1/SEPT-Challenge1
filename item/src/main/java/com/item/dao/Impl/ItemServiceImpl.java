package com.item.dao.Impl;

import com.item.config.IDRandom;
import com.item.dao.ItemService;
import com.item.entity.Item;
import com.item.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: ItemServiceImpl
 * @Author: ItemServiceImpl
 * @CreateDate: 2022/9/9 9:54
 * @Version: 1.0
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;


    @Override
    public List<Item> findAllitem() {
        List<Item> items = itemMapper.selectAll();
        return items;
    }

    @Override
    public int update(Item item) {
        Item it=new Item();
        it.setId(item.getId());
        it.setDesc(item.getDesc());
        it.setName(item.getName());
        it.setPrice(item.getPrice());
        int i = itemMapper.updateByPrimaryKeySelective(it);
        return i;
    }

    @Transactional
    @Override
    public int insert(Item item) {
        Item it=new Item();
        it.setId(item.getId());
        it.setDesc(item.getDesc());
        it.setName(item.getName());
        it.setPrice(item.getPrice());
        int i = itemMapper.insertSelective(it);
        return i;
    }

    @Override
    public int delete(Item item) {
        int i = itemMapper.deleteByPrimaryKey(item.getId());
        return i;
    }
}