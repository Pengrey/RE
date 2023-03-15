package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ml.InterfaceC7504a;
import p181jd.Intrinsics;
import p489zc._Collections;
import pt.pingodoce.app.data.local.models.shoppinglist.Friend;

/* compiled from: ShoppingList.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ShoppingList implements Parcelable, InterfaceC7504a {
    public static final Parcelable.Creator CREATOR = new C8789a();
    @InterfaceC4469e(name = "description")

    /* renamed from: A */
    private final String f23225A;
    @InterfaceC4469e(name = "isActive")

    /* renamed from: B */
    private boolean f23226B;
    @InterfaceC4469e(name = "products")

    /* renamed from: C */
    private List f23227C;
    @InterfaceC4469e(name = "sharedWith")

    /* renamed from: D */
    private List f23228D;
    @InterfaceC4469e(name = "dateCreated")

    /* renamed from: E */
    private final String f23229E;
    @InterfaceC4469e(name = "dateUpdated")

    /* renamed from: F */
    private final String f23230F;
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private String f23231w;
    @InterfaceC4469e(name = "clientId")

    /* renamed from: x */
    private final String f23232x;
    @InterfaceC4469e(name = "userId")

    /* renamed from: y */
    private String f23233y;
    @InterfaceC4469e(name = "name")

    /* renamed from: z */
    private String f23234z;

    /* compiled from: ShoppingList.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.ShoppingList$a */
    /* loaded from: classes2.dex */
    public static final class C8789a implements Parcelable.Creator {
        /* renamed from: a */
        public final ShoppingList createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(ShoppingList.class.getClassLoader()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(Friend.CREATOR.createFromParcel(parcel));
            }
            return new ShoppingList(readString, readString2, readString3, readString4, readString5, z, arrayList, arrayList2, parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ShoppingList[] newArray(int i) {
            return new ShoppingList[i];
        }
    }

    public ShoppingList() {
        this(null, null, null, null, null, false, null, null, null, null, 1023, null);
    }

    public ShoppingList(String str, String str2, String str3, String str4, String str5, boolean z, List list, List list2, String str6, String str7) {
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(str2, "clientId");
        Intrinsics.isThisObjectNull(str3, "userId");
        Intrinsics.isThisObjectNull(str4, "name");
        Intrinsics.isThisObjectNull(str5, "description");
        Intrinsics.isThisObjectNull(list, "products");
        Intrinsics.isThisObjectNull(list2, "users");
        Intrinsics.isThisObjectNull(str6, "dateCreated");
        Intrinsics.isThisObjectNull(str7, "dateUpdated");
        this.f23231w = str;
        this.f23232x = str2;
        this.f23233y = str3;
        this.f23234z = str4;
        this.f23225A = str5;
        this.f23226B = z;
        this.f23227C = list;
        this.f23228D = list2;
        this.f23229E = str6;
        this.f23230F = str7;
    }

    /* renamed from: d */
    public static /* synthetic */ ShoppingList m13742d(ShoppingList shoppingList, String str, String str2, String str3, String str4, String str5, boolean z, List list, List list2, String str6, String str7, int i, Object obj) {
        return shoppingList.m13743c((i & 1) != 0 ? shoppingList.f23231w : str, (i & 2) != 0 ? shoppingList.f23232x : str2, (i & 4) != 0 ? shoppingList.f23233y : str3, (i & 8) != 0 ? shoppingList.f23234z : str4, (i & 16) != 0 ? shoppingList.f23225A : str5, (i & 32) != 0 ? shoppingList.f23226B : z, (i & 64) != 0 ? shoppingList.f23227C : list, (i & 128) != 0 ? shoppingList.f23228D : list2, (i & 256) != 0 ? shoppingList.f23229E : str6, (i & 512) != 0 ? shoppingList.f23230F : str7);
    }

    /* renamed from: A */
    public final void m13748A(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f23231w = str;
    }

    /* renamed from: D */
    public final void m13747D(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f23234z = str;
    }

    /* renamed from: E */
    public final void m13746E(List list) {
        Intrinsics.isThisObjectNull(list, "<set-?>");
        this.f23228D = list;
    }

    /* renamed from: a */
    public final List m13745a(String str) {
        List m460i0;
        Intrinsics.isThisObjectNull(str, "userId");
        List list = this.f23228D;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Friend friend = (Friend) obj;
            if (friend.m14400c() && !Intrinsics.equals(friend.m14399d(), str)) {
                arrayList.add(obj);
            }
        }
        m460i0 = _Collections.m460i0(arrayList, 7);
        return m460i0;
    }

    /* renamed from: b */
    public final ShoppingList m13744b() {
        return new ShoppingList(this.f23231w, this.f23232x, this.f23233y, this.f23234z, this.f23225A, this.f23226B, this.f23227C, this.f23228D, this.f23229E, this.f23230F);
    }

    /* renamed from: c */
    public final ShoppingList m13743c(String str, String str2, String str3, String str4, String str5, boolean z, List list, List list2, String str6, String str7) {
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(str2, "clientId");
        Intrinsics.isThisObjectNull(str3, "userId");
        Intrinsics.isThisObjectNull(str4, "name");
        Intrinsics.isThisObjectNull(str5, "description");
        Intrinsics.isThisObjectNull(list, "products");
        Intrinsics.isThisObjectNull(list2, "users");
        Intrinsics.isThisObjectNull(str6, "dateCreated");
        Intrinsics.isThisObjectNull(str7, "dateUpdated");
        return new ShoppingList(str, str2, str3, str4, str5, z, list, list2, str6, str7);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m13741e() {
        return this.f23232x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShoppingList) {
            ShoppingList shoppingList = (ShoppingList) obj;
            return Intrinsics.equals(this.f23231w, shoppingList.f23231w) && Intrinsics.equals(this.f23232x, shoppingList.f23232x) && Intrinsics.equals(this.f23233y, shoppingList.f23233y) && Intrinsics.equals(this.f23234z, shoppingList.f23234z) && Intrinsics.equals(this.f23225A, shoppingList.f23225A) && this.f23226B == shoppingList.f23226B && Intrinsics.equals(this.f23227C, shoppingList.f23227C) && Intrinsics.equals(this.f23228D, shoppingList.f23228D) && Intrinsics.equals(this.f23229E, shoppingList.f23229E) && Intrinsics.equals(this.f23230F, shoppingList.f23230F);
        }
        return false;
    }

    /* renamed from: f */
    public final String m13740f() {
        return this.f23229E;
    }

    /* renamed from: h */
    public final String m13739h() {
        return this.f23230F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f23231w.hashCode() * 31) + this.f23232x.hashCode()) * 31) + this.f23233y.hashCode()) * 31) + this.f23234z.hashCode()) * 31) + this.f23225A.hashCode()) * 31;
        boolean z = this.f23226B;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((hashCode + i) * 31) + this.f23227C.hashCode()) * 31) + this.f23228D.hashCode()) * 31) + this.f23229E.hashCode()) * 31) + this.f23230F.hashCode();
    }

    /* renamed from: i */
    public final String m13738i() {
        return this.f23225A;
    }

    /* renamed from: j */
    public final String m13737j() {
        return this.f23231w;
    }

    /* renamed from: k */
    public final String m13736k() {
        return this.f23234z;
    }

    /* renamed from: m */
    public final List m13735m() {
        return this.f23227C;
    }

    /* renamed from: n */
    public final String m13734n() {
        return this.f23233y;
    }

    /* renamed from: r */
    public final List m13733r() {
        return this.f23228D;
    }

    /* renamed from: s */
    public final boolean m13732s() {
        return this.f23226B;
    }

    /* renamed from: t */
    public final boolean m13731t(String str) {
        Object obj;
        Intrinsics.isThisObjectNull(str, "userId");
        if (Intrinsics.equals(this.f23233y, str)) {
            return this.f23226B;
        }
        Iterator it = this.f23228D.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.equals(((Friend) obj).m14399d(), str)) {
                break;
            }
        }
        Friend friend = (Friend) obj;
        if (friend != null) {
            return friend.m14395i();
        }
        return false;
    }

    public String toString() {
        String str = this.f23231w;
        String str2 = this.f23232x;
        String str3 = this.f23233y;
        String str4 = this.f23234z;
        String str5 = this.f23225A;
        boolean z = this.f23226B;
        List list = this.f23227C;
        List list2 = this.f23228D;
        String str6 = this.f23229E;
        String str7 = this.f23230F;
        return "ShoppingList(id=" + str + ", clientId=" + str2 + ", userId=" + str3 + ", name=" + str4 + ", description=" + str5 + ", isActive=" + z + ", products=" + list + ", users=" + list2 + ", dateCreated=" + str6 + ", dateUpdated=" + str7 + ")";
    }

    /* renamed from: v */
    public final boolean m13730v() {
        return (this.f23231w.length() == 0) && this.f23227C.isEmpty();
    }

    /* renamed from: w */
    public final boolean m13729w() {
        Friend m13728y = m13728y();
        if (m13728y != null) {
            return !m13745a(m13728y.m14399d()).isEmpty();
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23231w);
        parcel.writeString(this.f23232x);
        parcel.writeString(this.f23233y);
        parcel.writeString(this.f23234z);
        parcel.writeString(this.f23225A);
        parcel.writeInt(this.f23226B ? 1 : 0);
        List<Parcelable> list = this.f23227C;
        parcel.writeInt(list.size());
        for (Parcelable parcelable : list) {
            parcel.writeParcelable(parcelable, i);
        }
        List<Friend> list2 = this.f23228D;
        parcel.writeInt(list2.size());
        for (Friend friend : list2) {
            friend.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f23229E);
        parcel.writeString(this.f23230F);
    }

    /* renamed from: y */
    public final Friend m13728y() {
        Object obj;
        Iterator it = this.f23228D.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Friend) obj).m14394j()) {
                break;
            }
        }
        return (Friend) obj;
    }

    /* renamed from: z */
    public final void m13727z(boolean z) {
        this.f23226B = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ShoppingList(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, boolean r17, java.util.List r18, java.util.List r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r1 = r2
            goto Lb
        La:
            r1 = r12
        Lb:
            r3 = r0 & 2
            if (r3 == 0) goto L1d
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "randomUUID().toString()"
            p181jd.Intrinsics.checkIfNull(r3, r4)
            goto L1e
        L1d:
            r3 = r13
        L1e:
            r4 = r0 & 4
            if (r4 == 0) goto L24
            r4 = r2
            goto L25
        L24:
            r4 = r14
        L25:
            r5 = r0 & 8
            if (r5 == 0) goto L2c
            java.lang.String r5 = "Nova Lista"
            goto L2d
        L2c:
            r5 = r15
        L2d:
            r6 = r0 & 16
            if (r6 == 0) goto L33
            r6 = r2
            goto L35
        L33:
            r6 = r16
        L35:
            r7 = r0 & 32
            if (r7 == 0) goto L3b
            r7 = 1
            goto L3d
        L3b:
            r7 = r17
        L3d:
            r8 = r0 & 64
            if (r8 == 0) goto L47
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L49
        L47:
            r8 = r18
        L49:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L53
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto L55
        L53:
            r9 = r19
        L55:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L5b
            r10 = r2
            goto L5d
        L5b:
            r10 = r20
        L5d:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L62
            goto L64
        L62:
            r2 = r21
        L64:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.data.remote.models.response.ShoppingList.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, java.util.List, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
