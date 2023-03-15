package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13780s;
import pt.pingodoce.app.data.local.models.egoi.EgoiEvent;

/* compiled from: DeviceTokenRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class DeviceTokenRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8736a();
    @InterfaceC4469e(name = "platform")

    /* renamed from: w */
    private final String f22851w;
    @InterfaceC4469e(name = "handle")

    /* renamed from: x */
    private final String f22852x;
    @InterfaceC4469e(name = "egoiEvents")

    /* renamed from: y */
    private final List f22853y;

    /* compiled from: DeviceTokenRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.DeviceTokenRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8736a implements Parcelable.Creator {
        /* renamed from: a */
        public final DeviceTokenRequest mo13025a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(EgoiEvent.CREATOR.createFromParcel(parcel));
            }
            return new DeviceTokenRequest(readString, readString2, arrayList);
        }

        /* renamed from: b */
        public final DeviceTokenRequest[] mo13024b(int i) {
            return new DeviceTokenRequest[i];
        }
    }

    public DeviceTokenRequest(String str, String str2, List list) {
        Intrinsics.isThisObjectNull(str, "platform");
        Intrinsics.isThisObjectNull(str2, "token");
        Intrinsics.isThisObjectNull(list, "egoiEvents");
        this.f22851w = str;
        this.f22852x = str2;
        this.f22853y = list;
    }

    /* renamed from: a */
    public final List m14167a() {
        return this.f22853y;
    }

    /* renamed from: b */
    public final String m14166b() {
        return this.f22851w;
    }

    /* renamed from: c */
    public final String m14165c() {
        return this.f22852x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceTokenRequest) {
            DeviceTokenRequest deviceTokenRequest = (DeviceTokenRequest) obj;
            return Intrinsics.equals(this.f22851w, deviceTokenRequest.f22851w) && Intrinsics.equals(this.f22852x, deviceTokenRequest.f22852x) && Intrinsics.equals(this.f22853y, deviceTokenRequest.f22853y);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f22851w.hashCode() * 31) + this.f22852x.hashCode()) * 31) + this.f22853y.hashCode();
    }

    public String toString() {
        String str = this.f22851w;
        String str2 = this.f22852x;
        List list = this.f22853y;
        return "DeviceTokenRequest(platform=" + str + ", token=" + str2 + ", egoiEvents=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22851w);
        parcel.writeString(this.f22852x);
        List<EgoiEvent> list = this.f22853y;
        parcel.writeInt(list.size());
        for (EgoiEvent egoiEvent : list) {
            egoiEvent.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ DeviceTokenRequest(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? C13780s.m197g() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceTokenRequest(String str) {
        this("ANDROID", str, null, 4, null);
        Intrinsics.isThisObjectNull(str, "token");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceTokenRequest(String str, List list) {
        this("ANDROID", str, list);
        Intrinsics.isThisObjectNull(str, "token");
        Intrinsics.isThisObjectNull(list, "egoiEvents");
    }
}
