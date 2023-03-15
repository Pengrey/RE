package androidx.appcompat.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.k0 */
/* loaded from: classes.dex */
public class C0497k0 {

    /* renamed from: a */
    private int f1649a = 0;

    /* renamed from: b */
    private int f1650b = 0;

    /* renamed from: c */
    private int f1651c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1652d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1653e = 0;

    /* renamed from: f */
    private int f1654f = 0;

    /* renamed from: g */
    private boolean f1655g = false;

    /* renamed from: h */
    private boolean f1656h = false;

    /* renamed from: a */
    public int m40539a() {
        return this.f1655g ? this.f1649a : this.f1650b;
    }

    /* renamed from: b */
    public int m40538b() {
        return this.f1649a;
    }

    /* renamed from: c */
    public int m40537c() {
        return this.f1650b;
    }

    /* renamed from: d */
    public int m40536d() {
        return this.f1655g ? this.f1650b : this.f1649a;
    }

    /* renamed from: e */
    public void m40535e(int i, int i2) {
        this.f1656h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1653e = i;
            this.f1649a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1654f = i2;
            this.f1650b = i2;
        }
    }

    /* renamed from: f */
    public void m40534f(boolean z) {
        if (z == this.f1655g) {
            return;
        }
        this.f1655g = z;
        if (!this.f1656h) {
            this.f1649a = this.f1653e;
            this.f1650b = this.f1654f;
        } else if (z) {
            int i = this.f1652d;
            if (i == Integer.MIN_VALUE) {
                i = this.f1653e;
            }
            this.f1649a = i;
            int i2 = this.f1651c;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f1654f;
            }
            this.f1650b = i2;
        } else {
            int i3 = this.f1651c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.f1653e;
            }
            this.f1649a = i3;
            int i4 = this.f1652d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f1654f;
            }
            this.f1650b = i4;
        }
    }

    /* renamed from: g */
    public void m40533g(int i, int i2) {
        this.f1651c = i;
        this.f1652d = i2;
        this.f1656h = true;
        if (this.f1655g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1649a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1650b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1649a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1650b = i2;
        }
    }
}
