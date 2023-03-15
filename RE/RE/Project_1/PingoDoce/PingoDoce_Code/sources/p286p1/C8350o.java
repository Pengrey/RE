package p286p1;

import p479z1.C13619p;

/* renamed from: p1.o */
/* loaded from: classes.dex */
public final class C8350o {

    /* renamed from: a */
    private final long f21620a;

    /* renamed from: b */
    private final long f21621b;

    /* renamed from: c */
    private final int f21622c;

    /* renamed from: a */
    public final long m15673a() {
        return this.f21621b;
    }

    /* renamed from: b */
    public final int m15672b() {
        return this.f21622c;
    }

    /* renamed from: c */
    public final long m15671c() {
        return this.f21620a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8350o) {
            C8350o c8350o = (C8350o) obj;
            return C13619p.m813e(m15671c(), c8350o.m15671c()) && C13619p.m813e(m15673a(), c8350o.m15673a()) && C8351p.m15662i(m15672b(), c8350o.m15672b());
        }
        return false;
    }

    public int hashCode() {
        return (((C13619p.m809i(m15671c()) * 31) + C13619p.m809i(m15673a())) * 31) + C8351p.m15661j(m15672b());
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) C13619p.m808j(m15671c())) + ", height=" + ((Object) C13619p.m808j(m15673a())) + ", placeholderVerticalAlign=" + ((Object) C8351p.m15660k(m15672b())) + ')';
    }
}
