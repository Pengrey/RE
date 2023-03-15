package pt.pingodoce.app.data.local.models.shoppinglist;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: LiteralProduct.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class LiteralProduct extends ShoppingListProduct {
    public static final Parcelable.Creator CREATOR = new C8715a();
    @InterfaceC4469e(name = "id")

    /* renamed from: O */
    private final String f22681O;
    @InterfaceC4469e(name = "timeStamp")

    /* renamed from: P */
    private final long f22682P;
    @InterfaceC4469e(name = "category")

    /* renamed from: Q */
    private final ShoppingListCategory f22683Q;
    @InterfaceC4469e(name = "name")

    /* renamed from: R */
    private String f22684R;
    @InterfaceC4469e(name = "quantity")

    /* renamed from: S */
    private int f22685S;
    @InterfaceC4469e(name = "checked")

    /* renamed from: T */
    private boolean f22686T;
    @InterfaceC4469e(name = "dateUpdated")

    /* renamed from: U */
    private String f22687U;
    @InterfaceC4469e(name = "sortOrder")

    /* renamed from: V */
    private int f22688V;
    @InterfaceC4469e(name = "manualOrder")

    /* renamed from: W */
    private int f22689W;
    @InterfaceC4469e(name = "deleted")

    /* renamed from: X */
    private boolean f22690X;

    /* compiled from: LiteralProduct.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.shoppinglist.LiteralProduct$a */
    /* loaded from: classes2.dex */
    public static final class C8715a implements Parcelable.Creator {
        /* renamed from: a */
        public final LiteralProduct createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new LiteralProduct(parcel.readString(), parcel.readLong(), (ShoppingListCategory) ShoppingListCategory.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final LiteralProduct[] newArray(int i) {
            return new LiteralProduct[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ LiteralProduct(java.lang.String r16, long r17, pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListCategory r19, java.lang.String r20, int r21, boolean r22, java.lang.String r23, int r24, int r25, boolean r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 1
            if (r1 == 0) goto L15
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "randomUUID().toString()"
            p181jd.Intrinsics.checkIfNull(r1, r2)
            r4 = r1
            goto L17
        L15:
            r4 = r16
        L17:
            r1 = r0 & 2
            if (r1 == 0) goto L21
            long r1 = java.lang.System.currentTimeMillis()
            r5 = r1
            goto L23
        L21:
            r5 = r17
        L23:
            r1 = r0 & 8
            java.lang.String r2 = ""
            if (r1 == 0) goto L2b
            r8 = r2
            goto L2d
        L2b:
            r8 = r20
        L2d:
            r1 = r0 & 16
            if (r1 == 0) goto L34
            r1 = 1
            r9 = r1
            goto L36
        L34:
            r9 = r21
        L36:
            r1 = r0 & 32
            r3 = 0
            if (r1 == 0) goto L3d
            r10 = r3
            goto L3f
        L3d:
            r10 = r22
        L3f:
            r1 = r0 & 64
            if (r1 == 0) goto L45
            r11 = r2
            goto L47
        L45:
            r11 = r23
        L47:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L4e
            r1 = -1
            r12 = r1
            goto L50
        L4e:
            r12 = r24
        L50:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L56
            r13 = r3
            goto L58
        L56:
            r13 = r25
        L58:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L5e
            r14 = r3
            goto L60
        L5e:
            r14 = r26
        L60:
            r3 = r15
            r7 = r19
            r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.data.local.models.shoppinglist.LiteralProduct.<init>(java.lang.String, long, pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListCategory, java.lang.String, int, boolean, java.lang.String, int, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: G */
    public void m14382G(boolean z) {
        this.f22686T = z;
    }

    /* renamed from: H */
    public void m14381H(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f22687U = str;
    }

    /* renamed from: I */
    public void m14380I(boolean z) {
        this.f22690X = z;
    }

    /* renamed from: J */
    public void m14379J(int i) {
        this.f22689W = i;
    }

    /* renamed from: K */
    public void m14378K(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f22684R = str;
    }

    /* renamed from: M */
    public void m14377M(int i) {
        this.f22685S = i;
    }

    /* renamed from: N */
    public LiteralProduct m14375a() {
        return new LiteralProduct(m14370k(), m14365w(), m14374f(), m14368n(), m14367s(), m14373h(), m14372i(), m14366v(), m14369m(), m14371j());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LiteralProduct) && super.equals(obj)) {
            LiteralProduct literalProduct = (LiteralProduct) obj;
            return Intrinsics.equals(m14370k(), literalProduct.m14370k()) && m14365w() == literalProduct.m14365w() && Intrinsics.equals(m14374f(), literalProduct.m14374f()) && Intrinsics.equals(m14368n(), literalProduct.m14368n()) && m14367s() == literalProduct.m14367s() && m14373h() == literalProduct.m14373h() && Intrinsics.equals(m14372i(), literalProduct.m14372i()) && m14366v() == literalProduct.m14366v() && m14369m() == literalProduct.m14369m() && m14371j() == literalProduct.m14371j();
        }
        return false;
    }

    /* renamed from: f */
    public ShoppingListCategory m14374f() {
        return this.f22683Q;
    }

    /* renamed from: h */
    public boolean m14373h() {
        return this.f22686T;
    }

    public int hashCode() {
        return (((((((((((((((((((super.hashCode() * 31) + m14370k().hashCode()) * 31) + Long.hashCode(m14365w())) * 31) + m14374f().hashCode()) * 31) + m14368n().hashCode()) * 31) + m14367s()) * 31) + Boolean.hashCode(m14373h())) * 31) + m14372i().hashCode()) * 31) + m14366v()) * 31) + m14369m()) * 31) + Boolean.hashCode(m14371j());
    }

    /* renamed from: i */
    public String m14372i() {
        return this.f22687U;
    }

    /* renamed from: j */
    public boolean m14371j() {
        return this.f22690X;
    }

    /* renamed from: k */
    public String m14370k() {
        return this.f22681O;
    }

    /* renamed from: m */
    public int m14369m() {
        return this.f22689W;
    }

    /* renamed from: n */
    public String m14368n() {
        return this.f22684R;
    }

    /* renamed from: s */
    public int m14367s() {
        return this.f22685S;
    }

    /* renamed from: v */
    public int m14366v() {
        return this.f22688V;
    }

    /* renamed from: w */
    public long m14365w() {
        return this.f22682P;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22681O);
        parcel.writeLong(this.f22682P);
        this.f22683Q.writeToParcel(parcel, i);
        parcel.writeString(this.f22684R);
        parcel.writeInt(this.f22685S);
        parcel.writeInt(this.f22686T ? 1 : 0);
        parcel.writeString(this.f22687U);
        parcel.writeInt(this.f22688V);
        parcel.writeInt(this.f22689W);
        parcel.writeInt(this.f22690X ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiteralProduct(String str, long j, ShoppingListCategory shoppingListCategory, String str2, int i, boolean z, String str3, int i2, int i3, boolean z2) {
        super(str, j, shoppingListCategory, str2, i, z, null, null, null, null, false, null, null, null, str3, i2, i3, z2, 16320, null);
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(shoppingListCategory, "category");
        Intrinsics.isThisObjectNull(str2, "name");
        Intrinsics.isThisObjectNull(str3, "dateUpdated");
        this.f22681O = str;
        this.f22682P = j;
        this.f22683Q = shoppingListCategory;
        this.f22684R = str2;
        this.f22685S = i;
        this.f22686T = z;
        this.f22687U = str3;
        this.f22688V = i2;
        this.f22689W = i3;
        this.f22690X = z2;
    }
}
