package tf;

import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p356sf.FileHandle;
import p356sf.FileMetadata;
import p356sf.FileSystem;
import p356sf.InterfaceC10189f0;
import p356sf.InterfaceC10191h0;
import p356sf.Path;
import p468yc.C13182l;
import p468yc.C13191r;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p489zc.Iterables;
import p489zc.MutableCollections;
import p489zc._Collections;
import sd.C10171u;
import sd.StringsJVM;

/* renamed from: tf.c */
/* loaded from: classes2.dex */
public final class ResourceFileSystem extends FileSystem {

    /* renamed from: d */
    private static final C10607a f27331d = new C10607a(null);
    @Deprecated

    /* renamed from: e */
    private static final Path f27332e = Path.C10205a.m8513e(Path.f26595x, "/", false, 1, null);

    /* renamed from: c */
    private final InterfaceC13178g f27333c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceFileSystem.kt */
    /* renamed from: tf.c$a */
    /* loaded from: classes2.dex */
    public static final class C10607a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ResourceFileSystem.kt */
        /* renamed from: tf.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C10608a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            public static final C10608a f27334w = new C10608a();

            C10608a() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean mo9587d(ZipEntry zipEntry) {
                Intrinsics.isThisObjectNull(zipEntry, "entry");
                return Boolean.valueOf(C10607a.m7550a(ResourceFileSystem.m7555r(), zipEntry.m7541a()));
            }
        }

        private C10607a() {
        }

        public /* synthetic */ C10607a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final /* synthetic */ boolean m7550a(C10607a c10607a, Path path) {
            return c10607a.m7548c(path);
        }

        /* renamed from: c */
        private final boolean m7548c(Path path) {
            boolean m8945o;
            m8945o = StringsJVM.m8945o(path.m8526g(), ".class", true);
            return !m8945o;
        }

        /* renamed from: b */
        public final Path m7549b() {
            return ResourceFileSystem.m7554s();
        }

        /* renamed from: d */
        public final Path m7547d(Path path, Path path2) {
            String m8891i0;
            String m8936x;
            Intrinsics.isThisObjectNull(path, "<this>");
            Intrinsics.isThisObjectNull(path2, "base");
            String path3 = path2.toString();
            Path m7549b = m7549b();
            m8891i0 = C10171u.m8891i0(path.toString(), path3);
            m8936x = StringsJVM.m8936x(m8891i0, '\\', '/', false, 4, null);
            return m7549b.m8522k(m8936x);
        }

