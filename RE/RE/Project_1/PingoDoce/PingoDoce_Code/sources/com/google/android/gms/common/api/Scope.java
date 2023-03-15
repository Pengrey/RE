package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C2478d();

    /* renamed from: w */
    final int f7153w;

    /* renamed from: x */
    private final String f7154x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i, String str) {
        C2597i.m33079g(str, "scopeUri must not be null or empty");
        this.f7153w = i;
        this.f7154x = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f7154x.equals(((Scope) obj).f7154x);
        }
        return false;
    }

    /* renamed from: h */
    public String m33512h() {
        return this.f7154x;
    }

    public int hashCode() {
        return this.f7154x.hashCode();
    }

    public String toString() {
        return this.f7154x;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f7153w);
        C0066a.m42003r(parcel, 2, m33512h(), false);
        C0066a.m42019b(parcel, m42020a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
