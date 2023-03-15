package p457y1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p479z1.C13619p;
import p479z1.C13621q;

/* renamed from: y1.g */
/* loaded from: classes.dex */
public final class C13068g {

    /* renamed from: c */
    public static final C13069a f33988c = new C13069a(null);

    /* renamed from: d */
    private static final C13068g f33989d = new C13068g(0, 0, 3, null);

    /* renamed from: a */
    private final long f33990a;

    /* renamed from: b */
    private final long f33991b;

    /* compiled from: TextIndent.kt */
    /* renamed from: y1.g$a */
    /* loaded from: classes.dex */
    public static final class C13069a {
        private C13069a() {
        }

        public /* synthetic */ C13069a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13068g m1696a() {
            return C13068g.f33989d;
        }
    }

    private C13068g(long j, long j2) {
        this.f33990a = j;
        this.f33991b = j2;
    }

    public /* synthetic */ C13068g(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: b */
    public final long m1698b() {
        return this.f33990a;
    }

    /* renamed from: c */
    public final long m1697c() {
        return this.f33991b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13068g) {
            C13068g c13068g = (C13068g) obj;
            return C13619p.m813e(m1698b(), c13068g.m1698b()) && C13619p.m813e(m1697c(), c13068g.m1697c());
        }
        return false;
    }

    public int hashCode() {
        return (C13619p.m809i(m1698b()) * 31) + C13619p.m809i(m1697c());
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) C13619p.m808j(m1698b())) + ", restLine=" + ((Object) C13619p.m808j(m1697c())) + ')';
    }

    public /* synthetic */ C13068g(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13621q.m803c(0) : j, (i & 2) != 0 ? C13621q.m803c(0) : j2, null);
    }
}
