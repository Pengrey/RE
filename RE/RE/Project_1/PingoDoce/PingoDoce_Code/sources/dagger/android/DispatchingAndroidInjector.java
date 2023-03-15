package dagger.android;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.android.InterfaceC4768a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p423wc.C11612a;
import p423wc.C11617f;
import p445xc.InterfaceC12341a;

/* loaded from: classes2.dex */
public final class DispatchingAndroidInjector<T> implements InterfaceC4768a<T> {

    /* renamed from: a */
    private final Map<String, InterfaceC12341a<InterfaceC4768a.InterfaceC4769a<?>>> f13073a;

    /* loaded from: classes2.dex */
    public static final class InvalidInjectorBindingException extends RuntimeException {
        InvalidInjectorBindingException(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DispatchingAndroidInjector(Map<Class<?>, InterfaceC12341a<InterfaceC4768a.InterfaceC4769a<?>>> map, Map<String, InterfaceC12341a<InterfaceC4768a.InterfaceC4769a<?>>> map2) {
        this.f13073a = m26657d(map, map2);
    }

    /* renamed from: b */
    private String m26659b(T t) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = t.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.f13073a.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        return arrayList.isEmpty() ? String.format("No injector factory bound for Class<%s>", t.getClass().getCanonicalName()) : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", t.getClass().getCanonicalName(), arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private static <C, V> Map<String, InterfaceC12341a<InterfaceC4768a.InterfaceC4769a<?>>> m26657d(Map<Class<? extends C>, V> map, Map<String, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        LinkedHashMap m4597b = C11612a.m4597b(map.size() + map2.size());
        m4597b.putAll(map2);
        for (Map.Entry<Class<? extends C>, V> entry : map.entrySet()) {
            m4597b.put(entry.getKey().getName(), entry.getValue());
        }
        return Collections.unmodifiableMap(m4597b);
    }

    @Override // dagger.android.InterfaceC4768a
    /* renamed from: a */
    public void mo2889c(T t) {
        if (!m26658c(t)) {
            throw new IllegalArgumentException(m26659b(t));
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    public boolean m26658c(T t) {
        InterfaceC12341a<InterfaceC4768a.InterfaceC4769a<?>> interfaceC12341a = this.f13073a.get(t.getClass().getName());
        if (interfaceC12341a == null) {
            return false;
        }
        InterfaceC4768a.InterfaceC4769a<?> mo42226get = interfaceC12341a.mo42226get();
        try {
            ((InterfaceC4768a) C11617f.m4588c(mo42226get.mo2891c(t), "%s.create(I) should not return null.", mo42226get.getClass())).mo2889c(t);
            return true;
        } catch (ClassCastException e) {
            throw new InvalidInjectorBindingException(String.format("%s does not implement AndroidInjector.Factory<%s>", mo42226get.getClass().getCanonicalName(), t.getClass().getCanonicalName()), e);
        }
    }
}
