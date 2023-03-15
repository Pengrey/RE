package p413w2;

import android.content.Context;
import androidx.core.util.C1069b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: w2.b */
/* loaded from: classes.dex */
public class C11551b<D> {

    /* renamed from: a */
    int f29579a;

    /* renamed from: b */
    InterfaceC11553b<D> f29580b;

    /* renamed from: c */
    InterfaceC11552a<D> f29581c;

    /* renamed from: d */
    boolean f29582d = false;

    /* renamed from: e */
    boolean f29583e = false;

    /* renamed from: f */
    boolean f29584f = true;

    /* renamed from: g */
    boolean f29585g = false;

    /* renamed from: h */
    boolean f29586h = false;

    /* compiled from: Loader.java */
    /* renamed from: w2.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11552a<D> {
        /* renamed from: a */
        void m4718a(C11551b<D> c11551b);
    }

    /* compiled from: Loader.java */
    /* renamed from: w2.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11553b<D> {
        /* renamed from: a */
        void mo4717a(C11551b<D> c11551b, D d);
    }

    public C11551b(Context context) {
        context.getApplicationContext();
    }

    /* renamed from: a */
    public void m4740a() {
        this.f29583e = true;
        m4731j();
    }

    /* renamed from: b */
    public boolean m4739b() {
        return mo4730k();
    }

    /* renamed from: c */
    public void m4738c() {
        this.f29586h = false;
    }

    /* renamed from: d */
    public String m4737d(D d) {
        StringBuilder sb2 = new StringBuilder(64);
        C1069b.m38635a(d, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: e */
    public void m4736e() {
        InterfaceC11552a<D> interfaceC11552a = this.f29581c;
        if (interfaceC11552a != null) {
            interfaceC11552a.m4718a(this);
        }
    }

    /* renamed from: f */
    public void m4735f(D d) {
        InterfaceC11553b<D> interfaceC11553b = this.f29580b;
        if (interfaceC11553b != null) {
            interfaceC11553b.mo4717a(this, d);
        }
    }

    @Deprecated
    /* renamed from: g */
    public void mo4734g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f29579a);
        printWriter.print(" mListener=");
        printWriter.println(this.f29580b);
        if (this.f29582d || this.f29585g || this.f29586h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f29582d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f29585g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f29586h);
        }
        if (this.f29583e || this.f29584f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f29583e);
            printWriter.print(" mReset=");
            printWriter.println(this.f29584f);
        }
    }

    /* renamed from: h */
    public void m4733h() {
        mo4728m();
    }

    /* renamed from: i */
    public boolean m4732i() {
        return this.f29583e;
    }

    /* renamed from: j */
    protected void m4731j() {
    }

    /* renamed from: k */
    protected boolean mo4730k() {
        throw null;
    }

    /* renamed from: l */
    public void m4729l() {
        if (this.f29582d) {
            m4733h();
        } else {
            this.f29585g = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void mo4728m() {
    }

    /* renamed from: n */
    protected void m4727n() {
    }

    /* renamed from: o */
    protected void mo4726o() {
        throw null;
    }

    /* renamed from: p */
    protected void m4725p() {
    }

    /* renamed from: q */
    public void m4724q(int i, InterfaceC11553b<D> interfaceC11553b) {
        if (this.f29580b == null) {
            this.f29580b = interfaceC11553b;
            this.f29579a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: r */
    public void m4723r() {
        m4727n();
        this.f29584f = true;
        this.f29582d = false;
        this.f29583e = false;
        this.f29585g = false;
        this.f29586h = false;
    }

    /* renamed from: s */
    public void m4722s() {
        if (this.f29586h) {
            m4729l();
        }
    }

    /* renamed from: t */
    public final void m4721t() {
        this.f29582d = true;
        this.f29584f = false;
        this.f29583e = false;
        mo4726o();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        C1069b.m38635a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.f29579a);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: u */
    public void m4720u() {
        this.f29582d = false;
        m4725p();
    }

    /* renamed from: v */
    public void m4719v(InterfaceC11553b<D> interfaceC11553b) {
        InterfaceC11553b<D> interfaceC11553b2 = this.f29580b;
        if (interfaceC11553b2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC11553b2 == interfaceC11553b) {
            this.f29580b = null;
            return;
        }
        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
}
