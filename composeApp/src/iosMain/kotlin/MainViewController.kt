import androidx.compose.ui.window.ComposeUIViewController
import kotlinx.cinterop.ExperimentalForeignApi
import org.example.project.greeting.HelloWorld

@OptIn(ExperimentalForeignApi::class)
fun MainViewController() = ComposeUIViewController {
    val hello = HelloWorld.helloWorld()

    App()
}
