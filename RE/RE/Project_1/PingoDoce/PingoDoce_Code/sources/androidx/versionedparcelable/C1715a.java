package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.lang.reflect.Method;
import p301q.C9545a;

/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes.dex */
class C1715a extends VersionedParcel {

    /* renamed from: d */
    private final SparseIntArray f5249d;

    /* renamed from: e */
    private final Parcel f5250e;

    /* renamed from: f */
    private final int f5251f;

    /* renamed from: g */
    private final int f5252g;

    /* renamed from: h */
    private final String f5253h;

    /* renamed from: i */
    private int f5254i;

    /* renamed from: j */
    private int f5255j;

    /* renamed from: k */
    private int f5256k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1715a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.VERSION_NAME, new C9545a(), new C9545a(), new C9545a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: A */
    public void mo35591A(byte[] bArr) {
        if (bArr != null) {
            this.f5250e.writeInt(bArr.length);
            this.f5250e.writeByteArray(bArr);
            return;
        }
        this.f5250e.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: C */
    protected void mo35590C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f5250e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: E */
    public void mo35589E(int i) {
        this.f5250e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: G */
    public void mo35588G(Parcelable parcelable) {
        this.f5250e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: I */
    public void mo35587I(String str) {
        this.f5250e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: a */
    public void mo35586a() {
        int i = this.f5254i;
        if (i >= 0) {
            int i2 = this.f5249d.get(i);
            int dataPosition = this.f5250e.dataPosition();
            this.f5250e.setDataPosition(i2);
            this.f5250e.writeInt(dataPosition - i2);
            this.f5250e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: b */
    protected VersionedParcel mo35585b() {
        Parcel parcel = this.f5250e;
        int dataPosition = parcel.dataPosition();
        int i = this.f5255j;
        if (i == this.f5251f) {
            i = this.f5252g;
        }
        int i2 = i;
        return new C1715a(parcel, dataPosition, i2, this.f5253h + "  ", this.f5246a, this.f5247b, this.f5248c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: g */
    public boolean mo35584g() {
        return this.f5250e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: i */
    public byte[] mo35583i() {
        int readInt = this.f5250e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f5250e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: k */
    protected CharSequence mo35582k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f5250e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: m */
    public boolean mo35581m(int i) {
        while (this.f5255j < this.f5252g) {
            int i2 = this.f5256k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f5250e.setDataPosition(this.f5255j);
            int readInt = this.f5250e.readInt();
            this.f5256k = this.f5250e.readInt();
            this.f5255j += readInt;
        }
        return this.f5256k == i;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: o */
    public int mo35580o() {
        return this.f5250e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: q */
    public <T extends Parcelable> T mo35579q() {
        return (T) this.f5250e.readParcelable(C1715a.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: s */
    public String mo35578s() {
        return this.f5250e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: w */
    public void mo35577w(int i) {
        mo35586a();
        this.f5254i = i;
        this.f5249d.put(i, this.f5250e.dataPosition());
        mo35589E(0);
        mo35589E(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: y */
    public void mo35576y(boolean z) {
        this.f5250e.writeInt(z ? 1 : 0);
    }

    private C1715a(Parcel parcel, int i, int i2, String str, C9545a<String, Method> c9545a, C9545a<String, Method> c9545a2, C9545a<String, Class> c9545a3) {
        super(c9545a, c9545a2, c9545a3);
        this.f5249d = new SparseIntArray();
        this.f5254i = -1;
        this.f5255j = 0;
        this.f5256k = -1;
        this.f5250e = parcel;
        this.f5251f = i;
        this.f5252g = i2;
        this.f5255j = i;
        this.f5253h = str;
    }
}
