package p039c3;

import android.view.ViewGroup;

/* renamed from: c3.l */
/* loaded from: classes.dex */
public class C2035l {

    /* renamed from: a */
    private ViewGroup f5896a;

    /* renamed from: b */
    private Runnable f5897b;

    /* renamed from: b */
    public static C2035l m34892b(ViewGroup viewGroup) {
        return (C2035l) viewGroup.getTag(C2028j.transition_current_scene);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m34891c(ViewGroup viewGroup, C2035l c2035l) {
        viewGroup.setTag(C2028j.transition_current_scene, c2035l);
    }

    /* renamed from: a */
    public void m34893a() {
        Runnable runnable;
        if (m34892b(this.f5896a) != this || (runnable = this.f5897b) == null) {
            return;
        }
        runnable.run();
    }
}
