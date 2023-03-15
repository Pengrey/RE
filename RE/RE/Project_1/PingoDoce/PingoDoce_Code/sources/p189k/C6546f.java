package p189k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p150i2.InterfaceMenuC5993a;
import p150i2.InterfaceMenuItemC5994b;
import p189k.AbstractC6541b;
import p209l.MenuC6953d;
import p209l.MenuItemC6947c;
import p301q.C9558g;

/* renamed from: k.f */
/* loaded from: classes.dex */
public class C6546f extends ActionMode {

    /* renamed from: a */
    final Context f17725a;

    /* renamed from: b */
    final AbstractC6541b f17726b;

    /* compiled from: SupportActionModeWrapper.java */
    /* renamed from: k.f$a */
    /* loaded from: classes.dex */
    public static class C6547a implements AbstractC6541b.InterfaceC6542a {

        /* renamed from: a */
        final ActionMode.Callback f17727a;

        /* renamed from: b */
        final Context f17728b;

        /* renamed from: c */
        final ArrayList<C6546f> f17729c = new ArrayList<>();

        /* renamed from: d */
        final C9558g<Menu, Menu> f17730d = new C9558g<>();

        public C6547a(Context context, ActionMode.Callback callback) {
            this.f17728b = context;
            this.f17727a = callback;
        }

        /* renamed from: f */
        private Menu m20627f(Menu menu) {
            Menu menu2 = this.f17730d.get(menu);
            if (menu2 == null) {
                MenuC6953d menuC6953d = new MenuC6953d(this.f17728b, (InterfaceMenuC5993a) menu);
                this.f17730d.put(menu, menuC6953d);
                return menuC6953d;
            }
            return menu2;
        }

        @Override // p189k.AbstractC6541b.InterfaceC6542a
        /* renamed from: a */
        public boolean mo20632a(AbstractC6541b abstractC6541b, MenuItem menuItem) {
            return this.f17727a.onActionItemClicked(m20628e(abstractC6541b), new MenuItemC6947c(this.f17728b, (InterfaceMenuItemC5994b) menuItem));
        }

        @Override // p189k.AbstractC6541b.InterfaceC6542a
        /* renamed from: b */
        public boolean mo20631b(AbstractC6541b abstractC6541b, Menu menu) {
            return this.f17727a.onCreateActionMode(m20628e(abstractC6541b), m20627f(menu));
        }

        @Override // p189k.AbstractC6541b.InterfaceC6542a
        /* renamed from: c */
        public boolean mo20630c(AbstractC6541b abstractC6541b, Menu menu) {
            return this.f17727a.onPrepareActionMode(m20628e(abstractC6541b), m20627f(menu));
        }

        @Override // p189k.AbstractC6541b.InterfaceC6542a
        /* renamed from: d */
        public void mo20629d(AbstractC6541b abstractC6541b) {
            this.f17727a.onDestroyActionMode(m20628e(abstractC6541b));
        }

        /* renamed from: e */
        public ActionMode m20628e(AbstractC6541b abstractC6541b) {
            int size = this.f17729c.size();
            for (int i = 0; i < size; i++) {
                C6546f c6546f = this.f17729c.get(i);
                if (c6546f != null && c6546f.f17726b == abstractC6541b) {
                    return c6546f;
                }
            }
            C6546f c6546f2 = new C6546f(this.f17728b, abstractC6541b);
            this.f17729c.add(c6546f2);
            return c6546f2;
        }
    }

    public C6546f(Context context, AbstractC6541b abstractC6541b) {
        this.f17725a = context;
        this.f17726b = abstractC6541b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f17726b.mo20646c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f17726b.mo20645d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC6953d(this.f17725a, (InterfaceMenuC5993a) this.f17726b.mo20644e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f17726b.mo20643f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f17726b.mo20642g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f17726b.m20656h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f17726b.mo20641i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f17726b.m20655j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f17726b.mo20640k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f17726b.mo20639l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f17726b.mo20638m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f17726b.mo20636o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f17726b.m20654p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f17726b.mo20634r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f17726b.mo20633s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f17726b.mo20637n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f17726b.mo20635q(i);
    }
}
