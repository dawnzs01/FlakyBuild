package com.xiaomi.miapi.dto;

import lombok.Data;

import java.io.Serializable;
/**
 * @author dongzhenxing
 * @date 2023/02/08
 */
@Data
public class UrlDTO implements Serializable {
    private String url;
    private Integer requestType;
}
