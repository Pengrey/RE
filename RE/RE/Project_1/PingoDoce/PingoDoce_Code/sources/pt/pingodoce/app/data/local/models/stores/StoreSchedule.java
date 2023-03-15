package pt.pingodoce.app.data.local.models.stores;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import id.InterfaceC6097a;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import sd.CharJVM;

/* compiled from: StoreSchedule.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class StoreSchedule implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8719a();

    /* renamed from: A */
    private final InterfaceC13178g f22735A;
    @InterfaceC4469e(name = "dayOfWeek")

    /* renamed from: w */
    private final int f22736w;
    @InterfaceC4469e(name = "openingTime")

    /* renamed from: x */
    private final String f22737x;
    @InterfaceC4469e(name = "closingTime")

    /* renamed from: y */
    private final String f22738y;
    @InterfaceC4469e(name = "isOnMaintenance")

    /* renamed from: z */
    private boolean f22739z;

    /* compiled from: StoreSchedule.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.stores.StoreSchedule$a */
    /* loaded from: classes2.dex */
    public static final class C8719a implements Parcelable.Creator {
        /* renamed from: a */
        public final StoreSchedule createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new StoreSchedule(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final StoreSchedule[] newArray(int i) {
            return new StoreSchedule[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreSchedule.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.stores.StoreSchedule$b */
    /* loaded from: classes2.dex */
    public static final class C8720b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C8720b f22740w = new C8720b();

        C8720b() {
            super(0);
        }

        /* renamed from: a */
        public final Locale mo42214q() {
            return Locale.getDefault();
        }
    }

    public StoreSchedule() {
        this(0, null, null, false, 15, null);
    }

    public StoreSchedule(int i, String str, String str2, boolean z) {
        InterfaceC13178g m1464a;
        Intrinsics.isThisObjectNull(str, "openingTime");
        Intrinsics.isThisObjectNull(str2, "closingTime");
        this.f22736w = i;
        this.f22737x = str;
        this.f22738y = str2;
        this.f22739z = z;
        m1464a = LazyJVM.m1464a(C8720b.f22740w);
        this.f22735A = m1464a;
    }

    /* renamed from: a */
    public final String m14311a() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(7, this.f22736w + 1);
        String displayName = calendar.getDisplayName(7, 2, m14308d());
        if (displayName == null) {
            displayName = BuildConfig.VERSION_NAME;
        }
        if (displayName.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = displayName.charAt(0);
            sb2.append((Object) (Character.isLowerCase(charAt) ? CharJVM.m9041d(charAt, m14308d()) : String.valueOf(charAt)));
            String substring = displayName.substring(1);
            Intrinsics.checkIfNull(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            return sb2.toString();
        }
        return displayName;
    }

    /* renamed from: b */
    public final String m14310b() {
        return this.f22738y;
    }

    /* renamed from: c */
    public final int m14309c() {
        return this.f22736w;
    }

    /* renamed from: d */
    public final Locale m14308d() {
        Object value = this.f22735A.getValue();
        Intrinsics.checkIfNull(value, "<get-locale>(...)");
        return (Locale) value;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m14307e() {
        return this.f22737x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StoreSchedule) {
            StoreSchedule storeSchedule = (StoreSchedule) obj;
            return this.f22736w == storeSchedule.f22736w && Intrinsics.equals(this.f22737x, storeSchedule.f22737x) && Intrinsics.equals(this.f22738y, storeSchedule.f22738y) && this.f22739z == storeSchedule.f22739z;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m14306f() {
        return this.f22739z;
    }

    /* renamed from: h */
    public final String m14305h() {
        DateTime parse = DateTime.parse(this.f22737x);
        DateTime parse2 = DateTime.parse(this.f22738y);
        DateTimeFormatter forPattern = DateTimeFormat.forPattern("HH:mm");
        String print = forPattern.print(parse);
        String print2 = forPattern.print(parse2);
        return print + " - " + print2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f22736w) * 31) + this.f22737x.hashCode()) * 31) + this.f22738y.hashCode()) * 31;
        boolean z = this.f22739z;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        int i = this.f22736w;
        String str = this.f22737x;
        String str2 = this.f22738y;
        boolean z = this.f22739z;
        return "StoreSchedule(dayOfWeek=" + i + ", openingTime=" + str + ", closingTime=" + str2 + ", isOnMaintenance=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f22736w);
        parcel.writeString(this.f22737x);
        parcel.writeString(this.f22738y);
        parcel.writeInt(this.f22739z ? 1 : 0);
    }

    public /* synthetic */ StoreSchedule(int i, String str, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i2 & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i2 & 8) != 0 ? false : z);
    }
}
