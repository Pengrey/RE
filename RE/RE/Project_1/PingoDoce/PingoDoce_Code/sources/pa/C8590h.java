package pa;

import android.content.Context;
import p177j9.C6378d;
import p177j9.C6401q;
import p177j9.InterfaceC6381e;
import p177j9.InterfaceC6387h;

/* renamed from: pa.h */
/* loaded from: classes.dex */
public class C8590h {

    /* compiled from: LibraryVersionComponent.java */
    /* renamed from: pa.h$a */
    /* loaded from: classes.dex */
    public interface InterfaceC8591a<T> {
        /* renamed from: a */
        String mo15078a(T t);
    }

    /* renamed from: b */
    public static C6378d<?> m15081b(String str, String str2) {
        return C6378d.m21113i(AbstractC8588f.m15085a(str, str2), AbstractC8588f.class);
    }

    /* renamed from: c */
    public static C6378d<?> m15080c(final String str, final InterfaceC8591a<Context> interfaceC8591a) {
        return C6378d.m21112j(AbstractC8588f.class).m21104b(C6401q.m21042j(Context.class)).m21100f(new InterfaceC6387h() { // from class: pa.g
            @Override // p177j9.InterfaceC6387h
            /* renamed from: a */
            public final Object mo1546a(InterfaceC6381e interfaceC6381e) {
                AbstractC8588f m15079d;
                m15079d = C8590h.m15079d(str, interfaceC8591a, interfaceC6381e);
                return m15079d;
            }
        }).m21102d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ AbstractC8588f m15079d(String str, InterfaceC8591a interfaceC8591a, InterfaceC6381e interfaceC6381e) {
        return AbstractC8588f.m15085a(str, interfaceC8591a.mo15078a((Context) interfaceC6381e.mo21096a(Context.class)));
    }
}
