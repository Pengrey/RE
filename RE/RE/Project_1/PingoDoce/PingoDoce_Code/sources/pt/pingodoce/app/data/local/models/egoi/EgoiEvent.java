package pt.pingodoce.app.data.local.models.egoi;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: EgoiEvent.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class EgoiEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8693a();
    @InterfaceC4469e(name = "contact")

    /* renamed from: w */
    private final String f22516w;
    @InterfaceC4469e(name = "messageHash")

    /* renamed from: x */
    private final String f22517x;
    @InterfaceC4469e(name = "deviceId")

    /* renamed from: y */
    private final int f22518y;

    /* compiled from: EgoiEvent.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.egoi.EgoiEvent$a */
    /* loaded from: classes2.dex */
    public static final class C8693a implements Parcelable.Creator {
        /* renamed from: a */
        public final EgoiEvent mo13450a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new EgoiEvent(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* renamed from: b */
        public final EgoiEvent[] mo13449b(int i) {
            return new EgoiEvent[i];
        }
    }

    public EgoiEvent() {
        this(null, null, 0, 7, null);
    }

    public EgoiEvent(String str, String str2, int i) {
        Intrinsics.isThisObjectNull(str, "contact");
        Intrinsics.isThisObjectNull(str2, "messageHash");
        this.f22516w = str;
        this.f22517x = str2;
        this.f22518y = i;
    }

    /* renamed from: a */
    public final String m14596a() {
        return this.f22516w;
    }

    /* renamed from: b */
    public final int m14595b() {
        return this.f22518y;
    }

    /* renamed from: c */
    public final String m14594c() {
        return this.f22517x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EgoiEvent) {
            EgoiEvent egoiEvent = (EgoiEvent) obj;
            return Intrinsics.equals(this.f22516w, egoiEvent.f22516w) && Intrinsics.equals(this.f22517x, egoiEvent.f22517x) && this.f22518y == egoiEvent.f22518y;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f22516w.hashCode() * 31) + this.f22517x.hashCode()) * 31) + Integer.hashCode(this.f22518y);
    }

    public String toString() {
        String str = this.f22516w;
        String str2 = this.f22517x;
        int i = this.f22518y;
        return "EgoiEvent(contact=" + str + ", messageHash=" + str2 + ", deviceId=" + i + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22516w);
        parcel.writeString(this.f22517x);
        parcel.writeInt(this.f22518y);
    }

    public /* synthetic */ EgoiEvent(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "000000" : str, (i2 & 2) != 0 ? "0000" : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
