package com.example.demo.controller;


import com.example.demo.common.codeDemo.ResultCode;
import com.example.demo.common.codeDemo.ResultModel;
import com.example.demo.entity.Personnel;
import com.example.demo.service.IPersonnelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Api(description = "人员")
@Controller
@RequestMapping("/personnel")
public class PersonnelController {

    @Autowired
    private IPersonnelService iPersonnelService;

    @GetMapping("/findAllPersonnelView")
    @ResponseBody
    @ApiOperation(value = "/findAllPersonnelView")
    public ModelAndView findAllPersonnelView(ModelAndView mv) {
        mv.addObject("first", "第一个");
        mv.addObject("list", iPersonnelService.findAllPersonnel());
        mv.setViewName("/personnel/personnel");
        return mv;
    }

    @PostMapping("/findAllPersonnel")
    @ResponseBody
    @ApiOperation(value = "/findAllPersonnel")
    public ResultModel findAllPersonnel(@RequestBody Personnel personnel) {
        ResultModel result = new ResultModel();
        try {
            result.setCode(ResultCode.success);
            result.setData(iPersonnelService.findAllPersonnel(personnel));
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(ResultCode.error);
            result.setMsg(e.getMessage());
            result.setData(new Object());
            return result;
        }
    }

}
