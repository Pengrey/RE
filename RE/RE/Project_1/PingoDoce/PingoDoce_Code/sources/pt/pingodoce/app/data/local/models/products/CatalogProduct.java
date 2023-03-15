package pt.pingodoce.app.data.local.models.products;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import androidx.core.text.C1050b;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import fm.C5579c;
import id.InterfaceC6097a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p489zc.C13780s;
import pt.pingodoce.app.data.remote.models.response.BrandResponse;

/* compiled from: CatalogProduct.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public class CatalogProduct implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8703a();
    @InterfaceC4469e(name = "description")

    /* renamed from: A */
    private final String f22555A;
    @InterfaceC4469e(name = "thumb")

    /* renamed from: B */
    private final String f22556B;
    @InterfaceC4469e(name = "brand")

    /* renamed from: C */
    private final BrandResponse f22557C;
    @InterfaceC4469e(name = "storePrice")

    /* renamed from: D */
    private final String f22558D;
    @InterfaceC4469e(name = "measureUnitCode")

    /* renamed from: E */
    private final String f22559E;
    @InterfaceC4469e(name = "hasLowerPrice")

    /* renamed from: F */
    private final boolean f22560F;
    @InterfaceC4469e(name = "bestPromotion")

    /* renamed from: G */
    private final Promotion f22561G;
    @InterfaceC4469e(name = "tags")

    /* renamed from: H */
    private final List f22562H;
    @InterfaceC4469e(name = "discountSortOrder")

    /* renamed from: I */
    private final int f22563I;
    @InterfaceC4469e(name = "quantity")

    /* renamed from: J */
    private int f22564J;
    @InterfaceC4469e(name = "overrideWithDiscountPrice")

    /* renamed from: K */
    private boolean f22565K;
    @InterfaceC4469e(name = "betterPriceAvailableMessage")

    /* renamed from: L */
    private final String f22566L;

    /* renamed from: M */
    private final InterfaceC13178g f22567M;
    @InterfaceC4469e(name = "productInternalCode")

    /* renamed from: w */
    private final String f22568w;
    @InterfaceC4469e(name = "categoryId")

    /* renamed from: x */
    private final int f22569x;
    @InterfaceC4469e(name = "name")

    /* renamed from: y */
    private final String f22570y;
    @InterfaceC4469e(name = "image")

    /* renamed from: z */
    private final String f22571z;

    /* compiled from: CatalogProduct.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.products.CatalogProduct$a */
    /* loaded from: classes2.dex */
    public static final class C8703a implements Parcelable.Creator {
        /* renamed from: a */
        public final CatalogProduct createFromParcel(Parcel parcel) {
            int readInt;
            Intrinsics.isThisObjectNull(parcel, "parcel");
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            BrandResponse brandResponse = (BrandResponse) BrandResponse.CREATOR.createFromParcel(parcel);
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            Promotion promotion = (Promotion) (parcel.readInt() == 0 ? null : Promotion.CREATOR.createFromParcel(parcel));
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (true) {
                readInt = parcel.readInt();
                if (i == readInt3) {
                    break;
                }
                arrayList.add(Integer.valueOf(readInt));
                i++;
            }
            return new CatalogProduct(readString, readInt2, readString2, readString3, readString4, readString5, brandResponse, readString6, readString7, z, promotion, arrayList, readInt, parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        }

        /* renamed from: b */
        public final CatalogProduct[] newArray(int i) {
            return new CatalogProduct[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatalogProduct.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.products.CatalogProduct$b */
    /* loaded from: classes2.dex */
    public static final class C8704b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C8704b f22572w = new C8704b();

        C8704b() {
            super(0);
        }

        /* renamed from: a */
        public final Locale mo42214q() {
            return Locale.getDefault();
        }
    }

    public CatalogProduct() {
        this(null, 0, null, null, null, null, null, null, null, false, null, null, 0, 0, false, null, 65535, null);
    }

    public CatalogProduct(String str, int i, String str2, String str3, String str4, String str5, BrandResponse brandResponse, String str6, String str7, boolean z, Promotion promotion, List list, int i2, int i3, boolean z2, String str8) {
        InterfaceC13178g m1464a;
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(str2, "name");
        Intrinsics.isThisObjectNull(str3, "image");
        Intrinsics.isThisObjectNull(str4, "description");
        Intrinsics.isThisObjectNull(str5, "thumb");
        Intrinsics.isThisObjectNull(brandResponse, "brand");
        Intrinsics.isThisObjectNull(str6, "storePrice");
        Intrinsics.isThisObjectNull(str7, "measureUnitCode");
        Intrinsics.isThisObjectNull(list, "tags");
        this.f22568w = str;
        this.f22569x = i;
        this.f22570y = str2;
        this.f22571z = str3;
        this.f22555A = str4;
        this.f22556B = str5;
        this.f22557C = brandResponse;
        this.f22558D = str6;
        this.f22559E = str7;
        this.f22560F = z;
        this.f22561G = promotion;
        this.f22562H = list;
        this.f22563I = i2;
        this.f22564J = i3;
        this.f22565K = z2;
        this.f22566L = str8;
        m1464a = LazyJVM.m1464a(C8704b.f22572w);
        this.f22567M = m1464a;
    }

    /* renamed from: L */
    private final String m14533L() {
        String m14460h;
        Promotion m14512e = m14512e();
        return (m14512e == null || (m14460h = m14512e.m14460h()) == null) ? BuildConfig.VERSION_NAME : m14460h;
    }

    /* renamed from: m */
    private final String m14506m() {
        String m14461f;
        Promotion m14512e = m14512e();
        return (m14512e == null || (m14461f = m14512e.m14461f()) == null) ? BuildConfig.VERSION_NAME : m14461f;
    }

    /* renamed from: A */
    public final Locale m14542A() {
        Object value = this.f22567M.getValue();
        Intrinsics.checkIfNull(value, "<get-locale>(...)");
        return (Locale) value;
    }

    /* renamed from: D */
    public String m14541D() {
        return this.f22559E;
    }

    /* renamed from: E */
    public String m14540E() {
        return this.f22570y;
    }

    /* renamed from: F */
    public final boolean m14539F() {
        return this.f22565K;
    }

    /* renamed from: G */
    public final int m14538G() {
        return this.f22564J;
    }

    /* renamed from: H */
    public final int m14537H() {
        return this.f22563I;
    }

    /* renamed from: I */
    public String m14536I() {
        return this.f22558D;
    }

    /* renamed from: J */
    public final List m14535J() {
        return this.f22562H;
    }

    /* renamed from: K */
    public final String m14534K() {
        return this.f22556B;
    }

    /* renamed from: M */
    public final boolean m14532M() {
        return this.f22561G != null;
    }

    /* renamed from: N */
    public final boolean m14531N() {
        if (m14532M()) {
            if (m14533L().length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O */
    public final boolean m14530O() {
        String m14459i;
        if (m14532M()) {
            Promotion m14512e = m14512e();
            if ((m14512e == null || (m14459i = m14512e.m14459i()) == null || m14459i.length() <= 0) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public final boolean m14529P() {
        if (m14532M()) {
            return false;
        }
        Promotion m14512e = m14512e();
        return m14512e != null ? m14512e.m14458j() : false;
    }

    /* renamed from: Q */
    public final boolean m14528Q() {
        return (m14530O() || m14531N() || this.f22560F) ? false : true;
    }

    /* renamed from: R */
    public final String m14527R() {
        return m14526S(true);
    }

    /* renamed from: S */
    public final String m14526S(boolean z) {
        if (m14532M()) {
            return m14508j(z);
        }
        return z ? C5579c.m23716c(m14536I(), m14541D()) : m14536I();
    }

    /* renamed from: T */
    public final String m14525T() {
        return m14524U(true);
    }

    /* renamed from: U */
    public final String m14524U(boolean z) {
        return !m14532M() ? BuildConfig.VERSION_NAME : z ? C5579c.m23716c(m14536I(), m14541D()) : m14536I();
    }

    /* renamed from: V */
    public final String m14523V() {
        return m14519Z(true);
    }

    /* renamed from: W */
    public final void m14522W(boolean z) {
        this.f22565K = z;
    }

    /* renamed from: X */
    public final void m14521X(int i) {
        this.f22564J = i;
    }

    /* renamed from: Y */
    public final String m14520Y() {
        return m14519Z(false);
    }

    /* renamed from: Z */
    public final String m14519Z(boolean z) {
        if (this.f22565K) {
            return m14508j(z);
        }
        return !m14529P() ? m14526S(z) : m14524U(z);
    }

    /* renamed from: a */
    public final String m14518a() {
        String m14464c;
        Promotion promotion = this.f22561G;
        return (promotion == null || (m14464c = promotion.m14464c()) == null) ? BuildConfig.VERSION_NAME : m14464c;
    }

    /* renamed from: a0 */
    public final boolean m14517a0() {
        return !this.f22560F && m14529P();
    }

    /* renamed from: b */
    public final String m14516b() {
        String m14454r;
        Promotion promotion = this.f22561G;
        return (promotion == null || (m14454r = promotion.m14454r()) == null) ? BuildConfig.VERSION_NAME : m14454r;
    }

    /* renamed from: b0 */
    public final boolean m14515b0() {
        return (m14529P() || !Intrinsics.equals(m14536I(), m14508j(false))) && !m14529P();
    }

    /* renamed from: c */
    public final String m14514c() {
        String m14466a;
        Promotion promotion = this.f22561G;
        return (promotion == null || (m14466a = promotion.m14466a()) == null) ? BuildConfig.VERSION_NAME : m14466a;
    }

    /* renamed from: d */
    public CatalogProduct m14513d() {
        return new CatalogProduct(m14499y(), this.f22569x, m14540E(), this.f22571z, this.f22555A, this.f22556B, this.f22557C, m14536I(), m14541D(), this.f22560F, this.f22561G, this.f22562H, this.f22563I, this.f22564J, this.f22565K, this.f22566L);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Promotion m14512e() {
        return this.f22561G;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatalogProduct) {
            CatalogProduct catalogProduct = (CatalogProduct) obj;
            return Intrinsics.equals(m14499y(), catalogProduct.m14499y()) && this.f22569x == catalogProduct.f22569x && Intrinsics.equals(m14540E(), catalogProduct.m14540E()) && Intrinsics.equals(this.f22571z, catalogProduct.f22571z) && Intrinsics.equals(this.f22555A, catalogProduct.f22555A) && Intrinsics.equals(this.f22556B, catalogProduct.f22556B) && Intrinsics.equals(this.f22557C, catalogProduct.f22557C) && Intrinsics.equals(m14536I(), catalogProduct.m14536I()) && Intrinsics.equals(m14541D(), catalogProduct.m14541D()) && this.f22560F == catalogProduct.f22560F && Intrinsics.equals(this.f22561G, catalogProduct.f22561G) && Intrinsics.equals(this.f22562H, catalogProduct.f22562H) && this.f22563I == catalogProduct.f22563I && this.f22564J == catalogProduct.f22564J && this.f22565K == catalogProduct.f22565K && Intrinsics.equals(this.f22566L, catalogProduct.f22566L);
        }
        return false;
    }

    /* renamed from: f */
    public final String m14511f() {
        Promotion m14512e;
        String m14466a;
        return (!m14532M() || (m14512e = m14512e()) == null || (m14466a = m14512e.m14466a()) == null) ? BuildConfig.VERSION_NAME : m14466a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        if ((m14506m().length() == 0) != false) goto L36;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m14510h() {
        /*
            r15 = this;
            boolean r0 = r15.m14532M()
            if (r0 == 0) goto Lc1
            boolean r0 = r15.m14532M()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1f
            java.lang.String r0 = r15.m14506m()
            int r0 = r0.length()
            if (r0 != 0) goto L1a
            r0 = r1
            goto L1b
        L1a:
            r0 = r2
        L1b:
            if (r0 == 0) goto L1f
            goto Lc1
        L1f:
            r0 = 3
            fe.a r3 = p106fe.CommonUtils.f15361a
            java.lang.String r4 = r15.m14506m()
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.util.Locale r6 = r15.m14542A()
            java.lang.String r7 = "yyyy-MM-dd'T'HH:mm:ss"
            r5.<init>(r7, r6)
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            java.util.Locale r7 = r15.m14542A()
            java.lang.String r8 = "'Até 'dd' de 'MMMM"
            r6.<init>(r8, r7)
            java.lang.String r9 = r3.m24295g(r4, r5, r6)
            java.lang.String r3 = " "
            java.lang.String[] r10 = new java.lang.String[]{r3}
            r11 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            java.util.List r3 = sd.C10163k.m8972q0(r9, r10, r11, r12, r13, r14)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = p489zc.C13777q.m218r(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
            r5 = r2
        L5e:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto Lb2
            java.lang.Object r6 = r3.next()
            int r7 = r5 + 1
            if (r5 >= 0) goto L6f
            p489zc.C13777q.m220q()
        L6f:
            java.lang.String r6 = (java.lang.String) r6
            if (r5 != r0) goto Lad
            int r5 = r6.length()
            if (r5 <= 0) goto L7b
            r5 = r1
            goto L7c
        L7b:
            r5 = r2
        L7c:
            if (r5 == 0) goto Lad
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            char r8 = r6.charAt(r2)
            boolean r9 = java.lang.Character.isLowerCase(r8)
            if (r9 == 0) goto L96
            java.util.Locale r9 = r15.m14542A()
            java.lang.String r8 = sd.C10148a.m9045d(r8, r9)
            goto L9a
        L96:
            java.lang.String r8 = java.lang.String.valueOf(r8)
        L9a:
            r5.append(r8)
            java.lang.String r6 = r6.substring(r1)
            java.lang.String r8 = "this as java.lang.String).substring(startIndex)"
            p181jd.Intrinsics.checkIfNull(r6, r8)
            r5.append(r6)
            java.lang.String r6 = r5.toString()
        Lad:
            r4.add(r6)
            r5 = r7
            goto L5e
        Lb2:
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 62
            r12 = 0
            java.lang.String r5 = " "
            java.lang.String r0 = p489zc.C13777q.m250U(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto Lc3
        Lc1:
            java.lang.String r0 = ""
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.data.local.models.products.CatalogProduct.m14510h():java.lang.String");
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((m14499y().hashCode() * 31) + this.f22569x) * 31) + m14540E().hashCode()) * 31) + this.f22571z.hashCode()) * 31) + this.f22555A.hashCode()) * 31) + this.f22556B.hashCode()) * 31) + this.f22557C.hashCode()) * 31) + m14536I().hashCode()) * 31) + m14541D().hashCode()) * 31) + Boolean.hashCode(this.f22560F)) * 31;
        Promotion promotion = this.f22561G;
        int hashCode2 = (((((((((hashCode + (promotion != null ? promotion.hashCode() : 0)) * 31) + this.f22562H.hashCode()) * 31) + this.f22563I) * 31) + this.f22564J) * 31) + Boolean.hashCode(this.f22565K)) * 31;
        String str = this.f22566L;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: i */
    public final String m14509i() {
        return m14508j(true);
    }

    /* renamed from: j */
    public final String m14508j(boolean z) {
        Promotion m14512e = m14512e();
        if (m14512e != null) {
            String m23716c = z ? C5579c.m23716c(m14512e.m14457k(), m14541D()) : m14512e.m14457k();
            if (m23716c != null) {
                return m23716c;
            }
        }
        return BuildConfig.VERSION_NAME;
    }

    /* renamed from: k */
    public final Spanned m14507k() {
        Spanned m38666a = C1050b.m38666a(this.f22555A, 0);
        Intrinsics.checkIfNull(m38666a, "fromHtml(description, Ht…at.FROM_HTML_MODE_LEGACY)");
        return m38666a;
    }

    /* renamed from: n */
    public final Promotion m14505n() {
        return this.f22561G;
    }

    /* renamed from: r */
    public final String m14504r() {
        return this.f22566L;
    }

    /* renamed from: s */
    public final BrandResponse m14503s() {
        return this.f22557C;
    }

    /* renamed from: t */
    public final int m14502t() {
        return this.f22569x;
    }

    /* renamed from: v */
    public final String m14501v() {
        return this.f22555A;
    }

    /* renamed from: w */
    public final boolean m14500w() {
        return this.f22560F;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22568w);
        parcel.writeInt(this.f22569x);
        parcel.writeString(this.f22570y);
        parcel.writeString(this.f22571z);
        parcel.writeString(this.f22555A);
        parcel.writeString(this.f22556B);
        this.f22557C.writeToParcel(parcel, i);
        parcel.writeString(this.f22558D);
        parcel.writeString(this.f22559E);
        parcel.writeInt(this.f22560F ? 1 : 0);
        Promotion promotion = this.f22561G;
        if (promotion == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotion.writeToParcel(parcel, i);
        }
        List<Number> list = this.f22562H;
        parcel.writeInt(list.size());
        for (Number number : list) {
            parcel.writeInt(number.intValue());
        }
        parcel.writeInt(this.f22563I);
        parcel.writeInt(this.f22564J);
        parcel.writeInt(this.f22565K ? 1 : 0);
        parcel.writeString(this.f22566L);
    }

    /* renamed from: y */
    public String m14499y() {
        return this.f22568w;
    }

    /* renamed from: z */
    public final String m14498z() {
        return this.f22571z;
    }

    public /* synthetic */ CatalogProduct(String str, int i, String str2, String str3, String str4, String str5, BrandResponse brandResponse, String str6, String str7, boolean z, Promotion promotion, List list, int i2, int i3, boolean z2, String str8, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i4 & 2) != 0 ? -1 : i, (i4 & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i4 & 8) != 0 ? BuildConfig.VERSION_NAME : str3, (i4 & 16) != 0 ? BuildConfig.VERSION_NAME : str4, (i4 & 32) != 0 ? BuildConfig.VERSION_NAME : str5, (i4 & 64) != 0 ? new BrandResponse(null, false, null, null, 15, null) : brandResponse, (i4 & 128) != 0 ? BuildConfig.VERSION_NAME : str6, (i4 & 256) == 0 ? str7 : BuildConfig.VERSION_NAME, (i4 & 512) != 0 ? false : z, (i4 & 1024) != 0 ? null : promotion, (i4 & 2048) != 0 ? C13780s.m197g() : list, (i4 & 4096) != 0 ? 0 : i2, (i4 & 8192) != 0 ? 0 : i3, (i4 & 16384) != 0 ? false : z2, (i4 & 32768) != 0 ? null : str8);
    }
}
