package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p020os.C1007a;
import androidx.core.view.accessibility.InterfaceC1097f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p128h2.C5816c;

/* renamed from: androidx.core.view.accessibility.c */
/* loaded from: classes.dex */
public class C1085c {

    /* renamed from: d */
    private static int f3421d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f3422a;

    /* renamed from: b */
    public int f3423b = -1;

    /* renamed from: c */
    private int f3424c = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: androidx.core.view.accessibility.c$a */
    /* loaded from: classes.dex */
    public static class C1086a {

        /* renamed from: e */
        public static final C1086a f3425e;

        /* renamed from: f */
        public static final C1086a f3426f;

        /* renamed from: g */
        public static final C1086a f3427g;

        /* renamed from: h */
        public static final C1086a f3428h;

        /* renamed from: i */
        public static final C1086a f3429i;

        /* renamed from: j */
        public static final C1086a f3430j;

        /* renamed from: k */
        public static final C1086a f3431k;

        /* renamed from: l */
        public static final C1086a f3432l;

        /* renamed from: m */
        public static final C1086a f3433m;

        /* renamed from: n */
        public static final C1086a f3434n;

        /* renamed from: o */
        public static final C1086a f3435o;

        /* renamed from: p */
        public static final C1086a f3436p;

        /* renamed from: a */
        final Object f3437a;

        /* renamed from: b */
        private final int f3438b;

        /* renamed from: c */
        private final Class<? extends InterfaceC1097f.AbstractC1098a> f3439c;

        /* renamed from: d */
        protected final InterfaceC1097f f3440d;

