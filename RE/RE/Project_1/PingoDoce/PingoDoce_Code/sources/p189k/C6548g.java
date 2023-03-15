package p189k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0382g;
import androidx.appcompat.widget.C0456b0;
import androidx.appcompat.widget.C0520s0;
import androidx.core.view.AbstractC1109b;
import androidx.core.view.C1175k;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p070e.C4906j;
import p150i2.InterfaceMenuC5993a;
import p209l.MenuItemC6947c;

/* renamed from: k.g */
/* loaded from: classes.dex */
public class C6548g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f17731e;

    /* renamed from: f */
    static final Class<?>[] f17732f;

    /* renamed from: a */
    final Object[] f17733a;

    /* renamed from: b */
    final Object[] f17734b;

    /* renamed from: c */
    Context f17735c;

    /* renamed from: d */
    private Object f17736d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SupportMenuInflater.java */
    /* renamed from: k.g$a */
    /* loaded from: classes.dex */
    public static class MenuItem$OnMenuItemClickListenerC6549a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f17737c = {MenuItem.class};

        /* renamed from: a */
        private Object f17738a;

        /* renamed from: b */
        private Method f17739b;

        public MenuItem$OnMenuItemClickListenerC6549a(Object obj, String str) {
            this.f17738a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f17739b = cls.getMethod(str, f17737c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f17739b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f17739b.invoke(this.f17738a, menuItem)).booleanValue();
                }
                this.f17739b.invoke(this.f17738a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SupportMenuInflater.java */
    /* renamed from: k.g$b */
    /* loaded from: classes.dex */
    public class C6550b {

        /* renamed from: A */
        AbstractC1109b f17740A;

        /* renamed from: B */
        private CharSequence f17741B;

        /* renamed from: C */
        private CharSequence f17742C;

        /* renamed from: D */
        private ColorStateList f17743D = null;

        /* renamed from: E */
        private PorterDuff.Mode f17744E = null;

        /* renamed from: a */
        private Menu f17746a;

        /* renamed from: b */
        private int f17747b;

        /* renamed from: c */
        private int f17748c;

        /* renamed from: d */
        private int f17749d;

        /* renamed from: e */
        private int f17750e;

        /* renamed from: f */
        private boolean f17751f;

        /* renamed from: g */
        private boolean f17752g;

        /* renamed from: h */
        private boolean f17753h;

        /* renamed from: i */
        private int f17754i;

        /* renamed from: j */
        private int f17755j;

        /* renamed from: k */
        private CharSequence f17756k;

        /* renamed from: l */
        private CharSequence f17757l;

        /* renamed from: m */
        private int f17758m;

        /* renamed from: n */
        private char f17759n;

        /* renamed from: o */
        private int f17760o;

        /* renamed from: p */
        private char f17761p;

        /* renamed from: q */
        private int f17762q;

        /* renamed from: r */
        private int f17763r;

        /* renamed from: s */
        private boolean f17764s;

        /* renamed from: t */
        private boolean f17765t;

        /* renamed from: u */
        private boolean f17766u;

        /* renamed from: v */
        private int f17767v;

        /* renamed from: w */
        private int f17768w;

        /* renamed from: x */
        private String f17769x;

        /* renamed from: y */
        private String f17770y;

        /* renamed from: z */
        private String f17771z;

        public C6550b(Menu menu) {
            this.f17746a = menu;
            m20616h();
        }

        /* renamed from: c */
        private char m20621c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m20619e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C6548g.this.f17735c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: i */
        private void m20615i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f17764s).setVisible(this.f17765t).setEnabled(this.f17766u).setCheckable(this.f17763r >= 1).setTitleCondensed(this.f17757l).setIcon(this.f17758m);
            int i = this.f17767v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f17771z != null) {
                if (!C6548g.this.f17735c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC6549a(C6548g.this.m20625b(), this.f17771z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f17763r >= 2) {
                if (menuItem instanceof C0382g) {
                    ((C0382g) menuItem).m40976t(true);
                } else if (menuItem instanceof MenuItemC6947c) {
                    ((MenuItemC6947c) menuItem).m19722h(true);
                }
            }
            String str = this.f17769x;
            if (str != null) {
                menuItem.setActionView((View) m20619e(str, C6548g.f17731e, C6548g.this.f17733a));
                z = true;
            }
            int i2 = this.f17768w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractC1109b abstractC1109b = this.f17740A;
            if (abstractC1109b != null) {
                C1175k.m38142a(menuItem, abstractC1109b);
            }
            C1175k.m38140c(menuItem, this.f17741B);
            C1175k.m38136g(menuItem, this.f17742C);
            C1175k.m38141b(menuItem, this.f17759n, this.f17760o);
            C1175k.m38137f(menuItem, this.f17761p, this.f17762q);
            PorterDuff.Mode mode = this.f17744E;
            if (mode != null) {
                C1175k.m38138e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f17743D;
            if (colorStateList != null) {
                C1175k.m38139d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void m20623a() {
            this.f17753h = true;
            m20615i(this.f17746a.add(this.f17747b, this.f17754i, this.f17755j, this.f17756k));
        }

        /* renamed from: b */
        public SubMenu m20622b() {
            this.f17753h = true;
            SubMenu addSubMenu = this.f17746a.addSubMenu(this.f17747b, this.f17754i, this.f17755j, this.f17756k);
            m20615i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean m20620d() {
            return this.f17753h;
        }

        /* renamed from: f */
        public void m20618f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C6548g.this.f17735c.obtainStyledAttributes(attributeSet, C4906j.f13508d1);
            this.f17747b = obtainStyledAttributes.getResourceId(C4906j.f13518f1, 0);
            this.f17748c = obtainStyledAttributes.getInt(C4906j.f13528h1, 0);
            this.f17749d = obtainStyledAttributes.getInt(C4906j.f13533i1, 0);
            this.f17750e = obtainStyledAttributes.getInt(C4906j.f13538j1, 0);
            this.f17751f = obtainStyledAttributes.getBoolean(C4906j.f13523g1, true);
            this.f17752g = obtainStyledAttributes.getBoolean(C4906j.f13513e1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void m20617g(AttributeSet attributeSet) {
            C0520s0 m40454u = C0520s0.m40454u(C6548g.this.f17735c, attributeSet, C4906j.f13543k1);
            this.f17754i = m40454u.m40461n(C4906j.f13558n1, 0);
            this.f17755j = (m40454u.m40464k(C4906j.f13573q1, this.f17748c) & (-65536)) | (m40454u.m40464k(C4906j.f13578r1, this.f17749d) & 65535);
            this.f17756k = m40454u.m40459p(C4906j.f13583s1);
            this.f17757l = m40454u.m40459p(C4906j.f13588t1);
            this.f17758m = m40454u.m40461n(C4906j.f13548l1, 0);
            this.f17759n = m20621c(m40454u.m40460o(C4906j.f13593u1));
            this.f17760o = m40454u.m40464k(C4906j.f13386B1, 4096);
            this.f17761p = m20621c(m40454u.m40460o(C4906j.f13598v1));
            this.f17762q = m40454u.m40464k(C4906j.f13406F1, 4096);
            int i = C4906j.f13603w1;
            if (m40454u.m40456s(i)) {
                this.f17763r = m40454u.m40474a(i, false) ? 1 : 0;
            } else {
                this.f17763r = this.f17750e;
            }
            this.f17764s = m40454u.m40474a(C4906j.f13563o1, false);
            this.f17765t = m40454u.m40474a(C4906j.f13568p1, this.f17751f);
            this.f17766u = m40454u.m40474a(C4906j.f13553m1, this.f17752g);
            this.f17767v = m40454u.m40464k(C4906j.f13411G1, -1);
            this.f17771z = m40454u.m40460o(C4906j.f13608x1);
            this.f17768w = m40454u.m40461n(C4906j.f13613y1, 0);
            this.f17769x = m40454u.m40460o(C4906j.f13381A1);
            String m40460o = m40454u.m40460o(C4906j.f13618z1);
            this.f17770y = m40460o;
            boolean z = m40460o != null;
            if (z && this.f17768w == 0 && this.f17769x == null) {
                this.f17740A = (AbstractC1109b) m20619e(m40460o, C6548g.f17732f, C6548g.this.f17734b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f17740A = null;
            }
            this.f17741B = m40454u.m40459p(C4906j.f13391C1);
            this.f17742C = m40454u.m40459p(C4906j.f13416H1);
            int i2 = C4906j.f13401E1;
            if (m40454u.m40456s(i2)) {
                this.f17744E = C0456b0.m40678e(m40454u.m40464k(i2, -1), this.f17744E);
            } else {
                this.f17744E = null;
            }
            int i3 = C4906j.f13396D1;
            if (m40454u.m40456s(i3)) {
                this.f17743D = m40454u.m40472c(i3);
            } else {
                this.f17743D = null;
            }
            m40454u.m40452w();
            this.f17753h = false;
        }

        /* renamed from: h */
        public void m20616h() {
            this.f17747b = 0;
            this.f17748c = 0;
            this.f17749d = 0;
            this.f17750e = 0;
            this.f17751f = true;
            this.f17752g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f17731e = clsArr;
        f17732f = clsArr;
    }

    public C6548g(Context context) {
        super(context);
        this.f17735c = context;
        Object[] objArr = {context};
        this.f17733a = objArr;
        this.f17734b = objArr;
    }

    /* renamed from: a */
    private Object m20626a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m20626a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r15 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r15 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r15.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0.m20616h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.m20620d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r15 = r0.f17740A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r15.mo19721a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0.m20622b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r0.m20623a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r15.equals("menu") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r15.equals("group") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r0.m20618f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r0.m20617g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r15.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        m20624c(r13, r14, r0.m20622b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
        return;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m20624c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            k.g$b r0 = new k.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r4
            r6 = r5
            r7 = r6
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r4
            r7 = r5
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.m20616h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.m20620d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.f17740A
            if (r15 == 0) goto L82
            boolean r15 = r15.mo19721a()
            if (r15 == 0) goto L82
            r0.m20622b()
            goto Lb9
        L82:
            r0.m20623a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = r3
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.m20618f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.m20617g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.m20622b()
            r12.m20624c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = r3
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p189k.C6548g.m20624c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* renamed from: b */
    Object m20625b() {
        if (this.f17736d == null) {
            this.f17736d = m20626a(this.f17735c);
        }
        return this.f17736d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC5993a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f17735c.getResources().getLayout(i);
                    m20624c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
