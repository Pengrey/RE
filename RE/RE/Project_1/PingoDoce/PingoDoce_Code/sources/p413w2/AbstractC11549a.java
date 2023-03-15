package p413w2;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.p020os.OperationCanceledException;
import androidx.core.util.C1077i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: w2.a */
/* loaded from: classes.dex */
public abstract class AbstractC11549a<D> extends C11551b<D> {

    /* renamed from: i */
    private final Executor f29570i;

    /* renamed from: j */
    volatile AbstractC11549a<D>.RunnableC11550a f29571j;

    /* renamed from: k */
    volatile AbstractC11549a<D>.RunnableC11550a f29572k;

    /* renamed from: l */
    long f29573l;

    /* renamed from: m */
    long f29574m;

    /* renamed from: n */
    Handler f29575n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncTaskLoader.java */
    /* renamed from: w2.a$a */
    /* loaded from: classes.dex */
    public final class RunnableC11550a extends AbstractC11554c<Void, Void, D> implements Runnable {

        /* renamed from: F */
        private final CountDownLatch f29576F = new CountDownLatch(1);

        /* renamed from: G */
        boolean f29577G;

        RunnableC11550a() {
        }

        @Override // p413w2.AbstractC11554c
        /* renamed from: h */
        protected void mo4709h(D d) {
            try {
                AbstractC11549a.this.m4744x(this, d);
            } finally {
                this.f29576F.countDown();
            }
        }

        @Override // p413w2.AbstractC11554c
        /* renamed from: i */
        protected void mo4708i(D d) {
            try {
                AbstractC11549a.this.m4743y(this, d);
            } finally {
                this.f29576F.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p413w2.AbstractC11554c
        /* renamed from: n */
        public D mo4715b(Void... voidArr) {
            try {
                return (D) AbstractC11549a.this.m4746C();
            } catch (OperationCanceledException e) {
                if (m4711f()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29577G = false;
            AbstractC11549a.this.m4742z();
        }
    }

    public AbstractC11549a(Context context) {
        this(context, AbstractC11554c.f29589D);
    }

    /* renamed from: A */
    public abstract D mo4748A();

    /* renamed from: B */
    public void m4747B(D d) {
    }

    /* renamed from: C */
    protected D m4746C() {
        return mo4748A();
    }

    @Override // p413w2.C11551b
    @Deprecated
    /* renamed from: g */
    public void mo4734g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo4734g(str, fileDescriptor, printWriter, strArr);
        if (this.f29571j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f29571j);
            printWriter.print(" waiting=");
            printWriter.println(this.f29571j.f29577G);
        }
        if (this.f29572k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f29572k);
            printWriter.print(" waiting=");
            printWriter.println(this.f29572k.f29577G);
        }
        if (this.f29573l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C1077i.m38615c(this.f29573l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C1077i.m38616b(this.f29574m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // p413w2.C11551b
    /* renamed from: k */
    protected boolean mo4730k() {
        if (this.f29571j != null) {
            if (!this.f29582d) {
                this.f29585g = true;
            }
            if (this.f29572k != null) {
                if (this.f29571j.f29577G) {
                    this.f29571j.f29577G = false;
                    this.f29575n.removeCallbacks(this.f29571j);
                }
                this.f29571j = null;
                return false;
            } else if (this.f29571j.f29577G) {
                this.f29571j.f29577G = false;
                this.f29575n.removeCallbacks(this.f29571j);
                this.f29571j = null;
                return false;
            } else {
                boolean m4716a = this.f29571j.m4716a(false);
                if (m4716a) {
                    this.f29572k = this.f29571j;
                    m4745w();
                }
                this.f29571j = null;
                return m4716a;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p413w2.C11551b
    /* renamed from: m */
    public void mo4728m() {
        super.mo4728m();
        m4739b();
        this.f29571j = new RunnableC11550a();
        m4742z();
    }

    /* renamed from: w */
    public void m4745w() {
    }

    /* renamed from: x */
    void m4744x(AbstractC11549a<D>.RunnableC11550a runnableC11550a, D d) {
        m4747B(d);
        if (this.f29572k == runnableC11550a) {
            m4722s();
            this.f29574m = SystemClock.uptimeMillis();
            this.f29572k = null;
            m4736e();
            m4742z();
        }
    }

    /* renamed from: y */
    void m4743y(AbstractC11549a<D>.RunnableC11550a runnableC11550a, D d) {
        if (this.f29571j != runnableC11550a) {
            m4744x(runnableC11550a, d);
        } else if (m4732i()) {
            m4747B(d);
        } else {
            m4738c();
            this.f29574m = SystemClock.uptimeMillis();
            this.f29571j = null;
            m4735f(d);
        }
    }

    /* renamed from: z */
    void m4742z() {
        if (this.f29572k != null || this.f29571j == null) {
            return;
        }
        if (this.f29571j.f29577G) {
            this.f29571j.f29577G = false;
            this.f29575n.removeCallbacks(this.f29571j);
        }
        if (this.f29573l > 0 && SystemClock.uptimeMillis() < this.f29574m + this.f29573l) {
            this.f29571j.f29577G = true;
            this.f29575n.postAtTime(this.f29571j, this.f29574m + this.f29573l);
            return;
        }
        this.f29571j.m4714c(this.f29570i, null);
    }

    private AbstractC11549a(Context context, Executor executor) {
        super(context);
        this.f29574m = -10000L;
        this.f29570i = executor;
    }
}
