package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC1382r;
import androidx.lifecycle.AbstractC1469p;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C1298a();

    /* renamed from: A */
    final int f3787A;

    /* renamed from: B */
    final String f3788B;

    /* renamed from: C */
    final int f3789C;

    /* renamed from: D */
    final int f3790D;

    /* renamed from: E */
    final CharSequence f3791E;

    /* renamed from: F */
    final int f3792F;

    /* renamed from: G */
    final CharSequence f3793G;

    /* renamed from: H */
    final ArrayList<String> f3794H;

    /* renamed from: I */
    final ArrayList<String> f3795I;

    /* renamed from: J */
    final boolean f3796J;

    /* renamed from: w */
    final int[] f3797w;

    /* renamed from: x */
    final ArrayList<String> f3798x;

    /* renamed from: y */
    final int[] f3799y;

    /* renamed from: z */
    final int[] f3800z;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    /* loaded from: classes.dex */
    class C1298a implements Parcelable.Creator<BackStackState> {
        C1298a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(C1331a c1331a) {
        int size = c1331a.f4112a.size();
        this.f3797w = new int[size * 5];
        if (c1331a.f4103g) {
            this.f3798x = new ArrayList<>(size);
            this.f3799y = new int[size];
            this.f3800z = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                AbstractC1382r.C1383a c1383a = c1331a.f4112a.get(i);
                int i3 = i2 + 1;
                this.f3797w[i2] = c1383a.f4114a;
                ArrayList<String> arrayList = this.f3798x;
                Fragment fragment = c1383a.f4115b;
                arrayList.add(fragment != null ? fragment.f3847B : null);
                int[] iArr = this.f3797w;
                int i4 = i3 + 1;
                iArr[i3] = c1383a.f4116c;
                int i5 = i4 + 1;
                iArr[i4] = c1383a.f4117d;
                int i6 = i5 + 1;
                iArr[i5] = c1383a.f4118e;
                iArr[i6] = c1383a.f4119f;
                this.f3799y[i] = c1383a.f4120g.ordinal();
                this.f3800z[i] = c1383a.f4121h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f3787A = c1331a.f4102f;
            this.f3788B = c1331a.f4104h;
            this.f3789C = c1331a.f3984s;
            this.f3790D = c1331a.f4105i;
            this.f3791E = c1331a.f4106j;
            this.f3792F = c1331a.f4107k;
            this.f3793G = c1331a.f4108l;
            this.f3794H = c1331a.f4109m;
            this.f3795I = c1331a.f4110n;
            this.f3796J = c1331a.f4113o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C1331a m37673a(FragmentManager fragmentManager) {
        C1331a c1331a = new C1331a(fragmentManager);
        int i = 0;
        int i2 = 0;
        while (i < this.f3797w.length) {
            AbstractC1382r.C1383a c1383a = new AbstractC1382r.C1383a();
            int i3 = i + 1;
            c1383a.f4114a = this.f3797w[i];
            if (FragmentManager.m37520H0(2)) {
                Log.v("FragmentManager", "Instantiate " + c1331a + " op #" + i2 + " base fragment #" + this.f3797w[i3]);
            }
            String str = this.f3798x.get(i2);
            if (str != null) {
                c1383a.f4115b = fragmentManager.m37461h0(str);
            } else {
                c1383a.f4115b = null;
            }
            c1383a.f4120g = AbstractC1469p.EnumC1472c.values()[this.f3799y[i2]];
            c1383a.f4121h = AbstractC1469p.EnumC1472c.values()[this.f3800z[i2]];
            int[] iArr = this.f3797w;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            c1383a.f4116c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            c1383a.f4117d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            c1383a.f4118e = i9;
            int i10 = iArr[i8];
            c1383a.f4119f = i10;
            c1331a.f4098b = i5;
            c1331a.f4099c = i7;
            c1331a.f4100d = i9;
            c1331a.f4101e = i10;
            c1331a.m37185e(c1383a);
            i2++;
            i = i8 + 1;
        }
        c1331a.f4102f = this.f3787A;
        c1331a.f4104h = this.f3788B;
        c1331a.f3984s = this.f3789C;
        c1331a.f4103g = true;
        c1331a.f4105i = this.f3790D;
        c1331a.f4106j = this.f3791E;
        c1331a.f4107k = this.f3792F;
        c1331a.f4108l = this.f3793G;
        c1331a.f4109m = this.f3794H;
        c1331a.f4110n = this.f3795I;
        c1331a.f4113o = this.f3796J;
        c1331a.m37370r(1);
        return c1331a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f3797w);
        parcel.writeStringList(this.f3798x);
        parcel.writeIntArray(this.f3799y);
        parcel.writeIntArray(this.f3800z);
        parcel.writeInt(this.f3787A);
        parcel.writeString(this.f3788B);
        parcel.writeInt(this.f3789C);
        parcel.writeInt(this.f3790D);
        TextUtils.writeToParcel(this.f3791E, parcel, 0);
        parcel.writeInt(this.f3792F);
        TextUtils.writeToParcel(this.f3793G, parcel, 0);
        parcel.writeStringList(this.f3794H);
        parcel.writeStringList(this.f3795I);
        parcel.writeInt(this.f3796J ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f3797w = parcel.createIntArray();
        this.f3798x = parcel.createStringArrayList();
        this.f3799y = parcel.createIntArray();
        this.f3800z = parcel.createIntArray();
        this.f3787A = parcel.readInt();
        this.f3788B = parcel.readString();
        this.f3789C = parcel.readInt();
        this.f3790D = parcel.readInt();
        this.f3791E = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3792F = parcel.readInt();
        this.f3793G = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3794H = parcel.createStringArrayList();
        this.f3795I = parcel.createStringArrayList();
        this.f3796J = parcel.readInt() != 0;
    }
}
