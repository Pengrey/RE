package pt.pingodoce.app.data.local.flows;

import android.os.Parcel;
import android.os.Parcelable;
import be.UtilsExtensions;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.Consent;

/* compiled from: PhoneFlowData.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public class PhoneFlowData implements FlowData {
    public static final Parcelable.Creator CREATOR = new C8676a();

    /* renamed from: w */
    private final String f22427w;

    /* renamed from: x */
    private final Consent f22428x;

    /* compiled from: PhoneFlowData.kt */
    /* renamed from: pt.pingodoce.app.data.local.flows.PhoneFlowData$a */
    /* loaded from: classes2.dex */
    public static final class C8676a implements Parcelable.Creator {
        /* renamed from: a */
        public final PhoneFlowData mo14232a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new PhoneFlowData(parcel.readString(), (Consent) (parcel.readInt() == 0 ? null : Consent.CREATOR.createFromParcel(parcel)));
        }

        /* renamed from: b */
        public final PhoneFlowData[] mo14231b(int i) {
            return new PhoneFlowData[i];
        }
    }

    public PhoneFlowData() {
        this(null, null, 3, null);
    }

    public PhoneFlowData(String str, Consent consent) {
        Intrinsics.isThisObjectNull(str, "phoneNumber");
        this.f22427w = str;
        this.f22428x = consent;
    }

    /* renamed from: a */
    public Consent m14702a() {
        return this.f22428x;
    }

    /* renamed from: b */
    public String m14701b() {
        return this.f22427w;
    }

    /* renamed from: c */
    public final String m14700c() {
        return UtilsExtensions.m35165g(m14701b());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22427w);
        Consent consent = this.f22428x;
        if (consent == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        consent.writeToParcel(parcel, i);
    }

    public /* synthetic */ PhoneFlowData(String str, Consent consent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? null : consent);
    }
}
