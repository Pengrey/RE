package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0928a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.p */
/* loaded from: classes.dex */
public final class C0926p implements Iterable<Intent> {

    /* renamed from: w */
    private final ArrayList<Intent> f3184w = new ArrayList<>();

    /* renamed from: x */
    private final Context f3185x;

    /* compiled from: TaskStackBuilder.java */
    /* renamed from: androidx.core.app.p$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0927a {
        /* renamed from: v */
        Intent mo39117v();
    }

    private C0926p(Context context) {
        this.f3185x = context;
    }

    /* renamed from: h */
    public static C0926p m39120h(Context context) {
        return new C0926p(context);
    }

    /* renamed from: b */
    public C0926p m39123b(Intent intent) {
        this.f3184w.add(intent);
        return this;
    }

    /* renamed from: f */
    public C0926p m39122f(Activity activity) {
        Intent mo39117v = activity instanceof InterfaceC0927a ? ((InterfaceC0927a) activity).mo39117v() : null;
        if (mo39117v == null) {
            mo39117v = C0905h.m39223a(activity);
        }
        if (mo39117v != null) {
            ComponentName component = mo39117v.getComponent();
            if (component == null) {
                component = mo39117v.resolveActivity(this.f3185x.getPackageManager());
            }
            m39121g(component);
            m39123b(mo39117v);
        }
        return this;
    }

    /* renamed from: g */
    public C0926p m39121g(ComponentName componentName) {
        int size = this.f3184w.size();
        try {
            Intent m39222b = C0905h.m39222b(this.f3185x, componentName);
            while (m39222b != null) {
                this.f3184w.add(size, m39222b);
                m39222b = C0905h.m39222b(this.f3185x, m39222b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f3184w.iterator();
    }

    /* renamed from: l */
    public void m39119l() {
        m39118o(null);
    }

    /* renamed from: o */
    public void m39118o(Bundle bundle) {
        if (!this.f3184w.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f3184w.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (C0928a.m39105l(this.f3185x, intentArr, bundle)) {
                return;
            }
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f3185x.startActivity(intent);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
