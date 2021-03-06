/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.debugger.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/jvm-debugger/jvm-debugger-test/testData/xcoroutines")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class XCoroutinesStackTraceTestGenerated extends AbstractXCoroutinesStackTraceTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInXcoroutines() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/jvm-debugger/jvm-debugger-test/testData/xcoroutines"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("coroutineSuspendFun.kt")
    public void testCoroutineSuspendFun() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/xcoroutines/coroutineSuspendFun.kt");
    }

    @TestMetadata("coroutineSuspendFun136.kt")
    public void testCoroutineSuspendFun136() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/xcoroutines/coroutineSuspendFun136.kt");
    }

    @TestMetadata("suspendMain.kt")
    public void testSuspendMain() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/xcoroutines/suspendMain.kt");
    }
}
