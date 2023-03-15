package p436x3;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p040c4.C2072h;

@TargetApi(19)
/* renamed from: x3.l */
/* loaded from: classes.dex */
public class C12273l implements InterfaceC12275m, InterfaceC12271j {

    /* renamed from: a */
    private final Path f32390a = new Path();

    /* renamed from: b */
    private final Path f32391b = new Path();

    /* renamed from: c */
    private final Path f32392c = new Path();

    /* renamed from: d */
    private final List<InterfaceC12275m> f32393d = new ArrayList();

    /* renamed from: e */
    private final C2072h f32394e;

    /* compiled from: MergePathsContent.java */
    /* renamed from: x3.l$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C12274a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32395a;

        static {
            int[] iArr = new int[C2072h.EnumC2073a.values().length];
            f32395a = iArr;
            try {
                iArr[C2072h.EnumC2073a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32395a[C2072h.EnumC2073a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32395a[C2072h.EnumC2073a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32395a[C2072h.EnumC2073a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32395a[C2072h.EnumC2073a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C12273l(C2072h c2072h) {
        if (Build.VERSION.SDK_INT >= 19) {
            c2072h.m34758c();
            this.f32394e = c2072h;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    /* renamed from: c */
    private void m3158c() {
        for (int i = 0; i < this.f32393d.size(); i++) {
            this.f32392c.addPath(this.f32393d.get(i).mo3148g());
        }
    }

    @TargetApi(19)
    /* renamed from: h */
    private void m3157h(Path.Op op) {
        this.f32391b.reset();
        this.f32390a.reset();
        for (int size = this.f32393d.size() - 1; size >= 1; size--) {
            InterfaceC12275m interfaceC12275m = this.f32393d.get(size);
            if (interfaceC12275m instanceof C12265d) {
                C12265d c12265d = (C12265d) interfaceC12275m;
                List<InterfaceC12275m> m3170k = c12265d.m3170k();
                for (int size2 = m3170k.size() - 1; size2 >= 0; size2--) {
                    Path mo3148g = m3170k.get(size2).mo3148g();
                    mo3148g.transform(c12265d.m3169l());
                    this.f32391b.addPath(mo3148g);
                }
            } else {
                this.f32391b.addPath(interfaceC12275m.mo3148g());
            }
        }
        InterfaceC12275m interfaceC12275m2 = this.f32393d.get(0);
        if (interfaceC12275m2 instanceof C12265d) {
            C12265d c12265d2 = (C12265d) interfaceC12275m2;
            List<InterfaceC12275m> m3170k2 = c12265d2.m3170k();
            for (int i = 0; i < m3170k2.size(); i++) {
                Path mo3148g2 = m3170k2.get(i).mo3148g();
                mo3148g2.transform(c12265d2.m3169l());
                this.f32390a.addPath(mo3148g2);
            }
        } else {
            this.f32390a.set(interfaceC12275m2.mo3148g());
        }
        this.f32392c.op(this.f32390a, this.f32391b, op);
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: d */
    public void mo3144d(List<InterfaceC12264c> list, List<InterfaceC12264c> list2) {
        for (int i = 0; i < this.f32393d.size(); i++) {
            this.f32393d.get(i).mo3144d(list, list2);
        }
    }

    @Override // p436x3.InterfaceC12271j
    /* renamed from: e */
    public void mo3151e(ListIterator<InterfaceC12264c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC12264c previous = listIterator.previous();
            if (previous instanceof InterfaceC12275m) {
                this.f32393d.add((InterfaceC12275m) previous);
                listIterator.remove();
            }
        }
    }

    @Override // p436x3.InterfaceC12275m
    /* renamed from: g */
    public Path mo3148g() {
        this.f32392c.reset();
        if (this.f32394e.m34757d()) {
            return this.f32392c;
        }
        int i = C12274a.f32395a[this.f32394e.m34759b().ordinal()];
        if (i == 1) {
            m3158c();
        } else if (i == 2) {
            m3157h(Path.Op.UNION);
        } else if (i == 3) {
            m3157h(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            m3157h(Path.Op.INTERSECT);
        } else if (i == 5) {
            m3157h(Path.Op.XOR);
        }
        return this.f32392c;
    }
}
