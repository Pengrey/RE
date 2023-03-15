package pt.pingodoce.app.data.local.dataProviders.base;

import com.squareup.moshi.InterfaceC4475g;
import org.threeten.p283bp.C8216e;
import p181jd.Intrinsics;

/* compiled from: HashMapLocalDataProvider.kt */
@InterfaceC4475g(generateAdapter = true)
/* renamed from: pt.pingodoce.app.data.local.dataProviders.base.LocalCacheType */
/* loaded from: classes2.dex */
public final class HashMapLocalDataProvider<T> {

    /* renamed from: a */
    private final C8216e f22370a;

    /* renamed from: b */
    private final C8216e f22371b;

    /* renamed from: c */
    private final Object f22372c;

    public HashMapLocalDataProvider(C8216e c8216e, C8216e c8216e2, Object obj) {
        Intrinsics.isThisObjectNull(c8216e, "refreshDate");
        Intrinsics.isThisObjectNull(c8216e2, "expiryDate");
        this.f22370a = c8216e;
        this.f22371b = c8216e2;
        this.f22372c = obj;
    }

    /* renamed from: b */
    public static /* synthetic */ HashMapLocalDataProvider m14782b(HashMapLocalDataProvider hashMapLocalDataProvider, C8216e c8216e, C8216e c8216e2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            c8216e = hashMapLocalDataProvider.f22370a;
        }
        if ((i & 2) != 0) {
            c8216e2 = hashMapLocalDataProvider.f22371b;
        }
        if ((i & 4) != 0) {
            obj = hashMapLocalDataProvider.f22372c;
        }
        return hashMapLocalDataProvider.m14783a(c8216e, c8216e2, obj);
    }

    /* renamed from: a */
    public final HashMapLocalDataProvider m14783a(C8216e c8216e, C8216e c8216e2, Object obj) {
        Intrinsics.isThisObjectNull(c8216e, "refreshDate");
        Intrinsics.isThisObjectNull(c8216e2, "expiryDate");
        return new HashMapLocalDataProvider(c8216e, c8216e2, obj);
    }

    /* renamed from: c */
    public final C8216e m14781c() {
        return this.f22371b;
    }

    /* renamed from: d */
    public final C8216e m14780d() {
        return this.f22370a;
    }

    /* renamed from: e */
    public final Object m14779e() {
        return this.f22372c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HashMapLocalDataProvider) {
            HashMapLocalDataProvider hashMapLocalDataProvider = (HashMapLocalDataProvider) obj;
            return Intrinsics.equals(this.f22370a, hashMapLocalDataProvider.f22370a) && Intrinsics.equals(this.f22371b, hashMapLocalDataProvider.f22371b) && Intrinsics.equals(this.f22372c, hashMapLocalDataProvider.f22372c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f22370a.hashCode() * 31) + this.f22371b.hashCode()) * 31;
        Object obj = this.f22372c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        C8216e c8216e = this.f22370a;
        C8216e c8216e2 = this.f22371b;
        Object obj = this.f22372c;
        return "LocalCacheType(refreshDate=" + c8216e + ", expiryDate=" + c8216e2 + ", value=" + obj + ")";
    }
}
