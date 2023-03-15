package p073e2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p053d2.C4710c;
import p053d2.C4720i;
import p094f2.C5335i;
import p094f2.C5343o;

/* renamed from: e2.d */
/* loaded from: classes.dex */
public class C4963d {

    /* renamed from: b */
    private int f13797b;

    /* renamed from: c */
    private boolean f13798c;

    /* renamed from: d */
    public final C4966e f13799d;

    /* renamed from: e */
    public final EnumC4965b f13800e;

    /* renamed from: f */
    public C4963d f13801f;

    /* renamed from: i */
    C4720i f13804i;

    /* renamed from: a */
    private HashSet<C4963d> f13796a = null;

    /* renamed from: g */
    public int f13802g = 0;

    /* renamed from: h */
    int f13803h = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintAnchor.java */
    /* renamed from: e2.d$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C4964a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13805a;

        static {
            int[] iArr = new int[EnumC4965b.values().length];
            f13805a = iArr;
            try {
                iArr[EnumC4965b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13805a[EnumC4965b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13805a[EnumC4965b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13805a[EnumC4965b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13805a[EnumC4965b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13805a[EnumC4965b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13805a[EnumC4965b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13805a[EnumC4965b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13805a[EnumC4965b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: ConstraintAnchor.java */
    /* renamed from: e2.d$b */
    /* loaded from: classes.dex */
    public enum EnumC4965b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C4963d(C4966e c4966e, EnumC4965b enumC4965b) {
        this.f13799d = c4966e;
        this.f13800e = enumC4965b;
    }

    /* renamed from: a */
    public boolean m26159a(C4963d c4963d, int i, int i2, boolean z) {
        if (c4963d == null) {
            m26144p();
            return true;
        } else if (z || m26145o(c4963d)) {
            this.f13801f = c4963d;
            if (c4963d.f13796a == null) {
                c4963d.f13796a = new HashSet<>();
            }
            HashSet<C4963d> hashSet = this.f13801f.f13796a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i > 0) {
                this.f13802g = i;
            } else {
                this.f13802g = 0;
            }
            this.f13803h = i2;
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public void m26158b(int i, ArrayList<C5343o> arrayList, C5343o c5343o) {
        HashSet<C4963d> hashSet = this.f13796a;
        if (hashSet != null) {
            Iterator<C4963d> it = hashSet.iterator();
            while (it.hasNext()) {
                C5335i.m24588a(it.next().f13799d, i, arrayList, c5343o);
            }
        }
    }

    /* renamed from: c */
    public HashSet<C4963d> m26157c() {
        return this.f13796a;
    }

    /* renamed from: d */
    public int m26156d() {
        if (this.f13798c) {
            return this.f13797b;
        }
        return 0;
    }

    /* renamed from: e */
    public int m26155e() {
        C4963d c4963d;
        if (this.f13799d.m26108Q() == 8) {
            return 0;
        }
        if (this.f13803h > -1 && (c4963d = this.f13801f) != null && c4963d.f13799d.m26108Q() == 8) {
            return this.f13803h;
        }
        return this.f13802g;
    }

    /* renamed from: f */
    public final C4963d m26154f() {
        switch (C4964a.f13805a[this.f13800e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f13799d.f13814H;
            case 3:
                return this.f13799d.f13812F;
            case 4:
                return this.f13799d.f13815I;
            case 5:
                return this.f13799d.f13813G;
            default:
                throw new AssertionError(this.f13800e.name());
        }
    }

    /* renamed from: g */
    public C4966e m26153g() {
        return this.f13799d;
    }

    /* renamed from: h */
    public C4720i m26152h() {
        return this.f13804i;
    }

    /* renamed from: i */
    public C4963d m26151i() {
        return this.f13801f;
    }

    /* renamed from: j */
    public EnumC4965b m26150j() {
        return this.f13800e;
    }

    /* renamed from: k */
    public boolean m26149k() {
        HashSet<C4963d> hashSet = this.f13796a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C4963d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m26154f().m26146n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public boolean m26148l() {
        HashSet<C4963d> hashSet = this.f13796a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* renamed from: m */
    public boolean m26147m() {
        return this.f13798c;
    }

    /* renamed from: n */
    public boolean m26146n() {
        return this.f13801f != null;
    }

    /* renamed from: o */
    public boolean m26145o(C4963d c4963d) {
        boolean z = false;
        if (c4963d == null) {
            return false;
        }
        EnumC4965b m26150j = c4963d.m26150j();
        EnumC4965b enumC4965b = this.f13800e;
        if (m26150j == enumC4965b) {
            return enumC4965b != EnumC4965b.BASELINE || (c4963d.m26153g().m26100U() && m26153g().m26100U());
        }
        switch (C4964a.f13805a[enumC4965b.ordinal()]) {
            case 1:
                return (m26150j == EnumC4965b.BASELINE || m26150j == EnumC4965b.CENTER_X || m26150j == EnumC4965b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = m26150j == EnumC4965b.LEFT || m26150j == EnumC4965b.RIGHT;
                if (c4963d.m26153g() instanceof C4970g) {
                    if (z2 || m26150j == EnumC4965b.CENTER_X) {
                        z = true;
                    }
                    return z;
                }
                return z2;
            case 4:
            case 5:
                boolean z3 = m26150j == EnumC4965b.TOP || m26150j == EnumC4965b.BOTTOM;
                if (c4963d.m26153g() instanceof C4970g) {
                    if (z3 || m26150j == EnumC4965b.CENTER_Y) {
                        z = true;
                    }
                    return z;
                }
                return z3;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f13800e.name());
        }
    }

    /* renamed from: p */
    public void m26144p() {
        HashSet<C4963d> hashSet;
        C4963d c4963d = this.f13801f;
        if (c4963d != null && (hashSet = c4963d.f13796a) != null) {
            hashSet.remove(this);
            if (this.f13801f.f13796a.size() == 0) {
                this.f13801f.f13796a = null;
            }
        }
        this.f13796a = null;
        this.f13801f = null;
        this.f13802g = 0;
        this.f13803h = -1;
        this.f13798c = false;
        this.f13797b = 0;
    }

    /* renamed from: q */
    public void m26143q() {
        this.f13798c = false;
        this.f13797b = 0;
    }

    /* renamed from: r */
    public void m26142r(C4710c c4710c) {
        C4720i c4720i = this.f13804i;
        if (c4720i == null) {
            this.f13804i = new C4720i(C4720i.EnumC4721a.UNRESTRICTED, null);
        } else {
            c4720i.m26816d();
        }
    }

    /* renamed from: s */
    public void m26141s(int i) {
        this.f13797b = i;
        this.f13798c = true;
    }

    public String toString() {
        return this.f13799d.m26066r() + ":" + this.f13800e.toString();
    }
}
