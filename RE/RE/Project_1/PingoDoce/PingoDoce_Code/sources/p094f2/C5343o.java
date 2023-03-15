package p094f2;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p053d2.C4711d;
import p073e2.C4961b;
import p073e2.C4966e;
import p073e2.C4969f;

/* renamed from: f2.o */
/* loaded from: classes.dex */
public class C5343o {

    /* renamed from: f */
    static int f14739f;

    /* renamed from: b */
    int f14741b;

    /* renamed from: c */
    int f14742c;

    /* renamed from: a */
    ArrayList<C4966e> f14740a = new ArrayList<>();

    /* renamed from: d */
    ArrayList<C5344a> f14743d = null;

    /* renamed from: e */
    private int f14744e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WidgetGroup.java */
    /* renamed from: f2.o$a */
    /* loaded from: classes.dex */
    public class C5344a {
        public C5344a(C5343o c5343o, C4966e c4966e, C4711d c4711d, int i) {
            new WeakReference(c4966e);
            c4711d.m26838x(c4966e.f13812F);
            c4711d.m26838x(c4966e.f13813G);
            c4711d.m26838x(c4966e.f13814H);
            c4711d.m26838x(c4966e.f13815I);
            c4711d.m26838x(c4966e.f13816J);
        }
    }

    public C5343o(int i) {
        this.f14741b = -1;
        this.f14742c = 0;
        int i2 = f14739f;
        f14739f = i2 + 1;
        this.f14741b = i2;
        this.f14742c = i;
    }

    /* renamed from: e */
    private String m24571e() {
        int i = this.f14742c;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    /* renamed from: j */
    private int m24566j(C4711d c4711d, ArrayList<C4966e> arrayList, int i) {
        int m26838x;
        int m26838x2;
        C4969f c4969f = (C4969f) arrayList.get(0).m26124I();
        c4711d.m26862D();
        c4969f.mo26008g(c4711d, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).mo26008g(c4711d, false);
        }
        if (i == 0 && c4969f.f13891x0 > 0) {
            C4961b.m26163b(c4969f, c4711d, arrayList, 0);
        }
        if (i == 1 && c4969f.f13892y0 > 0) {
            C4961b.m26163b(c4969f, c4711d, arrayList, 1);
        }
        try {
            c4711d.m26836z();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f14743d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f14743d.add(new C5344a(this, arrayList.get(i3), c4711d, i));
        }
        if (i == 0) {
            m26838x = c4711d.m26838x(c4969f.f13812F);
            m26838x2 = c4711d.m26838x(c4969f.f13814H);
            c4711d.m26862D();
        } else {
            m26838x = c4711d.m26838x(c4969f.f13813G);
            m26838x2 = c4711d.m26838x(c4969f.f13815I);
            c4711d.m26862D();
        }
        return m26838x2 - m26838x;
    }

    /* renamed from: a */
    public boolean m24575a(C4966e c4966e) {
        if (this.f14740a.contains(c4966e)) {
            return false;
        }
        this.f14740a.add(c4966e);
        return true;
    }

    /* renamed from: b */
    public void m24574b(ArrayList<C5343o> arrayList) {
        int size = this.f14740a.size();
        if (this.f14744e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C5343o c5343o = arrayList.get(i);
                if (this.f14744e == c5343o.f14741b) {
                    m24569g(this.f14742c, c5343o);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public int m24573c() {
        return this.f14741b;
    }

    /* renamed from: d */
    public int m24572d() {
        return this.f14742c;
    }

    /* renamed from: f */
    public int m24570f(C4711d c4711d, int i) {
        if (this.f14740a.size() == 0) {
            return 0;
        }
        return m24566j(c4711d, this.f14740a, i);
    }

    /* renamed from: g */
    public void m24569g(int i, C5343o c5343o) {
        Iterator<C4966e> it = this.f14740a.iterator();
        while (it.hasNext()) {
            C4966e next = it.next();
            c5343o.m24575a(next);
            if (i == 0) {
                next.f13858m0 = c5343o.m24573c();
            } else {
                next.f13860n0 = c5343o.m24573c();
            }
        }
        this.f14744e = c5343o.f14741b;
    }

    /* renamed from: h */
    public void m24568h(boolean z) {
    }

    /* renamed from: i */
    public void m24567i(int i) {
        this.f14742c = i;
    }

    public String toString() {
        Iterator<C4966e> it;
        String str = m24571e() + " [" + this.f14741b + "] <";
        while (this.f14740a.iterator().hasNext()) {
            str = str + " " + it.next().m26066r();
        }
        return str + " >";
    }
}
