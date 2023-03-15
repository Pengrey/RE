package p012ab;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import bb.C1875b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.joda.time.DateTimeConstants;
import p046cb.C2107b;
import p062db.C4774b;
import p103fb.C5443b;
import p103fb.C5444c;
import p418w7.C11581c;
import p418w7.C11591e;
import p443xa.C12333c;
import p443xa.C12335e;
import p463y7.C13128a;
import p463y7.C13129b;
import p463y7.C13130c;
import p466ya.C13144c;
import p466ya.InterfaceC13142a;
import p466ya.InterfaceC13143b;

/* renamed from: ab.b */
/* loaded from: classes2.dex */
public class C0099b<T extends InterfaceC13143b> implements InterfaceC0098a<T> {

    /* renamed from: v */
    private static final int[] f201v = {10, 20, 50, 100, 200, 500, DateTimeConstants.MILLIS_PER_SECOND};

    /* renamed from: w */
    private static final TimeInterpolator f202w = new DecelerateInterpolator();

    /* renamed from: a */
    private final C11581c f203a;

    /* renamed from: b */
    private final C5443b f204b;

    /* renamed from: c */
    private final C13144c<T> f205c;

    /* renamed from: d */
    private final float f206d;

    /* renamed from: g */
    private ShapeDrawable f207g;

    /* renamed from: l */
    private Set<? extends InterfaceC13142a<T>> f208l;

    /* renamed from: n */
    private float f209n;

    /* renamed from: p */
    private C13144c.InterfaceC13147c<T> f210p;

    /* renamed from: q */
    private C13144c.InterfaceC13148d<T> f211q;

    /* renamed from: r */
    private C13144c.InterfaceC13149e<T> f212r;

    /* renamed from: s */
    private C13144c.InterfaceC13150f<T> f213s;

    /* renamed from: t */
    private C13144c.InterfaceC13151g<T> f214t;

    /* renamed from: u */
    private C13144c.InterfaceC13152h<T> f215u;

    /* renamed from: f */
    private final Executor f216f = Executors.newSingleThreadExecutor();

    /* renamed from: h */
    private Set<C0110k> f217h = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: i */
    private SparseArray<C13128a> f218i = new SparseArray<>();

    /* renamed from: j */
    private C0108i<T> f219j = new C0108i<>(null);

    /* renamed from: k */
    private int f220k = 4;

    /* renamed from: m */
    private C0108i<InterfaceC13142a<T>> f221m = new C0108i<>(null);

    /* renamed from: o */
    private final C0099b<T>.HandlerC0112m f222o = new HandlerC0112m(this, null);

