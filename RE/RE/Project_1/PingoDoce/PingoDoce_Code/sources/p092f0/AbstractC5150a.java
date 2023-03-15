package p092f0;

import java.util.ArrayList;
import java.util.List;
import p092f0.Applier;

/* renamed from: f0.a */
/* loaded from: classes.dex */
public abstract class AbstractC5150a<T> implements Applier<T> {

    /* renamed from: a */
    private final T f14231a;

    /* renamed from: b */
    private final List<T> f14232b = new ArrayList();

    /* renamed from: c */
    private T f14233c;

    public AbstractC5150a(T t) {
        this.f14231a = t;
        this.f14233c = t;
    }

    @Override // p092f0.Applier
    /* renamed from: a */
    public T mo25549a() {
        return this.f14233c;
    }

    @Override // p092f0.Applier
    /* renamed from: c */
    public void mo25548c(T t) {
        this.f14232b.add(mo25549a());
        m25542l(t);
    }

    @Override // p092f0.Applier
    public final void clear() {
        this.f14232b.clear();
        m25542l(this.f14231a);
        mo25543k();
    }

    @Override // p092f0.Applier
    /* renamed from: d */
    public void mo25547d() {
        Applier.C5162a.m25450a(this);
    }

    @Override // p092f0.Applier
    /* renamed from: f */
    public void mo25546f() {
        Applier.C5162a.m25449b(this);
    }

    @Override // p092f0.Applier
    /* renamed from: i */
    public void mo25545i() {
        if (!this.f14232b.isEmpty()) {
            List<T> list = this.f14232b;
            m25542l(list.remove(list.size() - 1));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: j */
    public final T m25544j() {
        return this.f14231a;
    }

    /* renamed from: k */
    protected abstract void mo25543k();

    /* renamed from: l */
    protected void m25542l(T t) {
        this.f14233c = t;
    }
}
