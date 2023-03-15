package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.lifecycle.s0 */
/* loaded from: classes.dex */
public class C1486s0 {

    /* renamed from: a */
    private final HashMap<String, AbstractC1468o0> f4366a = new HashMap<>();

    /* renamed from: a */
    public final void m36975a() {
        for (AbstractC1468o0 abstractC1468o0 : this.f4366a.values()) {
            abstractC1468o0.m36991b();
        }
        this.f4366a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC1468o0 m36974b(String str) {
        return this.f4366a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<String> m36973c() {
        return new HashSet(this.f4366a.keySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m36972d(String str, AbstractC1468o0 abstractC1468o0) {
        AbstractC1468o0 put = this.f4366a.put(str, abstractC1468o0);
        if (put != null) {
            put.mo36928e();
        }
    }
}
