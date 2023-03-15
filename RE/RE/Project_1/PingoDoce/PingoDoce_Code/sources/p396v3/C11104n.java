package p396v3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p129h3.EnumC5835j;

/* renamed from: v3.n */
/* loaded from: classes.dex */
public final class C11104n {

    /* renamed from: a */
    private final boolean f28499a;

    /* renamed from: b */
    private final boolean f28500b;

    /* renamed from: c */
    private final boolean f28501c;

    /* renamed from: d */
    private final int f28502d;

    /* renamed from: e */
    private final EnumC5835j f28503e;

    public C11104n(boolean z, boolean z2, boolean z3, int i, EnumC5835j enumC5835j) {
        this.f28499a = z;
        this.f28500b = z2;
        this.f28501c = z3;
        this.f28502d = i;
        this.f28503e = enumC5835j;
    }

    /* renamed from: a */
    public final boolean m6123a() {
        return this.f28499a;
    }

    /* renamed from: b */
    public final EnumC5835j m6122b() {
        return this.f28503e;
    }

    /* renamed from: c */
    public final int m6121c() {
        return this.f28502d;
    }

    /* renamed from: d */
    public final boolean m6120d() {
        return this.f28500b;
    }

    /* renamed from: e */
    public final boolean m6119e() {
        return this.f28501c;
    }

    public /* synthetic */ C11104n(boolean z, boolean z2, boolean z3, int i, EnumC5835j enumC5835j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) == 0 ? z3 : true, (i2 & 8) != 0 ? 4 : i, (i2 & 16) != 0 ? EnumC5835j.RESPECT_PERFORMANCE : enumC5835j);
    }
}
