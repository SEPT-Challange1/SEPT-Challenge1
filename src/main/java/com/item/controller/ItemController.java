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

}
