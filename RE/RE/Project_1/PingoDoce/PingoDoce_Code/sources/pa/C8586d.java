package pa;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: pa.d */
/* loaded from: classes.dex */
public class C8586d {

    /* renamed from: b */
    private static volatile C8586d f22191b;

    /* renamed from: a */
    private final Set<AbstractC8588f> f22192a = new HashSet();

    C8586d() {
    }

    /* renamed from: a */
    public static C8586d m15088a() {
        C8586d c8586d = f22191b;
        if (c8586d == null) {
            synchronized (C8586d.class) {
                c8586d = f22191b;
                if (c8586d == null) {
                    c8586d = new C8586d();
                    f22191b = c8586d;
                }
            }
        }
        return c8586d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<AbstractC8588f> m15087b() {
        Set<AbstractC8588f> unmodifiableSet;
        synchronized (this.f22192a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f22192a);
        }
        return unmodifiableSet;
    }
}
