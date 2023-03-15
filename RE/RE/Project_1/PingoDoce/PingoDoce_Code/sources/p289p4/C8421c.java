package p289p4;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.C2290b;
import com.facebook.FacebookException;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p076e5.CrashShieldHandler;
import p289p4.C8412a;
import p289p4.C8425d;
import p306q4.C9647a;
import p306q4.C9650b;
import p306q4.C9651c;
import p306q4.C9655f;
import p377u4.AppEventUtility;
import p482z4.C13646i;
import p482z4.FetchedAppSettings;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p4.c */
/* loaded from: classes.dex */
public class C8421c {

    /* renamed from: f */
    private static final String f21796f = "p4.c";

    /* renamed from: g */
    private static C8421c f21797g;

    /* renamed from: a */
    private final Handler f21798a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private Set<Activity> f21799b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    private Set<ViewTreeObserver$OnGlobalLayoutListenerC8424c> f21800c = new HashSet();

    /* renamed from: d */
    private HashSet<String> f21801d = new HashSet<>();

    /* renamed from: e */
    private HashMap<Integer, HashSet<String>> f21802e = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodelessMatcher.java */
    /* renamed from: p4.c$a */
    /* loaded from: classes.dex */
    public class RunnableC8422a implements Runnable {
        RunnableC8422a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                C8421c.m15447a(C8421c.this);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* compiled from: CodelessMatcher.java */
    /* renamed from: p4.c$b */
    /* loaded from: classes.dex */
    public static class C8423b {

        /* renamed from: a */
        private WeakReference<View> f21804a;

        /* renamed from: b */
        private String f21805b;

        public C8423b(View view, String str) {
            this.f21804a = new WeakReference<>(view);
            this.f21805b = str;
        }

