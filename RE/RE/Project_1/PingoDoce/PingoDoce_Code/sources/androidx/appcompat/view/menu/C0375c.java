package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC0387j;
import androidx.appcompat.view.menu.InterfaceC0389k;
import java.util.ArrayList;
import p070e.C4903g;

/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
public class C0375c implements InterfaceC0387j, AdapterView.OnItemClickListener {

    /* renamed from: A */
    int f1046A;

    /* renamed from: B */
    int f1047B;

    /* renamed from: C */
    int f1048C;

    /* renamed from: D */
    private InterfaceC0387j.InterfaceC0388a f1049D;

    /* renamed from: E */
    C0376a f1050E;

    /* renamed from: F */
    private int f1051F;

    /* renamed from: w */
    Context f1052w;

    /* renamed from: x */
    LayoutInflater f1053x;

    /* renamed from: y */
    C0378e f1054y;

    /* renamed from: z */
    ExpandedMenuView f1055z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListMenuPresenter.java */
    /* renamed from: androidx.appcompat.view.menu.c$a */
    /* loaded from: classes.dex */
    public class C0376a extends BaseAdapter {

        /* renamed from: w */
        private int f1056w = -1;

        public C0376a() {
            m41053a();
        }

        /* renamed from: a */
        void m41053a() {
            C0382g m41000x = C0375c.this.f1054y.m41000x();
            if (m41000x != null) {
                ArrayList<C0382g> m41046B = C0375c.this.f1054y.m41046B();
                int size = m41046B.size();
                for (int i = 0; i < size; i++) {
                    if (m41046B.get(i) == m41000x) {
                        this.f1056w = i;
                        return;
                    }
                }
            }
            this.f1056w = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public C0382g getItem(int i) {
            ArrayList<C0382g> m41046B = C0375c.this.f1054y.m41046B();
            int i2 = i + C0375c.this.f1046A;
            int i3 = this.f1056w;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return m41046B.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0375c.this.f1054y.m41046B().size() - C0375c.this.f1046A;
            return this.f1056w < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0375c c0375c = C0375c.this;
                view = c0375c.f1053x.inflate(c0375c.f1048C, viewGroup, false);
            }
            ((InterfaceC0389k.InterfaceC0390a) view).mo29452e(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m41053a();
            super.notifyDataSetChanged();
        }
    }

    public C0375c(Context context, int i) {
        this(i, 0);
        this.f1052w = context;
        this.f1053x = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter m41057a() {
        if (this.f1050E == null) {
            this.f1050E = new C0376a();
        }
        return this.f1050E;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: b */
    public void mo29480b(C0378e c0378e, boolean z) {
        InterfaceC0387j.InterfaceC0388a interfaceC0388a = this.f1049D;
        if (interfaceC0388a != null) {
            interfaceC0388a.mo40856b(c0378e, z);
        }
    }

    /* renamed from: c */
    public InterfaceC0389k m41056c(ViewGroup viewGroup) {
        if (this.f1055z == null) {
            this.f1055z = (ExpandedMenuView) this.f1053x.inflate(C4903g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1050E == null) {
                this.f1050E = new C0376a();
            }
            this.f1055z.setAdapter((ListAdapter) this.f1050E);
            this.f1055z.setOnItemClickListener(this);
        }
        return this.f1055z;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: d */
    public void mo29478d(Context context, C0378e c0378e) {
        if (this.f1047B != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1047B);
            this.f1052w = contextThemeWrapper;
            this.f1053x = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1052w != null) {
            this.f1052w = context;
            if (this.f1053x == null) {
                this.f1053x = LayoutInflater.from(context);
            }
        }
        this.f1054y = c0378e;
        C0376a c0376a = this.f1050E;
        if (c0376a != null) {
            c0376a.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: e */
    public void mo29477e(Parcelable parcelable) {
        m41055h((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: f */
    public boolean mo29476f(SubMenuC0394m subMenuC0394m) {
        if (subMenuC0394m.hasVisibleItems()) {
            new DialogInterface$OnKeyListenerC0381f(subMenuC0394m).m40996d(null);
            InterfaceC0387j.InterfaceC0388a interfaceC0388a = this.f1049D;
            if (interfaceC0388a != null) {
                interfaceC0388a.mo40855c(subMenuC0394m);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: g */
    public void mo29475g(boolean z) {
        C0376a c0376a = this.f1050E;
        if (c0376a != null) {
            c0376a.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    public int getId() {
        return this.f1051F;
    }

    /* renamed from: h */
    public void m41055h(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1055z.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: i */
    public boolean mo29473i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: j */
    public Parcelable mo29472j() {
        if (this.f1055z == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m41054n(bundle);
        return bundle;
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
        this.f1049D = interfaceC0388a;
    }

    /* renamed from: n */
    public void m41054n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f1055z;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1054y.m41037O(this.f1050E.getItem(i), this, 0);
    }

    public C0375c(int i, int i2) {
        this.f1048C = i;
        this.f1047B = i2;
    }
}
