package p353s7;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: s7.c */
/* loaded from: classes.dex */
public final class C10076c {
    static {
        C10076c.class.getClassLoader();
    }

    private C10076c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m9258a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m9257b(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: c */
    public static void m9256c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: d */
    public static void m9255d(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: e */
    public static boolean m9254e(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
