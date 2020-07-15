package cn.yaminets.ojknowledgegraph;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: birtu-oj-knowledge-graph-master 2
 * @description: 测试
 * @author: Gauss
 * @date: 2020-07-08 16:05
 **/
public class demo {
    public static void main(String[] args){
        Map<Integer,String> difficultyMap = new HashMap<>();
        difficultyMap.put(0,"暂无评定");
        difficultyMap.put(1,"入门");
        difficultyMap.put(2,"普及-");
        difficultyMap.put(3,"普及/提高-");
        difficultyMap.put(4,"普及+/提高");
        difficultyMap.put(5,"提高+/省选-");
        difficultyMap.put(6,"省选/NOI-");
        difficultyMap.put(7,"NOI/NOI+/CTSC");
        System.out.println(difficultyMap);
    }
}
