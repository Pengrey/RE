package pt.pingodoce.app.data.local.models.clubs;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: FormFieldOption.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class FormFieldOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8690a();

    /* renamed from: w */
    private final String f22509w;

    /* renamed from: x */
    private final String f22510x;

    /* compiled from: FormFieldOption.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.clubs.FormFieldOption$a */
    /* loaded from: classes2.dex */
    public static final class C8690a implements Parcelable.Creator {
        /* renamed from: a */
        public final FormFieldOption mo13457a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new FormFieldOption(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final FormFieldOption[] mo13456b(int i) {
            return new FormFieldOption[i];
        }
    }

    public FormFieldOption() {
        this(null, null, 3, null);
    }

    public FormFieldOption(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "key");
        Intrinsics.isThisObjectNull(str2, "value");
        this.f22509w = str;
        this.f22510x = str2;
    }

    /* renamed from: a */
    public final String m14602a() {
        return this.f22509w;
    }

    /* renamed from: b */
    public final String m14601b() {
        return this.f22510x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FormFieldOption) {
            FormFieldOption formFieldOption = (FormFieldOption) obj;
            return Intrinsics.equals(this.f22509w, formFieldOption.f22509w) && Intrinsics.equals(this.f22510x, formFieldOption.f22510x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f22509w.hashCode() * 31) + this.f22510x.hashCode();
    }

    public String toString() {
        String str = this.f22509w;
        String str2 = this.f22510x;
        return "FormFieldOption(key=" + str + ", value=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22509w);
        parcel.writeString(this.f22510x);
    }

    public /* synthetic */ FormFieldOption(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2);
    }
}
