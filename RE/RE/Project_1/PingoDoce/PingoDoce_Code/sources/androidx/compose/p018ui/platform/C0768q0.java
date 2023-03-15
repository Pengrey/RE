package androidx.compose.p018ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.savedstate.InterfaceC1663c;
import androidx.savedstate.SavedStateRegistry;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p092f0.C5209j1;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p244n0.C7573h;
import p244n0.InterfaceC7570f;
import p260o0.InterfaceC7981q;
import p302q0.C9575g;
import p468yc.C13195u;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
/* renamed from: androidx.compose.ui.platform.q0 */
/* loaded from: classes.dex */
public final class C0768q0 {

    /* renamed from: a */
    private static final Class[] f2333a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DisposableSaveableStateRegistry.android.kt */
    /* renamed from: androidx.compose.ui.platform.q0$a */
    /* loaded from: classes.dex */
    public static final class C0769a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ boolean f2334w;

        /* renamed from: x */
        final /* synthetic */ SavedStateRegistry f2335x;

        /* renamed from: y */
        final /* synthetic */ String f2336y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0769a(boolean z, SavedStateRegistry savedStateRegistry, String str) {
            super(0);
            this.f2334w = z;
            this.f2335x = savedStateRegistry;
            this.f2336y = str;
        }

        /* renamed from: a */
        public final void m39630a() {
            if (this.f2334w) {
                this.f2335x.m35791f(this.f2336y);
            }
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m39630a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DisposableSaveableStateRegistry.android.kt */
    /* renamed from: androidx.compose.ui.platform.q0$b */
    /* loaded from: classes.dex */
    public static final class C0770b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C0770b f2337w = new C0770b();

        C0770b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo9587d(Object obj) {
            Intrinsics.isThisObjectNull(obj, "it");
            return Boolean.valueOf(C0768q0.m39634e(obj));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Bundle m39638a(InterfaceC7570f interfaceC7570f) {
        return m39635d(interfaceC7570f);
    }

    /* renamed from: b */
    public static final C0759o0 m39637b(View view, InterfaceC1663c interfaceC1663c) {
        Intrinsics.isThisObjectNull(view, "view");
        Intrinsics.isThisObjectNull(interfaceC1663c, "owner");
        ViewParent parent = view.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(C9575g.compose_view_saveable_id_tag);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return m39636c(str, interfaceC1663c);
    }

    /* renamed from: c */
    public static final C0759o0 m39636c(String str, InterfaceC1663c interfaceC1663c) {
        boolean z;
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(interfaceC1663c, "savedStateRegistryOwner");
        String str2 = ((Object) InterfaceC7570f.class.getSimpleName()) + ':' + str;
        SavedStateRegistry mo35784i = interfaceC1663c.mo35784i();
        Intrinsics.checkIfNull(mo35784i, "savedStateRegistryOwner.savedStateRegistry");
        Bundle m35796a = mo35784i.m35796a(str2);
        final InterfaceC7570f m18116a = C7573h.m18116a(m35796a == null ? null : m39631h(m35796a), C0770b.f2337w);
        try {
            mo35784i.m35793d(str2, new SavedStateRegistry.InterfaceC1660b() { // from class: androidx.compose.ui.platform.p0
                @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1660b
                /* renamed from: a */
                public final Bundle mo35789a() {
                    Bundle m37145d;
                    m37145d = C0768q0.m39635d(InterfaceC7570f.this);
                    return m37145d;
                }
            });
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new C0759o0(m18116a, new C0769a(z, mo35784i, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final Bundle m39635d(InterfaceC7570f interfaceC7570f) {
        Intrinsics.isThisObjectNull(interfaceC7570f, "$saveableStateRegistry");
        return m39632g(interfaceC7570f.mo18126b());
    }

    /* renamed from: e */
    public static final /* synthetic */ boolean m39634e(Object obj) {
        return m39633f(obj);
    }

    /* renamed from: f */
    private static final boolean m39633f(Object obj) {
        if (obj instanceof InterfaceC7981q) {
            InterfaceC7981q interfaceC7981q = (InterfaceC7981q) obj;
            if (interfaceC7981q.mo17279d() == C5209j1.m25071g() || interfaceC7981q.mo17279d() == C5209j1.m25065m() || interfaceC7981q.mo17279d() == C5209j1.m25068j()) {
                T value = interfaceC7981q.getValue();
                if (value == 0) {
                    return true;
                }
                return m39633f(value);
            }
            return false;
        }
        Class[] clsArr = f2333a;
        int length = clsArr.length;
        int i = 0;
        while (i < length) {
            Class cls = clsArr[i];
            i++;
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private static final Bundle m39632g(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle;
    }

    /* renamed from: h */
    private static final Map m39631h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        Intrinsics.checkIfNull(keySet, "this.keySet()");
        for (String str : keySet) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            Objects.requireNonNull(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            Intrinsics.checkIfNull(str, "key");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
