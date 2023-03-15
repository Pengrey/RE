package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
public class C1586e implements InterfaceC1639r {

    /* renamed from: a */
    final InterfaceC1639r f4787a;

    /* renamed from: b */
    int f4788b = 0;

    /* renamed from: c */
    int f4789c = -1;

    /* renamed from: d */
    int f4790d = -1;

    /* renamed from: e */
    Object f4791e = null;

    public C1586e(InterfaceC1639r interfaceC1639r) {
        this.f4787a = interfaceC1639r;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1639r
    /* renamed from: a */
    public void mo35898a(int i, int i2) {
        int i3;
        if (this.f4788b == 2 && (i3 = this.f4789c) >= i && i3 <= i + i2) {
            this.f4790d += i2;
            this.f4789c = i;
            return;
        }
        m36109e();
        this.f4789c = i;
        this.f4790d = i2;
        this.f4788b = 2;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1639r
    /* renamed from: b */
    public void mo35897b(int i, int i2) {
        m36109e();
        this.f4787a.mo35897b(i, i2);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1639r
    /* renamed from: c */
    public void mo35896c(int i, int i2) {
        int i3;
        if (this.f4788b == 1 && i >= (i3 = this.f4789c)) {
            int i4 = this.f4790d;
            if (i <= i3 + i4) {
                this.f4790d = i4 + i2;
                this.f4789c = Math.min(i, i3);
                return;
            }
        }
        m36109e();
        this.f4789c = i;
        this.f4790d = i2;
        this.f4788b = 1;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1639r
    /* renamed from: d */
    public void mo35895d(int i, int i2, Object obj) {
        int i3;
        if (this.f4788b == 3) {
            int i4 = this.f4789c;
            int i5 = this.f4790d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f4791e == obj) {
                this.f4789c = Math.min(i, i4);
                this.f4790d = Math.max(i5 + i4, i3) - this.f4789c;
                return;
            }
        }
        m36109e();
        this.f4789c = i;
        this.f4790d = i2;
        this.f4791e = obj;
        this.f4788b = 3;
    }

    /* renamed from: e */
    public void m36109e() {
        int i = this.f4788b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f4787a.mo35896c(this.f4789c, this.f4790d);
        } else if (i == 2) {
            this.f4787a.mo35898a(this.f4789c, this.f4790d);
        } else if (i == 3) {
            this.f4787a.mo35895d(this.f4789c, this.f4790d, this.f4791e);
        }
        this.f4791e = null;
        this.f4788b = 0;
    }
}
