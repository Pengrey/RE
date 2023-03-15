package p289p4;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.C2290b;
import java.lang.ref.WeakReference;
import p076e5.CrashShieldHandler;
import p248n4.AppEventsLogger;
import p306q4.C9647a;
import p306q4.C9655f;
import p377u4.AppEventUtility;

/* renamed from: p4.d */
/* loaded from: classes.dex */
public class C8425d {

    /* compiled from: RCTCodelessLoggingEventListener.java */
    /* renamed from: p4.d$a */
    /* loaded from: classes.dex */
    public static class View$OnTouchListenerC8426a implements View.OnTouchListener {

        /* renamed from: A */
        private boolean f21811A;

        /* renamed from: w */
        private C9647a f21812w;

        /* renamed from: x */
        private WeakReference<View> f21813x;

        /* renamed from: y */
        private WeakReference<View> f21814y;

        /* renamed from: z */
        private View.OnTouchListener f21815z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RCTCodelessLoggingEventListener.java */
        /* renamed from: p4.d$a$a */
        /* loaded from: classes.dex */
        public class RunnableC8427a implements Runnable {

            /* renamed from: w */
            final /* synthetic */ String f21816w;

            /* renamed from: x */
            final /* synthetic */ Bundle f21817x;

            RunnableC8427a(View$OnTouchListenerC8426a view$OnTouchListenerC8426a, String str, Bundle bundle) {
                this.f21816w = str;
                this.f21817x = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (CrashShieldHandler.m25963d(this)) {
                    return;
                }
                try {
                    AppEventsLogger.m17815e(C2290b.m34110e()).m17816d(this.f21816w, this.f21817x);
                } catch (Throwable th2) {
                    CrashShieldHandler.m25965b(th2, this);
                }
            }
        }

        public View$OnTouchListenerC8426a(C9647a c9647a, View view, View view2) {
            this.f21811A = false;
            if (c9647a == null || view == null || view2 == null) {
                return;
            }
            this.f21815z = C9655f.m10269h(view2);
            this.f21812w = c9647a;
            this.f21813x = new WeakReference<>(view2);
            this.f21814y = new WeakReference<>(view);
            this.f21811A = true;
        }

        /* renamed from: b */
        private void m15425b() {
            C9647a c9647a = this.f21812w;
            if (c9647a == null) {
                return;
            }
            String m10291b = c9647a.m10291b();
            Bundle m15442f = C8421c.m15442f(this.f21812w, this.f21814y.get(), this.f21813x.get());
            if (m15442f.containsKey("_valueToSum")) {
                m15442f.putDouble("_valueToSum", AppEventUtility.m6941g(m15442f.getString("_valueToSum")));
            }
            m15442f.putString("_is_fb_codeless", "1");
            C2290b.m34103l().execute(new RunnableC8427a(this, m10291b, m15442f));
        }

        /* renamed from: a */
        public boolean m15426a() {
            return this.f21811A;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                m15425b();
            }
            View.OnTouchListener onTouchListener = this.f21815z;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    /* renamed from: a */
    public static View$OnTouchListenerC8426a m15427a(C9647a c9647a, View view, View view2) {
        if (CrashShieldHandler.m25963d(C8425d.class)) {
            return null;
        }
        try {
            return new View$OnTouchListenerC8426a(c9647a, view, view2);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8425d.class);
            return null;
        }
    }
}
