package p356sf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p356sf.Path;
import p468yc.Exceptions;
import p489zc._Collections;
import tf.FixedLengthSource;
import tf.ZipEntry;
import tf.zip;

/* renamed from: sf.k0 */
/* loaded from: classes2.dex */
public final class ZipFileSystem extends FileSystem {
    @Deprecated

    /* renamed from: f */
    private static final Path f26570f;

    /* renamed from: c */
    private final Path f26571c;

    /* renamed from: d */
    private final FileSystem f26572d;

    /* renamed from: e */
    private final Map f26573e;

    /* compiled from: ZipFileSystem.kt */
    /* renamed from: sf.k0$a */
    /* loaded from: classes2.dex */
    private static final class C10195a {
        private C10195a() {
        }

        public /* synthetic */ C10195a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C10195a(null);
        f26570f = Path.C10205a.m8513e(Path.f26595x, "/", false, 1, null);
    }

    public ZipFileSystem(Path path, FileSystem fileSystem, Map map, String str) {
        Intrinsics.isThisObjectNull(path, "zipPath");
        Intrinsics.isThisObjectNull(fileSystem, "fileSystem");
        Intrinsics.isThisObjectNull(map, "entries");
        this.f26571c = path;
        this.f26572d = fileSystem;
        this.f26573e = map;
    }

    /* renamed from: r */
    private final Path m8618r(Path path) {
        return f26570f.m8521l(path, true);
    }

    /* renamed from: s */
    private final List m8617s(Path path, boolean z) {
        List m455n0;
        ZipEntry zipEntry = (ZipEntry) this.f26573e.get(m8618r(path));
        if (zipEntry != null) {
            m455n0 = _Collections.m455n0(zipEntry.m7540b());
            return m455n0;
        } else if (z) {
            throw new IOException("not a directory: " + path);
        } else {
            return null;
        }
    }

    /* renamed from: b */
    public InterfaceC10189f0 m8627b(Path path, boolean z) {
        Intrinsics.isThisObjectNull(path, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* renamed from: c */
    public void m8626c(Path path, Path path2) {
        Intrinsics.isThisObjectNull(path, "source");
        Intrinsics.isThisObjectNull(path2, "target");
        throw new IOException("zip file systems are read-only");
    }

    /* renamed from: g */
    public void m8625g(Path path, boolean z) {
        Intrinsics.isThisObjectNull(path, "dir");
        throw new IOException("zip file systems are read-only");
    }

    /* renamed from: i */
    public void m8624i(Path path, boolean z) {
        Intrinsics.isThisObjectNull(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    /* renamed from: k */
    public List m8623k(Path path) {
        Intrinsics.isThisObjectNull(path, "dir");
        List m8617s = m8617s(path, true);
        Intrinsics.ifNullDoSomething(m8617s);
        return m8617s;
    }

    /* renamed from: m */
    public FileMetadata m8622m(Path path) {
        InterfaceC10187e interfaceC10187e;
        Intrinsics.isThisObjectNull(path, "path");
        ZipEntry zipEntry = (ZipEntry) this.f26573e.get(m8618r(path));
        Throwable th2 = null;
        if (zipEntry == null) {
            return null;
        }
        FileMetadata fileMetadata = new FileMetadata(!zipEntry.m7534h(), zipEntry.m7534h(), null, zipEntry.m7534h() ? null : Long.valueOf(zipEntry.m7535g()), null, zipEntry.m7537e(), null, null, 128, null);
        if (zipEntry.m7536f() == -1) {
            return fileMetadata;
        }
        FileHandle m8656n = this.f26572d.m8656n(this.f26571c);
        try {
            interfaceC10187e = C10200t.m8565c(m8656n.m8686F(zipEntry.m7536f()));
        } catch (Throwable th3) {
            th2 = th3;
            interfaceC10187e = null;
        }
        if (m8656n != null) {
            try {
                m8656n.close();
            } catch (Throwable th4) {
                if (th2 == null) {
                    th2 = th4;
                } else {
                    Exceptions.m1470a(th2, th4);
                }
            }
        }
        if (th2 == null) {
            Intrinsics.ifNullDoSomething(interfaceC10187e);
            return zip.m7526h(interfaceC10187e, fileMetadata);
        }
        throw th2;
    }

    /* renamed from: n */
    public FileHandle m8621n(Path path) {
        Intrinsics.isThisObjectNull(path, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    /* renamed from: p */
    public InterfaceC10189f0 m8620p(Path path, boolean z) {
        Intrinsics.isThisObjectNull(path, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* renamed from: q */
    public InterfaceC10191h0 m8619q(Path path) throws IOException {
        InterfaceC10187e interfaceC10187e;
        Intrinsics.isThisObjectNull(path, "file");
        ZipEntry zipEntry = (ZipEntry) this.f26573e.get(m8618r(path));
        if (zipEntry != null) {
            FileHandle m8656n = this.f26572d.m8656n(this.f26571c);
            Throwable th2 = null;
            try {
                interfaceC10187e = C10200t.m8565c(m8656n.m8686F(zipEntry.m7536f()));
            } catch (Throwable th3) {
                interfaceC10187e = null;
                th2 = th3;
            }
            if (m8656n != null) {
                try {
                    m8656n.close();
                } catch (Throwable th4) {
                    if (th2 == null) {
                        th2 = th4;
                    } else {
                        Exceptions.m1470a(th2, th4);
                    }
                }
            }
            if (th2 == null) {
                Intrinsics.ifNullDoSomething(interfaceC10187e);
                zip.m7523k(interfaceC10187e);
                if (zipEntry.m7538d() == 0) {
                    return new FixedLengthSource(interfaceC10187e, zipEntry.m7535g(), true);
                }
                return new FixedLengthSource(new InflaterSource(new FixedLengthSource(interfaceC10187e, zipEntry.m7539c(), true), new Inflater(true)), zipEntry.m7535g(), false);
            }
            throw th2;
        }
        throw new FileNotFoundException("no such file: " + path);
    }
}
