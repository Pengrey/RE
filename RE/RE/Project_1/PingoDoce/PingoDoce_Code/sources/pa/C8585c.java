package pa;

import java.util.Iterator;
import java.util.Set;
import p177j9.C6378d;
import p177j9.C6401q;
import p177j9.InterfaceC6381e;

/* renamed from: pa.c */
/* loaded from: classes.dex */
public class C8585c implements InterfaceC8592i {

    /* renamed from: a */
    private final String f22189a;

    /* renamed from: b */
    private final C8586d f22190b;

    C8585c(Set<AbstractC8588f> set, C8586d c8586d) {
        this.f22189a = m15089e(set);
        this.f22190b = c8586d;
    }

    /* renamed from: c */
    public static C6378d<InterfaceC8592i> m15091c() {
        return C6378d.m21119c(InterfaceC8592i.class).m21104b(C6401q.m21041k(AbstractC8588f.class)).m21100f(C8584b.f22188a).m21102d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ InterfaceC8592i m15090d(InterfaceC6381e interfaceC6381e) {
        return new C8585c(interfaceC6381e.mo21095b(AbstractC8588f.class), C8586d.m15088a());
    }

    /* renamed from: e */
    private static String m15089e(Set<AbstractC8588f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AbstractC8588f> it = set.iterator();
        while (it.hasNext()) {
            AbstractC8588f next = it.next();
            sb2.append(next.mo15084b());
            sb2.append('/');
            sb2.append(next.mo15083c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // pa.InterfaceC8592i
    /* renamed from: a */
    public String mo15077a() {
        if (this.f22190b.m15087b().isEmpty()) {
            return this.f22189a;
        }
        return this.f22189a + ' ' + m15089e(this.f22190b.m15087b());
    }
}
