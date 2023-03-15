package p356sf;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p356sf.Path;
import tf.C10615h;
import tf.ResourceFileSystem;

/* renamed from: sf.i */
/* loaded from: classes2.dex */
public abstract class FileSystem {

    /* renamed from: a */
    public static final C10192a f26562a = new C10192a(null);

    /* renamed from: b */
    public static final FileSystem f26563b;

    /* compiled from: FileSystem.kt */
    /* renamed from: sf.i$a */
    /* loaded from: classes2.dex */
    public static final class C10192a {
        private C10192a() {
        }

        public /* synthetic */ C10192a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        FileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        f26563b = jvmSystemFileSystem;
        Path.C10205a c10205a = Path.f26595x;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkIfNull(property, "getProperty(\"java.io.tmpdir\")");
        Path.C10205a.m8513e(c10205a, property, false, 1, null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        Intrinsics.checkIfNull(classLoader, "ResourceFileSystem::class.java.classLoader");
        new ResourceFileSystem(classLoader, false);
    }

    /* renamed from: a */
    public final InterfaceC10189f0 m8669a(Path path) throws IOException {
        Intrinsics.isThisObjectNull(path, "file");
        return m8668b(path, false);
    }

    /* renamed from: b */
    public abstract InterfaceC10189f0 m8668b(Path path, boolean z) throws IOException;

    /* renamed from: c */
    public abstract void m8667c(Path path, Path path2) throws IOException;

    /* renamed from: d */
    public final void m8666d(Path path) throws IOException {
        Intrinsics.isThisObjectNull(path, "dir");
        m8665e(path, false);
    }

    /* renamed from: e */
    public final void m8665e(Path path, boolean z) throws IOException {
        Intrinsics.isThisObjectNull(path, "dir");
        C10615h.m7509a(this, path, z);
    }

    /* renamed from: f */
    public final void m8664f(Path path) throws IOException {
        Intrinsics.isThisObjectNull(path, "dir");
        m8663g(path, false);
    }

    /* renamed from: g */
    public abstract void m8663g(Path path, boolean z) throws IOException;

    /* renamed from: h */
    public final void m8662h(Path path) throws IOException {
        Intrinsics.isThisObjectNull(path, "path");
        m8661i(path, false);
    }

    /* renamed from: i */
    public abstract void m8661i(Path path, boolean z) throws IOException;

    /* renamed from: j */
    public final boolean m8660j(Path path) throws IOException {
        Intrinsics.isThisObjectNull(path, "path");
        return C10615h.m7508b(this, path);
    }

    /* renamed from: k */
    public abstract List m8659k(Path path) throws IOException;

    /* renamed from: l */
    public final FileMetadata m8658l(Path path) throws IOException {
        Intrinsics.isThisObjectNull(path, "path");
        return C10615h.m7507c(this, path);
    }

    /* renamed from: m */
    public abstract FileMetadata m8657m(Path path) throws IOException;

    /* renamed from: n */
    public abstract FileHandle m8656n(Path path) throws IOException;

    /* renamed from: o */
    public final InterfaceC10189f0 m8655o(Path path) throws IOException {
        Intrinsics.isThisObjectNull(path, "file");
        return m8654p(path, false);
    }

    /* renamed from: p */
    public abstract InterfaceC10189f0 m8654p(Path path, boolean z) throws IOException;

    /* renamed from: q */
    public abstract InterfaceC10191h0 m8653q(Path path) throws IOException;
}
