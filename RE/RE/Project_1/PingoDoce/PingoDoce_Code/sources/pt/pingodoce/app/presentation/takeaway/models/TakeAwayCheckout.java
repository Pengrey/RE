package pt.pingodoce.app.presentation.takeaway.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import fm.C5579c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: TakeAwayCheckout.kt */
/* loaded from: classes2.dex */
public final class TakeAwayCheckout implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9511a();

    /* renamed from: A */
    private int f25012A;

    /* renamed from: B */
    private String f25013B;

    /* renamed from: C */
    private String f25014C;

    /* renamed from: D */
    private final String f25015D;

    /* renamed from: E */
    private final String f25016E;

    /* renamed from: F */
    private String f25017F;

    /* renamed from: G */
    private final String f25018G;

    /* renamed from: H */
    private final boolean f25019H;

    /* renamed from: w */
    private final String f25020w;

    /* renamed from: x */
    private String f25021x;

    /* renamed from: y */
    private String f25022y;

    /* renamed from: z */
    private String f25023z;

    /* compiled from: TakeAwayCheckout.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout$a */
    /* loaded from: classes2.dex */
    public static final class C9511a implements Parcelable.Creator {
        /* renamed from: a */
        public final TakeAwayCheckout mo10257a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new TakeAwayCheckout(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final TakeAwayCheckout[] mo10256b(int i) {
            return new TakeAwayCheckout[i];
        }
    }

    public TakeAwayCheckout() {
        this(null, null, null, null, 0, null, null, null, null, null, null, false, 4095, null);
    }

    public TakeAwayCheckout(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        Intrinsics.isThisObjectNull(str, "number");
        Intrinsics.isThisObjectNull(str2, "total");
        Intrinsics.isThisObjectNull(str3, "storeName");
        Intrinsics.isThisObjectNull(str4, "storeAddress");
        Intrinsics.isThisObjectNull(str5, "pickupDay");
        Intrinsics.isThisObjectNull(str6, "pickUpTime");
        Intrinsics.isThisObjectNull(str7, "owner");
        Intrinsics.isThisObjectNull(str8, "ownerPhone");
        Intrinsics.isThisObjectNull(str9, "ownerEmail");
        Intrinsics.isThisObjectNull(str10, "disclaimer");
        this.f25020w = str;
        this.f25021x = str2;
        this.f25022y = str3;
        this.f25023z = str4;
        this.f25012A = i;
        this.f25013B = str5;
        this.f25014C = str6;
        this.f25015D = str7;
        this.f25016E = str8;
        this.f25017F = str9;
        this.f25018G = str10;
        this.f25019H = z;
    }

    /* renamed from: b */
    public static /* synthetic */ TakeAwayCheckout m10868b(TakeAwayCheckout takeAwayCheckout, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, int i2, Object obj) {
        return takeAwayCheckout.m10869a((i2 & 1) != 0 ? takeAwayCheckout.f25020w : str, (i2 & 2) != 0 ? takeAwayCheckout.f25021x : str2, (i2 & 4) != 0 ? takeAwayCheckout.f25022y : str3, (i2 & 8) != 0 ? takeAwayCheckout.f25023z : str4, (i2 & 16) != 0 ? takeAwayCheckout.f25012A : i, (i2 & 32) != 0 ? takeAwayCheckout.f25013B : str5, (i2 & 64) != 0 ? takeAwayCheckout.f25014C : str6, (i2 & 128) != 0 ? takeAwayCheckout.f25015D : str7, (i2 & 256) != 0 ? takeAwayCheckout.f25016E : str8, (i2 & 512) != 0 ? takeAwayCheckout.f25017F : str9, (i2 & 1024) != 0 ? takeAwayCheckout.f25018G : str10, (i2 & 2048) != 0 ? takeAwayCheckout.f25019H : z);
    }

    /* renamed from: a */
    public final TakeAwayCheckout m10869a(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        Intrinsics.isThisObjectNull(str, "number");
        Intrinsics.isThisObjectNull(str2, "total");
        Intrinsics.isThisObjectNull(str3, "storeName");
        Intrinsics.isThisObjectNull(str4, "storeAddress");
        Intrinsics.isThisObjectNull(str5, "pickupDay");
        Intrinsics.isThisObjectNull(str6, "pickUpTime");
        Intrinsics.isThisObjectNull(str7, "owner");
        Intrinsics.isThisObjectNull(str8, "ownerPhone");
        Intrinsics.isThisObjectNull(str9, "ownerEmail");
        Intrinsics.isThisObjectNull(str10, "disclaimer");
        return new TakeAwayCheckout(str, str2, str3, str4, i, str5, str6, str7, str8, str9, str10, z);
    }

    /* renamed from: c */
    public final boolean m10867c() {
        return this.f25019H;
    }

    /* renamed from: d */
    public final String m10866d() {
        return this.f25018G;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m10865e() {
        return this.f25020w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TakeAwayCheckout) {
            TakeAwayCheckout takeAwayCheckout = (TakeAwayCheckout) obj;
            return Intrinsics.equals(this.f25020w, takeAwayCheckout.f25020w) && Intrinsics.equals(this.f25021x, takeAwayCheckout.f25021x) && Intrinsics.equals(this.f25022y, takeAwayCheckout.f25022y) && Intrinsics.equals(this.f25023z, takeAwayCheckout.f25023z) && this.f25012A == takeAwayCheckout.f25012A && Intrinsics.equals(this.f25013B, takeAwayCheckout.f25013B) && Intrinsics.equals(this.f25014C, takeAwayCheckout.f25014C) && Intrinsics.equals(this.f25015D, takeAwayCheckout.f25015D) && Intrinsics.equals(this.f25016E, takeAwayCheckout.f25016E) && Intrinsics.equals(this.f25017F, takeAwayCheckout.f25017F) && Intrinsics.equals(this.f25018G, takeAwayCheckout.f25018G) && this.f25019H == takeAwayCheckout.f25019H;
        }
        return false;
    }

    /* renamed from: f */
    public final String m10864f() {
        return this.f25015D;
    }

    /* renamed from: h */
    public final String m10863h() {
        return this.f25017F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((this.f25020w.hashCode() * 31) + this.f25021x.hashCode()) * 31) + this.f25022y.hashCode()) * 31) + this.f25023z.hashCode()) * 31) + Integer.hashCode(this.f25012A)) * 31) + this.f25013B.hashCode()) * 31) + this.f25014C.hashCode()) * 31) + this.f25015D.hashCode()) * 31) + this.f25016E.hashCode()) * 31) + this.f25017F.hashCode()) * 31) + this.f25018G.hashCode()) * 31;
        boolean z = this.f25019H;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public final String m10862i() {
        return this.f25016E;
    }

    /* renamed from: j */
    public final String m10861j() {
        return this.f25014C;
    }

    /* renamed from: k */
    public final String m10860k() {
        return this.f25013B;
    }

    /* renamed from: m */
    public final String m10859m() {
        return this.f25023z;
    }

    /* renamed from: n */
    public final String m10858n() {
        return this.f25022y;
    }

    /* renamed from: r */
    public final void m10857r(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f25014C = str;
    }

    /* renamed from: s */
    public final void m10856s(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f25013B = str;
    }

    /* renamed from: t */
    public final void m10855t(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f25023z = str;
    }

    public String toString() {
        String str = this.f25020w;
        String str2 = this.f25021x;
        String str3 = this.f25022y;
        String str4 = this.f25023z;
        int i = this.f25012A;
        String str5 = this.f25013B;
        String str6 = this.f25014C;
        String str7 = this.f25015D;
        String str8 = this.f25016E;
        String str9 = this.f25017F;
        String str10 = this.f25018G;
        boolean z = this.f25019H;
        return "TakeAwayCheckout(number=" + str + ", total=" + str2 + ", storeName=" + str3 + ", storeAddress=" + str4 + ", storeId=" + i + ", pickupDay=" + str5 + ", pickUpTime=" + str6 + ", owner=" + str7 + ", ownerPhone=" + str8 + ", ownerEmail=" + str9 + ", disclaimer=" + str10 + ", cancellable=" + z + ")";
    }

    /* renamed from: v */
    public final void m10854v(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f25022y = str;
    }

    /* renamed from: w */
    public final String m10853w() {
        return C5579c.m23715d(this.f25021x, null, 1, null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f25020w);
        parcel.writeString(this.f25021x);
        parcel.writeString(this.f25022y);
        parcel.writeString(this.f25023z);
        parcel.writeInt(this.f25012A);
        parcel.writeString(this.f25013B);
        parcel.writeString(this.f25014C);
        parcel.writeString(this.f25015D);
        parcel.writeString(this.f25016E);
        parcel.writeString(this.f25017F);
        parcel.writeString(this.f25018G);
        parcel.writeInt(this.f25019H ? 1 : 0);
    }

    public /* synthetic */ TakeAwayCheckout(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i2 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i2 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i2 & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? BuildConfig.VERSION_NAME : str5, (i2 & 64) != 0 ? BuildConfig.VERSION_NAME : str6, (i2 & 128) != 0 ? BuildConfig.VERSION_NAME : str7, (i2 & 256) != 0 ? BuildConfig.VERSION_NAME : str8, (i2 & 512) != 0 ? BuildConfig.VERSION_NAME : str9, (i2 & 1024) == 0 ? str10 : BuildConfig.VERSION_NAME, (i2 & 2048) != 0 ? true : z);
    }
}
