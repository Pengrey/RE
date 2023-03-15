package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import be.UtilsExtensions;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p181jd.Intrinsics;
import sd.C10171u;

/* compiled from: Benefit.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class Benefit implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8768b();
    @InterfaceC4469e(name = "isNew")

    /* renamed from: A */
    private final boolean f23052A;
    @InterfaceC4469e(name = "isExpiring")

    /* renamed from: B */
    private final boolean f23053B;
    @InterfaceC4469e(name = "startDate")

    /* renamed from: C */
    private final String f23054C;
    @InterfaceC4469e(name = "endDate")

    /* renamed from: D */
    private final String f23055D;
    @InterfaceC4469e(name = "clubCode")

    /* renamed from: E */
    private final String f23056E;
    @InterfaceC4469e(name = "clubType")

    /* renamed from: F */
    private final String f23057F;
    @InterfaceC4469e(name = "ean")

    /* renamed from: G */
    private final String f23058G;
    @InterfaceC4469e(name = "moreInfo")

    /* renamed from: H */
    private final String f23059H;

    /* renamed from: I */
    private final DateTimeFormatter f23060I;
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final String f23061w;
    @InterfaceC4469e(name = "imageUrl")

    /* renamed from: x */
    private final String f23062x;
    @InterfaceC4469e(name = "title")

    /* renamed from: y */
    private final String f23063y;
    @InterfaceC4469e(name = "description")

    /* renamed from: z */
    private final String f23064z;

    /* compiled from: Benefit.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.Benefit$a */
    /* loaded from: classes2.dex */
    public enum EnumC8767a {
        BABY(70),
        WINE(71);
        
        private final int code;

        EnumC8767a(int i) {
            this.code = i;
        }

        public final int getCode() {
            return this.code;
        }
    }

    /* compiled from: Benefit.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.Benefit$b */
    /* loaded from: classes2.dex */
    public static final class C8768b implements Parcelable.Creator {
        /* renamed from: a */
        public final Benefit createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new Benefit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final Benefit[] newArray(int i) {
            return new Benefit[i];
        }
    }

    public Benefit() {
        this(null, null, null, null, false, false, null, null, null, null, null, null, 4095, null);
    }

    public Benefit(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(str2, "imageUrl");
        Intrinsics.isThisObjectNull(str3, "title");
        Intrinsics.isThisObjectNull(str4, "description");
        Intrinsics.isThisObjectNull(str5, "startDate");
        Intrinsics.isThisObjectNull(str6, "endDate");
        Intrinsics.isThisObjectNull(str7, "clubCode");
        Intrinsics.isThisObjectNull(str8, "clubType");
        Intrinsics.isThisObjectNull(str9, "ean");
        Intrinsics.isThisObjectNull(str10, "moreInfo");
        this.f23061w = str;
        this.f23062x = str2;
        this.f23063y = str3;
        this.f23064z = str4;
        this.f23052A = z;
        this.f23053B = z2;
        this.f23054C = str5;
        this.f23055D = str6;
        this.f23056E = str7;
        this.f23057F = str8;
        this.f23058G = str9;
        this.f23059H = str10;
        this.f23060I = DateTimeFormat.forPattern("dd/MMM").withLocale(new Locale("pt"));
    }

    /* renamed from: a */
    public final String m13939a() {
        return this.f23056E;
    }

    /* renamed from: b */
    public final String m13938b() {
        return this.f23057F;
    }

    /* renamed from: c */
    public final String m13937c() {
        try {
            DateTime parse = DateTime.parse(this.f23054C);
            DateTime parse2 = DateTime.parse(this.f23055D);
            String asString = parse.dayOfMonth().getAsString();
            String asText = parse.monthOfYear().getAsText();
            Intrinsics.checkIfNull(asText, "s.monthOfYear().asText");
            String m35170b = UtilsExtensions.m35170b(asText);
            String asString2 = parse2.dayOfMonth().getAsString();
            String asText2 = parse2.monthOfYear().getAsText();
            Intrinsics.checkIfNull(asText2, "e.monthOfYear().asText");
            String m35170b2 = UtilsExtensions.m35170b(asText2);
            return asString + " " + m35170b + " a " + asString2 + " " + m35170b2;
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    /* renamed from: d */
    public final String m13936d() {
        List m8883q0;
        String m8889k0;
        try {
            String print = this.f23060I.print(DateTime.parse(this.f23055D));
            Intrinsics.checkIfNull(print, "parsed");
            m8883q0 = C10171u.m8883q0(print, new String[]{"/"}, false, 0, 6, null);
            Object obj = m8883q0.get(0);
            m8889k0 = C10171u.m8889k0(UtilsExtensions.m35170b((String) m8883q0.get(1)), ".");
            return obj + "/" + m8889k0;
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m13935e() {
        return this.f23064z;
    }

    /* renamed from: f */
    public final String m13934f() {
        return this.f23058G;
    }

    /* renamed from: h */
    public final String m13933h() {
        return this.f23055D;
    }

    /* renamed from: i */
    public final String m13932i() {
        return this.f23061w;
    }

    /* renamed from: j */
    public final String m13931j() {
        return this.f23062x;
    }

    /* renamed from: k */
    public final String m13930k() {
        return this.f23059H;
    }

    /* renamed from: m */
    public final String m13929m() {
        return this.f23054C;
    }

    /* renamed from: n */
    public final String m13928n() {
        return this.f23063y;
    }

    /* renamed from: r */
    public final boolean m13927r() {
        String str = this.f23057F;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkIfNull(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String lowerCase2 = EnumC8767a.BABY.name().toLowerCase(locale);
        Intrinsics.checkIfNull(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return Intrinsics.equals(lowerCase, lowerCase2);
    }

    /* renamed from: s */
    public final boolean m13926s() {
        return this.f23053B;
    }

    /* renamed from: t */
    public final boolean m13925t() {
        return this.f23052A;
    }

    /* renamed from: v */
    public final boolean m13924v() {
        return (this.f23058G.length() > 0) && TextUtils.getTrimmedLength(this.f23058G) > 1;
    }

    /* renamed from: w */
    public final boolean m13923w() {
        String str = this.f23057F;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkIfNull(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String lowerCase2 = EnumC8767a.WINE.name().toLowerCase(locale);
        Intrinsics.checkIfNull(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return Intrinsics.equals(lowerCase, lowerCase2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23061w);
        parcel.writeString(this.f23062x);
        parcel.writeString(this.f23063y);
        parcel.writeString(this.f23064z);
        parcel.writeInt(this.f23052A ? 1 : 0);
        parcel.writeInt(this.f23053B ? 1 : 0);
        parcel.writeString(this.f23054C);
        parcel.writeString(this.f23055D);
        parcel.writeString(this.f23056E);
        parcel.writeString(this.f23057F);
        parcel.writeString(this.f23058G);
        parcel.writeString(this.f23059H);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ Benefit(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18, boolean r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            if (r1 == 0) goto L14
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "randomUUID().toString()"
            p181jd.Intrinsics.checkIfNull(r1, r2)
            goto L15
        L14:
            r1 = r14
        L15:
            r2 = r0 & 2
            java.lang.String r3 = ""
            if (r2 == 0) goto L1d
            r2 = r3
            goto L1e
        L1d:
            r2 = r15
        L1e:
            r4 = r0 & 4
            if (r4 == 0) goto L24
            r4 = r3
            goto L26
        L24:
            r4 = r16
        L26:
            r5 = r0 & 8
            if (r5 == 0) goto L2c
            r5 = r3
            goto L2e
        L2c:
            r5 = r17
        L2e:
            r6 = r0 & 16
            r7 = 0
            if (r6 == 0) goto L35
            r6 = r7
            goto L37
        L35:
            r6 = r18
        L37:
            r8 = r0 & 32
            if (r8 == 0) goto L3c
            goto L3e
        L3c:
            r7 = r19
        L3e:
            r8 = r0 & 64
            if (r8 == 0) goto L44
            r8 = r3
            goto L46
        L44:
            r8 = r20
        L46:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L4c
            r9 = r3
            goto L4e
        L4c:
            r9 = r21
        L4e:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L54
            r10 = r3
            goto L56
        L54:
            r10 = r22
        L56:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L5c
            r11 = r3
            goto L5e
        L5c:
            r11 = r23
        L5e:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L64
            r12 = r3
            goto L66
        L64:
            r12 = r24
        L66:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L6b
            goto L6d
        L6b:
            r3 = r25
        L6d:
            r14 = r13
            r15 = r1
            r16 = r2
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.data.remote.models.response.Benefit.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
