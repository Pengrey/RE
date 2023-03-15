package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p133h7.BinderC5870d;
import p133h7.InterfaceC5867b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C2627s();

    /* renamed from: A */
    private final boolean f7559A;

    /* renamed from: w */
    private final String f7560w;

    /* renamed from: x */
    private final boolean f7561x;

    /* renamed from: y */
    private final boolean f7562y;

    /* renamed from: z */
    private final Context f7563z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.f7560w = str;
        this.f7561x = z;
        this.f7562y = z2;
        this.f7563z = (Context) BinderC5870d.m22836H(InterfaceC5867b.AbstractBinderC5868a.m22841y(iBinder));
        this.f7559A = z3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [h7.b, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42003r(parcel, 1, this.f7560w, false);
        C0066a.m42018c(parcel, 2, this.f7561x);
        C0066a.m42018c(parcel, 3, this.f7562y);
        C0066a.m42010k(parcel, 4, BinderC5870d.m22835S1(this.f7563z), false);
        C0066a.m42018c(parcel, 5, this.f7559A);
        C0066a.m42019b(parcel, m42020a);
    }
}
