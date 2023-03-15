package pt.pingodoce.app.data.local.flows;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.Consent;

/* compiled from: UpdatePhoneFlowData.kt */
/* loaded from: classes2.dex */
public final class UpdatePhoneFlowData extends PhoneFlowData {
    public static final Parcelable.Creator CREATOR = new C8679a();

    /* renamed from: A */
    private final Consent f22437A;

    /* renamed from: y */
    private String f22438y;

    /* renamed from: z */
    private final String f22439z;

    /* compiled from: UpdatePhoneFlowData.kt */
    /* renamed from: pt.pingodoce.app.data.local.flows.UpdatePhoneFlowData$a */
    /* loaded from: classes2.dex */
    public static final class C8679a implements Parcelable.Creator {
        /* renamed from: a */
        public final UpdatePhoneFlowData mo13540a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new UpdatePhoneFlowData(parcel.readString(), parcel.readString(), (Consent) (parcel.readInt() == 0 ? null : Consent.CREATOR.createFromParcel(parcel)));
        }

        /* renamed from: b */
        public final UpdatePhoneFlowData[] mo13539b(int i) {
            return new UpdatePhoneFlowData[i];
        }
    }

    public /* synthetic */ UpdatePhoneFlowData(String str, String str2, Consent consent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, str2, (i & 4) != 0 ? null : consent);
    }

    /* renamed from: a */
    public Consent m14686a() {
        return this.f22437A;
    }

    /* renamed from: b */
    public String m14685b() {
        return this.f22439z;
    }

    /* renamed from: d */
    public final String m14684d() {
        return this.f22438y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdatePhoneFlowData) {
            UpdatePhoneFlowData updatePhoneFlowData = (UpdatePhoneFlowData) obj;
            return Intrinsics.equals(this.f22438y, updatePhoneFlowData.f22438y) && Intrinsics.equals(m14685b(), updatePhoneFlowData.m14685b()) && Intrinsics.equals(m14686a(), updatePhoneFlowData.m14686a());
        }
        return false;
    }

    public int hashCode() {
        return (((this.f22438y.hashCode() * 31) + m14685b().hashCode()) * 31) + (m14686a() == null ? 0 : m14686a().hashCode());
    }

    public String toString() {
        String str = this.f22438y;
        String m14685b = m14685b();
        Consent m14686a = m14686a();
        return "UpdatePhoneFlowData(newNumber=" + str + ", phoneNumber=" + m14685b + ", consents=" + m14686a + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22438y);
        parcel.writeString(this.f22439z);
        Consent consent = this.f22437A;
        if (consent == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        consent.writeToParcel(parcel, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePhoneFlowData(String str, String str2, Consent consent) {
        super(str2, consent);
        Intrinsics.isThisObjectNull(str, "newNumber");
        Intrinsics.isThisObjectNull(str2, "phoneNumber");
        this.f22438y = str;
        this.f22439z = str2;
        this.f22437A = consent;
    }
}
