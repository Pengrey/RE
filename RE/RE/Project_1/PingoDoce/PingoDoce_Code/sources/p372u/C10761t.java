package p372u;

import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p393v0.C11003c0;
import p393v0.Color;
import p410w.InterfaceC11498x;
import p410w.Padding;

/* renamed from: u.t */
/* loaded from: classes.dex */
public final class C10761t {

    /* renamed from: a */
    private final long f27847a;

    /* renamed from: b */
    private final boolean f27848b;

    /* renamed from: c */
    private final InterfaceC11498x f27849c;

    private C10761t(long j, boolean z, InterfaceC11498x interfaceC11498x) {
        this.f27847a = j;
        this.f27848b = z;
        this.f27849c = interfaceC11498x;
    }

    public /* synthetic */ C10761t(long j, boolean z, InterfaceC11498x interfaceC11498x, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, interfaceC11498x);
    }

    /* renamed from: a */
    public final InterfaceC11498x m7204a() {
        return this.f27849c;
    }

    /* renamed from: b */
    public final boolean m7203b() {
        return this.f27848b;
    }

    /* renamed from: c */
    public final long m7202c() {
        return this.f27847a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (Intrinsics.equals(C10761t.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.gestures.OverScrollConfiguration");
            C10761t c10761t = (C10761t) obj;
            return Color.m6646n(m7202c(), c10761t.m7202c()) && this.f27848b == c10761t.f27848b && Intrinsics.equals(this.f27849c, c10761t.f27849c);
        }
        return false;
    }

    public int hashCode() {
        return (((Color.m6640t(m7202c()) * 31) + Boolean.hashCode(this.f27848b)) * 31) + this.f27849c.hashCode();
    }

    public String toString() {
        return "OverScrollConfiguration(glowColor=" + ((Object) Color.m6639u(m7202c())) + ", forceShowAlways=" + this.f27848b + ", drawPadding=" + this.f27849c + ')';
    }

    public /* synthetic */ C10761t(long j, boolean z, InterfaceC11498x interfaceC11498x, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C11003c0.m6593c(4284900966L) : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? Padding.m4986c(0.0f, 0.0f, 3, null) : interfaceC11498x, null);
    }
}
