package pt.pingodoce.app.data.remote.models.response;

import ad.C0127b;
import android.os.Parcel;
import android.os.Parcelable;
import be.UtilsExtensions;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.maps.model.LatLng;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import id.InterfaceC6097a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p466ya.InterfaceC13143b;
import p468yc.C13191r;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p489zc.C13769l0;
import p489zc.C13780s;
import p489zc._Collections;
import pt.pingodoce.app.data.local.models.stores.Coordinates;
import pt.pingodoce.app.data.local.models.stores.StoreSchedule;
import pt.pingodoce.app.data.local.models.stores.TakeAwaySchedule;

/* compiled from: Store.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class Store implements Parcelable, InterfaceC13143b {
    public static final Parcelable.Creator CREATOR = new C8791a();
    @InterfaceC4469e(name = "address")

    /* renamed from: A */
    private final String f23247A;
    @InterfaceC4469e(name = "phone")

    /* renamed from: B */
    private final String f23248B;
    @InterfaceC4469e(name = "coordinates")

    /* renamed from: C */
    private final Coordinates f23249C;
    @InterfaceC4469e(name = "schedules")

    /* renamed from: D */
    private final List f23250D;
    @InterfaceC4469e(name = "takeAwaySchedules")

    /* renamed from: E */
    private final List f23251E;

    /* renamed from: F */
    private final InterfaceC13178g f23252F;

    /* renamed from: G */
    private final DateTimeFormatter f23253G;

    /* renamed from: H */
    private final DateTimeFormatter f23254H;
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final int f23255w;
    @InterfaceC4469e(name = "isDefault")

    /* renamed from: x */
    private boolean f23256x;
    @InterfaceC4469e(name = "searchEnabled")

    /* renamed from: y */
    private final boolean f23257y;
    @InterfaceC4469e(name = "name")

    /* renamed from: z */
    private final String f23258z;

    /* compiled from: Store.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.Store$a */
    /* loaded from: classes2.dex */
    public static final class C8791a implements Parcelable.Creator {
        /* renamed from: a */
        public final Store createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            int readInt = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Coordinates coordinates = (Coordinates) Coordinates.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(StoreSchedule.CREATOR.createFromParcel(parcel));
            }
            return new Store(readInt, z, z2, readString, readString2, readString3, coordinates, arrayList, parcel.createStringArrayList());
        }

        /* renamed from: b */
        public final Store[] newArray(int i) {
            return new Store[i];
        }
    }

    /* compiled from: Comparisons.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.Store$b */
    /* loaded from: classes2.dex */
    public static final class C8792b<T> implements Comparator {
        public final int compare(Object obj, Object obj2) {
            int m41795a;
            m41795a = C0127b.m41795a(Integer.valueOf(((StoreSchedule) obj).m14309c()), Integer.valueOf(((StoreSchedule) obj2).m14309c()));
            return m41795a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Store.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.Store$c */
    /* loaded from: classes2.dex */
    public static final class C8793c extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C8793c f23259w = new C8793c();

        C8793c() {
            super(0);
        }

        /* renamed from: a */
        public final Map mo42214q() {
            return new LinkedHashMap();
        }
    }

    public Store() {
        this(0, false, false, null, null, null, null, null, null, 511, null);
    }

    public Store(int i, boolean z, boolean z2, String str, String str2, String str3, Coordinates coordinates, List list, List list2) {
        InterfaceC13178g m1464a;
        Intrinsics.isThisObjectNull(str, "name");
        Intrinsics.isThisObjectNull(str2, "address");
        Intrinsics.isThisObjectNull(str3, "phone");
        Intrinsics.isThisObjectNull(coordinates, "coordinates");
        Intrinsics.isThisObjectNull(list, "schedules");
        Intrinsics.isThisObjectNull(list2, "takeAwaySchedules");
        this.f23255w = i;
        this.f23256x = z;
        this.f23257y = z2;
        this.f23258z = str;
        this.f23247A = str2;
        this.f23248B = str3;
        this.f23249C = coordinates;
        this.f23250D = list;
        this.f23251E = list2;
        m1464a = LazyJVM.m1464a(C8793c.f23259w);
        this.f23252F = m1464a;
        this.f23253G = DateTimeFormat.forPattern("EEE dd MMMM").withLocale(new Locale("pt"));
        this.f23254H = DateTimeFormat.forPattern("HH:mm");
    }

    /* renamed from: A */
    public final void m13716A(boolean z) {
        this.f23256x = z;
    }

    /* renamed from: D */
    public final List m13715D() {
        List m455n0;
        Map m330i;
        if (m13704r().isEmpty()) {
            for (String str : this.f23251E) {
                String print = this.f23253G.print(DateTime.parse(str));
                Intrinsics.checkIfNull(print, "dayFormat.print(DateTime.parse(it))");
                String m35170b = UtilsExtensions.m35170b(print);
                String print2 = this.f23254H.print(DateTime.parse(str));
                if (m13704r().containsKey(m35170b)) {
                    Object obj = m13704r().get(m35170b);
                    Intrinsics.ifNullDoSomething(obj);
                    Map m14298b = ((TakeAwaySchedule) obj).m14298b();
                    Intrinsics.checkIfNull(print2, "hour");
                    m14298b.put(print2, str);
                } else {
                    Map m13704r = m13704r();
                    m330i = C13769l0.m330i(C13191r.m1447a(print2, str));
                    m13704r.put(m35170b, new TakeAwaySchedule(m35170b, m330i));
                }
            }
        }
        m455n0 = _Collections.m455n0(m13704r().keySet());
        return m455n0;
    }

    /* renamed from: a */
    public String mo1545a() {
        return this.f23247A;
    }

    /* renamed from: b */
    public LatLng mo1544b() {
        return new LatLng(this.f23249C.m14317a(), this.f23249C.m14316b());
    }

    /* renamed from: c */
    public final Store m13714c() {
        return new Store(this.f23255w, this.f23256x, this.f23257y, this.f23258z, this.f23247A, this.f23248B, this.f23249C, this.f23250D, this.f23251E);
    }

    /* renamed from: d */
    public final String m13713d() {
        return this.f23247A;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Coordinates m13712e() {
        return this.f23249C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Store) {
            Store store = (Store) obj;
            return this.f23255w == store.f23255w && this.f23256x == store.f23256x && this.f23257y == store.f23257y && Intrinsics.equals(this.f23258z, store.f23258z) && Intrinsics.equals(this.f23247A, store.f23247A) && Intrinsics.equals(this.f23248B, store.f23248B) && Intrinsics.equals(this.f23249C, store.f23249C) && Intrinsics.equals(this.f23250D, store.f23250D) && Intrinsics.equals(this.f23251E, store.f23251E);
        }
        return false;
    }

    /* renamed from: f */
    public final int m13711f() {
        return this.f23255w;
    }

    public String getTitle() {
        return this.f23258z;
    }

    /* renamed from: h */
    public final String m13710h() {
        return this.f23258z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f23255w) * 31;
        boolean z = this.f23256x;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f23257y;
        return ((((((((((((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.f23258z.hashCode()) * 31) + this.f23247A.hashCode()) * 31) + this.f23248B.hashCode()) * 31) + this.f23249C.hashCode()) * 31) + this.f23250D.hashCode()) * 31) + this.f23251E.hashCode();
    }

    /* renamed from: i */
    public final String m13709i() {
        return this.f23248B;
    }

    /* renamed from: j */
    public final List m13708j() {
        return this.f23250D;
    }

    /* renamed from: k */
    public final boolean m13707k() {
        return this.f23257y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        r2 = p489zc.C14724a0.m455n0(r2);
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m13706m(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "day"
            p181jd.Intrinsics.isThisObjectNull(r2, r0)
            java.util.Map r0 = r1.m13704r()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            r1.m13715D()
        L12:
            java.util.Map r0 = r1.m13704r()
            java.lang.Object r2 = r0.get(r2)
            pt.pingodoce.app.data.local.models.stores.TakeAwaySchedule r2 = (pt.pingodoce.app.data.local.models.stores.TakeAwaySchedule) r2
            if (r2 == 0) goto L30
            java.util.Map r2 = r2.m14298b()
            if (r2 == 0) goto L30
            java.util.Set r2 = r2.keySet()
            if (r2 == 0) goto L30
            java.util.List r2 = p489zc.C13777q.m223n0(r2)
            if (r2 != 0) goto L34
        L30:
            java.util.List r2 = p489zc.C13777q.m237g()
        L34:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.data.remote.models.response.Store.m13706m(java.lang.String):java.util.List");
    }

    /* renamed from: n */
    public final List m13705n() {
        return this.f23251E;
    }

    /* renamed from: r */
    public final Map m13704r() {
        return (Map) this.f23252F.getValue();
    }

    /* renamed from: s */
    public final boolean m13703s() {
        int i;
        return !m13701v() && (i = Calendar.getInstance().get(7) - 1) < this.f23250D.size() && ((StoreSchedule) this.f23250D.get(i)).m14306f();
    }

    /* renamed from: t */
    public final boolean m13702t() {
        return this.f23256x;
    }

    public String toString() {
        int i = this.f23255w;
        boolean z = this.f23256x;
        boolean z2 = this.f23257y;
        String str = this.f23258z;
        String str2 = this.f23247A;
        String str3 = this.f23248B;
        Coordinates coordinates = this.f23249C;
        List list = this.f23250D;
        List list2 = this.f23251E;
        return "Store(id=" + i + ", isDefault=" + z + ", searchEnabled=" + z2 + ", name=" + str + ", address=" + str2 + ", phone=" + str3 + ", coordinates=" + coordinates + ", schedules=" + list + ", takeAwaySchedules=" + list2 + ")";
    }

    /* renamed from: v */
    public final boolean m13701v() {
        int i = Calendar.getInstance().get(7) - 1;
        if (i >= this.f23250D.size()) {
            return false;
        }
        if (!((StoreSchedule) this.f23250D.get(i)).m14306f()) {
            DateTime parse = DateTime.parse(((StoreSchedule) this.f23250D.get(i)).m14307e());
            DateTime parse2 = DateTime.parse(((StoreSchedule) this.f23250D.get(i)).m14310b());
            int i2 = new DateTime().hourOfDay().get();
            if (i2 >= parse.hourOfDay().get() && i2 <= parse2.hourOfDay().get()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    public final boolean m13700w() {
        return !this.f23251E.isEmpty();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f23255w);
        parcel.writeInt(this.f23256x ? 1 : 0);
        parcel.writeInt(this.f23257y ? 1 : 0);
        parcel.writeString(this.f23258z);
        parcel.writeString(this.f23247A);
        parcel.writeString(this.f23248B);
        this.f23249C.writeToParcel(parcel, i);
        List<StoreSchedule> list = this.f23250D;
        parcel.writeInt(list.size());
        for (StoreSchedule storeSchedule : list) {
            storeSchedule.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.f23251E);
    }

    /* renamed from: y */
    public final String m13699y() {
        int i = Calendar.getInstance().get(7) - 1;
        return i >= this.f23250D.size() ? BuildConfig.VERSION_NAME : ((StoreSchedule) this.f23250D.get(i)).m14305h();
    }

    /* renamed from: z */
    public final List m13698z() {
        List m461h0;
        List m453p0;
        List m197g;
        int i = Calendar.getInstance().get(7) - 1;
        if (i + 1 >= this.f23250D.size()) {
            m197g = C13780s.m197g();
            return m197g;
        }
        m461h0 = _Collections.m461h0(this.f23250D, new C8792b());
        List subList = m461h0.subList(0, i);
        m453p0 = _Collections.m453p0(m461h0.subList(i, m461h0.size()));
        m453p0.addAll(subList);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m453p0) {
            if (!((StoreSchedule) obj).m14306f()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public /* synthetic */ Store(int i, boolean z, boolean z2, String str, String str2, String str3, Coordinates coordinates, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? BuildConfig.VERSION_NAME : str, (i2 & 16) != 0 ? BuildConfig.VERSION_NAME : str2, (i2 & 32) == 0 ? str3 : BuildConfig.VERSION_NAME, (i2 & 64) != 0 ? new Coordinates(0.0d, 0.0d, 3, null) : coordinates, (i2 & 128) != 0 ? C13780s.m197g() : list, (i2 & 256) != 0 ? C13780s.m197g() : list2);
    }
}
