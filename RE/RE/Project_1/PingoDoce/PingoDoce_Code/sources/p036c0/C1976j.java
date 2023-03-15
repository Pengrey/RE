package p036c0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p393v0.Color;

/* renamed from: c0.j */
/* loaded from: classes.dex */
public final class C1976j {

    /* renamed from: a */
    private final long f5788a;

    /* renamed from: b */
    private final long f5789b;

    private C1976j(long j, long j2) {
        this.f5788a = j;
        this.f5789b = j2;
    }

    public /* synthetic */ C1976j(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: a */
    public final long m34996a() {
        return this.f5789b;
    }

    /* renamed from: b */
    public final long m34995b() {
        return this.f5788a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1976j) {
            C1976j c1976j = (C1976j) obj;
            return Color.m6646n(m34995b(), c1976j.m34995b()) && Color.m6646n(m34996a(), c1976j.m34996a());
        }
        return false;
    }

    public int hashCode() {
        return (Color.m6640t(m34995b()) * 31) + Color.m6640t(m34996a());
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) Color.m6639u(m34995b())) + ", selectionBackgroundColor=" + ((Object) Color.m6639u(m34996a())) + ')';
    }
}
