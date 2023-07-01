package com.alibaba.fastjson2.v1issues.issue_1200;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONWriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by wenshao on 16/05/2017.
 */
public class Issue1203 {
    @Test
    public void test_for_issue() throws Exception {
        String[] strArr = new String[5];
        strArr[0] = "a";
        strArr[1] = "b";
        strArr[3] = "d";
        strArr[4] = "";

        String json = JSON.toJSONString(strArr, JSONWriter.Feature.NullAsDefaultValue);
        assertEquals("[\"a\",\"b\",\"\",\"d\",\"\"]", json);
    }
}
