package pt.pingodoce.app.presentation.common.loyaltycard.resume;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: LoyaltyCardResumeViewModel.kt */
@InterfaceC4475g(generateAdapter = true)
/* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.resume.OnboardingResumeInfoRowItem */
/* loaded from: classes2.dex */
public final class C14956OnboardingResumeInfoRowItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9076a();

    /* renamed from: w */
    private final String f23914w;

    /* renamed from: x */
    private boolean f23915x;

    /* compiled from: LoyaltyCardResumeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.resume.OnboardingResumeInfoRowItem$a */
    /* loaded from: classes2.dex */
    public static final class C9076a implements Parcelable.Creator {
        /* renamed from: a */
        public final C14956OnboardingResumeInfoRowItem mo11694a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new C14956OnboardingResumeInfoRowItem(parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final C14956OnboardingResumeInfoRowItem[] mo11693b(int i) {
            return new C14956OnboardingResumeInfoRowItem[i];
        }
    }

    public C14956OnboardingResumeInfoRowItem(String str, boolean z) {
        Intrinsics.isThisObjectNull(str, "label");
        this.f23914w = str;
        this.f23915x = z;
    }

    /* renamed from: a */
    public final String m12638a() {
        return this.f23914w;
    }

    /* renamed from: b */
    public final boolean m12637b() {
        return this.f23915x;
    }

    /* renamed from: c */
    public final void m12636c(boolean z) {
        this.f23915x = z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14956OnboardingResumeInfoRowItem) {
            C14956OnboardingResumeInfoRowItem c14956OnboardingResumeInfoRowItem = (C14956OnboardingResumeInfoRowItem) obj;
            return Intrinsics.equals(this.f23914w, c14956OnboardingResumeInfoRowItem.f23914w) && this.f23915x == c14956OnboardingResumeInfoRowItem.f23915x;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f23914w.hashCode() * 31;
        boolean z = this.f23915x;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f23914w;
        boolean z = this.f23915x;
        return "OnboardingResumeInfoRowItem(label=" + str + ", selected=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23914w);
        parcel.writeInt(this.f23915x ? 1 : 0);
    }

    public /* synthetic */ C14956OnboardingResumeInfoRowItem(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
