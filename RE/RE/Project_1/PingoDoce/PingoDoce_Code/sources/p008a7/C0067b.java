package p008a7;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: a7.b */
/* loaded from: classes.dex */
public final class C0067b {
    /* renamed from: a */
    public static <T extends SafeParcelable> byte[] m41994a(T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: b */
    public static <T extends SafeParcelable> void m41993b(T t, Intent intent, String str) {
        intent.putExtra(str, m41994a(t));
    }
}
