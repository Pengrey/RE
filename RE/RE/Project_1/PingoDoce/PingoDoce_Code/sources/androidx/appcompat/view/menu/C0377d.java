package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC0389k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
public class C0377d extends BaseAdapter {

    /* renamed from: A */
    private final LayoutInflater f1058A;

    /* renamed from: B */
    private final int f1059B;

    /* renamed from: w */
    C0378e f1060w;

    /* renamed from: x */
    private int f1061x = -1;

    /* renamed from: y */
    private boolean f1062y;

    /* renamed from: z */
    private final boolean f1063z;

    public C0377d(C0378e c0378e, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1063z = z;
        this.f1058A = layoutInflater;
        this.f1060w = c0378e;
        this.f1059B = i;
        m41051a();
    }

    /* renamed from: a */
    void m41051a() {
        C0382g m41000x = this.f1060w.m41000x();
        if (m41000x != null) {
            ArrayList<C0382g> m41046B = this.f1060w.m41046B();
            int size = m41046B.size();
            for (int i = 0; i < size; i++) {
                if (m41046B.get(i) == m41000x) {
                    this.f1061x = i;
                    return;
                }
            }
        }
        this.f1061x = -1;
    }

    /* renamed from: b */
    public C0378e m41050b() {
        return this.f1060w;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public C0382g getItem(int i) {
        ArrayList<C0382g> m41046B = this.f1063z ? this.f1060w.m41046B() : this.f1060w.m41042G();
        int i2 = this.f1061x;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return m41046B.get(i);
    }

    /* renamed from: d */
    public void m41048d(boolean z) {
        this.f1062y = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C0382g> m41046B = this.f1063z ? this.f1060w.m41046B() : this.f1060w.m41042G();
        if (this.f1061x < 0) {
            return m41046B.size();
        }
        return m41046B.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1058A.inflate(this.f1059B, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1060w.mo40939H() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        InterfaceC0389k.InterfaceC0390a interfaceC0390a = (InterfaceC0389k.InterfaceC0390a) view;
        if (this.f1062y) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0390a.mo29452e(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m41051a();
        super.notifyDataSetChanged();
    }
}
