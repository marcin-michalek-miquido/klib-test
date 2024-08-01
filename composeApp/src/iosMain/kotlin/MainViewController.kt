@file:OptIn(ExperimentalForeignApi::class)

import androidx.compose.ui.window.ComposeUIViewController
import kotlinx.cinterop.ExperimentalForeignApi
import org.example.project.greeting.HelloWorld

fun MainViewController() = ComposeUIViewController {
    val klibTest = HelloWorld.helloWorld()

    App()
}
