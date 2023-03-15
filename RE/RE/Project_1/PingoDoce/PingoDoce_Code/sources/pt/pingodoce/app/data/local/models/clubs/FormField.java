package pt.pingodoce.app.data.local.models.clubs;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13780s;

/* compiled from: FormField.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class FormField implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8689a();

    /* renamed from: A */
    private final String f22495A;

    /* renamed from: B */
    private final boolean f22496B;

    /* renamed from: C */
    private final boolean f22497C;

    /* renamed from: D */
    private final String f22498D;

    /* renamed from: E */
    private final String f22499E;

    /* renamed from: w */
    private final String f22500w;

    /* renamed from: x */
    private final String f22501x;

    /* renamed from: y */
    private final String f22502y;

    /* renamed from: z */
    private final List f22503z;

    /* compiled from: FormField.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.clubs.FormField$a */
    /* loaded from: classes2.dex */
    public static final class C8689a implements Parcelable.Creator {
        /* renamed from: a */
        public final FormField mo13463a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(FormFieldOption.CREATOR.createFromParcel(parcel));
            }
            return new FormField(readString, readString2, readString3, arrayList, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final FormField[] mo13462b(int i) {
            return new FormField[i];
        }
    }

    public FormField() {
        this(null, null, null, null, null, false, false, null, null, 511, null);
    }

    public FormField(String str, String str2, String str3, List list, String str4, boolean z, boolean z2, String str5, String str6) {
        Intrinsics.isThisObjectNull(str, "field");
        Intrinsics.isThisObjectNull(str2, "label");
        Intrinsics.isThisObjectNull(str3, "type");
        Intrinsics.isThisObjectNull(list, "options");
        Intrinsics.isThisObjectNull(str4, "regex");
        Intrinsics.isThisObjectNull(str5, "group");
        Intrinsics.isThisObjectNull(str6, "fieldGroup");
        this.f22500w = str;
        this.f22501x = str2;
        this.f22502y = str3;
        this.f22503z = list;
        this.f22495A = str4;
        this.f22496B = z;
        this.f22497C = z2;
        this.f22498D = str5;
        this.f22499E = str6;
    }

    /* renamed from: a */
    public final String m14615a() {
        return this.f22500w;
    }

    /* renamed from: b */
    public final String m14614b() {
        return this.f22499E;
    }

    /* renamed from: c */
    public final String m14613c() {
        return this.f22498D;
    }

    /* renamed from: d */
    public final String m14612d() {
        return this.f22501x;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List m14611e() {
        return this.f22503z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FormField) {
            FormField formField = (FormField) obj;
            return Intrinsics.equals(this.f22500w, formField.f22500w) && Intrinsics.equals(this.f22501x, formField.f22501x) && Intrinsics.equals(this.f22502y, formField.f22502y) && Intrinsics.equals(this.f22503z, formField.f22503z) && Intrinsics.equals(this.f22495A, formField.f22495A) && this.f22496B == formField.f22496B && this.f22497C == formField.f22497C && Intrinsics.equals(this.f22498D, formField.f22498D) && Intrinsics.equals(this.f22499E, formField.f22499E);
        }
        return false;
    }

    /* renamed from: f */
    public final String m14610f() {
        return this.f22495A;
    }

    /* renamed from: h */
    public final boolean m14609h() {
        return this.f22496B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f22500w.hashCode() * 31) + this.f22501x.hashCode()) * 31) + this.f22502y.hashCode()) * 31) + this.f22503z.hashCode()) * 31) + this.f22495A.hashCode()) * 31;
        boolean z = this.f22496B;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f22497C;
        return ((((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.f22498D.hashCode()) * 31) + this.f22499E.hashCode();
    }

    /* renamed from: i */
    public final String m14608i() {
        return this.f22502y;
    }

    /* renamed from: j */
    public final boolean m14607j() {
        return this.f22497C;
    }

    public String toString() {
        String str = this.f22500w;
        String str2 = this.f22501x;
        String str3 = this.f22502y;
        List list = this.f22503z;
        String str4 = this.f22495A;
        boolean z = this.f22496B;
        boolean z2 = this.f22497C;
        String str5 = this.f22498D;
        String str6 = this.f22499E;
        return "FormField(field=" + str + ", label=" + str2 + ", type=" + str3 + ", options=" + list + ", regex=" + str4 + ", required=" + z + ", isUnique=" + z2 + ", group=" + str5 + ", fieldGroup=" + str6 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22500w);
        parcel.writeString(this.f22501x);
        parcel.writeString(this.f22502y);
        List<FormFieldOption> list = this.f22503z;
        parcel.writeInt(list.size());
        for (FormFieldOption formFieldOption : list) {
            formFieldOption.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f22495A);
        parcel.writeInt(this.f22496B ? 1 : 0);
        parcel.writeInt(this.f22497C ? 1 : 0);
        parcel.writeString(this.f22498D);
        parcel.writeString(this.f22499E);
    }

    public /* synthetic */ FormField(String str, String str2, String str3, List list, String str4, boolean z, boolean z2, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i & 8) != 0 ? C13780s.m197g() : list, (i & 16) != 0 ? BuildConfig.VERSION_NAME : str4, (i & 32) != 0 ? false : z, (i & 64) == 0 ? z2 : false, (i & 128) != 0 ? BuildConfig.VERSION_NAME : str5, (i & 256) == 0 ? str6 : BuildConfig.VERSION_NAME);
    }
}
