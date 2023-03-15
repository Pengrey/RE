package dagger.android;

import android.app.Application;
import com.google.errorprone.annotations.ForOverride;
import p384uc.InterfaceC10866b;

/* renamed from: dagger.android.b */
/* loaded from: classes2.dex */
public abstract class AbstractApplicationC4770b extends Application implements InterfaceC10866b {

    /* renamed from: w */
    volatile DispatchingAndroidInjector<Object> f13074w;

    /* renamed from: b */
    private void m26655b() {
        if (this.f13074w == null) {
            synchronized (this) {
                if (this.f13074w == null) {
                    mo26656a().mo2889c(this);
                    if (this.f13074w == null) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }

    @ForOverride
    /* renamed from: a */
    protected abstract InterfaceC4768a<? extends AbstractApplicationC4770b> mo26656a();

    @Override // p384uc.InterfaceC10866b
    /* renamed from: j */
    public InterfaceC4768a<Object> mo5749j() {
        m26655b();
        return this.f13074w;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        m26655b();
    }
}
