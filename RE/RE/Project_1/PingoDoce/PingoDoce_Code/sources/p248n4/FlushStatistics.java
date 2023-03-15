package p248n4;

import p181jd.Intrinsics;

/* renamed from: n4.l */
/* loaded from: classes.dex */
public final class FlushStatistics {

    /* renamed from: a */
    private int f20248a;

    /* renamed from: b */
    private EnumC7672k f20249b = EnumC7672k.SUCCESS;

    /* renamed from: a */
    public final int m17768a() {
        return this.f20248a;
    }

    /* renamed from: b */
    public final EnumC7672k m17767b() {
        return this.f20249b;
    }

    /* renamed from: c */
    public final void m17766c(int i) {
        this.f20248a = i;
    }

    /* renamed from: d */
    public final void m17765d(EnumC7672k enumC7672k) {
        Intrinsics.isThisObjectNull(enumC7672k, "<set-?>");
        this.f20249b = enumC7672k;
    }
}
