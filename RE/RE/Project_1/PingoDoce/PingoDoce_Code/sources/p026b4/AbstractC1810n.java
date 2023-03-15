package p026b4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p152i4.C6013a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b4.n */
/* loaded from: classes.dex */
public abstract class AbstractC1810n<V, O> implements InterfaceC1809m<V, O> {

    /* renamed from: a */
    final List<C6013a<V>> f5502a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1810n(V v) {
        this(Collections.singletonList(new C6013a(v)));
    }

    @Override // p026b4.InterfaceC1809m
    /* renamed from: b */
    public List<C6013a<V>> mo35328b() {
        return this.f5502a;
    }

    @Override // p026b4.InterfaceC1809m
    /* renamed from: c */
    public boolean mo35327c() {
        return this.f5502a.isEmpty() || (this.f5502a.size() == 1 && this.f5502a.get(0).m22358h());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f5502a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f5502a.toArray()));
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1810n(List<C6013a<V>> list) {
        this.f5502a = list;
    }
}
