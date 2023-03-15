package p444xb;

import java.util.Objects;
import p422wb.C11607b;
import p422wb.C11608c;

/* renamed from: xb.b */
/* loaded from: classes2.dex */
final class C12338b {

    /* renamed from: a */
    private final C11607b f32491a;

    /* renamed from: b */
    private final C11607b f32492b;

    /* renamed from: c */
    private final C11608c f32493c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12338b(C11607b c11607b, C11607b c11607b2, C11608c c11608c) {
        this.f32491a = c11607b;
        this.f32492b = c11607b2;
        this.f32493c = c11608c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C11608c m3052a() {
        return this.f32493c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C11607b m3051b() {
        return this.f32491a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C11607b m3050c() {
        return this.f32492b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m3049d() {
        return this.f32492b == null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12338b) {
            C12338b c12338b = (C12338b) obj;
            return Objects.equals(this.f32491a, c12338b.f32491a) && Objects.equals(this.f32492b, c12338b.f32492b) && Objects.equals(this.f32493c, c12338b.f32493c);
        }
        return false;
    }

    public int hashCode() {
        return (Objects.hashCode(this.f32491a) ^ Objects.hashCode(this.f32492b)) ^ Objects.hashCode(this.f32493c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f32491a);
        sb2.append(" , ");
        sb2.append(this.f32492b);
        sb2.append(" : ");
        C11608c c11608c = this.f32493c;
        sb2.append(c11608c == null ? "null" : Integer.valueOf(c11608c.m4612c()));
        sb2.append(" ]");
        return sb2.toString();
    }
}