        /* renamed from: a */
        public View m15438a() {
            WeakReference<View> weakReference = this.f21804a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        /* renamed from: b */
        public String m15437b() {
            return this.f21805b;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: CodelessMatcher.java */
    /* renamed from: p4.c$c */
    /* loaded from: classes.dex */
    public static class ViewTreeObserver$OnGlobalLayoutListenerC8424c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: A */
        private final String f21806A;

        /* renamed from: w */
        private WeakReference<View> f21807w;

        /* renamed from: x */
        private List<C9647a> f21808x;

        /* renamed from: y */
        private final Handler f21809y;

        /* renamed from: z */
        private HashSet<String> f21810z;

        public ViewTreeObserver$OnGlobalLayoutListenerC8424c(View view, Handler handler, HashSet<String> hashSet, String str) {
            this.f21807w = new WeakReference<>(view);
            this.f21809y = handler;
            this.f21810z = hashSet;
            this.f21806A = str;
            handler.postDelayed(this, 200L);
        }

        /* renamed from: a */
        private void m15436a(C8423b c8423b, View view, C9647a c9647a) {
            if (c9647a == null) {
                return;
            }
            try {
                View m15438a = c8423b.m15438a();
                if (m15438a == null) {
                    return;
                }
                View m10276a = C9655f.m10276a(m15438a);
                if (m10276a != null && C9655f.m10261p(m15438a, m10276a)) {
                    m15433d(c8423b, view, c9647a);
                } else if (m15438a.getClass().getName().startsWith("com.facebook.react")) {
                } else {
                    if (!(m15438a instanceof AdapterView)) {
                        m15435b(c8423b, view, c9647a);
                    } else if (m15438a instanceof ListView) {
                        m15434c(c8423b, view, c9647a);
                    }
                }
            } catch (Exception e) {
                Utility.m33974J(C8421c.m15446b(), e);
            }
        }

        /* renamed from: b */
        private void m15435b(C8423b c8423b, View view, C9647a c9647a) {
            View m15438a = c8423b.m15438a();
            if (m15438a == null) {
                return;
            }
            String m15437b = c8423b.m15437b();
            View.OnClickListener m10270g = C9655f.m10270g(m15438a);
            boolean z = (m10270g instanceof C8412a.View$OnClickListenerC8414b) && ((C8412a.View$OnClickListenerC8414b) m10270g).m15465a();
            if (this.f21810z.contains(m15437b) || z) {
                return;
            }
            m15438a.setOnClickListener(C8412a.m15469b(c9647a, view, m15438a));
            this.f21810z.add(m15437b);
        }

        /* renamed from: c */
        private void m15434c(C8423b c8423b, View view, C9647a c9647a) {
            AdapterView adapterView = (AdapterView) c8423b.m15438a();
            if (adapterView == null) {
                return;
            }
            String m15437b = c8423b.m15437b();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            boolean z = (onItemClickListener instanceof C8412a.C8415c) && ((C8412a.C8415c) onItemClickListener).m15464a();
            if (this.f21810z.contains(m15437b) || z) {
                return;
            }
            adapterView.setOnItemClickListener(C8412a.m15468c(c9647a, view, adapterView));
            this.f21810z.add(m15437b);
        }

        /* renamed from: d */
        private void m15433d(C8423b c8423b, View view, C9647a c9647a) {
            View m15438a = c8423b.m15438a();
            if (m15438a == null) {
                return;
            }
            String m15437b = c8423b.m15437b();
            View.OnTouchListener m10269h = C9655f.m10269h(m15438a);
            boolean z = (m10269h instanceof C8425d.View$OnTouchListenerC8426a) && ((C8425d.View$OnTouchListenerC8426a) m10269h).m15426a();
            if (this.f21810z.contains(m15437b) || z) {
                return;
            }
            m15438a.setOnTouchListener(C8425d.m15427a(c9647a, view, m15438a));
            this.f21810z.add(m15437b);
        }

        /* renamed from: f */
        public static List<C8423b> m15431f(C9647a c9647a, View view, List<C9651c> list, int i, int i2, String str) {
            String str2 = str + "." + String.valueOf(i2);
            ArrayList arrayList = new ArrayList();
            if (view == null) {
                return arrayList;
            }
            if (i >= list.size()) {
                arrayList.add(new C8423b(view, str2));
            } else {
                C9651c c9651c = list.get(i);
                if (c9651c.f25467a.equals("..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        List<View> m15430g = m15430g((ViewGroup) parent);
                        int size = m15430g.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.addAll(m15431f(c9647a, m15430g.get(i3), list, i + 1, i3, str2));
                        }
                    }
                    return arrayList;
                } else if (c9651c.f25467a.equals(".")) {
                    arrayList.add(new C8423b(view, str2));
                    return arrayList;
                } else if (!m15429h(view, c9651c, i2)) {
                    return arrayList;
                } else {
                    if (i == list.size() - 1) {
                        arrayList.add(new C8423b(view, str2));
                    }
                }
            }
            if (view instanceof ViewGroup) {
                List<View> m15430g2 = m15430g((ViewGroup) view);
                int size2 = m15430g2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.addAll(m15431f(c9647a, m15430g2.get(i4), list, i + 1, i4, str2));
                }
            }
            return arrayList;
        }

