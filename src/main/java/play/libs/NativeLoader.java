package play.libs;

import java.io.File;

/**
 * <p>
 * Loads native libraries. This must be used with an ApplicationLoader, for example:
 * </p>
 *
 * <pre>
 * public class WithNativeLibsApplicationLoader extends GuiceApplicationLoader {
 *     public GuiceApplicationBuilder builder(ApplicationLoader.Context context) {
 *         NativeLoader.load("mylib);
 *         return super.builder(context);
 *     }
 * }
 * </pre>
 *
 * @see <a href="https://www.playframework.com/documentation/latest/JavaDependencyInjection#Advanced:-Extending-the-GuiceApplicationLoader">Java: Extending the GuiceApplicationLoader</a>
 * @see <a href="https://www.playframework.com/documentation/latest/ScalaDependencyInjection#Advanced:-Extending-the-GuiceApplicationLoader">Scala: Extending the GuiceApplicationLoader</a>
 *
 * @see System#load(String)
 * @see System#loadLibrary(String)
 */
public class NativeLoader {

    /**
     * This works as {@link System#loadLibrary(String)}.
     *
     * @param name name of the native library to be loaded.
     * @see System#loadLibrary(String)
     * @see #load(File)
     */
    public static void load(String name) {
        System.loadLibrary(name);
    }

    /**
     * This works as {@link System#load(String)}.
     *
     * @param path the path of the library.
     * @see System#load(String)
     */
    public static void load(File path) {
        System.load(path.getPath());
    }
}
