/*
 * Copyright 2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openehealth.ipf.commons.utils.clock

/**
 * A mocked clock that allows to specify the time returned by {@link MockClock#now}.
 */
class MockClock implements Clock {
    private long now

    /**
     * Runs the given closure while the time is set to the given value.<p>
     * The time is reset after the closure has returned. Therefore it is possible
     * to make nested calls to this method.
     * @param time
     *          the time that is returned by {@link #now} while running the closure.
     * @param closure
     *          the code to execute while the time is set.
     * @return the result returned by the closure.
     */
    def doAt(long time, Closure closure) {
        def old = now
        now = time
        def result = closure()
        now = old
        result
    }

    long now() {
        now
    }
}
