package act.test.util;

/*-
 * #%L
 * ACT Framework
 * %%
 * Copyright (C) 2014 - 2018 ActFramework
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import act.app.App;
import org.junit.BeforeClass;
import org.osgl.$;
import osgl.ut.TestBase;

public class TestTestBase extends TestBase {

    @BeforeClass
    public static void clearActMockup() {
        $.setFieldValue("INST", App.class, null);
        Thread.currentThread().setContextClassLoader(TestTestBase.class.getClassLoader());
    }

}