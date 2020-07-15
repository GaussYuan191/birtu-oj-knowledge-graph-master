package com.zyaml.nai.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

import static com.alibaba.fastjson.JSON.parseObject;
import static org.json.JSONObject.*;

/**
 * @program: birtu-oj-knowledge-graph-master 2
 * @description:
 * @author: Gauss
 * @date: 2020-07-10 22:46
 **/
@Service
public class FileTransKaldi {

    public static final String KALDI_CNN_TDNN_URL = "http://127.0.0.1:8888";

    public String getFileTransResult(MultipartFile file) throws Exception {
        RestTemplate restTemplate = new RestTemplate();

        File tempFile = File.createTempFile("tmp", null);
        file.transferTo(tempFile);
        FileSystemResource resource = new FileSystemResource(tempFile);
        MultiValueMap<String, Object> param = new LinkedMultiValueMap<>();
        param.add("file", resource);
        System.out.println(resource.contentLength());

        String response = restTemplate.postForObject(KALDI_CNN_TDNN_URL, param, String.class);
        JSONObject resultObject = parseObject(response);
        tempFile.deleteOnExit();

        System.out.println(resultObject);

        return resultObject.toJSONString();
    }
}

