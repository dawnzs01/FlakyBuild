/*
 * Copyright DDDplus Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package io.github.dddplus.annotation;

import io.github.dddplus.runtime.BaseDomainAbility;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 领域能力，注解在{@link BaseDomainAbility}之上.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Component
public @interface DomainAbility {

    /**
     * The value may indicate a suggestion for a logical component name,
     * to be turned into a Spring bean in case of an autodetected component.
     *
     * @return the suggested component name, if any
     */
    @AliasFor(annotation = Component.class, attribute = "value") String value() default "";

    /**
     * 所属业务域.
     *
     * @return {@link Domain#code()}
     */
    String domain();

    /**
     * 能力名称.
     */
    String name() default "";

    /**
     * 该领域能力的业务标签.
     * <p>
     * <p>通过标签，把众多的扩展点管理起来，结构化</p>
     */
    String[] tags() default {};
}
