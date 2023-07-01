package com.xiaomi.mone.tpc.common.param;

import com.xiaomi.mone.tpc.common.enums.NodeUserRelTypeEnum;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @project: mi-tpc
 * @author: zgf1
 * @date: 2022/3/3 19:52
 */
@Data
@ToString(callSuper = true)
public class NodeUserEditParam extends BaseParam implements Serializable {

    private Long id;
    private Integer type;
    private Integer tester;

    @Override
    public boolean argCheck() {
        if (id == null) {
            return false;
        }
        if (type == null || NodeUserRelTypeEnum.getEnum(type) == null) {
            return false;
        }
        return true;
    }
}
