/*
 * Copyright 2020 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.linecorp.decaton.testing;

import java.util.Random;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import lombok.Getter;
import lombok.experimental.Accessors;

/**
 * Test rule to provide {@link Random} instance with including
 * random seed info in error message for reproducibility
 */
public class RandomRule implements TestRule {
    @Getter
    @Accessors(fluent = true)
    private Random random;

    @Override
    public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                long seed = System.currentTimeMillis();
                random = new Random(seed);

                try {
                    base.evaluate();
                } catch (Throwable t) {
                    throw new Exception(String.format("%s failed. [randomSeed=%d]",
                                                      description.getDisplayName(),
                                                      seed), t);
                }
            }
        };
    }
}
