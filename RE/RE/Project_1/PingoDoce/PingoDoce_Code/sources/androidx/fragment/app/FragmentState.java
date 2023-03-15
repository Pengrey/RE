package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C1330a();

    /* renamed from: A */
    final int f3969A;

    /* renamed from: B */
    final String f3970B;

    /* renamed from: C */
    final boolean f3971C;

    /* renamed from: D */
    final boolean f3972D;

    /* renamed from: E */
    final boolean f3973E;

    /* renamed from: F */
    final Bundle f3974F;

    /* renamed from: G */
    final boolean f3975G;

    /* renamed from: H */
    final int f3976H;

    /* renamed from: I */
    Bundle f3977I;

    /* renamed from: w */
    final String f3978w;

    /* renamed from: x */
    final String f3979x;

    /* renamed from: y */
    final boolean f3980y;

    /* renamed from: z */
    final int f3981z;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    /* loaded from: classes.dex */
    class C1330a implements Parcelable.Creator<FragmentState> {
        C1330a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentState(Fragment fragment) {
        this.f3978w = fragment.getClass().getName();
        this.f3979x = fragment.f3847B;
        this.f3980y = fragment.f3808J;
        this.f3981z = fragment.f3816S;
        this.f3969A = fragment.f3817T;
        this.f3970B = fragment.f3818U;
        this.f3971C = fragment.f3821X;
        this.f3972D = fragment.f3807I;
        this.f3973E = fragment.f3820W;
        this.f3974F = fragment.f3803C;
        this.f3975G = fragment.f3819V;
        this.f3976H = fragment.f3834m0.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f3978w);
        sb2.append(" (");
        sb2.append(this.f3979x);
        sb2.append(")}:");
        if (this.f3980y) {
            sb2.append(" fromLayout");
        }
        if (this.f3969A != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f3969A));
        }
        String str = this.f3970B;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f3970B);
        }
        if (this.f3971C) {
            sb2.append(" retainInstance");
        }
        if (this.f3972D) {
            sb2.append(" removing");
        }
        if (this.f3973E) {
            sb2.append(" detached");
        }
        if (this.f3975G) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3978w);
        parcel.writeString(this.f3979x);
        parcel.writeInt(this.f3980y ? 1 : 0);
        parcel.writeInt(this.f3981z);
        parcel.writeInt(this.f3969A);
        parcel.writeString(this.f3970B);
        parcel.writeInt(this.f3971C ? 1 : 0);
        parcel.writeInt(this.f3972D ? 1 : 0);
        parcel.writeInt(this.f3973E ? 1 : 0);
        parcel.writeBundle(this.f3974F);
        parcel.writeInt(this.f3975G ? 1 : 0);
        parcel.writeBundle(this.f3977I);
        parcel.writeInt(this.f3976H);
    }

    FragmentState(Parcel parcel) {
        this.f3978w = parcel.readString();
        this.f3979x = parcel.readString();
        this.f3980y = parcel.readInt() != 0;
        this.f3981z = parcel.readInt();
        this.f3969A = parcel.readInt();
        this.f3970B = parcel.readString();
        this.f3971C = parcel.readInt() != 0;
        this.f3972D = parcel.readInt() != 0;
        this.f3973E = parcel.readInt() != 0;
        this.f3974F = parcel.readBundle();
        this.f3975G = parcel.readInt() != 0;
        this.f3977I = parcel.readBundle();
        this.f3976H = parcel.readInt();
    }
}
