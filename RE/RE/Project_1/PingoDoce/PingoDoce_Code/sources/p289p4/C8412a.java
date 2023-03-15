package p289p4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.C2290b;
import java.lang.ref.WeakReference;
import p076e5.CrashShieldHandler;
import p248n4.AppEventsLogger;
import p306q4.C9647a;
import p306q4.C9655f;
import p377u4.AppEventUtility;

/* renamed from: p4.a */
/* loaded from: classes.dex */
public class C8412a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodelessLoggingEventListener.java */
    /* renamed from: p4.a$a */
    /* loaded from: classes.dex */
    public static class RunnableC8413a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ String f21773w;

        /* renamed from: x */
        final /* synthetic */ Bundle f21774x;

        RunnableC8413a(String str, Bundle bundle) {
            this.f21773w = str;
            this.f21774x = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                AppEventsLogger.m17815e(C2290b.m34110e()).m17816d(this.f21773w, this.f21774x);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* compiled from: CodelessLoggingEventListener.java */
    /* renamed from: p4.a$b */
    /* loaded from: classes.dex */
    public static class View$OnClickListenerC8414b implements View.OnClickListener {

        /* renamed from: A */
        private boolean f21775A;

        /* renamed from: w */
        private C9647a f21776w;

        /* renamed from: x */
        private WeakReference<View> f21777x;

        /* renamed from: y */
        private WeakReference<View> f21778y;

        /* renamed from: z */
        private View.OnClickListener f21779z;

        /* synthetic */ View$OnClickListenerC8414b(C9647a c9647a, View view, View view2, RunnableC8413a runnableC8413a) {
            this(c9647a, view, view2);
        }

        /* renamed from: a */
        public boolean m15465a() {
            return this.f21775A;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                View.OnClickListener onClickListener = this.f21779z;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                if (this.f21778y.get() == null || this.f21777x.get() == null) {
                    return;
                }
                C8412a.m15470a(this.f21776w, this.f21778y.get(), this.f21777x.get());
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }

        private View$OnClickListenerC8414b(C9647a c9647a, View view, View view2) {
            this.f21775A = false;
            if (c9647a == null || view == null || view2 == null) {
                return;
            }
            this.f21779z = C9655f.m10270g(view2);
            this.f21776w = c9647a;
            this.f21777x = new WeakReference<>(view2);
            this.f21778y = new WeakReference<>(view);
            this.f21775A = true;
        }
    }

    /* compiled from: CodelessLoggingEventListener.java */
    /* renamed from: p4.a$c */
    /* loaded from: classes.dex */
    public static class C8415c implements AdapterView.OnItemClickListener {

        /* renamed from: A */
        private boolean f21780A;

        /* renamed from: w */
        private C9647a f21781w;

        /* renamed from: x */
        private WeakReference<AdapterView> f21782x;

        /* renamed from: y */
        private WeakReference<View> f21783y;

        /* renamed from: z */
        private AdapterView.OnItemClickListener f21784z;

        /* synthetic */ C8415c(C9647a c9647a, View view, AdapterView adapterView, RunnableC8413a runnableC8413a) {
            this(c9647a, view, adapterView);
        }

        /* renamed from: a */
        public boolean m15464a() {
            return this.f21780A;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            AdapterView.OnItemClickListener onItemClickListener = this.f21784z;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            if (this.f21783y.get() == null || this.f21782x.get() == null) {
                return;
            }
            C8412a.m15470a(this.f21781w, this.f21783y.get(), this.f21782x.get());
        }

        private C8415c(C9647a c9647a, View view, AdapterView adapterView) {
            this.f21780A = false;
            if (c9647a == null || view == null || adapterView == null) {
                return;
            }
            this.f21784z = adapterView.getOnItemClickListener();
            this.f21781w = c9647a;
            this.f21782x = new WeakReference<>(adapterView);
            this.f21783y = new WeakReference<>(view);
            this.f21780A = true;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m15470a(C9647a c9647a, View view, View view2) {
        if (CrashShieldHandler.m25963d(C8412a.class)) {
            return;
        }
        try {
            m15467d(c9647a, view, view2);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8412a.class);
        }
    }

    /* renamed from: b */
    public static View$OnClickListenerC8414b m15469b(C9647a c9647a, View view, View view2) {
        if (CrashShieldHandler.m25963d(C8412a.class)) {
            return null;
        }
        try {
            return new View$OnClickListenerC8414b(c9647a, view, view2, null);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8412a.class);
            return null;
        }
    }

    /* renamed from: c */
    public static C8415c m15468c(C9647a c9647a, View view, AdapterView adapterView) {
        if (CrashShieldHandler.m25963d(C8412a.class)) {
            return null;
        }
        try {
            return new C8415c(c9647a, view, adapterView, null);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8412a.class);
            return null;
        }
    }

    /* renamed from: d */
    private static void m15467d(C9647a c9647a, View view, View view2) {
        if (CrashShieldHandler.m25963d(C8412a.class)) {
            return;
        }
        try {
            String m10291b = c9647a.m10291b();
            Bundle m15442f = C8421c.m15442f(c9647a, view, view2);
            m15466e(m15442f);
            C2290b.m34103l().execute(new RunnableC8413a(m10291b, m15442f));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8412a.class);
        }
    }

    /* renamed from: e */
    protected static void m15466e(Bundle bundle) {
        if (CrashShieldHandler.m25963d(C8412a.class)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                bundle.putDouble("_valueToSum", AppEventUtility.m6941g(string));
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8412a.class);
        }
    }
}
