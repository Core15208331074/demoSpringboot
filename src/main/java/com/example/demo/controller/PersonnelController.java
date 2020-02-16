package com.example.demo.controller;


import com.example.demo.common.codeDemo.ResultCode;
import com.example.demo.common.codeDemo.ResultModel;
import com.example.demo.entity.Personnel;
import com.example.demo.service.IPersonnelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;


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

    @GetMapping("/findShiYuan")
    @ApiOperation(value = "/findAllPersonnelView")
    public String findShiYuanView(Model model) {
        return "personnel/shiyuan";
    }

    @GetMapping("/outPortExcel")
    @ApiOperation(value = "/outPortExcel")
    public void outPortExcel(HttpServletResponse response) {
        try {
            List<Personnel> list = iPersonnelService.findAllPersonnel();
            String[] str = {"团队名称", "下级人数", "团队当前金额(元)", "团队消费(元)", "团队返佣(元)", "团队福利(元)", "团队充值(元)", "团队提现(元)"};
            String fileName = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) + new Random(10000).nextInt() + ".xls";
//            HSSFWorkbook hssfWorkTeam = ExcelUtil.getHSSFWorkTeam02(fileName, str, list, new HSSFWorkbook());
            response.reset();
            response.addHeader("Content-Disposition", "attachment:filename=" + fileName);
            OutputStream out = new BufferedOutputStream(response.getOutputStream());
            response.setContentType("application/vnd.ms-excel;charset=gb2312");
//            hssfWorkTeam.write(out);
            out.flush();
            out.close();
            return;
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    @RequestMapping(value = "/uploadPicture",method = RequestMethod.POST)
    @ResponseBody
    public ResultModel uploadPicture(@RequestParam("file") MultipartFile file) {
        ResultModel result = new ResultModel();
        try {
            result.setCode(200);
            result.setData("上传成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(500);
            result.setMsg("上传失败");
            return result;
        }
    }

}