        /* renamed from: g */
        private static List<View> m15430g(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
            if (r5.getClass().getSimpleName().equals(r7[r7.length - 1]) == false) goto L14;
         */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean m15429h(android.view.View r5, p306q4.C9651c r6, int r7) {
            /*
                Method dump skipped, instructions count: 265
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p289p4.C8421c.ViewTreeObserver$OnGlobalLayoutListenerC8424c.m15429h(android.view.View, q4.c, int):boolean");
        }

        /* renamed from: i */
        private void m15428i() {
            if (this.f21808x == null || this.f21807w.get() == null) {
                return;
            }
            for (int i = 0; i < this.f21808x.size(); i++) {
                m15432e(this.f21808x.get(i), this.f21807w.get());
            }
        }

        /* renamed from: e */
        public void m15432e(C9647a c9647a, View view) {
            if (c9647a == null || view == null) {
                return;
            }
            if (TextUtils.isEmpty(c9647a.m10292a()) || c9647a.m10292a().equals(this.f21806A)) {
                List<C9651c> m10288e = c9647a.m10288e();
                if (m10288e.size() > 25) {
                    return;
                }
                for (C8423b c8423b : m15431f(c9647a, view, m10288e, 0, -1, this.f21806A)) {
                    m15436a(c8423b, view, c9647a);
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            m15428i();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            m15428i();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                FetchedAppSettings m33990j = FetchedAppSettingsManager.m33990j(C2290b.m34109f());
                if (m33990j != null && m33990j.m739b()) {
                    List<C9647a> m10287f = C9647a.m10287f(m33990j.m737d());
                    this.f21808x = m10287f;
                    if (m10287f == null || (view = this.f21807w.get()) == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    m15428i();
                }
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    private C8421c() {
    }

    /* renamed from: a */
    static /* synthetic */ void m15447a(C8421c c8421c) {
        if (CrashShieldHandler.m25963d(C8421c.class)) {
            return;
        }
        try {
            c8421c.m15441g();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8421c.class);
        }
    }

    /* renamed from: b */
    static /* synthetic */ String m15446b() {
        if (CrashShieldHandler.m25963d(C8421c.class)) {
            return null;
        }
        try {
            return f21796f;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8421c.class);
            return null;
        }
    }

    /* renamed from: e */
    public static synchronized C8421c m15443e() {
        synchronized (C8421c.class) {
            if (CrashShieldHandler.m25963d(C8421c.class)) {
                return null;
            }
            if (f21797g == null) {
                f21797g = new C8421c();
            }
            return f21797g;
        }
    }

    /* renamed from: f */
    public static Bundle m15442f(C9647a c9647a, View view, View view2) {
        List<C9650b> m10289d;
        List<C8423b> m15431f;
        if (CrashShieldHandler.m25963d(C8421c.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            if (c9647a != null && (m10289d = c9647a.m10289d()) != null) {
                for (C9650b c9650b : m10289d) {
                    String str = c9650b.f25464b;
                    if (str != null && str.length() > 0) {
                        bundle.putString(c9650b.f25463a, c9650b.f25464b);
                    } else if (c9650b.f25465c.size() > 0) {
                        if (c9650b.f25466d.equals("relative")) {
                            m15431f = ViewTreeObserver$OnGlobalLayoutListenerC8424c.m15431f(c9647a, view2, c9650b.f25465c, 0, -1, view2.getClass().getSimpleName());
                        } else {
                            m15431f = ViewTreeObserver$OnGlobalLayoutListenerC8424c.m15431f(c9647a, view, c9650b.f25465c, 0, -1, view.getClass().getSimpleName());
                        }
                        Iterator<C8423b> it = m15431f.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C8423b next = it.next();
                                if (next.m15438a() != null) {
                                    String m10266k = C9655f.m10266k(next.m15438a());
                                    if (m10266k.length() > 0) {
                                        bundle.putString(c9650b.f25463a, m10266k);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8421c.class);
            return null;
        }
    }

    /* renamed from: g */
    private void m15441g() {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            for (Activity activity : this.f21799b) {
                if (activity != null) {
                    this.f21800c.add(new ViewTreeObserver$OnGlobalLayoutListenerC8424c(AppEventUtility.m6943e(activity), this.f21798a, this.f21801d, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: i */
    private void m15439i() {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                m15441g();
            } else {
                this.f21798a.post(new RunnableC8422a());
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: c */
    public void m15445c(Activity activity) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            if (C13646i.m716b()) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f21799b.add(activity);
                this.f21801d.clear();
                if (this.f21802e.containsKey(Integer.valueOf(activity.hashCode()))) {
                    this.f21801d = this.f21802e.get(Integer.valueOf(activity.hashCode()));
                }
                m15439i();
                return;
            }
            throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: d */
    public void m15444d(Activity activity) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            this.f21802e.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: h */
    public void m15440h(Activity activity) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            if (C13646i.m716b()) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f21799b.remove(activity);
                this.f21800c.clear();
                this.f21802e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f21801d.clone());
                this.f21801d.clear();
                return;
            }
            throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }
}
