import kotlinx.cinterop.ExperimentalForeignApi
import org.example.project.greeting.HelloWorld

@OptIn(ExperimentalForeignApi::class)
fun helloLibraryFromLibraryModule() {
    val hello = HelloWorld.helloWorld()
}
