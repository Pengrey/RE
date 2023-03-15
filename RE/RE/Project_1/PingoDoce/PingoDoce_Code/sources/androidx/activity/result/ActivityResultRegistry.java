package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.C0890c;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1491v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p050d.ActivityResultContract;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    private Random f653a = new Random();

    /* renamed from: b */
    private final Map<Integer, String> f654b = new HashMap();

    /* renamed from: c */
    final Map<String, Integer> f655c = new HashMap();

    /* renamed from: d */
    private final Map<String, C0300d> f656d = new HashMap();

    /* renamed from: e */
    ArrayList<String> f657e = new ArrayList<>();

    /* renamed from: f */
    final transient Map<String, C0299c<?>> f658f = new HashMap();

    /* renamed from: g */
    final Map<String, Object> f659g = new HashMap();

    /* renamed from: h */
    final Bundle f660h = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    /* loaded from: classes.dex */
    public class C0297a extends AbstractC0304b<I> {

        /* renamed from: a */
        final /* synthetic */ String f665a;

        /* renamed from: b */
        final /* synthetic */ ActivityResultContract f666b;

        C0297a(String str, ActivityResultContract activityResultContract) {
            this.f665a = str;
            this.f666b = activityResultContract;
        }

        @Override // androidx.activity.result.AbstractC0304b
        /* renamed from: b */
        public void mo37539b(I i, C0890c c0890c) {
            Integer num = ActivityResultRegistry.this.f655c.get(this.f665a);
            if (num != null) {
                ActivityResultRegistry.this.f657e.add(this.f665a);
                try {
                    ActivityResultRegistry.this.mo41342f(num.intValue(), this.f666b, i, c0890c);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.f657e.remove(this.f665a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f666b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.AbstractC0304b
        /* renamed from: c */
        public void mo37538c() {
            ActivityResultRegistry.this.m41336l(this.f665a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    /* loaded from: classes.dex */
    public class C0298b extends AbstractC0304b<I> {

        /* renamed from: a */
        final /* synthetic */ String f668a;

        /* renamed from: b */
        final /* synthetic */ ActivityResultContract f669b;

        C0298b(String str, ActivityResultContract activityResultContract) {
            this.f668a = str;
            this.f669b = activityResultContract;
        }

        @Override // androidx.activity.result.AbstractC0304b
        /* renamed from: b */
        public void mo37539b(I i, C0890c c0890c) {
            Integer num = ActivityResultRegistry.this.f655c.get(this.f668a);
            if (num != null) {
                ActivityResultRegistry.this.f657e.add(this.f668a);
                ActivityResultRegistry.this.mo41342f(num.intValue(), this.f669b, i, c0890c);
                return;
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f669b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.AbstractC0304b
        /* renamed from: c */
        public void mo37538c() {
            ActivityResultRegistry.this.m41336l(this.f668a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    /* loaded from: classes.dex */
    public static class C0299c<O> {

        /* renamed from: a */
        final InterfaceC0303a<O> f671a;

        /* renamed from: b */
        final ActivityResultContract<?, O> f672b;

        C0299c(InterfaceC0303a<O> interfaceC0303a, ActivityResultContract<?, O> activityResultContract) {
            this.f671a = interfaceC0303a;
            this.f672b = activityResultContract;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    /* loaded from: classes.dex */
    public static class C0300d {

        /* renamed from: a */
        final AbstractC1469p f673a;

        /* renamed from: b */
        private final ArrayList<InterfaceC1485s> f674b = new ArrayList<>();

        C0300d(AbstractC1469p abstractC1469p) {
            this.f673a = abstractC1469p;
        }

        /* renamed from: a */
        void m41335a(InterfaceC1485s interfaceC1485s) {
            this.f673a.mo10402a(interfaceC1485s);
            this.f674b.add(interfaceC1485s);
        }

        /* renamed from: b */
        void m41334b() {
            Iterator<InterfaceC1485s> it = this.f674b.iterator();
            while (it.hasNext()) {
                this.f673a.mo10400c(it.next());
            }
            this.f674b.clear();
        }
    }

    /* renamed from: a */
    private void m41347a(int i, String str) {
        this.f654b.put(Integer.valueOf(i), str);
        this.f655c.put(str, Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private <O> void m41344d(String str, int i, Intent intent, C0299c<O> c0299c) {
        if (c0299c != null && c0299c.f671a != null && this.f657e.contains(str)) {
            c0299c.f671a.mo37406b(c0299c.f672b.mo37401e(i, intent));
            this.f657e.remove(str);
            return;
        }
        this.f659g.remove(str);
        this.f660h.putParcelable(str, new ActivityResult(i, intent));
    }

    /* renamed from: e */
    private int m41343e() {
        int nextInt = this.f653a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f654b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f653a.nextInt(2147418112);
        }
    }

    /* renamed from: k */
    private void m41337k(String str) {
        if (this.f655c.get(str) != null) {
            return;
        }
        m41347a(m41343e(), str);
    }

    /* renamed from: b */
    public final boolean m41346b(int i, int i2, Intent intent) {
        String str = this.f654b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        m41344d(str, i2, intent, this.f658f.get(str));
        return true;
    }

    /* renamed from: c */
    public final <O> boolean m41345c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        InterfaceC0303a<?> interfaceC0303a;
        String str = this.f654b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0299c<?> c0299c = this.f658f.get(str);
        if (c0299c != null && (interfaceC0303a = c0299c.f671a) != null) {
            if (this.f657e.remove(str)) {
                interfaceC0303a.mo37406b(o);
                return true;
            }
            return true;
        }
        this.f660h.remove(str);
        this.f659g.put(str, o);
        return true;
    }

    /* renamed from: f */
    public abstract <I, O> void mo41342f(int i, ActivityResultContract<I, O> activityResultContract, @SuppressLint({"UnknownNullness"}) I i2, C0890c c0890c);

    /* renamed from: g */
    public final void m41341g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f657e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f653a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f660h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            if (this.f655c.containsKey(str)) {
                Integer remove = this.f655c.remove(str);
                if (!this.f660h.containsKey(str)) {
                    this.f654b.remove(remove);
                }
            }
            m41347a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    /* renamed from: h */
    public final void m41340h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f655c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f655c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f657e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f660h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f653a);
    }

    /* renamed from: i */
    public final <I, O> AbstractC0304b<I> m41339i(final String str, InterfaceC1491v interfaceC1491v, final ActivityResultContract<I, O> activityResultContract, final InterfaceC0303a<O> interfaceC0303a) {
        AbstractC1469p mo137b = interfaceC1491v.mo137b();
        if (!mo137b.mo10401b().isAtLeast(AbstractC1469p.EnumC1472c.STARTED)) {
            m41337k(str);
            C0300d c0300d = this.f656d.get(str);
            if (c0300d == null) {
                c0300d = new C0300d(mo137b);
            }
            c0300d.m41335a(new InterfaceC1485s() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.InterfaceC1485s
                /* renamed from: n */
                public void mo33846n(InterfaceC1491v interfaceC1491v2, AbstractC1469p.EnumC1471b enumC1471b) {
                    if (AbstractC1469p.EnumC1471b.ON_START.equals(enumC1471b)) {
                        ActivityResultRegistry.this.f658f.put(str, new C0299c<>(interfaceC0303a, activityResultContract));
                        if (ActivityResultRegistry.this.f659g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f659g.get(str);
                            ActivityResultRegistry.this.f659g.remove(str);
                            interfaceC0303a.mo37406b(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f660h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.f660h.remove(str);
                            interfaceC0303a.mo37406b(activityResultContract.mo37401e(activityResult.m41351b(), activityResult.m41352a()));
                        }
                    } else if (AbstractC1469p.EnumC1471b.ON_STOP.equals(enumC1471b)) {
                        ActivityResultRegistry.this.f658f.remove(str);
                    } else if (AbstractC1469p.EnumC1471b.ON_DESTROY.equals(enumC1471b)) {
                        ActivityResultRegistry.this.m41336l(str);
                    }
                }
            });
            this.f656d.put(str, c0300d);
            return new C0297a(str, activityResultContract);
        }
        throw new IllegalStateException("LifecycleOwner " + interfaceC1491v + " is attempting to register while current state is " + mo137b.mo10401b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final <I, O> AbstractC0304b<I> m41338j(String str, ActivityResultContract<I, O> activityResultContract, InterfaceC0303a<O> interfaceC0303a) {
        m41337k(str);
        this.f658f.put(str, new C0299c<>(interfaceC0303a, activityResultContract));
        if (this.f659g.containsKey(str)) {
            Object obj = this.f659g.get(str);
            this.f659g.remove(str);
            interfaceC0303a.mo37406b(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f660h.getParcelable(str);
        if (activityResult != null) {
            this.f660h.remove(str);
            interfaceC0303a.mo37406b(activityResultContract.mo37401e(activityResult.m41351b(), activityResult.m41352a()));
        }
        return new C0298b(str, activityResultContract);
    }

    /* renamed from: l */
    final void m41336l(String str) {
        Integer remove;
        if (!this.f657e.contains(str) && (remove = this.f655c.remove(str)) != null) {
            this.f654b.remove(remove);
        }
        this.f658f.remove(str);
        if (this.f659g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f659g.get(str));
            this.f659g.remove(str);
        }
        if (this.f660h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f660h.getParcelable(str));
            this.f660h.remove(str);
        }
        C0300d c0300d = this.f656d.get(str);
        if (c0300d != null) {
            c0300d.m41334b();
            this.f656d.remove(str);
        }
    }
}
