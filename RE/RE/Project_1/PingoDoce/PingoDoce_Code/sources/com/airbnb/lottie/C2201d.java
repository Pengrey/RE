package com.airbnb.lottie;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p005a4.C0016c;
import p005a4.C0017d;
import p005a4.C0021h;
import p055d4.C4730d;
import p130h4.C5848d;
import p130h4.C5851g;
import p301q.C9556e;
import p301q.C9559h;

/* renamed from: com.airbnb.lottie.d */
/* loaded from: classes.dex */
public class C2201d {

    /* renamed from: c */
    private Map<String, List<C4730d>> f6367c;

    /* renamed from: d */
    private Map<String, C2226g> f6368d;

    /* renamed from: e */
    private Map<String, C0016c> f6369e;

    /* renamed from: f */
    private List<C0021h> f6370f;

    /* renamed from: g */
    private C9559h<C0017d> f6371g;

    /* renamed from: h */
    private C9556e<C4730d> f6372h;

    /* renamed from: i */
    private List<C4730d> f6373i;

    /* renamed from: j */
    private Rect f6374j;

    /* renamed from: k */
    private float f6375k;

    /* renamed from: l */
    private float f6376l;

    /* renamed from: m */
    private float f6377m;

    /* renamed from: n */
    private boolean f6378n;

    /* renamed from: a */
    private final C2235n f6365a = new C2235n();

    /* renamed from: b */
    private final HashSet<String> f6366b = new HashSet<>();

    /* renamed from: o */
    private int f6379o = 0;

    /* renamed from: a */
    public void m34431a(String str) {
        C5848d.m22929c(str);
        this.f6366b.add(str);
    }

    /* renamed from: b */
    public Rect m34430b() {
        return this.f6374j;
    }

    /* renamed from: c */
    public C9559h<C0017d> m34429c() {
        return this.f6371g;
    }

    /* renamed from: d */
    public float m34428d() {
        return (m34427e() / this.f6377m) * 1000.0f;
    }

    /* renamed from: e */
    public float m34427e() {
        return this.f6376l - this.f6375k;
    }

    /* renamed from: f */
    public float m34426f() {
        return this.f6376l;
    }

    /* renamed from: g */
    public Map<String, C0016c> m34425g() {
        return this.f6369e;
    }

    /* renamed from: h */
    public float m34424h(float f) {
        return C5851g.m22893k(this.f6375k, this.f6376l, f);
    }

    /* renamed from: i */
    public float m34423i() {
        return this.f6377m;
    }

    /* renamed from: j */
    public Map<String, C2226g> m34422j() {
        return this.f6368d;
    }

    /* renamed from: k */
    public List<C4730d> m34421k() {
        return this.f6373i;
    }

    /* renamed from: l */
    public C0021h m34420l(String str) {
        int size = this.f6370f.size();
        for (int i = 0; i < size; i++) {
            C0021h c0021h = this.f6370f.get(i);
            if (c0021h.m42107a(str)) {
                return c0021h;
            }
        }
        return null;
    }

    /* renamed from: m */
    public int m34419m() {
        return this.f6379o;
    }

    /* renamed from: n */
    public C2235n m34418n() {
        return this.f6365a;
    }

    /* renamed from: o */
    public List<C4730d> m34417o(String str) {
        return this.f6367c.get(str);
    }

    /* renamed from: p */
    public float m34416p() {
        return this.f6375k;
    }

    /* renamed from: q */
    public boolean m34415q() {
        return this.f6378n;
    }

    /* renamed from: r */
    public void m34414r(int i) {
        this.f6379o += i;
    }

    /* renamed from: s */
    public void m34413s(Rect rect, float f, float f2, float f3, List<C4730d> list, C9556e<C4730d> c9556e, Map<String, List<C4730d>> map, Map<String, C2226g> map2, C9559h<C0017d> c9559h, Map<String, C0016c> map3, List<C0021h> list2) {
        this.f6374j = rect;
        this.f6375k = f;
        this.f6376l = f2;
        this.f6377m = f3;
        this.f6373i = list;
        this.f6372h = c9556e;
        this.f6367c = map;
        this.f6368d = map2;
        this.f6371g = c9559h;
        this.f6369e = map3;
        this.f6370f = list2;
    }

    /* renamed from: t */
    public C4730d m34412t(long j) {
        return this.f6372h.m10644f(j);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (C4730d c4730d : this.f6373i) {
            sb2.append(c4730d.m26743w("\t"));
        }
        return sb2.toString();
    }

    /* renamed from: u */
    public void m34411u(boolean z) {
        this.f6378n = z;
    }

    /* renamed from: v */
    public void m34410v(boolean z) {
        this.f6365a.m34290b(z);
    }
}