        static {
            new C1086a(1, null);
            new C1086a(2, null);
            new C1086a(4, null);
            new C1086a(8, null);
            f3425e = new C1086a(16, null);
            new C1086a(32, null);
            f3426f = new C1086a(64, null);
            f3427g = new C1086a(128, null);
            new C1086a(256, (CharSequence) null, InterfaceC1097f.C1099b.class);
            new C1086a(512, (CharSequence) null, InterfaceC1097f.C1099b.class);
            new C1086a(1024, (CharSequence) null, InterfaceC1097f.C1100c.class);
            new C1086a(2048, (CharSequence) null, InterfaceC1097f.C1100c.class);
            f3428h = new C1086a(4096, null);
            f3429i = new C1086a(8192, null);
            new C1086a(16384, null);
            new C1086a(32768, null);
            new C1086a(65536, null);
            new C1086a(131072, (CharSequence) null, InterfaceC1097f.C1104g.class);
            f3430j = new C1086a(262144, null);
            f3431k = new C1086a(524288, null);
            f3432l = new C1086a(1048576, null);
            new C1086a(2097152, (CharSequence) null, InterfaceC1097f.C1105h.class);
            int i = Build.VERSION.SDK_INT;
            new C1086a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new C1086a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, InterfaceC1097f.C1102e.class);
            f3433m = new C1086a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            f3434n = new C1086a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            f3435o = new C1086a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            f3436p = new C1086a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new C1086a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new C1086a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new C1086a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new C1086a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new C1086a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            new C1086a(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, InterfaceC1097f.C1103f.class);
            new C1086a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, InterfaceC1097f.C1101d.class);
            new C1086a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            new C1086a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            new C1086a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            new C1086a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
        }

        public C1086a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        /* renamed from: a */
        public C1086a m38511a(CharSequence charSequence, InterfaceC1097f interfaceC1097f) {
            return new C1086a(null, this.f3438b, charSequence, interfaceC1097f, this.f3439c);
        }

        /* renamed from: b */
        public int m38510b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f3437a).getId();
            }
            return 0;
        }

        /* renamed from: c */
        public CharSequence m38509c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f3437a).getLabel();
            }
            return null;
        }

        /* renamed from: d */
        public boolean m38508d(View view, Bundle bundle) {
            if (this.f3440d != null) {
                InterfaceC1097f.AbstractC1098a abstractC1098a = null;
                Class<? extends InterfaceC1097f.AbstractC1098a> cls = this.f3439c;
                if (cls != null) {
                    try {
                        InterfaceC1097f.AbstractC1098a newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        try {
                            newInstance.m38493a(bundle);
                            abstractC1098a = newInstance;
                        } catch (Exception e) {
                            e = e;
                            abstractC1098a = newInstance;
                            Class<? extends InterfaceC1097f.AbstractC1098a> cls2 = this.f3439c;
                            String name = cls2 == null ? "null" : cls2.getName();
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                            return this.f3440d.mo30335a(view, abstractC1098a);
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                return this.f3440d.mo30335a(view, abstractC1098a);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof C1086a)) {
                C1086a c1086a = (C1086a) obj;
                Object obj2 = this.f3437a;
                return obj2 == null ? c1086a.f3437a == null : obj2.equals(c1086a.f3437a);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f3437a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public C1086a(int i, CharSequence charSequence, InterfaceC1097f interfaceC1097f) {
            this(null, i, charSequence, interfaceC1097f, null);
        }

        C1086a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private C1086a(int i, CharSequence charSequence, Class<? extends InterfaceC1097f.AbstractC1098a> cls) {
            this(null, i, charSequence, null, cls);
        }

        C1086a(Object obj, int i, CharSequence charSequence, InterfaceC1097f interfaceC1097f, Class<? extends InterfaceC1097f.AbstractC1098a> cls) {
            this.f3438b = i;
            this.f3440d = interfaceC1097f;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                this.f3437a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f3437a = obj;
            }
            this.f3439c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: androidx.core.view.accessibility.c$b */
    /* loaded from: classes.dex */
    public static class C1087b {

        /* renamed from: a */
        final Object f3441a;

        C1087b(Object obj) {
            this.f3441a = obj;
        }

        /* renamed from: a */
        public static C1087b m38507a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 21) {
                return new C1087b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new C1087b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new C1087b(null);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: androidx.core.view.accessibility.c$c */
    /* loaded from: classes.dex */
    public static class C1088c {

        /* renamed from: a */
        final Object f3442a;

        C1088c(Object obj) {
            this.f3442a = obj;
        }

        /* renamed from: a */
        public static C1088c m38506a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                return new C1088c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new C1088c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C1088c(null);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: androidx.core.view.accessibility.c$d */
    /* loaded from: classes.dex */
    public static class C1089d {

        /* renamed from: a */
        final Object f3443a;

        C1089d(Object obj) {
            this.f3443a = obj;
        }

        /* renamed from: a */
        public static C1089d m38505a(int i, float f, float f2, float f3) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new C1089d(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
            }
            return new C1089d(null);
        }
    }

    private C1085c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3422a = accessibilityNodeInfo;
    }

    /* renamed from: A */
    private boolean m38601A() {
        return !m38549h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: B */
    private int m38599B(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f3421d;
        f3421d = i2 + 1;
        return i2;
    }

    /* renamed from: L0 */
    public static C1085c m38578L0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C1085c(accessibilityNodeInfo);
    }

    /* renamed from: N */
    public static C1085c m38576N() {
        return m38578L0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: O */
    public static C1085c m38575O(View view) {
        return m38578L0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: P */
    public static C1085c m38574P(C1085c c1085c) {
        return m38578L0(AccessibilityNodeInfo.obtain(c1085c.f3422a));
    }

    /* renamed from: T */
    private void m38570T(View view) {
        SparseArray<WeakReference<ClickableSpan>> m38519w = m38519w(view);
        if (m38519w != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < m38519w.size(); i++) {
                if (m38519w.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                m38519w.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: V */
    private void m38568V(int i, boolean z) {
        Bundle m38527s = m38527s();
        if (m38527s != null) {
            int i2 = m38527s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            m38527s.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: e */
    private void m38555e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m38549h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m38549h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m38549h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m38549h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: g */
    private void m38551g() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3422a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f3422a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f3422a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f3422a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: h */
    private List<Integer> m38549h(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f3422a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f3422a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    /* renamed from: j */
    private static String m38545j(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908372:
                        return "ACTION_IME_ENTER";
                    default:
                        switch (i) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    /* renamed from: l */
    private boolean m38541l(int i) {
        Bundle m38527s = m38527s();
        return m38527s != null && (m38527s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    /* renamed from: q */
    public static ClickableSpan[] m38531q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: u */
    private SparseArray<WeakReference<ClickableSpan>> m38523u(View view) {
        SparseArray<WeakReference<ClickableSpan>> m38519w = m38519w(view);
        if (m38519w == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(C5816c.tag_accessibility_clickable_spans, sparseArray);
            return sparseArray;
        }
        return m38519w;
    }

    /* renamed from: w */
    private SparseArray<WeakReference<ClickableSpan>> m38519w(View view) {
        return (SparseArray) view.getTag(C5816c.tag_accessibility_clickable_spans);
    }

    /* renamed from: A0 */
    public void m38600A0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3422a.setScreenReaderFocusable(z);
        } else {
            m38568V(1, z);
        }
    }

    /* renamed from: B0 */
    public void m38598B0(boolean z) {
        this.f3422a.setScrollable(z);
    }

    /* renamed from: C */
    public boolean m38597C() {
        return this.f3422a.isCheckable();
    }

    /* renamed from: C0 */
    public void m38596C0(boolean z) {
        this.f3422a.setSelected(z);
    }

    /* renamed from: D */
    public boolean m38595D() {
        return this.f3422a.isChecked();
    }

    /* renamed from: D0 */
    public void m38594D0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3422a.setShowingHintText(z);
        } else {
            m38568V(4, z);
        }
    }

    /* renamed from: E */
    public boolean m38593E() {
        return this.f3422a.isClickable();
    }

    /* renamed from: E0 */
    public void m38592E0(View view, int i) {
        this.f3424c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3422a.setSource(view, i);
        }
    }

    /* renamed from: F */
    public boolean m38591F() {
        return this.f3422a.isEnabled();
    }

    /* renamed from: F0 */
    public void m38590F0(CharSequence charSequence) {
        if (C1007a.m38761a()) {
            this.f3422a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f3422a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: G */
    public boolean m38589G() {
        return this.f3422a.isFocusable();
    }

    /* renamed from: G0 */
    public void m38588G0(CharSequence charSequence) {
        this.f3422a.setText(charSequence);
    }

    /* renamed from: H */
    public boolean m38587H() {
        return this.f3422a.isFocused();
    }

    /* renamed from: H0 */
    public void m38586H0(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f3422a.setTextSelection(i, i2);
        }
    }

    /* renamed from: I */
    public boolean m38585I() {
        return this.f3422a.isLongClickable();
    }

    /* renamed from: I0 */
    public void m38584I0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f3422a.setTraversalAfter(view);
        }
    }

    /* renamed from: J */
    public boolean m38583J() {
        return this.f3422a.isPassword();
    }

    /* renamed from: J0 */
    public void m38582J0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3422a.setVisibleToUser(z);
        }
    }

    /* renamed from: K */
    public boolean m38581K() {
        return this.f3422a.isScrollable();
    }

    /* renamed from: K0 */
    public AccessibilityNodeInfo m38580K0() {
        return this.f3422a;
    }

    /* renamed from: L */
    public boolean m38579L() {
        return this.f3422a.isSelected();
    }

    /* renamed from: M */
    public boolean m38577M() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f3422a.isShowingHintText();
        }
        return m38541l(4);
    }

    /* renamed from: Q */
    public boolean m38573Q(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f3422a.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: R */
    public void m38572R() {
        this.f3422a.recycle();
    }

    /* renamed from: S */
    public boolean m38571S(C1086a c1086a) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f3422a.removeAction((AccessibilityNodeInfo.AccessibilityAction) c1086a.f3437a);
        }
        return false;
    }

    /* renamed from: U */
    public void m38569U(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3422a.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    /* renamed from: W */
    public void m38567W(Rect rect) {
        this.f3422a.setBoundsInParent(rect);
    }

    /* renamed from: X */
    public void m38566X(Rect rect) {
        this.f3422a.setBoundsInScreen(rect);
    }

    /* renamed from: Y */
    public void m38565Y(boolean z) {
        this.f3422a.setCheckable(z);
    }

    /* renamed from: Z */
    public void m38564Z(boolean z) {
        this.f3422a.setChecked(z);
    }

    /* renamed from: a */
    public void m38563a(int i) {
        this.f3422a.addAction(i);
    }

    /* renamed from: a0 */
    public void m38562a0(CharSequence charSequence) {
        this.f3422a.setClassName(charSequence);
    }

    /* renamed from: b */
    public void m38561b(C1086a c1086a) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3422a.addAction((AccessibilityNodeInfo.AccessibilityAction) c1086a.f3437a);
        }
    }

    /* renamed from: b0 */
    public void m38560b0(boolean z) {
        this.f3422a.setClickable(z);
    }

    /* renamed from: c */
    public void m38559c(View view) {
        this.f3422a.addChild(view);
    }

    /* renamed from: c0 */
    public void m38558c0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3422a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C1087b) obj).f3441a);
        }
    }

    /* renamed from: d */
    public void m38557d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3422a.addChild(view, i);
        }
    }

    /* renamed from: d0 */
    public void m38556d0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3422a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C1088c) obj).f3442a);
        }
    }

    /* renamed from: e0 */
    public void m38554e0(CharSequence charSequence) {
        this.f3422a.setContentDescription(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1085c)) {
            C1085c c1085c = (C1085c) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f3422a;
            if (accessibilityNodeInfo == null) {
                if (c1085c.f3422a != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(c1085c.f3422a)) {
                return false;
            }
            return this.f3424c == c1085c.f3424c && this.f3423b == c1085c.f3423b;
        }
        return false;
    }

    /* renamed from: f */
    public void m38553f(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i < 19 || i >= 26) {
            return;
        }
        m38551g();
        m38570T(view);
        ClickableSpan[] m38531q = m38531q(charSequence);
        if (m38531q == null || m38531q.length <= 0) {
            return;
        }
        m38527s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C5816c.accessibility_action_clickable_span);
        SparseArray<WeakReference<ClickableSpan>> m38523u = m38523u(view);
        for (int i2 = 0; i2 < m38531q.length; i2++) {
            int m38599B = m38599B(m38531q[i2], m38523u);
            m38523u.put(m38599B, new WeakReference<>(m38531q[i2]));
            m38555e(m38531q[i2], (Spanned) charSequence, m38599B);
        }
    }

    /* renamed from: f0 */
    public void m38552f0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3422a.setContentInvalid(z);
        }
    }

    /* renamed from: g0 */
    public void m38550g0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3422a.setDismissable(z);
        }
    }

    /* renamed from: h0 */
    public void m38548h0(boolean z) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f3422a.setEditable(z);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3422a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public List<C1086a> m38547i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f3422a.getActionList() : null;
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new C1086a(actionList.get(i)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    /* renamed from: i0 */
    public void m38546i0(boolean z) {
        this.f3422a.setEnabled(z);
    }

    /* renamed from: j0 */
    public void m38544j0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3422a.setError(charSequence);
        }
    }

    /* renamed from: k */
    public int m38543k() {
        return this.f3422a.getActions();
    }

    /* renamed from: k0 */
    public void m38542k0(boolean z) {
        this.f3422a.setFocusable(z);
    }

    /* renamed from: l0 */
    public void m38540l0(boolean z) {
        this.f3422a.setFocused(z);
    }

    @Deprecated
    /* renamed from: m */
    public void m38539m(Rect rect) {
        this.f3422a.getBoundsInParent(rect);
    }

    /* renamed from: m0 */
    public void m38538m0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3422a.setHeading(z);
        } else {
            m38568V(2, z);
        }
    }

    /* renamed from: n */
    public void m38537n(Rect rect) {
        this.f3422a.getBoundsInScreen(rect);
    }

    /* renamed from: n0 */
    public void m38536n0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f3422a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f3422a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: o */
    public int m38535o() {
        return this.f3422a.getChildCount();
    }

    /* renamed from: o0 */
    public void m38534o0(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f3422a.setLabelFor(view);
        }
    }

    /* renamed from: p */
    public CharSequence m38533p() {
        return this.f3422a.getClassName();
    }

    /* renamed from: p0 */
    public void m38532p0(int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3422a.setLiveRegion(i);
        }
    }

    /* renamed from: q0 */
    public void m38530q0(boolean z) {
        this.f3422a.setLongClickable(z);
    }

    /* renamed from: r */
    public CharSequence m38529r() {
        return this.f3422a.getContentDescription();
    }

    /* renamed from: r0 */
    public void m38528r0(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3422a.setMaxTextLength(i);
        }
    }

    /* renamed from: s */
    public Bundle m38527s() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f3422a.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: s0 */
    public void m38526s0(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3422a.setMovementGranularities(i);
        }
    }

    /* renamed from: t */
    public int m38525t() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f3422a.getMovementGranularities();
        }
        return 0;
    }

    /* renamed from: t0 */
    public void m38524t0(CharSequence charSequence) {
        this.f3422a.setPackageName(charSequence);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m38539m(rect);
        sb2.append("; boundsInParent: " + rect);
        m38537n(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(m38521v());
        sb2.append("; className: ");
        sb2.append(m38533p());
        sb2.append("; text: ");
        sb2.append(m38515y());
        sb2.append("; contentDescription: ");
        sb2.append(m38529r());
        sb2.append("; viewId: ");
        sb2.append(m38513z());
        sb2.append("; checkable: ");
        sb2.append(m38597C());
        sb2.append("; checked: ");
        sb2.append(m38595D());
        sb2.append("; focusable: ");
        sb2.append(m38589G());
        sb2.append("; focused: ");
        sb2.append(m38587H());
        sb2.append("; selected: ");
        sb2.append(m38579L());
        sb2.append("; clickable: ");
        sb2.append(m38593E());
        sb2.append("; longClickable: ");
        sb2.append(m38585I());
        sb2.append("; enabled: ");
        sb2.append(m38591F());
        sb2.append("; password: ");
        sb2.append(m38583J());
        sb2.append("; scrollable: " + m38581K());
        sb2.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C1086a> m38547i = m38547i();
            for (int i = 0; i < m38547i.size(); i++) {
                C1086a c1086a = m38547i.get(i);
                String m38545j = m38545j(c1086a.m38510b());
                if (m38545j.equals("ACTION_UNKNOWN") && c1086a.m38509c() != null) {
                    m38545j = c1086a.m38509c().toString();
                }
                sb2.append(m38545j);
                if (i != m38547i.size() - 1) {
                    sb2.append(", ");
                }
            }
        } else {
            int m38543k = m38543k();
            while (m38543k != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(m38543k);
                m38543k &= ~numberOfTrailingZeros;
                sb2.append(m38545j(numberOfTrailingZeros));
                if (m38543k != 0) {
                    sb2.append(", ");
                }
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: u0 */
    public void m38522u0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f3422a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f3422a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: v */
    public CharSequence m38521v() {
        return this.f3422a.getPackageName();
    }

    /* renamed from: v0 */
    public void m38520v0(View view) {
        this.f3423b = -1;
        this.f3422a.setParent(view);
    }

    /* renamed from: w0 */
    public void m38518w0(View view, int i) {
        this.f3423b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3422a.setParent(view, i);
        }
    }

    /* renamed from: x */
    public CharSequence m38517x() {
        if (C1007a.m38761a()) {
            return this.f3422a.getStateDescription();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f3422a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        return null;
    }

    /* renamed from: x0 */
    public void m38516x0(boolean z) {
        this.f3422a.setPassword(z);
    }

    /* renamed from: y */
    public CharSequence m38515y() {
        if (m38601A()) {
            List<Integer> m38549h = m38549h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> m38549h2 = m38549h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> m38549h3 = m38549h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> m38549h4 = m38549h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3422a.getText(), 0, this.f3422a.getText().length()));
            for (int i = 0; i < m38549h.size(); i++) {
                spannableString.setSpan(new C1082a(m38549h4.get(i).intValue(), this, m38527s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), m38549h.get(i).intValue(), m38549h2.get(i).intValue(), m38549h3.get(i).intValue());
            }
            return spannableString;
        }
        return this.f3422a.getText();
    }

    /* renamed from: y0 */
    public void m38514y0(C1089d c1089d) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3422a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) c1089d.f3443a);
        }
    }

    /* renamed from: z */
    public String m38513z() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f3422a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: z0 */
    public void m38512z0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3422a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }
}
