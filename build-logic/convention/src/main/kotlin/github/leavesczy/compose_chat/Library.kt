package github.leavesczy.compose_chat

import com.android.build.api.dsl.CommonExtension
import com.android.build.gradle.internal.dsl.LibraryExtensionImpl
import org.gradle.api.Project
import java.io.File

/**
 * @Author: leavesCZY
 * @Date: 2023/11/29 16:10
 * @Desc:
 */
internal fun Project.configureAndroidLibrary(commonExtension: CommonExtension) {
    commonExtension.apply {
        this as LibraryExtensionImpl
        defaultConfig {
            consumerProguardFiles.add(File("consumer-rules.pro"))
        }
    }
}