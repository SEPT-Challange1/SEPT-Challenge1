package com.item.controller;

import com.item.config.RestResult;
import com.item.dao.ItemService;
import com.item.entity.Item;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: ItemController
 * @Author: ItemController
 * @CreateDate: 2022/9/9 9:56
 * @Version: 1.0
 */
@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/findAllitem", method = RequestMethod.GET)
    @ApiOperation(value = "findAll", notes = "findAll", httpMethod = "POST")
    public RestResult findAllitem() {
        List<Item> allitem = itemService.findAllitem();
        return new RestResult(1, allitem);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value = "insertGood", notes = "insertGood", httpMethod = "POST")
    public RestResult insert(@RequestBody Item item) {
        try {
            int insert = itemService.insert(item);
            if (insert>0){
                return new RestResult(1, "addSuccess");
            }
            return new RestResult(0,"addFail");
        }catch (Exception e){
            return new RestResult(0,"addFail");
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ApiOperation(value = "changeGoods", notes = "must upload id", httpMethod = "POST")
    public RestResult update(@RequestBody Item item) {
        try {
            int update = itemService.update(item);
            if (update>0){
                return new RestResult(1, "changeSuccess");
            }
            return new RestResult(0,"changeFail");
        }catch (Exception e){
            return new RestResult(0,"changeFail");
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.DELETE)
    @ApiOperation(value = "deleteGoods", notes = "only upload id", httpMethod = "DELETE")
    public RestResult delete(@RequestBody Item item) {
        try {
            int delete = itemService.delete(item);
            if (delete>0){
                return new RestResult(1, "deleteSuccess");
            }
            return new RestResult(0,"deleteFail");
        }catch (Exception e){
            return new RestResult(0,"deleteFail");
        }
    }
}
