package pt.pingodoce.app.presentation.common.loyaltycard.resume;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13777q;

@InterfaceC4475g(generateAdapter = true)
/* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.resume.OnboardingResumeInfoRow */
/* loaded from: classes2.dex */
public final class LoyaltyCardResumeViewModel implements Parcelable {

    /* renamed from: A */
    private final String f23901A;

    /* renamed from: B */
    private final boolean f23902B;

    /* renamed from: C */
    private final boolean f23903C;

    /* renamed from: D */
    private final boolean f23904D;

    /* renamed from: E */
    private final int f23905E;

    /* renamed from: F */
    private boolean f23906F;

    /* renamed from: G */
    private final String f23907G;

    /* renamed from: H */
    private final boolean f23908H;

    /* renamed from: w */
    private final String f23909w;

    /* renamed from: x */
    private String f23910x;

    /* renamed from: y */
    private final List f23911y;

    /* renamed from: z */
    private boolean f23912z;

    /* renamed from: I */
    public static final C9074a f23913I = new C9074a(null);
    public static final Parcelable.Creator CREATOR = new C9075b();

    /* compiled from: LoyaltyCardResumeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.resume.OnboardingResumeInfoRow$a */
    /* loaded from: classes2.dex */
    public static final class C9074a {
        private C9074a() {
        }

        public /* synthetic */ C9074a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final LoyaltyCardResumeViewModel m12641a(String str, List list, String str2) {
            Intrinsics.isThisObjectNull(str, "title");
            Intrinsics.isThisObjectNull(list, "cardList");
            Intrinsics.isThisObjectNull(str2, "message");
            if (list.size() == 1) {
                return new LoyaltyCardResumeViewModel(str, ((C14956OnboardingResumeInfoRowItem) C13777q.m256L(list)).m12638a(), str2);
            }
            return new LoyaltyCardResumeViewModel(str, list, str2);
        }
    }

    /* compiled from: LoyaltyCardResumeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.resume.OnboardingResumeInfoRow$b */
    /* loaded from: classes2.dex */
    public static final class C9075b implements Parcelable.Creator {
        /* renamed from: a */
        public final LoyaltyCardResumeViewModel mo11699a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(C14956OnboardingResumeInfoRowItem.CREATOR.createFromParcel(parcel));
            }
            return new LoyaltyCardResumeViewModel(readString, readString2, arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final LoyaltyCardResumeViewModel[] mo11698b(int i) {
            return new LoyaltyCardResumeViewModel[i];
        }
    }

