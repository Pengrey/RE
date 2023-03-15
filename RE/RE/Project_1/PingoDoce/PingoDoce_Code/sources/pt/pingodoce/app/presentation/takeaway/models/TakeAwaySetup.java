package pt.pingodoce.app.presentation.takeaway.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13780s;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayCategory;

/* compiled from: TakeAwaySetup.kt */
/* loaded from: classes2.dex */
public final class TakeAwaySetup implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9512a();

    /* renamed from: A */
    private List f25024A;

    /* renamed from: w */
    private final int f25025w;

    /* renamed from: x */
    private String f25026x;

    /* renamed from: y */
    private String f25027y;

    /* renamed from: z */
    private String f25028z;

    /* compiled from: TakeAwaySetup.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.models.TakeAwaySetup$a */
    /* loaded from: classes2.dex */
    public static final class C9512a implements Parcelable.Creator {
        /* renamed from: a */
        public final TakeAwaySetup mo10250a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(TakeAwayCategory.CREATOR.createFromParcel(parcel));
            }
            return new TakeAwaySetup(readInt, readString, readString2, readString3, arrayList);
        }

        /* renamed from: b */
        public final TakeAwaySetup[] mo10249b(int i) {
            return new TakeAwaySetup[i];
        }
    }

    public TakeAwaySetup() {
        this(0, null, null, null, null, 31, null);
    }

    public TakeAwaySetup(int i, String str, String str2, String str3, List list) {
        Intrinsics.isThisObjectNull(str, "dayLabel");
        Intrinsics.isThisObjectNull(str2, "hourLabel");
        Intrinsics.isThisObjectNull(str3, "dateTimeStamp");
        Intrinsics.isThisObjectNull(list, "categories");
        this.f25025w = i;
        this.f25026x = str;
        this.f25027y = str2;
        this.f25028z = str3;
        this.f25024A = list;
    }

    /* renamed from: a */
    public final String m10850a() {
        return this.f25028z;
    }

    /* renamed from: b */
    public final String m10849b() {
        return this.f25026x;
    }

    /* renamed from: c */
    public final String m10848c() {
        return this.f25027y;
    }

    /* renamed from: d */
    public final int m10847d() {
        return this.f25025w;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void m10846e(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f25028z = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TakeAwaySetup) {
            TakeAwaySetup takeAwaySetup = (TakeAwaySetup) obj;
            return this.f25025w == takeAwaySetup.f25025w && Intrinsics.equals(this.f25026x, takeAwaySetup.f25026x) && Intrinsics.equals(this.f25027y, takeAwaySetup.f25027y) && Intrinsics.equals(this.f25028z, takeAwaySetup.f25028z) && Intrinsics.equals(this.f25024A, takeAwaySetup.f25024A);
        }
        return false;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f25025w) * 31) + this.f25026x.hashCode()) * 31) + this.f25027y.hashCode()) * 31) + this.f25028z.hashCode()) * 31) + this.f25024A.hashCode();
    }

    public String toString() {
        int i = this.f25025w;
        String str = this.f25026x;
        String str2 = this.f25027y;
        String str3 = this.f25028z;
        List list = this.f25024A;
        return "TakeAwaySetup(storeId=" + i + ", dayLabel=" + str + ", hourLabel=" + str2 + ", dateTimeStamp=" + str3 + ", categories=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f25025w);
        parcel.writeString(this.f25026x);
        parcel.writeString(this.f25027y);
        parcel.writeString(this.f25028z);
        List<TakeAwayCategory> list = this.f25024A;
        parcel.writeInt(list.size());
        for (TakeAwayCategory takeAwayCategory : list) {
            takeAwayCategory.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ TakeAwaySetup(int i, String str, String str2, String str3, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i2 & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i2 & 8) == 0 ? str3 : BuildConfig.VERSION_NAME, (i2 & 16) != 0 ? C13780s.m197g() : list);
    }
}
