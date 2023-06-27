/*
 * Copyright (c) 2020, Red Hat, Inc. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.openjdk.jcstress.tests.volatiles;

import org.openjdk.jcstress.annotations.*;
import org.openjdk.jcstress.infra.results.III_Result;
import org.openjdk.jcstress.infra.results.II_Result;

/**
 * @author Aleksey Shipilev (shade@redhat.com)
 */
@JCStressTest
@Outcome(id = "0, .*, 0", expect = Expect.ACCEPTABLE, desc = "T2 -> T1 sequential execution")
@Outcome(id = "1, .*, 1", expect = Expect.ACCEPTABLE, desc = "T1 -> T2 sequential execution")
@Outcome(id = "0, .*, 1", expect = Expect.ACCEPTABLE, desc = "Sequential consistency")
@Outcome(id = "1, 0, 0", expect = Expect.ACCEPTABLE_INTERESTING, desc = "Seeing through the race over unobserved volatile")
@Outcome(id = "1, 1, 0", expect = Expect.FORBIDDEN, desc = "Cannot see old x over the observed volatile")
@State
public class ObservedVolatileBarrierTest {

    int x;
    volatile int v;
    int y;

    @Actor
    public void actor1() {
        x = 1;
        v = 1;
        y = 1;
    }

    @Actor
    public void actor2(III_Result r) {
        r.r1 = y;
        r.r2 = v;
        r.r3 = x;
    }

}
