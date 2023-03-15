package p459y3;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p040c4.C2070g;
import p040c4.C2078l;

/* renamed from: y3.g */
/* loaded from: classes.dex */
public class C13090g {

    /* renamed from: a */
    private final List<AbstractC13078a<C2078l, Path>> f34022a;

    /* renamed from: b */
    private final List<AbstractC13078a<Integer, Integer>> f34023b;

    /* renamed from: c */
    private final List<C2070g> f34024c;

    public C13090g(List<C2070g> list) {
        this.f34024c = list;
        this.f34022a = new ArrayList(list.size());
        this.f34023b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f34022a.add(list.get(i).m34762b().mo35329a());
            this.f34023b.add(list.get(i).m34761c().mo35329a());
        }
    }

    /* renamed from: a */
    public List<AbstractC13078a<C2078l, Path>> m1661a() {
        return this.f34022a;
    }

    /* renamed from: b */
    public List<C2070g> m1660b() {
        return this.f34024c;
    }

    /* renamed from: c */
    public List<AbstractC13078a<Integer, Integer>> m1659c() {
        return this.f34023b;
    }
}
