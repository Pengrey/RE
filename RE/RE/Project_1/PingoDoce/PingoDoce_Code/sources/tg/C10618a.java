package tg;

import tg.BaseParameters;

/* renamed from: tg.a */
/* loaded from: classes2.dex */
public final class BannersParameters implements BaseParameters {

    /* renamed from: w */
    private final int f27361w;

    public BannersParameters(int i) {
        this.f27361w = i;
    }

    /* renamed from: a */
    public final int m7043a() {
        return this.f27361w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BannersParameters) && this.f27361w == ((BannersParameters) obj).f27361w;
    }

    @Override // tg.BaseParameters
    public String getKey() {
        return BaseParameters.C8557a.m7042a(this);
    }

    public int hashCode() {
        return Integer.hashCode(this.f27361w);
    }

    public String toString() {
        int i = this.f27361w;
        return "BannersParameters(storeId=" + i + ")";
    }
}