    /* renamed from: e */
    private boolean f223e = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: ab.b$a */
    /* loaded from: classes2.dex */
    public class C0100a implements C11581c.InterfaceC11588g {
        C0100a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p418w7.C11581c.InterfaceC11588g
        /* renamed from: f */
        public boolean mo1538f(C13130c c13130c) {
            return C0099b.this.f213s != null && C0099b.this.f213s.mo1525a((InterfaceC13143b) C0099b.this.f219j.m41908a(c13130c));
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: ab.b$b */
    /* loaded from: classes2.dex */
    class C0101b implements C11581c.InterfaceC11585d {
        C0101b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p418w7.C11581c.InterfaceC11585d
        /* renamed from: d */
        public void mo1540d(C13130c c13130c) {
            if (C0099b.this.f214t != null) {
                C0099b.this.f214t.m1524a((InterfaceC13143b) C0099b.this.f219j.m41908a(c13130c));
            }
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: ab.b$c */
    /* loaded from: classes2.dex */
    class C0102c implements C11581c.InterfaceC11586e {
        C0102c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p418w7.C11581c.InterfaceC11586e
        /* renamed from: e */
        public void mo4657e(C13130c c13130c) {
            if (C0099b.this.f215u != null) {
                C0099b.this.f215u.m1523a((InterfaceC13143b) C0099b.this.f219j.m41908a(c13130c));
            }
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: ab.b$d */
    /* loaded from: classes2.dex */
    class C0103d implements C11581c.InterfaceC11588g {
        C0103d() {
        }

        @Override // p418w7.C11581c.InterfaceC11588g
        /* renamed from: f */
        public boolean mo1538f(C13130c c13130c) {
            return C0099b.this.f210p != null && C0099b.this.f210p.mo1528a((InterfaceC13142a) C0099b.this.f221m.m41908a(c13130c));
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: ab.b$e */
    /* loaded from: classes2.dex */
    class C0104e implements C11581c.InterfaceC11585d {
        C0104e() {
        }

        @Override // p418w7.C11581c.InterfaceC11585d
        /* renamed from: d */
        public void mo1540d(C13130c c13130c) {
            if (C0099b.this.f211q != null) {
                C0099b.this.f211q.m1527a((InterfaceC13142a) C0099b.this.f221m.m41908a(c13130c));
            }
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: ab.b$f */
    /* loaded from: classes2.dex */
    class C0105f implements C11581c.InterfaceC11586e {
        C0105f() {
        }

        @Override // p418w7.C11581c.InterfaceC11586e
        /* renamed from: e */
        public void mo4657e(C13130c c13130c) {
            if (C0099b.this.f212r != null) {
                C0099b.this.f212r.m1526a((InterfaceC13142a) C0099b.this.f221m.m41908a(c13130c));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultClusterRenderer.java */
    @TargetApi(12)
    /* renamed from: ab.b$g */
    /* loaded from: classes2.dex */
    public class C0106g extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private final C0110k f230a;

        /* renamed from: b */
        private final C13130c f231b;

        /* renamed from: c */
        private final LatLng f232c;

        /* renamed from: d */
        private final LatLng f233d;

        /* renamed from: e */
        private boolean f234e;

        /* renamed from: f */
        private C1875b f235f;

        /* synthetic */ C0106g(C0099b c0099b, C0110k c0110k, LatLng latLng, LatLng latLng2, C0100a c0100a) {
            this(c0110k, latLng, latLng2);
        }

        /* renamed from: a */
        public void m41912a() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(C0099b.f202w);
            ofFloat.addUpdateListener(this);
            ofFloat.addListener(this);
            ofFloat.start();
        }

        /* renamed from: b */
        public void m41911b(C1875b c1875b) {
            this.f235f = c1875b;
            this.f234e = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f234e) {
                C0099b.this.f219j.m41905d(this.f231b);
                C0099b.this.f221m.m41905d(this.f231b);
                this.f235f.m35239i(this.f231b);
            }
            this.f230a.f253b = this.f233d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f233d;
            double d = latLng.f8253w;
            LatLng latLng2 = this.f232c;
            double d2 = latLng2.f8253w;
            double d3 = animatedFraction;
            double d4 = ((d - d2) * d3) + d2;
            double d5 = latLng.f8254x - latLng2.f8254x;
            if (Math.abs(d5) > 180.0d) {
                d5 -= Math.signum(d5) * 360.0d;
            }
            this.f231b.m1554g(new LatLng(d4, (d5 * d3) + this.f232c.f8254x));
        }

        private C0106g(C0110k c0110k, LatLng latLng, LatLng latLng2) {
            this.f230a = c0110k;
            this.f231b = c0110k.f252a;
            this.f232c = latLng;
            this.f233d = latLng2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: ab.b$h */
    /* loaded from: classes2.dex */
    public class C0107h {

        /* renamed from: a */
        private final InterfaceC13142a<T> f237a;

        /* renamed from: b */
        private final Set<C0110k> f238b;

        /* renamed from: c */
        private final LatLng f239c;

        public C0107h(InterfaceC13142a<T> interfaceC13142a, Set<C0110k> set, LatLng latLng) {
            this.f237a = interfaceC13142a;
            this.f238b = set;
            this.f239c = latLng;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m41909b(C0099b<T>.HandlerC0109j handlerC0109j) {
            C0110k c0110k;
            C0110k c0110k2;
            if (C0099b.this.mo41939S(this.f237a)) {
                C13130c m41907b = C0099b.this.f221m.m41907b(this.f237a);
                if (m41907b == null) {
                    MarkerOptions markerOptions = new MarkerOptions();
                    LatLng latLng = this.f239c;
                    if (latLng == null) {
                        latLng = this.f237a.mo523b();
                    }
                    MarkerOptions m31540N = markerOptions.m31540N(latLng);
                    C0099b.this.m41944N(this.f237a, m31540N);
                    m41907b = C0099b.this.f205c.m1535i().m35226i(m31540N);
                    C0099b.this.f221m.m41906c(this.f237a, m41907b);
                    c0110k = new C0110k(m41907b, null);
                    LatLng latLng2 = this.f239c;
                    if (latLng2 != null) {
                        handlerC0109j.m41903b(c0110k, latLng2, this.f237a.mo523b());
                    }
                } else {
                    c0110k = new C0110k(m41907b, null);
                    C0099b.this.m41940R(this.f237a, m41907b);
                }
                C0099b.this.m41941Q(this.f237a, m41907b);
                this.f238b.add(c0110k);
                return;
            }
            for (T t : this.f237a.mo521d()) {
                C13130c m41907b2 = C0099b.this.f219j.m41907b(t);
                if (m41907b2 == null) {
                    MarkerOptions markerOptions2 = new MarkerOptions();
                    LatLng latLng3 = this.f239c;
                    if (latLng3 != null) {
                        markerOptions2.m31540N(latLng3);
                    } else {
                        markerOptions2.m31540N(t.mo1544b());
                    }
                    C0099b.this.mo41945M(t, markerOptions2);
                    m41907b2 = C0099b.this.f205c.m1534j().m35226i(markerOptions2);
                    c0110k2 = new C0110k(m41907b2, null);
                    C0099b.this.f219j.m41906c(t, m41907b2);
                    LatLng latLng4 = this.f239c;
                    if (latLng4 != null) {
                        handlerC0109j.m41903b(c0110k2, latLng4, t.mo1544b());
                    }
                } else {
                    c0110k2 = new C0110k(m41907b2, null);
                    C0099b.this.m41942P(t, m41907b2);
                }
                C0099b.this.m41943O(t, m41907b2);
                this.f238b.add(c0110k2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultClusterRenderer.java */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: ab.b$j */
    /* loaded from: classes2.dex */
    public class HandlerC0109j extends Handler implements MessageQueue.IdleHandler {

        /* renamed from: a */
        private final Lock f243a;

        /* renamed from: b */
        private final Condition f244b;

        /* renamed from: c */
        private Queue<C0099b<T>.C0107h> f245c;

        /* renamed from: d */
        private Queue<C0099b<T>.C0107h> f246d;

        /* renamed from: e */
        private Queue<C13130c> f247e;

        /* renamed from: f */
        private Queue<C13130c> f248f;

        /* renamed from: g */
        private Queue<C0099b<T>.C0106g> f249g;

        /* renamed from: h */
        private boolean f250h;

        /* synthetic */ HandlerC0109j(C0099b c0099b, C0100a c0100a) {
            this();
        }

        @TargetApi(11)
        /* renamed from: e */
        private void m41900e() {
            if (!this.f248f.isEmpty()) {
                m41898g(this.f248f.poll());
            } else if (!this.f249g.isEmpty()) {
                this.f249g.poll().m41912a();
            } else if (!this.f246d.isEmpty()) {
                this.f246d.poll().m41909b(this);
            } else if (!this.f245c.isEmpty()) {
                this.f245c.poll().m41909b(this);
            } else if (this.f247e.isEmpty()) {
            } else {
                m41898g(this.f247e.poll());
            }
        }

        /* renamed from: g */
        private void m41898g(C13130c c13130c) {
            C0099b.this.f219j.m41905d(c13130c);
            C0099b.this.f221m.m41905d(c13130c);
            C0099b.this.f205c.m1533k().m35239i(c13130c);
        }

        /* renamed from: a */
        public void m41904a(boolean z, C0099b<T>.C0107h c0107h) {
            this.f243a.lock();
            sendEmptyMessage(0);
            if (z) {
                this.f246d.add(c0107h);
            } else {
                this.f245c.add(c0107h);
            }
            this.f243a.unlock();
        }

        /* renamed from: b */
        public void m41903b(C0110k c0110k, LatLng latLng, LatLng latLng2) {
            this.f243a.lock();
            this.f249g.add(new C0106g(C0099b.this, c0110k, latLng, latLng2, null));
            this.f243a.unlock();
        }

        @TargetApi(11)
        /* renamed from: c */
        public void m41902c(C0110k c0110k, LatLng latLng, LatLng latLng2) {
            this.f243a.lock();
            C0099b<T>.C0106g c0106g = new C0106g(C0099b.this, c0110k, latLng, latLng2, null);
            c0106g.m41911b(C0099b.this.f205c.m1533k());
            this.f249g.add(c0106g);
            this.f243a.unlock();
        }

        /* renamed from: d */
        public boolean m41901d() {
            boolean z;
            try {
                this.f243a.lock();
                if (this.f245c.isEmpty() && this.f246d.isEmpty() && this.f248f.isEmpty() && this.f247e.isEmpty()) {
                    if (this.f249g.isEmpty()) {
                        z = false;
                        return z;
                    }
                }
                z = true;
                return z;
            } finally {
                this.f243a.unlock();
            }
        }

        /* renamed from: f */
        public void m41899f(boolean z, C13130c c13130c) {
            this.f243a.lock();
            sendEmptyMessage(0);
            if (z) {
                this.f248f.add(c13130c);
            } else {
                this.f247e.add(c13130c);
            }
            this.f243a.unlock();
        }

        /* renamed from: h */
        public void m41897h() {
            while (m41901d()) {
                sendEmptyMessage(0);
                this.f243a.lock();
                try {
                    try {
                        if (m41901d()) {
                            this.f244b.await();
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    this.f243a.unlock();
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.f250h) {
                Looper.myQueue().addIdleHandler(this);
                this.f250h = true;
            }
            removeMessages(0);
            this.f243a.lock();
            for (int i = 0; i < 10; i++) {
                try {
                    m41900e();
                } finally {
                    this.f243a.unlock();
                }
            }
            if (!m41901d()) {
                this.f250h = false;
                Looper.myQueue().removeIdleHandler(this);
                this.f244b.signalAll();
            } else {
                sendEmptyMessageDelayed(0, 10L);
            }
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        private HandlerC0109j() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f243a = reentrantLock;
            this.f244b = reentrantLock.newCondition();
            this.f245c = new LinkedList();
            this.f246d = new LinkedList();
            this.f247e = new LinkedList();
            this.f248f = new LinkedList();
            this.f249g = new LinkedList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: ab.b$k */
    /* loaded from: classes2.dex */
    public static class C0110k {

        /* renamed from: a */
        private final C13130c f252a;

        /* renamed from: b */
        private LatLng f253b;

        /* synthetic */ C0110k(C13130c c13130c, C0100a c0100a) {
            this(c13130c);
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0110k) {
                return this.f252a.equals(((C0110k) obj).f252a);
            }
            return false;
        }

        public int hashCode() {
            return this.f252a.hashCode();
        }

        private C0110k(C13130c c13130c) {
            this.f252a = c13130c;
            this.f253b = c13130c.m1560a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: ab.b$l */
    /* loaded from: classes2.dex */
    public class RunnableC0111l implements Runnable {

        /* renamed from: A */
        private float f254A;

        /* renamed from: w */
        final Set<? extends InterfaceC13142a<T>> f256w;

        /* renamed from: x */
        private Runnable f257x;

        /* renamed from: y */
        private C11591e f258y;

        /* renamed from: z */
        private C4774b f259z;

        /* synthetic */ RunnableC0111l(C0099b c0099b, Set set, C0100a c0100a) {
            this(set);
        }

        /* renamed from: a */
        public void m41893a(Runnable runnable) {
            this.f257x = runnable;
        }

        /* renamed from: b */
        public void m41892b(float f) {
            this.f254A = f;
            this.f259z = new C4774b(Math.pow(2.0d, Math.min(f, C0099b.this.f209n)) * 256.0d);
        }

        /* renamed from: c */
        public void m41891c(C11591e c11591e) {
            this.f258y = c11591e;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            LatLngBounds m31553a;
            ArrayList arrayList;
            if (this.f256w.equals(C0099b.this.f208l)) {
                this.f257x.run();
                return;
            }
            ArrayList arrayList2 = null;
            HandlerC0109j handlerC0109j = new HandlerC0109j(C0099b.this, null);
            float f = this.f254A;
            boolean z = f > C0099b.this.f209n;
            float f2 = f - C0099b.this.f209n;
            Set<C0110k> set = C0099b.this.f217h;
            try {
                m31553a = this.f258y.m4651a().f8276A;
            } catch (Exception e) {
                e.printStackTrace();
                m31553a = LatLngBounds.m31556h().m31552b(new LatLng(0.0d, 0.0d)).m31553a();
            }
            if (C0099b.this.f208l == null || !C0099b.this.f223e) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (InterfaceC13142a<T> interfaceC13142a : C0099b.this.f208l) {
                    if (C0099b.this.mo41939S(interfaceC13142a) && m31553a.m31555t(interfaceC13142a.mo523b())) {
                        arrayList.add(this.f259z.m26651b(interfaceC13142a.mo523b()));
                    }
                }
            }
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (InterfaceC13142a<T> interfaceC13142a2 : this.f256w) {
                boolean m31555t = m31553a.m31555t(interfaceC13142a2.mo523b());
                if (z && m31555t && C0099b.this.f223e) {
                    C2107b m41953E = C0099b.this.m41953E(arrayList, this.f259z.m26651b(interfaceC13142a2.mo523b()));
                    if (m41953E != null) {
                        handlerC0109j.m41904a(true, new C0107h(interfaceC13142a2, newSetFromMap, this.f259z.m26652a(m41953E)));
                    } else {
                        handlerC0109j.m41904a(true, new C0107h(interfaceC13142a2, newSetFromMap, null));
                    }
                } else {
                    handlerC0109j.m41904a(m31555t, new C0107h(interfaceC13142a2, newSetFromMap, null));
                }
            }
            handlerC0109j.m41897h();
            set.removeAll(newSetFromMap);
            if (C0099b.this.f223e) {
                arrayList2 = new ArrayList();
                for (InterfaceC13142a<T> interfaceC13142a3 : this.f256w) {
                    if (C0099b.this.mo41939S(interfaceC13142a3) && m31553a.m31555t(interfaceC13142a3.mo523b())) {
                        arrayList2.add(this.f259z.m26651b(interfaceC13142a3.mo523b()));
                    }
                }
            }
            for (C0110k c0110k : set) {
                boolean m31555t2 = m31553a.m31555t(c0110k.f253b);
                if (z || f2 <= -3.0f || !m31555t2 || !C0099b.this.f223e) {
                    handlerC0109j.m41899f(m31555t2, c0110k.f252a);
                } else {
                    C2107b m41953E2 = C0099b.this.m41953E(arrayList2, this.f259z.m26651b(c0110k.f253b));
                    if (m41953E2 != null) {
                        handlerC0109j.m41902c(c0110k, c0110k.f253b, this.f259z.m26652a(m41953E2));
                    } else {
                        handlerC0109j.m41899f(true, c0110k.f252a);
                    }
                }
            }
            handlerC0109j.m41897h();
            C0099b.this.f217h = newSetFromMap;
            C0099b.this.f208l = this.f256w;
            C0099b.this.f209n = f;
            this.f257x.run();
        }

        private RunnableC0111l(Set<? extends InterfaceC13142a<T>> set) {
            this.f256w = set;
        }
    }

    public C0099b(Context context, C11581c c11581c, C13144c<T> c13144c) {
        this.f203a = c11581c;
        this.f206d = context.getResources().getDisplayMetrics().density;
        C5443b c5443b = new C5443b(context);
        this.f204b = c5443b;
        c5443b.m24347g(m41946L(context));
        c5443b.m24345i(C12335e.amu_ClusterIcon_TextAppearance);
        c5443b.m24349e(m41947K());
        this.f205c = c13144c;
    }

    /* renamed from: D */
    private static double m41954D(C2107b c2107b, C2107b c2107b2) {
        double d = c2107b.f6112a;
        double d2 = c2107b2.f6112a;
        double d3 = (d - d2) * (d - d2);
        double d4 = c2107b.f6113b;
        double d5 = c2107b2.f6113b;
        return d3 + ((d4 - d5) * (d4 - d5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public C2107b m41953E(List<C2107b> list, C2107b c2107b) {
        C2107b c2107b2 = null;
        if (list != null && !list.isEmpty()) {
            int mo527f = this.f205c.m1536h().mo527f();
            double d = mo527f * mo527f;
            for (C2107b c2107b3 : list) {
                double m41954D = m41954D(c2107b3, c2107b);
                if (m41954D < d) {
                    c2107b2 = c2107b3;
                    d = m41954D;
                }
            }
        }
        return c2107b2;
    }

    /* renamed from: K */
    private LayerDrawable m41947K() {
        this.f207g = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.f207g});
        int i = (int) (this.f206d * 3.0f);
        layerDrawable.setLayerInset(1, i, i, i, i);
        return layerDrawable;
    }

    /* renamed from: L */
    private C5444c m41946L(Context context) {
        C5444c c5444c = new C5444c(context);
        c5444c.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        c5444c.setId(C12333c.amu_text);
        int i = (int) (this.f206d * 12.0f);
        c5444c.setPadding(i, i, i, i);
        return c5444c;
    }

    /* renamed from: F */
    protected int m41952F(InterfaceC13142a<T> interfaceC13142a) {
        int mo524a = interfaceC13142a.mo524a();
        int i = 0;
        if (mo524a <= f201v[0]) {
            return mo524a;
        }
        while (true) {
            int[] iArr = f201v;
            if (i < iArr.length - 1) {
                int i2 = i + 1;
                if (mo524a < iArr[i2]) {
                    return iArr[i];
                }
                i = i2;
            } else {
                return iArr[iArr.length - 1];
            }
        }
    }

    /* renamed from: G */
    protected String m41951G(int i) {
        if (i < f201v[0]) {
            return String.valueOf(i);
        }
        return i + "+";
    }

    /* renamed from: H */
    protected int m41950H(int i) {
        float min = 300.0f - Math.min(i, 300.0f);
        return Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    /* renamed from: I */
    protected C13128a mo41949I(InterfaceC13142a<T> interfaceC13142a) {
        int m41952F = m41952F(interfaceC13142a);
        C13128a c13128a = this.f218i.get(m41952F);
        if (c13128a == null) {
            this.f207g.getPaint().setColor(m41950H(m41952F));
            C13128a m1564a = C13129b.m1564a(this.f204b.m24350d(m41951G(m41952F)));
            this.f218i.put(m41952F, m1564a);
            return m1564a;
        }
        return c13128a;
    }

    /* renamed from: J */
    public C13130c m41948J(T t) {
        return this.f219j.m41907b(t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public void mo41945M(T t, MarkerOptions markerOptions) {
        if (t.getTitle() != null && t.mo1545a() != null) {
            markerOptions.m31538P(t.getTitle());
            markerOptions.m31539O(t.mo1545a());
        } else if (t.getTitle() != null) {
            markerOptions.m31538P(t.getTitle());
        } else if (t.mo1545a() != null) {
            markerOptions.m31538P(t.mo1545a());
        }
    }

    /* renamed from: N */
    protected void m41944N(InterfaceC13142a<T> interfaceC13142a, MarkerOptions markerOptions) {
        markerOptions.m31544J(mo41949I(interfaceC13142a));
    }

    /* renamed from: O */
    protected void m41943O(T t, C13130c c13130c) {
    }

    /* renamed from: P */
    protected void m41942P(T t, C13130c c13130c) {
        boolean z = true;
        boolean z2 = false;
        if (t.getTitle() != null && t.mo1545a() != null) {
            if (!t.getTitle().equals(c13130c.m1558c())) {
                c13130c.m1552i(t.getTitle());
                z2 = true;
            }
            if (!t.mo1545a().equals(c13130c.m1559b())) {
                c13130c.m1553h(t.mo1545a());
                z2 = true;
            }
        } else {
            if (t.mo1545a() != null && !t.mo1545a().equals(c13130c.m1558c())) {
                c13130c.m1552i(t.mo1545a());
            } else if (t.getTitle() != null && !t.getTitle().equals(c13130c.m1558c())) {
                c13130c.m1552i(t.getTitle());
            }
            z2 = true;
        }
        if (c13130c.m1560a().equals(t.mo1544b())) {
            z = z2;
        } else {
            c13130c.m1554g(t.mo1544b());
        }
        if (z && c13130c.m1557d()) {
            c13130c.m1551j();
        }
    }

    /* renamed from: Q */
    protected void m41941Q(InterfaceC13142a<T> interfaceC13142a, C13130c c13130c) {
    }

    /* renamed from: R */
    protected void m41940R(InterfaceC13142a<T> interfaceC13142a, C13130c c13130c) {
        c13130c.m1555f(mo41949I(interfaceC13142a));
    }

    /* renamed from: S */
    protected boolean mo41939S(InterfaceC13142a<T> interfaceC13142a) {
        return interfaceC13142a.mo524a() >= this.f220k;
    }

    @Override // p012ab.InterfaceC0098a
    /* renamed from: a */
    public void mo41938a(C13144c.InterfaceC13152h<T> interfaceC13152h) {
        this.f215u = interfaceC13152h;
    }

    @Override // p012ab.InterfaceC0098a
    /* renamed from: b */
    public void mo41937b(C13144c.InterfaceC13151g<T> interfaceC13151g) {
        this.f214t = interfaceC13151g;
    }

    @Override // p012ab.InterfaceC0098a
    /* renamed from: c */
    public void mo41936c(Set<? extends InterfaceC13142a<T>> set) {
        this.f222o.m41890a(set);
    }

    @Override // p012ab.InterfaceC0098a
    /* renamed from: d */
    public void mo41935d(C13144c.InterfaceC13150f<T> interfaceC13150f) {
        this.f213s = interfaceC13150f;
    }

    @Override // p012ab.InterfaceC0098a
    /* renamed from: e */
    public void mo41934e(C13144c.InterfaceC13149e<T> interfaceC13149e) {
        this.f212r = interfaceC13149e;
    }

    @Override // p012ab.InterfaceC0098a
    /* renamed from: f */
    public void mo41933f(C13144c.InterfaceC13147c<T> interfaceC13147c) {
        this.f210p = interfaceC13147c;
    }

    @Override // p012ab.InterfaceC0098a
    /* renamed from: g */
    public void mo41932g() {
        this.f205c.m1534j().m35223l(new C0100a());
        this.f205c.m1534j().m35225j(new C0101b());
        this.f205c.m1534j().m35224k(new C0102c());
        this.f205c.m1535i().m35223l(new C0103d());
        this.f205c.m1535i().m35225j(new C0104e());
        this.f205c.m1535i().m35224k(new C0105f());
    }

    @Override // p012ab.InterfaceC0098a
    /* renamed from: h */
    public void mo41931h() {
        this.f205c.m1534j().m35223l(null);
        this.f205c.m1534j().m35225j(null);
        this.f205c.m1534j().m35224k(null);
        this.f205c.m1535i().m35223l(null);
        this.f205c.m1535i().m35225j(null);
        this.f205c.m1535i().m35224k(null);
    }

    @Override // p012ab.InterfaceC0098a
    /* renamed from: i */
    public void mo41930i(C13144c.InterfaceC13148d<T> interfaceC13148d) {
        this.f211q = interfaceC13148d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: ab.b$i */
    /* loaded from: classes2.dex */
    public static class C0108i<T> {

        /* renamed from: a */
        private Map<T, C13130c> f241a;

        /* renamed from: b */
        private Map<C13130c, T> f242b;

        private C0108i() {
            this.f241a = new HashMap();
            this.f242b = new HashMap();
        }

        /* renamed from: a */
        public T m41908a(C13130c c13130c) {
            return this.f242b.get(c13130c);
        }

        /* renamed from: b */
        public C13130c m41907b(T t) {
            return this.f241a.get(t);
        }

        /* renamed from: c */
        public void m41906c(T t, C13130c c13130c) {
            this.f241a.put(t, c13130c);
            this.f242b.put(c13130c, t);
        }

        /* renamed from: d */
        public void m41905d(C13130c c13130c) {
            T t = this.f242b.get(c13130c);
            this.f242b.remove(c13130c);
            this.f241a.remove(t);
        }

        /* synthetic */ C0108i(C0100a c0100a) {
            this();
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: ab.b$m */
    /* loaded from: classes2.dex */
    private class HandlerC0112m extends Handler {

        /* renamed from: a */
        private boolean f260a;

        /* renamed from: b */
        private C0099b<T>.RunnableC0111l f261b;

        /* compiled from: DefaultClusterRenderer.java */
        /* renamed from: ab.b$m$a */
        /* loaded from: classes2.dex */
        class RunnableC0113a implements Runnable {
            RunnableC0113a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                HandlerC0112m.this.sendEmptyMessage(1);
            }
        }

        private HandlerC0112m() {
            this.f260a = false;
            this.f261b = null;
        }

        /* renamed from: a */
        public void m41890a(Set<? extends InterfaceC13142a<T>> set) {
            synchronized (this) {
                this.f261b = new RunnableC0111l(C0099b.this, set, null);
            }
            sendEmptyMessage(0);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C0099b<T>.RunnableC0111l runnableC0111l;
            if (message.what == 1) {
                this.f260a = false;
                if (this.f261b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.f260a || this.f261b == null) {
                return;
            }
            C11591e m4673d = C0099b.this.f203a.m4673d();
            synchronized (this) {
                runnableC0111l = this.f261b;
                this.f261b = null;
                this.f260a = true;
            }
            runnableC0111l.m41893a(new RunnableC0113a());
            runnableC0111l.m41891c(m4673d);
            runnableC0111l.m41892b(C0099b.this.f203a.m4674c().f8246x);
            C0099b.this.f216f.execute(runnableC0111l);
        }

        /* synthetic */ HandlerC0112m(C0099b c0099b, C0100a c0100a) {
            this();
        }
    }
}
