package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: AppNotifications.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class AppNotifications implements Parcelable {
    @InterfaceC4469e(name = "shoppingList")

    /* renamed from: A */
    private final boolean f22816A;
    @InterfaceC4469e(name = "takeaway")

    /* renamed from: B */
    private final boolean f22817B;
    @InterfaceC4469e(name = "sms")

    /* renamed from: C */
    private final boolean f22818C;
    @InterfaceC4469e(name = "email")

    /* renamed from: D */
    private final boolean f22819D;
    @InterfaceC4469e(name = "personalized")

    /* renamed from: w */
    private final boolean f22820w;
    @InterfaceC4469e(name = "pubOnline")

    /* renamed from: x */
    private final boolean f22821x;
    @InterfaceC4469e(name = "flyers")

    /* renamed from: y */
    private final boolean f22822y;
    @InterfaceC4469e(name = "clubs")

    /* renamed from: z */
    private final boolean f22823z;

    /* renamed from: E */
    public static final C8727a f22824E = new C8727a(null);
    public static final Parcelable.Creator CREATOR = new C8728b();

    /* compiled from: AppNotifications.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.AppNotifications$a */
    /* loaded from: classes2.dex */
    public static final class C8727a {
        private C8727a() {
        }

        public /* synthetic */ C8727a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AppNotifications m14212a(boolean z) {
            if (z) {
                return m14210c();
            }
            return m14211b();
        }

        /* renamed from: b */
        public final AppNotifications m14211b() {
            return new AppNotifications(false, false, false, false, false, false, false, false);
        }

        /* renamed from: c */
        public final AppNotifications m14210c() {
            return new AppNotifications(true, true, true, true, true, true, true, true);
        }
    }

    /* compiled from: AppNotifications.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.AppNotifications$b */
    /* loaded from: classes2.dex */
    public static final class C8728b implements Parcelable.Creator {
        /* renamed from: a */
        public final AppNotifications mo13742a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new AppNotifications(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final AppNotifications[] mo13741b(int i) {
            return new AppNotifications[i];
        }
    }

    public AppNotifications(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f22820w = z;
        this.f22821x = z2;
        this.f22822y = z3;
        this.f22823z = z4;
        this.f22816A = z5;
        this.f22817B = z6;
        this.f22818C = z7;
        this.f22819D = z8;
    }

    /* renamed from: a */
    public final boolean m14220a() {
        return this.f22823z;
    }

    /* renamed from: b */
    public final boolean m14219b() {
        return this.f22819D;
    }

    /* renamed from: c */
    public final boolean m14218c() {
        return this.f22822y;
    }

    /* renamed from: d */
    public final boolean m14217d() {
        return this.f22821x;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean m14216e() {
        return this.f22817B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppNotifications) {
            AppNotifications appNotifications = (AppNotifications) obj;
            return this.f22820w == appNotifications.f22820w && this.f22821x == appNotifications.f22821x && this.f22822y == appNotifications.f22822y && this.f22823z == appNotifications.f22823z && this.f22816A == appNotifications.f22816A && this.f22817B == appNotifications.f22817B && this.f22818C == appNotifications.f22818C && this.f22819D == appNotifications.f22819D;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m14215f() {
        return this.f22820w;
    }

    /* renamed from: h */
    public final boolean m14214h() {
        return this.f22816A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.f22820w;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f22821x;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.f22822y;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.f22823z;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r24 = this.f22816A;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        ?? r25 = this.f22817B;
        int i10 = r25;
        if (r25 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r26 = this.f22818C;
        int i12 = r26;
        if (r26 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z2 = this.f22819D;
        return i13 + (z2 ? 1 : z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean m14213i() {
        return this.f22818C;
    }

    public String toString() {
        boolean z = this.f22820w;
        boolean z2 = this.f22821x;
        boolean z3 = this.f22822y;
        boolean z4 = this.f22823z;
        boolean z5 = this.f22816A;
        boolean z6 = this.f22817B;
        boolean z7 = this.f22818C;
        boolean z8 = this.f22819D;
        return "AppNotifications(personalized=" + z + ", onlinePublicity=" + z2 + ", flyers=" + z3 + ", clubs=" + z4 + ", shoppingList=" + z5 + ", orders=" + z6 + ", sms=" + z7 + ", email=" + z8 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f22820w ? 1 : 0);
        parcel.writeInt(this.f22821x ? 1 : 0);
        parcel.writeInt(this.f22822y ? 1 : 0);
        parcel.writeInt(this.f22823z ? 1 : 0);
        parcel.writeInt(this.f22816A ? 1 : 0);
        parcel.writeInt(this.f22817B ? 1 : 0);
        parcel.writeInt(this.f22818C ? 1 : 0);
        parcel.writeInt(this.f22819D ? 1 : 0);
    }
}
