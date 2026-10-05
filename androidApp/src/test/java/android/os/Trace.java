package android.os;

/** JVM-only tracing shim for Compose runtime regression tests; never packaged in the app. */
public final class Trace {
    private Trace() {}
    public static void beginSection(String name) {}
    public static void endSection() {}
    public static boolean isEnabled() { return false; }
}
