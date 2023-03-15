package androidx.core.p020os;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.h */
/* loaded from: classes.dex */
final class C1019h implements InterfaceC1018g {

    /* renamed from: a */
    private final LocaleList f3319a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1019h(Object obj) {
        this.f3319a = (LocaleList) obj;
    }

    @Override // androidx.core.p020os.InterfaceC1018g
    /* renamed from: a */
    public Object mo38741a() {
        return this.f3319a;
    }

    public boolean equals(Object obj) {
        return this.f3319a.equals(((InterfaceC1018g) obj).mo38741a());
    }

    @Override // androidx.core.p020os.InterfaceC1018g
    public Locale get(int i) {
        return this.f3319a.get(i);
    }

    public int hashCode() {
        return this.f3319a.hashCode();
    }

    public String toString() {
        return this.f3319a.toString();
    }
}
