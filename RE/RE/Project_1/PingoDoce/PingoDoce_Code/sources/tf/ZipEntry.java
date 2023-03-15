package tf;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p356sf.Path;

/* renamed from: tf.d */
/* loaded from: classes2.dex */
public final class ZipEntry {

    /* renamed from: a */
    private final Path f27336a;

    /* renamed from: b */
    private final boolean f27337b;

    /* renamed from: c */
    private final long f27338c;

    /* renamed from: d */
    private final long f27339d;

    /* renamed from: e */
    private final int f27340e;

    /* renamed from: f */
    private final Long f27341f;

    /* renamed from: g */
    private final long f27342g;

    /* renamed from: h */
    private final List f27343h;

    public ZipEntry(Path path, boolean z, String str, long j, long j2, long j3, int i, Long l, long j4) {
        Intrinsics.isThisObjectNull(path, "canonicalPath");
        Intrinsics.isThisObjectNull(str, "comment");
        this.f27336a = path;
        this.f27337b = z;
        this.f27338c = j2;
        this.f27339d = j3;
        this.f27340e = i;
        this.f27341f = l;
        this.f27342g = j4;
        this.f27343h = new ArrayList();
    }

    /* renamed from: a */
    public final Path m7541a() {
        return this.f27336a;
    }

    /* renamed from: b */
    public final List m7540b() {
        return this.f27343h;
    }

    /* renamed from: c */
    public final long m7539c() {
        return this.f27338c;
    }

    /* renamed from: d */
    public final int m7538d() {
        return this.f27340e;
    }

    /* renamed from: e */
    public final Long m7537e() {
        return this.f27341f;
    }

    /* renamed from: f */
    public final long m7536f() {
        return this.f27342g;
    }

    /* renamed from: g */
    public final long m7535g() {
        return this.f27339d;
    }

    /* renamed from: h */
    public final boolean m7534h() {
        return this.f27337b;
    }

    public /* synthetic */ ZipEntry(Path path, boolean z, String str, long j, long j2, long j3, int i, Long l, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? BuildConfig.VERSION_NAME : str, (i2 & 8) != 0 ? -1L : j, (i2 & 16) != 0 ? -1L : j2, (i2 & 32) != 0 ? -1L : j3, (i2 & 64) != 0 ? -1 : i, (i2 & 128) != 0 ? null : l, (i2 & 256) == 0 ? j4 : -1L);
    }
}
