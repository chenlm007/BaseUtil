package com.che.baseutil.proxy;

import com.che.baseutil.BuildConfig;

import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/**
 * 作者：余天然 on 16/9/18 下午3:54
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class,
        sdk = 21,
        manifest = "src/main/AndroidManifest.xml",
        packageName = "com.che.baseutil",
        resourceDir = "res")
public class BaseTestClient {
}
