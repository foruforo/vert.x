/*
 * Copyright 2011-2012 the original author or authors.
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

package org.vertx.java.tests.core.modincludes;

import org.junit.Test;
import org.vertx.java.testframework.TestBase;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class JavaScriptIncludeTest extends TestBase {

  @Override
  protected void setUp() throws Exception {
    super.setUp();

  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
  }

  @Test
  public void testSimpleInclude() throws Exception {
    startMod("testmod1-1");
    startTest(getMethodName());
  }

  @Test
  public void testChainedInclude() throws Exception {
    startMod("testmod2-1");
    startTest(getMethodName());
  }

  @Test
  public void testMultipleIncludes() throws Exception {
    startMod("testmod3-1");
    startTest(getMethodName());
  }

  @Test
  public void testCircularInclude() throws Exception {
    String deployID = startMod("testmod4-1");
    assertNull(deployID); // Null implies module deploy fails - which it will because of circular deps
    //startTest(getMethodName());
  }

  @Test
  public void testSimpleIncludeJar() throws Exception {
    startMod("testmod5-1");
    startTest(getMethodName());
  }

  @Test
  public void testChainedIncludeJar() throws Exception {
    startMod("testmod6-1");
    startTest(getMethodName());
  }

  @Test
  public void testMultipleIncludesJar() throws Exception {
    startMod("testmod7-1");
    startTest(getMethodName());
  }



}