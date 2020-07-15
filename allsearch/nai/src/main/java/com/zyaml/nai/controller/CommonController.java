package com.zyaml.nai.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.zyaml.nai.Exception.Resp;
import com.zyaml.nai.entry.from.QAFrom;
import com.zyaml.nai.service.FileTransAli;
import com.zyaml.nai.service.FileTransKaldi;

import com.zyaml.nai.service.QAService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @program: birtu-oj-knowledge-graph-master 2
 * @description:
 * @author: Gauss
 * @date: 2020-07-10 22:43
 **/
@Controller
@RequestMapping("/api")
public class CommonController {

    @Autowired
    private FileTransAli fileTransAli;

    @Autowired
    private FileTransKaldi fileTransKaldi;

    @Autowired
    QAService qaService;

    @RequestMapping(value = "/index")
    public String webPlatformIndex() {
        return "index";
    }

    @RequestMapping("/aliSubmit")
    @ResponseBody
    public Resp fileTransRequest(@RequestParam("file")MultipartFile file) {
        String result = null;
        try {
            String taskId = fileTransAli.submitFileTrans(file);
            result = fileTransAli.getFileTransResult(taskId);

        } catch (Exception e) {
            e.printStackTrace();
        }
        //去toString方法中产生的括号
        String b = result.substring(0,result.length() -1);
        String c = b.substring(1,b.length());
//        System.out.println(b + "b__");
        JSONObject jsonObject = JSONObject.fromObject(c);
        String text = jsonObject.getString("text");
        //text 为语音识别的内容
        System.out.println(text);
        Resp res = qaService.qustion(text);
//        System.out.println(res.toString());
        return res;
    }

    @RequestMapping("/KaldiSubmit")
    @ResponseBody
    public String fileTransKaldiRequest(@RequestParam("file")MultipartFile file) {
        String result = null;
        try {
            result = fileTransKaldi.getFileTransResult(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
