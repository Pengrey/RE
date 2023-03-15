package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC0387j;
import androidx.appcompat.view.menu.InterfaceC0389k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public abstract class AbstractC0368a implements InterfaceC0387j {

    /* renamed from: A */
    private InterfaceC0387j.InterfaceC0388a f1000A;

    /* renamed from: B */
    private int f1001B;

    /* renamed from: C */
    private int f1002C;

    /* renamed from: D */
    protected InterfaceC0389k f1003D;

    /* renamed from: E */
    private int f1004E;

    /* renamed from: w */
    protected Context f1005w;

    /* renamed from: x */
    protected Context f1006x;

    /* renamed from: y */
    protected C0378e f1007y;

    /* renamed from: z */
    protected LayoutInflater f1008z;

    public AbstractC0368a(Context context, int i, int i2) {
        this.f1005w = context;
        this.f1008z = LayoutInflater.from(context);
        this.f1001B = i;
        this.f1002C = i2;
    }

    /* renamed from: a */
    protected void m41069a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1003D).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: b */
    public void mo29480b(C0378e c0378e, boolean z) {
        InterfaceC0387j.InterfaceC0388a interfaceC0388a = this.f1000A;
        if (interfaceC0388a != null) {
            interfaceC0388a.mo40856b(c0378e, z);
        }
    }

    /* renamed from: c */
    public abstract void mo40890c(C0382g c0382g, InterfaceC0389k.InterfaceC0390a interfaceC0390a);

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: d */
    public void mo29478d(Context context, C0378e c0378e) {
        this.f1006x = context;
        LayoutInflater.from(context);
        this.f1007y = c0378e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: f */
    public boolean mo29476f(SubMenuC0394m subMenuC0394m) {
        InterfaceC0387j.InterfaceC0388a interfaceC0388a = this.f1000A;
        SubMenuC0394m subMenuC0394m2 = subMenuC0394m;
        if (interfaceC0388a != null) {
            if (subMenuC0394m == null) {
                subMenuC0394m2 = this.f1007y;
            }
            return interfaceC0388a.mo40855c(subMenuC0394m2);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: g */
    public void mo29475g(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f1003D;
        if (viewGroup == null) {
            return;
        }
        C0378e c0378e = this.f1007y;
        int i = 0;
        if (c0378e != null) {
            c0378e.m41003t();
            ArrayList<C0382g> m41042G = this.f1007y.m41042G();
            int size = m41042G.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C0382g c0382g = m41042G.get(i3);
                if (mo40886s(i2, c0382g)) {
                    View childAt = viewGroup.getChildAt(i2);
                    C0382g itemData = childAt instanceof InterfaceC0389k.InterfaceC0390a ? ((InterfaceC0389k.InterfaceC0390a) childAt).getItemData() : null;
                    View mo40888p = mo40888p(c0382g, childAt, viewGroup);
                    if (c0382g != itemData) {
                        mo40888p.setPressed(false);
                        mo40888p.jumpDrawablesToCurrentState();
                    }
                    if (mo40888p != childAt) {
                        m41069a(mo40888p, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo40889n(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    public int getId() {
        return this.f1004E;
    }

    /* renamed from: h */
    public InterfaceC0389k.InterfaceC0390a m41068h(ViewGroup viewGroup) {
        return (InterfaceC0389k.InterfaceC0390a) this.f1008z.inflate(this.f1002C, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: k */
    public boolean mo29471k(C0378e c0378e, C0382g c0382g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: l */
    public boolean mo29470l(C0378e c0378e, C0382g c0382g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: m */
    public void mo40949m(InterfaceC0387j.InterfaceC0388a interfaceC0388a) {
        this.f1000A = interfaceC0388a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo40889n(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: o */
    public InterfaceC0387j.InterfaceC0388a m41067o() {
        return this.f1000A;
    }

    /* renamed from: p */
    public View mo40888p(C0382g c0382g, View view, ViewGroup viewGroup) {
        InterfaceC0389k.InterfaceC0390a m41068h;
        if (view instanceof InterfaceC0389k.InterfaceC0390a) {
            m41068h = (InterfaceC0389k.InterfaceC0390a) view;
        } else {
            m41068h = m41068h(viewGroup);
        }
        mo40890c(c0382g, m41068h);
        return (View) m41068h;
    }

    /* renamed from: q */
    public InterfaceC0389k mo40887q(ViewGroup viewGroup) {
        if (this.f1003D == null) {
            InterfaceC0389k interfaceC0389k = (InterfaceC0389k) this.f1008z.inflate(this.f1001B, viewGroup, false);
            this.f1003D = interfaceC0389k;
            interfaceC0389k.mo29426b(this.f1007y);
            mo29475g(true);
        }
        return this.f1003D;
    }

    /* renamed from: r */
    public void m41066r(int i) {
        this.f1004E = i;
    }

    /* renamed from: s */
    public abstract boolean mo40886s(int i, C0382g c0382g);
}
