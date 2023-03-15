package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0928a;
import androidx.core.view.AbstractC1109b;
import androidx.core.view.C1148d0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p150i2.InterfaceMenuC5993a;

/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public class C0378e implements InterfaceMenuC5993a {

    /* renamed from: A */
    private static final int[] f1064A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f1065a;

    /* renamed from: b */
    private final Resources f1066b;

    /* renamed from: c */
    private boolean f1067c;

    /* renamed from: d */
    private boolean f1068d;

    /* renamed from: e */
    private InterfaceC0379a f1069e;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f1077m;

    /* renamed from: n */
    CharSequence f1078n;

    /* renamed from: o */
    Drawable f1079o;

    /* renamed from: p */
    View f1080p;

    /* renamed from: x */
    private C0382g f1088x;

    /* renamed from: z */
    private boolean f1090z;

    /* renamed from: l */
    private int f1076l = 0;

    /* renamed from: q */
    private boolean f1081q = false;

    /* renamed from: r */
    private boolean f1082r = false;

    /* renamed from: s */
    private boolean f1083s = false;

    /* renamed from: t */
    private boolean f1084t = false;

    /* renamed from: u */
    private boolean f1085u = false;

    /* renamed from: v */
    private ArrayList<C0382g> f1086v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<InterfaceC0387j>> f1087w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private boolean f1089y = false;

    /* renamed from: f */
    private ArrayList<C0382g> f1070f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<C0382g> f1071g = new ArrayList<>();

    /* renamed from: h */
    private boolean f1072h = true;

    /* renamed from: i */
    private ArrayList<C0382g> f1073i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0382g> f1074j = new ArrayList<>();

    /* renamed from: k */
    private boolean f1075k = true;

    /* compiled from: MenuBuilder.java */
    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0379a {
        /* renamed from: a */
        boolean mo20648a(C0378e c0378e, MenuItem menuItem);

        /* renamed from: b */
        void mo20647b(C0378e c0378e);
    }

    /* compiled from: MenuBuilder.java */
    /* renamed from: androidx.appcompat.view.menu.e$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0380b {
        /* renamed from: a */
        boolean mo40859a(C0382g c0382g);
    }

    public C0378e(Context context) {
        this.f1065a = context;
        this.f1066b = context.getResources();
        m41017f0(true);
    }

    /* renamed from: D */
    private static int m41044D(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f1064A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: P */
    private void m41036P(int i, boolean z) {
        if (i < 0 || i >= this.f1070f.size()) {
            return;
        }
        this.f1070f.remove(i);
        if (z) {
            m41039M(true);
        }
    }

    /* renamed from: a0 */
    private void m41026a0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources m41043E = m41043E();
        if (view != null) {
            this.f1080p = view;
            this.f1078n = null;
            this.f1079o = null;
        } else {
            if (i > 0) {
                this.f1078n = m41043E.getText(i);
            } else if (charSequence != null) {
                this.f1078n = charSequence;
            }
            if (i2 > 0) {
                this.f1079o = C0928a.m39111f(m41001w(), i2);
            } else if (drawable != null) {
                this.f1079o = drawable;
            }
            this.f1080p = null;
        }
        m41039M(false);
    }

    /* renamed from: f0 */
    private void m41017f0(boolean z) {
        boolean z2 = true;
        this.f1068d = (z && this.f1066b.getConfiguration().keyboard != 1 && C1148d0.m38215e(ViewConfiguration.get(this.f1065a), this.f1065a)) ? false : false;
    }

    /* renamed from: g */
    private C0382g m41016g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0382g(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: i */
    private void m41013i(boolean z) {
        if (this.f1087w.isEmpty()) {
            return;
        }
        m41014h0();
        Iterator<WeakReference<InterfaceC0387j>> it = this.f1087w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0387j> next = it.next();
            InterfaceC0387j interfaceC0387j = next.get();
            if (interfaceC0387j == null) {
                this.f1087w.remove(next);
            } else {
                interfaceC0387j.mo29475g(z);
            }
        }
        m41015g0();
    }

    /* renamed from: j */
    private void m41012j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f1087w.isEmpty()) {
            return;
        }
        Iterator<WeakReference<InterfaceC0387j>> it = this.f1087w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0387j> next = it.next();
            InterfaceC0387j interfaceC0387j = next.get();
            if (interfaceC0387j == null) {
                this.f1087w.remove(next);
            } else {
                int id2 = interfaceC0387j.getId();
                if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    interfaceC0387j.mo29477e(parcelable);
                }
            }
        }
    }

    /* renamed from: k */
    private void m41011k(Bundle bundle) {
        Parcelable mo29472j;
        if (this.f1087w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<InterfaceC0387j>> it = this.f1087w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0387j> next = it.next();
            InterfaceC0387j interfaceC0387j = next.get();
            if (interfaceC0387j == null) {
                this.f1087w.remove(next);
            } else {
                int id2 = interfaceC0387j.getId();
                if (id2 > 0 && (mo29472j = interfaceC0387j.mo29472j()) != null) {
                    sparseArray.put(id2, mo29472j);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    /* renamed from: l */
    private boolean m41010l(SubMenuC0394m subMenuC0394m, InterfaceC0387j interfaceC0387j) {
        if (this.f1087w.isEmpty()) {
            return false;
        }
        boolean mo29476f = interfaceC0387j != null ? interfaceC0387j.mo29476f(subMenuC0394m) : false;
        Iterator<WeakReference<InterfaceC0387j>> it = this.f1087w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0387j> next = it.next();
            InterfaceC0387j interfaceC0387j2 = next.get();
            if (interfaceC0387j2 == null) {
                this.f1087w.remove(next);
            } else if (!mo29476f) {
                mo29476f = interfaceC0387j2.mo29476f(subMenuC0394m);
            }
        }
        return mo29476f;
    }

    /* renamed from: p */
    private static int m41007p(ArrayList<C0382g> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m40990f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public View m41047A() {
        return this.f1080p;
    }

    /* renamed from: B */
    public ArrayList<C0382g> m41046B() {
        m41003t();
        return this.f1074j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean m41045C() {
        return this.f1084t;
    }

    /* renamed from: E */
    Resources m41043E() {
        return this.f1066b;
    }

    /* renamed from: F */
    public C0378e mo40940F() {
        return this;
    }

    /* renamed from: G */
    public ArrayList<C0382g> m41042G() {
        if (this.f1072h) {
            this.f1071g.clear();
            int size = this.f1070f.size();
            for (int i = 0; i < size; i++) {
                C0382g c0382g = this.f1070f.get(i);
                if (c0382g.isVisible()) {
                    this.f1071g.add(c0382g);
                }
            }
            this.f1072h = false;
            this.f1075k = true;
            return this.f1071g;
        }
        return this.f1071g;
    }

    /* renamed from: H */
    public boolean mo40939H() {
        return this.f1089y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo40938I() {
        return this.f1067c;
    }

    /* renamed from: J */
    public boolean mo40937J() {
        return this.f1068d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m41041K(C0382g c0382g) {
        this.f1075k = true;
        m41039M(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m41040L(C0382g c0382g) {
        this.f1072h = true;
        m41039M(true);
    }

    /* renamed from: M */
    public void m41039M(boolean z) {
        if (!this.f1081q) {
            if (z) {
                this.f1072h = true;
                this.f1075k = true;
            }
            m41013i(z);
            return;
        }
        this.f1082r = true;
        if (z) {
            this.f1083s = true;
        }
    }

    /* renamed from: N */
    public boolean m41038N(MenuItem menuItem, int i) {
        return m41037O(menuItem, null, i);
    }

    /* renamed from: O */
    public boolean m41037O(MenuItem menuItem, InterfaceC0387j interfaceC0387j, int i) {
        C0382g c0382g = (C0382g) menuItem;
        if (c0382g == null || !c0382g.isEnabled()) {
            return false;
        }
        boolean m40985k = c0382g.m40985k();
        AbstractC1109b mo19732b = c0382g.mo19732b();
        boolean z = mo19732b != null && mo19732b.mo19721a();
        if (c0382g.m40986j()) {
            m40985k |= c0382g.expandActionView();
            if (m40985k) {
                m41019e(true);
            }
        } else if (c0382g.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m41019e(false);
            }
            if (!c0382g.hasSubMenu()) {
                c0382g.m40972x(new SubMenuC0394m(m41001w(), this, c0382g));
            }
            SubMenuC0394m subMenuC0394m = (SubMenuC0394m) c0382g.getSubMenu();
            if (z) {
                mo19732b.mo19718f(subMenuC0394m);
            }
            m40985k |= m41010l(subMenuC0394m, interfaceC0387j);
            if (!m40985k) {
                m41019e(true);
            }
        } else if ((i & 1) == 0) {
            m41019e(true);
        }
        return m40985k;
    }

    /* renamed from: Q */
    public void m41035Q(InterfaceC0387j interfaceC0387j) {
        Iterator<WeakReference<InterfaceC0387j>> it = this.f1087w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0387j> next = it.next();
            InterfaceC0387j interfaceC0387j2 = next.get();
            if (interfaceC0387j2 == null || interfaceC0387j2 == interfaceC0387j) {
                this.f1087w.remove(next);
            }
        }
    }

    /* renamed from: R */
    public void m41034R(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo40931v());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0394m) item.getSubMenu()).m41034R(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* renamed from: S */
    public void m41033S(Bundle bundle) {
        m41012j(bundle);
    }

    /* renamed from: T */
    public void m41032T(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0394m) item.getSubMenu()).m41032T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo40931v(), sparseArray);
        }
    }

    /* renamed from: U */
    public void m41031U(Bundle bundle) {
        m41011k(bundle);
    }

    /* renamed from: V */
    public void mo40936V(InterfaceC0379a interfaceC0379a) {
        this.f1069e = interfaceC0379a;
    }

    /* renamed from: W */
    public C0378e m41030W(int i) {
        this.f1076l = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m41029X(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1070f.size();
        m41014h0();
        for (int i = 0; i < size; i++) {
            C0382g c0382g = this.f1070f.get(i);
            if (c0382g.getGroupId() == groupId && c0382g.m40983m() && c0382g.isCheckable()) {
                c0382g.m40977s(c0382g == menuItem);
            }
        }
        m41015g0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y */
    public C0378e m41028Y(int i) {
        m41026a0(0, null, i, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Z */
    public C0378e m41027Z(Drawable drawable) {
        m41026a0(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo29428a(int i, int i2, int i3, CharSequence charSequence) {
        int m41044D = m41044D(i3);
        C0382g m41016g = m41016g(i, i2, i3, m41044D, charSequence, this.f1076l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1077m;
        if (contextMenuInfo != null) {
            m41016g.m40974v(contextMenuInfo);
        }
        ArrayList<C0382g> arrayList = this.f1070f;
        arrayList.add(m41007p(arrayList, m41044D), m41016g);
        m41039M(true);
        return m41016g;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo29428a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1065a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m41025b(InterfaceC0387j interfaceC0387j) {
        m41023c(interfaceC0387j, this.f1065a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b0 */
    public C0378e m41024b0(int i) {
        m41026a0(i, null, 0, null, null);
        return this;
    }

    /* renamed from: c */
    public void m41023c(InterfaceC0387j interfaceC0387j, Context context) {
        this.f1087w.add(new WeakReference<>(interfaceC0387j));
        interfaceC0387j.mo29478d(context, this);
        this.f1075k = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c0 */
    public C0378e m41022c0(CharSequence charSequence) {
        m41026a0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        C0382g c0382g = this.f1088x;
        if (c0382g != null) {
            mo40935f(c0382g);
        }
        this.f1070f.clear();
        m41039M(true);
    }

    public void clearHeader() {
        this.f1079o = null;
        this.f1078n = null;
        this.f1080p = null;
        m41039M(false);
    }

    @Override // android.view.Menu
    public void close() {
        m41019e(true);
    }

    /* renamed from: d */
    public void m41021d() {
        InterfaceC0379a interfaceC0379a = this.f1069e;
        if (interfaceC0379a != null) {
            interfaceC0379a.mo20647b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d0 */
    public C0378e m41020d0(View view) {
        m41026a0(0, null, 0, null, view);
        return this;
    }

    /* renamed from: e */
    public final void m41019e(boolean z) {
        if (this.f1085u) {
            return;
        }
        this.f1085u = true;
        Iterator<WeakReference<InterfaceC0387j>> it = this.f1087w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0387j> next = it.next();
            InterfaceC0387j interfaceC0387j = next.get();
            if (interfaceC0387j == null) {
                this.f1087w.remove(next);
            } else {
                interfaceC0387j.mo29480b(this, z);
            }
        }
        this.f1085u = false;
    }

    /* renamed from: e0 */
    public void m41018e0(boolean z) {
        this.f1090z = z;
    }

    /* renamed from: f */
    public boolean mo40935f(C0382g c0382g) {
        boolean z = false;
        if (!this.f1087w.isEmpty() && this.f1088x == c0382g) {
            m41014h0();
            Iterator<WeakReference<InterfaceC0387j>> it = this.f1087w.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0387j> next = it.next();
                InterfaceC0387j interfaceC0387j = next.get();
                if (interfaceC0387j == null) {
                    this.f1087w.remove(next);
                } else {
                    z = interfaceC0387j.mo29471k(this, c0382g);
                    if (z) {
                        break;
                    }
                }
            }
            m41015g0();
            if (z) {
                this.f1088x = null;
            }
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0382g c0382g = this.f1070f.get(i2);
            if (c0382g.getItemId() == i) {
                return c0382g;
            }
            if (c0382g.hasSubMenu() && (findItem = c0382g.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g0 */
    public void m41015g0() {
        this.f1081q = false;
        if (this.f1082r) {
            this.f1082r = false;
            m41039M(this.f1083s);
        }
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f1070f.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo40934h(C0378e c0378e, MenuItem menuItem) {
        InterfaceC0379a interfaceC0379a = this.f1069e;
        return interfaceC0379a != null && interfaceC0379a.mo20648a(c0378e, menuItem);
    }

    /* renamed from: h0 */
    public void m41014h0() {
        if (this.f1081q) {
            return;
        }
        this.f1081q = true;
        this.f1082r = false;
        this.f1083s = false;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1090z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1070f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m41005r(i, keyEvent) != null;
    }

    /* renamed from: m */
    public boolean mo40932m(C0382g c0382g) {
        boolean z = false;
        if (this.f1087w.isEmpty()) {
            return false;
        }
        m41014h0();
        Iterator<WeakReference<InterfaceC0387j>> it = this.f1087w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0387j> next = it.next();
            InterfaceC0387j interfaceC0387j = next.get();
            if (interfaceC0387j == null) {
                this.f1087w.remove(next);
            } else {
                z = interfaceC0387j.mo29470l(this, c0382g);
                if (z) {
                    break;
                }
            }
        }
        m41015g0();
        if (z) {
            this.f1088x = c0382g;
        }
        return z;
    }

    /* renamed from: n */
    public int m41009n(int i) {
        return m41008o(i, 0);
    }

    /* renamed from: o */
    public int m41008o(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f1070f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m41038N(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0382g m41005r = m41005r(i, keyEvent);
        boolean m41038N = m41005r != null ? m41038N(m41005r, i2) : false;
        if ((i2 & 2) != 0) {
            m41019e(true);
        }
        return m41038N;
    }

    /* renamed from: q */
    public int m41006q(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1070f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: r */
    C0382g m41005r(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<C0382g> arrayList = this.f1086v;
        arrayList.clear();
        m41004s(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo40938I = mo40938I();
        for (int i2 = 0; i2 < size; i2++) {
            C0382g c0382g = arrayList.get(i2);
            if (mo40938I) {
                numericShortcut = c0382g.getAlphabeticShortcut();
            } else {
                numericShortcut = c0382g.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (mo40938I && numericShortcut == '\b' && i == 67))) {
                return c0382g;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int m41009n = m41009n(i);
        if (m41009n >= 0) {
            int size = this.f1070f.size() - m41009n;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f1070f.get(m41009n).getGroupId() != i) {
                    break;
                }
                m41036P(m41009n, false);
                i2 = i3;
            }
            m41039M(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m41036P(m41006q(i), true);
    }

    /* renamed from: s */
    void m41004s(List<C0382g> list, int i, KeyEvent keyEvent) {
        boolean mo40938I = mo40938I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1070f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0382g c0382g = this.f1070f.get(i2);
                if (c0382g.hasSubMenu()) {
                    ((C0378e) c0382g.getSubMenu()).m41004s(list, i, keyEvent);
                }
                char alphabeticShortcut = mo40938I ? c0382g.getAlphabeticShortcut() : c0382g.getNumericShortcut();
                if (((modifiers & 69647) == ((mo40938I ? c0382g.getAlphabeticModifiers() : c0382g.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (mo40938I && alphabeticShortcut == '\b' && i == 67)) && c0382g.isEnabled()) {
                        list.add(c0382g);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1070f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0382g c0382g = this.f1070f.get(i2);
            if (c0382g.getGroupId() == i) {
                c0382g.m40976t(z2);
                c0382g.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1089y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1070f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0382g c0382g = this.f1070f.get(i2);
            if (c0382g.getGroupId() == i) {
                c0382g.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f1070f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0382g c0382g = this.f1070f.get(i2);
            if (c0382g.getGroupId() == i && c0382g.m40971y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            m41039M(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1067c = z;
        m41039M(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1070f.size();
    }

    /* renamed from: t */
    public void m41003t() {
        ArrayList<C0382g> m41042G = m41042G();
        if (this.f1075k) {
            Iterator<WeakReference<InterfaceC0387j>> it = this.f1087w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0387j> next = it.next();
                InterfaceC0387j interfaceC0387j = next.get();
                if (interfaceC0387j == null) {
                    this.f1087w.remove(next);
                } else {
                    z |= interfaceC0387j.mo29473i();
                }
            }
            if (z) {
                this.f1073i.clear();
                this.f1074j.clear();
                int size = m41042G.size();
                for (int i = 0; i < size; i++) {
                    C0382g c0382g = m41042G.get(i);
                    if (c0382g.m40984l()) {
                        this.f1073i.add(c0382g);
                    } else {
                        this.f1074j.add(c0382g);
                    }
                }
            } else {
                this.f1073i.clear();
                this.f1074j.clear();
                this.f1074j.addAll(m41042G());
            }
            this.f1075k = false;
        }
    }

    /* renamed from: u */
    public ArrayList<C0382g> m41002u() {
        m41003t();
        return this.f1073i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public String mo40931v() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: w */
    public Context m41001w() {
        return this.f1065a;
    }

    /* renamed from: x */
    public C0382g m41000x() {
        return this.f1088x;
    }

    /* renamed from: y */
    public Drawable m40999y() {
        return this.f1079o;
    }

    /* renamed from: z */
    public CharSequence m40998z() {
        return this.f1078n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return mo29428a(0, 0, 0, this.f1066b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1066b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo29428a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0382g c0382g = (C0382g) mo29428a(i, i2, i3, charSequence);
        SubMenuC0394m subMenuC0394m = new SubMenuC0394m(this.f1065a, this, c0382g);
        c0382g.m40972x(subMenuC0394m);
        return subMenuC0394m;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo29428a(i, i2, i3, this.f1066b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1066b.getString(i4));
    }
}
