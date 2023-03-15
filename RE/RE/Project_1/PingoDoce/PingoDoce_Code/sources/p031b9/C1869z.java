package p031b9;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b9.z */
/* loaded from: classes.dex */
public final class C1869z {
    static {
        C1869z.class.getClassLoader();
    }

    private C1869z() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m35242a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m35241b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface);
    }

    /* renamed from: c */
    public static void m35240c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
