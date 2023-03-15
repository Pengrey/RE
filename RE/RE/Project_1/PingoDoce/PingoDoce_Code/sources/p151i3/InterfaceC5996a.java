package p151i3;

import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import p297pd._Ranges;
import p356sf.FileSystem;
import p356sf.Path;
import td.AbstractC10505e0;
import td.C10587w0;

/* renamed from: i3.a */
/* loaded from: classes.dex */
public interface InterfaceC5996a {

    /* compiled from: DiskCache.kt */
    /* renamed from: i3.a$a */
    /* loaded from: classes.dex */
    public static final class C5997a {

        /* renamed from: a */
        private Path f16549a;

        /* renamed from: f */
        private long f16550f;

        /* renamed from: b */
        private FileSystem f16551b = FileSystem.f26563b;

        /* renamed from: c */
        private double f16552c = 0.02d;

        /* renamed from: d */
        private long f16553d = 10485760;

        /* renamed from: e */
        private long f16554e = 262144000;

        /* renamed from: g */
        private AbstractC10505e0 f16555g = C10587w0.m7620b();

        /* renamed from: a */
        public final InterfaceC5996a m22442a() {
            long j;
            Path path = this.f16549a;
            if (path != null) {
                if (this.f16552c > 0.0d) {
                    try {
                        StatFs statFs = new StatFs(path.m8520m().getAbsolutePath());
                        j = _Ranges.m14995n((long) (this.f16552c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f16553d, this.f16554e);
                    } catch (Exception unused) {
                        j = this.f16553d;
                    }
                } else {
                    j = this.f16550f;
                }
                return new C6009d(j, path, this.f16551b, this.f16555g);
            }
            throw new IllegalStateException("directory == null".toString());
        }

        /* renamed from: b */
        public final C5997a m22441b(File file) {
            return m22440c(Path.C10205a.m8514d(Path.f26595x, file, false, 1, null));
        }

        /* renamed from: c */
        public final C5997a m22440c(Path path) {
            this.f16549a = path;
            return this;
        }
    }

    /* compiled from: DiskCache.kt */
    /* renamed from: i3.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC5998b {
        /* renamed from: d */
        Path mo22373d();

        /* renamed from: f */
        Path mo22372f();

        /* renamed from: g */
        InterfaceC5999c mo22371g();

        /* renamed from: h */
        void mo22370h();
    }

    /* compiled from: DiskCache.kt */
    /* renamed from: i3.a$c */
    /* loaded from: classes.dex */
    public interface InterfaceC5999c extends Closeable {
        /* renamed from: d */
        Path mo22368d();

        /* renamed from: f */
        Path mo22367f();

        /* renamed from: k */
        InterfaceC5998b mo22366k();
    }

    /* renamed from: a */
    InterfaceC5999c mo22380a(String str);

    /* renamed from: b */
    FileSystem mo22379b();

    /* renamed from: c */
    InterfaceC5998b mo22378c(String str);
}
