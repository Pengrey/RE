package p292p7;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: p7.c */
/* loaded from: classes.dex */
public final class C8446c {
    static {
        C8446c.class.getClassLoader();
    }

    private C8446c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m15396a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m15395b(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: c */
    public static void m15394c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: d */
    public static void m15393d(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: e */
    public static boolean m15392e(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
