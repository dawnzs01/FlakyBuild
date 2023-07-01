package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONSchemaValidException;
import com.alibaba.fastjson2.annotation.JSONField;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FieldReaderDoubleFieldTest {
    @Test
    public void test() {
        Bean bean = new Bean();
        ObjectReader objectReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(Bean.class);
        FieldReader fieldReader = objectReader.getFieldReader("value");
        fieldReader.accept(bean, "123");
        assertEquals(123D, bean.value);

        assertThrows(JSONException.class, () -> fieldReader.accept(bean, new Object()));
    }

    private static class Bean {
        public Double value;
    }

    @Test
    public void test1() {
        Bean1 bean = new Bean1();
        ObjectReader objectReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(Bean1.class);
        FieldReader fieldReader = objectReader.getFieldReader("value");
        assertThrows(JSONSchemaValidException.class, () -> fieldReader.accept(bean, "123"));
        assertThrows(JSONSchemaValidException.class, () -> fieldReader.accept(bean, 123));
        assertThrows(JSONSchemaValidException.class, () -> fieldReader.accept(bean, 123L));
        assertThrows(JSONSchemaValidException.class, () -> fieldReader.accept(bean, 123F));
        assertThrows(JSONSchemaValidException.class, () -> fieldReader.accept(bean, 123D));
    }

    private static class Bean1 {
        @JSONField(schema = "{'minimum':128}")
        public Double value;
    }

    @Test
    public void test2() {
        ObjectReader<Bean2> objectReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(Bean2.class);
        assertEquals(
                123D,
                objectReader.readObject(
                        JSONReader.of("{\"id\":101, \"value\":123}")
                ).value
        );
    }

    private static class Bean2 {
        public Double value;
        public final int id;

        public Bean2(@JSONField(name = "id") int id) {
            this.id = id;
        }
    }
}