    public LoyaltyCardResumeViewModel(String str, String str2, List list, boolean z, String str3, boolean z2, boolean z3, boolean z4, int i, boolean z5, String str4, boolean z6) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(str2, "subTitle");
        Intrinsics.isThisObjectNull(list, "items");
        Intrinsics.isThisObjectNull(str3, "message");
        this.f23909w = str;
        this.f23910x = str2;
        this.f23911y = list;
        this.f23912z = z;
        this.f23901A = str3;
        this.f23902B = z2;
        this.f23903C = z3;
        this.f23904D = z4;
        this.f23905E = i;
        this.f23906F = z5;
        this.f23907G = str4;
        this.f23908H = z6;
    }

    /* renamed from: a */
    public final String m12655a() {
        return this.f23907G;
    }

    /* renamed from: b */
    public final boolean m12654b() {
        return this.f23912z;
    }

    /* renamed from: c */
    public final List m12653c() {
        return this.f23911y;
    }

    /* renamed from: d */
    public final String m12652d() {
        return this.f23901A;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m12651e() {
        return this.f23905E;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoyaltyCardResumeViewModel) {
            LoyaltyCardResumeViewModel loyaltyCardResumeViewModel = (LoyaltyCardResumeViewModel) obj;
            return Intrinsics.equals(this.f23909w, loyaltyCardResumeViewModel.f23909w) && Intrinsics.equals(this.f23910x, loyaltyCardResumeViewModel.f23910x) && Intrinsics.equals(this.f23911y, loyaltyCardResumeViewModel.f23911y) && this.f23912z == loyaltyCardResumeViewModel.f23912z && Intrinsics.equals(this.f23901A, loyaltyCardResumeViewModel.f23901A) && this.f23902B == loyaltyCardResumeViewModel.f23902B && this.f23903C == loyaltyCardResumeViewModel.f23903C && this.f23904D == loyaltyCardResumeViewModel.f23904D && this.f23905E == loyaltyCardResumeViewModel.f23905E && this.f23906F == loyaltyCardResumeViewModel.f23906F && Intrinsics.equals(this.f23907G, loyaltyCardResumeViewModel.f23907G) && this.f23908H == loyaltyCardResumeViewModel.f23908H;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m12650f() {
        return this.f23903C;
    }

    /* renamed from: h */
    public final boolean m12649h() {
        return this.f23906F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f23909w.hashCode() * 31) + this.f23910x.hashCode()) * 31) + this.f23911y.hashCode()) * 31;
        boolean z = this.f23912z;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.f23901A.hashCode()) * 31;
        boolean z2 = this.f23902B;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z3 = this.f23903C;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z4 = this.f23904D;
        int i6 = z4;
        if (z4 != 0) {
            i6 = 1;
        }
        int hashCode3 = (((i5 + i6) * 31) + Integer.hashCode(this.f23905E)) * 31;
        boolean z5 = this.f23906F;
        int i7 = z5;
        if (z5 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode3 + i7) * 31;
        String str = this.f23907G;
        int hashCode4 = (i8 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z6 = this.f23908H;
        return hashCode4 + (z6 ? 1 : z6 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean m12648i() {
        return this.f23904D;
    }

    /* renamed from: j */
    public final boolean m12647j() {
        return this.f23902B;
    }

    /* renamed from: k */
    public final String m12646k() {
        return this.f23910x;
    }

    /* renamed from: m */
    public final String m12645m() {
        return this.f23909w;
    }

    /* renamed from: n */
    public final boolean m12644n() {
        return this.f23908H;
    }

    /* renamed from: r */
    public final void m12643r(boolean z) {
        this.f23912z = z;
    }

    /* renamed from: s */
    public final void m12642s(boolean z) {
        this.f23906F = z;
    }

    public String toString() {
        String str = this.f23909w;
        String str2 = this.f23910x;
        List list = this.f23911y;
        boolean z = this.f23912z;
        String str3 = this.f23901A;
        boolean z2 = this.f23902B;
        boolean z3 = this.f23903C;
        boolean z4 = this.f23904D;
        int i = this.f23905E;
        boolean z5 = this.f23906F;
        String str4 = this.f23907G;
        boolean z6 = this.f23908H;
        return "OnboardingResumeInfoRow(title=" + str + ", subTitle=" + str2 + ", items=" + list + ", hasGuests=" + z + ", message=" + str3 + ", showWarningIcon=" + z2 + ", showActionButton=" + z3 + ", showEditButton=" + z4 + ", rowItemId=" + i + ", showAlertContainer=" + z5 + ", alertMessage=" + str4 + ", isCardOwner=" + z6 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23909w);
        parcel.writeString(this.f23910x);
        List<C14956OnboardingResumeInfoRowItem> list = this.f23911y;
        parcel.writeInt(list.size());
        for (C14956OnboardingResumeInfoRowItem c14956OnboardingResumeInfoRowItem : list) {
            c14956OnboardingResumeInfoRowItem.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f23912z ? 1 : 0);
        parcel.writeString(this.f23901A);
        parcel.writeInt(this.f23902B ? 1 : 0);
        parcel.writeInt(this.f23903C ? 1 : 0);
        parcel.writeInt(this.f23904D ? 1 : 0);
        parcel.writeInt(this.f23905E);
        parcel.writeInt(this.f23906F ? 1 : 0);
        parcel.writeString(this.f23907G);
        parcel.writeInt(this.f23908H ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ LoyaltyCardResumeViewModel(java.lang.String r16, java.lang.String r17, java.util.List r18, boolean r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, int r24, boolean r25, java.lang.String r26, boolean r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 4
            if (r1 == 0) goto Lc
            java.util.List r1 = p489zc.C13777q.m237g()
            r5 = r1
            goto Le
        Lc:
            r5 = r18
        Le:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L15
            r6 = r2
            goto L17
        L15:
            r6 = r19
        L17:
            r1 = r0 & 16
            if (r1 == 0) goto L1f
            java.lang.String r1 = ""
            r7 = r1
            goto L21
        L1f:
            r7 = r20
        L21:
            r1 = r0 & 32
            if (r1 == 0) goto L27
            r8 = r2
            goto L29
        L27:
            r8 = r21
        L29:
            r1 = r0 & 64
            if (r1 == 0) goto L2f
            r9 = r2
            goto L31
        L2f:
            r9 = r22
        L31:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L37
            r10 = r2
            goto L39
        L37:
            r10 = r23
        L39:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L41
            r1 = 89
            r11 = r1
            goto L43
        L41:
            r11 = r24
        L43:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L4a
            r1 = 1
            r12 = r1
            goto L4c
        L4a:
            r12 = r25
        L4c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L53
            r1 = 0
            r13 = r1
            goto L55
        L53:
            r13 = r26
        L55:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L5b
            r14 = r2
            goto L5d
        L5b:
            r14 = r27
        L5d:
            r2 = r15
            r3 = r16
            r4 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel.<init>(java.lang.String, java.lang.String, java.util.List, boolean, java.lang.String, boolean, boolean, boolean, int, boolean, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LoyaltyCardResumeViewModel(java.lang.String r17, java.lang.String r18, boolean r19) {
        /*
            r16 = this;
            java.lang.String r0 = "title"
            r2 = r17
            p181jd.Intrinsics.isThisObjectNull(r2, r0)
            java.lang.String r0 = "subTitle"
            r3 = r18
            p181jd.Intrinsics.isThisObjectNull(r3, r0)
            java.util.List r4 = p489zc.C13777q.m237g()
            r5 = 0
            java.lang.String r6 = ""
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 3840(0xf00, float:5.381E-42)
            r15 = 0
            r1 = r16
            r9 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel.<init>(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LoyaltyCardResumeViewModel(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r16 = this;
            java.lang.String r0 = "title"
            r2 = r17
            p181jd.Intrinsics.isThisObjectNull(r2, r0)
            java.lang.String r0 = "subTitle"
            r3 = r18
            p181jd.Intrinsics.isThisObjectNull(r3, r0)
            java.lang.String r0 = "message"
            r6 = r19
            p181jd.Intrinsics.isThisObjectNull(r6, r0)
            java.util.List r4 = p489zc.C13777q.m237g()
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 3968(0xf80, float:5.56E-42)
            r15 = 0
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoyaltyCardResumeViewModel(String str, List list, String str2) {
        this(str, BuildConfig.VERSION_NAME, list, false, str2, false, false, false, 0, false, null, false, 3976, null);
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(list, "items");
        Intrinsics.isThisObjectNull(str2, "message");
    }
}
