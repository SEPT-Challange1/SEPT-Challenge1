package com.item.dao;

import com.item.entity.Item;

import java.util.List;

/**
 * @Description: ItemService接口层
 * @Author: ItemService
 * @CreateDate: 2022/9/9 9:53
 * @Version: 1.0
 */
public interface ItemService {

    List<Item> findAllitem();

    int update(Item item);

    int insert(Item item);

    int delete(Item item);
}
