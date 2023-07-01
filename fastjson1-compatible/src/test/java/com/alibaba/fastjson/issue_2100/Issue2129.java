package com.alibaba.fastjson.issue_2100;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.LinkedHashMultimap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Issue2129 {
    @Test
    public void test_for_issue() {
        LinkedHashMultimap<String, String> map = LinkedHashMultimap.create();
        map.put("a", "1");
        map.put("a", "b");
        map.put("b", "1");
        String json = JSON.toJSONString(map);
        assertEquals("{\"a\":[\"1\",\"b\"],\"b\":[\"1\"]}", json);
    }
}
