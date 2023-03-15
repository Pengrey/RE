package p444xb;

import java.util.ArrayList;
import java.util.List;

/* renamed from: xb.c */
/* loaded from: classes2.dex */
final class C12339c {

    /* renamed from: a */
    private final List<C12338b> f32494a;

    /* renamed from: b */
    private final int f32495b;

    /* renamed from: c */
    private final boolean f32496c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12339c(List<C12338b> list, int i, boolean z) {
        this.f32494a = new ArrayList(list);
        this.f32495b = i;
        this.f32496c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C12338b> m3048a() {
        return this.f32494a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m3047b() {
        return this.f32495b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m3046c(List<C12338b> list) {
        return this.f32494a.equals(list);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12339c) {
            C12339c c12339c = (C12339c) obj;
            return this.f32494a.equals(c12339c.m3048a()) && this.f32496c == c12339c.f32496c;
        }
        return false;
    }

    public int hashCode() {
        return this.f32494a.hashCode() ^ Boolean.valueOf(this.f32496c).hashCode();
    }

    public String toString() {
        return "{ " + this.f32494a + " }";
    }
}
