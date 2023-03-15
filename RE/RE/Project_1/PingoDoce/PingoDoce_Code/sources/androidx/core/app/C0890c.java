package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.core.util.C1072d;

/* renamed from: androidx.core.app.c */
/* loaded from: classes.dex */
public class C0890c {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActivityOptionsCompat.java */
    /* renamed from: androidx.core.app.c$a */
    /* loaded from: classes.dex */
    public static class C0891a extends C0890c {

        /* renamed from: a */
        private final ActivityOptions f3067a;

        C0891a(ActivityOptions activityOptions) {
            this.f3067a = activityOptions;
        }

        @Override // androidx.core.app.C0890c
        /* renamed from: b */
        public Bundle mo39250b() {
            return this.f3067a.toBundle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityOptionsCompat.java */
    /* renamed from: androidx.core.app.c$b */
    /* loaded from: classes.dex */
    public static class C0892b {
        /* renamed from: a */
        static ActivityOptions m39249a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        /* renamed from: b */
        static ActivityOptions m39248b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        /* renamed from: c */
        static ActivityOptions m39247c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    protected C0890c() {
    }

    /* renamed from: a */
    public static C0890c m39251a(Activity activity, C1072d<View, String>... c1072dArr) {
        if (Build.VERSION.SDK_INT >= 21) {
            Pair[] pairArr = null;
            if (c1072dArr != null) {
                pairArr = new Pair[c1072dArr.length];
                for (int i = 0; i < c1072dArr.length; i++) {
                    pairArr[i] = Pair.create(c1072dArr[i].f3406a, c1072dArr[i].f3407b);
                }
            }
            return new C0891a(C0892b.m39248b(activity, pairArr));
        }
        return new C0890c();
    }

    /* renamed from: b */
    public Bundle mo39250b() {
        return null;
    }
}