        /* renamed from: e */
        public final List m7546e(ClassLoader classLoader) {
            List m467b0;
            Intrinsics.isThisObjectNull(classLoader, "<this>");
            Enumeration<URL> resources = classLoader.getResources(BuildConfig.VERSION_NAME);
            Intrinsics.checkIfNull(resources, "getResources(\"\")");
            ArrayList<URL> list = Collections.list(resources);
            Intrinsics.checkIfNull(list, "list(this)");
            ArrayList arrayList = new ArrayList();
            for (URL url : list) {
                C10607a m7555r = ResourceFileSystem.m7555r();
                Intrinsics.checkIfNull(url, "it");
                C13182l m7545f = m7555r.m7545f(url);
                if (m7545f != null) {
                    arrayList.add(m7545f);
                }
            }
            Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
            Intrinsics.checkIfNull(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
            ArrayList<URL> list2 = Collections.list(resources2);
            Intrinsics.checkIfNull(list2, "list(this)");
            ArrayList arrayList2 = new ArrayList();
            for (URL url2 : list2) {
                C10607a m7555r2 = ResourceFileSystem.m7555r();
                Intrinsics.checkIfNull(url2, "it");
                C13182l m7544g = m7555r2.m7544g(url2);
                if (m7544g != null) {
                    arrayList2.add(m7544g);
                }
            }
            m467b0 = _Collections.m467b0(arrayList, arrayList2);
            return m467b0;
        }

        /* renamed from: f */
        public final C13182l m7545f(URL url) {
            Intrinsics.isThisObjectNull(url, "<this>");
            if (Intrinsics.equals(url.getProtocol(), "file")) {
                return C13191r.m1447a(FileSystem.f26563b, Path.C10205a.m8514d(Path.f26595x, new File(url.toURI()), false, 1, null));
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
            r0 = sd.C10171u.m8900Z(r10, "!", 0, false, 6, null);
         */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p468yc.C13182l m7544g(java.net.URL r10) {
            /*
                r9 = this;
                java.lang.String r0 = "<this>"
                p181jd.Intrinsics.isThisObjectNull(r10, r0)
                java.lang.String r10 = r10.toString()
                java.lang.String r0 = "toString()"
                p181jd.Intrinsics.checkIfNull(r10, r0)
                java.lang.String r0 = "jar:file:"
                r7 = 0
                r1 = 2
                r8 = 0
                boolean r0 = sd.C10163k.m9008C(r10, r0, r7, r1, r8)
                if (r0 != 0) goto L1a
                return r8
            L1a:
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                java.lang.String r2 = "!"
                r1 = r10
                int r0 = sd.C10163k.m8987Z(r1, r2, r3, r4, r5, r6)
                r1 = -1
                if (r0 != r1) goto L29
                return r8
            L29:
                sf.y$a r1 = p356sf.Path.f26595x
                java.io.File r2 = new java.io.File
                r3 = 4
                java.lang.String r10 = r10.substring(r3, r0)
                java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
                p181jd.Intrinsics.checkIfNull(r10, r0)
                java.net.URI r10 = java.net.URI.create(r10)
                r2.<init>(r10)
                r10 = 1
                sf.y r10 = p356sf.Path.C10205a.m8514d(r1, r2, r7, r10, r8)
                sf.i r0 = p356sf.FileSystem.f26563b
                tf.c$a$a r1 = tf.ResourceFileSystem.C10607a.C10608a.f27334w
                sf.k0 r10 = tf.zip.m7530d(r10, r0, r1)
                sf.y r0 = r9.m7549b()
                yc.l r10 = p468yc.C13191r.m1447a(r10, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: tf.ResourceFileSystem.C10607a.m7544g(java.net.URL):yc.l");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourceFileSystem.kt */
    /* renamed from: tf.c$b */
    /* loaded from: classes2.dex */
    public static final class C10609b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ ClassLoader f27335w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10609b(ClassLoader classLoader) {
            super(0);
            this.f27335w = classLoader;
        }

        /* renamed from: a */
        public final List mo42214q() {
            return ResourceFileSystem.m7555r().m7546e(this.f27335w);
        }
    }

    public ResourceFileSystem(ClassLoader classLoader, boolean z) {
        InterfaceC13178g m1464a;
        Intrinsics.isThisObjectNull(classLoader, "classLoader");
        m1464a = LazyJVM.m1464a(new C10609b(classLoader));
        this.f27333c = m1464a;
        if (z) {
            m7552u().size();
        }
    }

    /* renamed from: r */
    public static final /* synthetic */ C10607a m7555r() {
        return f27331d;
    }

    /* renamed from: s */
    public static final /* synthetic */ Path m7554s() {
        return f27332e;
    }

    /* renamed from: t */
    private final Path m7553t(Path path) {
        return f27332e.m8521l(path, true);
    }

    /* renamed from: u */
    private final List m7552u() {
        return (List) this.f27333c.getValue();
    }

    /* renamed from: v */
    private final String m7551v(Path path) {
        return m7553t(path).m8523j(f27332e).toString();
    }

    /* renamed from: b */
    public InterfaceC10189f0 m7564b(Path path, boolean z) {
        Intrinsics.isThisObjectNull(path, "file");
        throw new IOException(this + " is read-only");
    }

    /* renamed from: c */
    public void m7563c(Path path, Path path2) {
        Intrinsics.isThisObjectNull(path, "source");
        Intrinsics.isThisObjectNull(path2, "target");
        throw new IOException(this + " is read-only");
    }

    /* renamed from: g */
    public void m7562g(Path path, boolean z) {
        Intrinsics.isThisObjectNull(path, "dir");
        throw new IOException(this + " is read-only");
    }

    /* renamed from: i */
    public void m7561i(Path path, boolean z) {
        Intrinsics.isThisObjectNull(path, "path");
        throw new IOException(this + " is read-only");
    }

    /* renamed from: k */
    public List m7560k(Path path) {
        List m455n0;
        int m186r;
        Intrinsics.isThisObjectNull(path, "dir");
        String m7551v = m7551v(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (C13182l c13182l : m7552u()) {
            FileSystem fileSystem = (FileSystem) c13182l.m1462a();
            Path path2 = (Path) c13182l.m1461b();
            try {
                List m8659k = fileSystem.m8659k(path2.m8522k(m7551v));
                ArrayList<Path> arrayList = new ArrayList();
                for (Object obj : m8659k) {
                    if (C10607a.m7550a(f27331d, (Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                m186r = Iterables.m186r(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(m186r);
                for (Path path3 : arrayList) {
                    arrayList2.add(f27331d.m7547d(path3, path2));
                }
                MutableCollections.m181u(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            m455n0 = _Collections.m455n0(linkedHashSet);
            return m455n0;
        }
        throw new FileNotFoundException("file not found: " + path);
    }

    /* renamed from: m */
    public FileMetadata m7559m(Path path) {
        Intrinsics.isThisObjectNull(path, "path");
        if (C10607a.m7550a(f27331d, path)) {
            String m7551v = m7551v(path);
            for (C13182l c13182l : m7552u()) {
                FileMetadata m8657m = ((FileSystem) c13182l.m1462a()).m8657m(((Path) c13182l.m1461b()).m8522k(m7551v));
                if (m8657m != null) {
                    return m8657m;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: n */
    public FileHandle m7558n(Path path) {
        Intrinsics.isThisObjectNull(path, "file");
        if (C10607a.m7550a(f27331d, path)) {
            String m7551v = m7551v(path);
            for (C13182l c13182l : m7552u()) {
                try {
                    return ((FileSystem) c13182l.m1462a()).m8656n(((Path) c13182l.m1461b()).m8522k(m7551v));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + path);
        }
        throw new FileNotFoundException("file not found: " + path);
    }

    /* renamed from: p */
    public InterfaceC10189f0 m7557p(Path path, boolean z) {
        Intrinsics.isThisObjectNull(path, "file");
        throw new IOException(this + " is read-only");
    }

    /* renamed from: q */
    public InterfaceC10191h0 m7556q(Path path) {
        Intrinsics.isThisObjectNull(path, "file");
        if (C10607a.m7550a(f27331d, path)) {
            String m7551v = m7551v(path);
            for (C13182l c13182l : m7552u()) {
                try {
                    return ((FileSystem) c13182l.m1462a()).m8653q(((Path) c13182l.m1461b()).m8522k(m7551v));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + path);
        }
        throw new FileNotFoundException("file not found: " + path);
    }
}
