package com.google.android.gms.internal.measurement;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.q0 */
/* loaded from: classes.dex */
public final class C2932q0 {

    /* renamed from: a */
    private static final ClassLoader f7938a = C2932q0.class.getClassLoader();

    private C2932q0() {
    }

    /* renamed from: a */
    public static Parcelable m32199a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static HashMap m32198b(Parcel parcel) {
        return parcel.readHashMap(f7938a);
    }

    /* renamed from: c */
    public static void m32197c(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m32196d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: e */
    public static void m32195e(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: f */
    public static boolean m32194f(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
