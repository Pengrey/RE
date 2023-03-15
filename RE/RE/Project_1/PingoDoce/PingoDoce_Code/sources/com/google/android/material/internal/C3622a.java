package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.InterfaceC3633h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.material.internal.a */
/* loaded from: classes.dex */
public class C3622a<T extends InterfaceC3633h<T>> {

    /* renamed from: a */
    private final Map<Integer, T> f10103a = new HashMap();

    /* renamed from: b */
    private final Set<Integer> f10104b = new HashSet();

    /* renamed from: c */
    private InterfaceC3624b f10105c;

    /* renamed from: d */
    private boolean f10106d;

    /* renamed from: e */
    private boolean f10107e;

    /* compiled from: CheckableGroup.java */
    /* renamed from: com.google.android.material.internal.a$a */
    /* loaded from: classes.dex */
    class C3623a implements InterfaceC3633h.InterfaceC3634a<T> {
        C3623a() {
        }

        @Override // com.google.android.material.internal.InterfaceC3633h.InterfaceC3634a
        /* renamed from: b */
        public void mo29538a(T t, boolean z) {
            if (z) {
                if (!C3622a.this.m29651g(t)) {
                    return;
                }
            } else {
                C3622a c3622a = C3622a.this;
                if (!c3622a.m29640r(t, c3622a.f10107e)) {
                    return;
                }
            }
            C3622a.this.m29645m();
        }
    }

    /* compiled from: CheckableGroup.java */
    /* renamed from: com.google.android.material.internal.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3624b {
        /* renamed from: a */
        void mo29638a(Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m29651g(InterfaceC3633h<T> interfaceC3633h) {
        int id2 = interfaceC3633h.getId();
        if (this.f10104b.contains(Integer.valueOf(id2))) {
            return false;
        }
        T t = this.f10103a.get(Integer.valueOf(m29647k()));
        if (t != null) {
            m29640r(t, false);
        }
        boolean add = this.f10104b.add(Integer.valueOf(id2));
        if (!interfaceC3633h.isChecked()) {
            interfaceC3633h.setChecked(true);
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m29645m() {
        InterfaceC3624b interfaceC3624b = this.f10105c;
        if (interfaceC3624b != null) {
            interfaceC3624b.mo29638a(m29649i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public boolean m29640r(InterfaceC3633h<T> interfaceC3633h, boolean z) {
        int id2 = interfaceC3633h.getId();
        if (this.f10104b.contains(Integer.valueOf(id2))) {
            if (z && this.f10104b.size() == 1 && this.f10104b.contains(Integer.valueOf(id2))) {
                interfaceC3633h.setChecked(true);
                return false;
            }
            boolean remove = this.f10104b.remove(Integer.valueOf(id2));
            if (interfaceC3633h.isChecked()) {
                interfaceC3633h.setChecked(false);
            }
            return remove;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public void m29653e(T t) {
        this.f10103a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            m29651g(t);
        }
        t.setInternalOnCheckedChangeListener(new C3623a());
    }

    /* renamed from: f */
    public void m29652f(int i) {
        T t = this.f10103a.get(Integer.valueOf(i));
        if (t != null && m29651g(t)) {
            m29645m();
        }
    }

    /* renamed from: h */
    public void m29650h() {
        boolean z = !this.f10104b.isEmpty();
        for (T t : this.f10103a.values()) {
            m29640r(t, false);
        }
        if (z) {
            m29645m();
        }
    }

    /* renamed from: i */
    public Set<Integer> m29649i() {
        return new HashSet(this.f10104b);
    }

    /* renamed from: j */
    public List<Integer> m29648j(ViewGroup viewGroup) {
        Set<Integer> m29649i = m29649i();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC3633h) && m29649i.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public int m29647k() {
        if (!this.f10106d || this.f10104b.isEmpty()) {
            return -1;
        }
        return this.f10104b.iterator().next().intValue();
    }

    /* renamed from: l */
    public boolean m29646l() {
        return this.f10106d;
    }

    /* renamed from: n */
    public void m29644n(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.f10103a.remove(Integer.valueOf(t.getId()));
        this.f10104b.remove(Integer.valueOf(t.getId()));
    }

    /* renamed from: o */
    public void m29643o(InterfaceC3624b interfaceC3624b) {
        this.f10105c = interfaceC3624b;
    }

    /* renamed from: p */
    public void m29642p(boolean z) {
        this.f10107e = z;
    }

    /* renamed from: q */
    public void m29641q(boolean z) {
        if (this.f10106d != z) {
            this.f10106d = z;
            m29650h();
        }
    }
}
