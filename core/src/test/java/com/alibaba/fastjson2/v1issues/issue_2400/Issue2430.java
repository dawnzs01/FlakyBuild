package com.alibaba.fastjson2.v1issues.issue_2400;

import com.alibaba.fastjson2.JSON;
import com.google.common.collect.ArrayListMultimap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Issue2430 {
    @Test
    public void testForIssue() {
        ArrayListMultimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("a", "1");
        multimap.put("a", "2");
        multimap.put("a", "3");
        multimap.put("b", "1");

        VO vo = new VO();
        vo.setMap(multimap);
        vo.setName("zhangsan");

        assertEquals("{\"map\":{\"a\":[\"1\",\"2\",\"3\"],\"b\":[\"1\"]},\"name\":\"zhangsan\"}",
                JSON.toJSONString(vo));
    }

    @Test
    public void testForIssue2() {
        String jsonString = "{\"map\":{\"a\":[\"1\",\"2\",\"3\"],\"b\":[\"1\"]},\"name\":\"zhangsan\"}";
        VO vo = JSON.parseObject(jsonString, VO.class);
        assertEquals("{\"map\":{\"a\":[\"1\",\"2\",\"3\"],\"b\":[\"1\"]},\"name\":\"zhangsan\"}", JSON.toJSONString(vo));
    }

    public static class VO {
        private String name;
        private ArrayListMultimap<String, String> map;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayListMultimap<String, String> getMap() {
            return map;
        }

        public void setMap(ArrayListMultimap<String, String> map) {
            this.map = map;
        }

        @Override
        public String toString() {
            return String.format("VO:{name->%s,map->%s}", this.name, this.map.toString());
        }
    }
}
