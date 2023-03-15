package p358t0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p112g0.MutableVector;
import p169j1.ModifiedFocusNode;
import p169j1.ModifiedFocusRequesterNode;

/* renamed from: t0.s */
/* loaded from: classes.dex */
public final class C10349s {

    /* renamed from: b */
    public static final C10350a f26942b = new C10350a(null);

    /* renamed from: c */
    private static final C10349s f26943c;

    /* renamed from: a */
    private final MutableVector<ModifiedFocusRequesterNode> f26944a = new MutableVector<>(new ModifiedFocusRequesterNode[16], 0);

    /* compiled from: FocusRequester.kt */
    /* renamed from: t0.s$a */
    /* loaded from: classes.dex */
    public static final class C10350a {
        private C10350a() {
        }

        public /* synthetic */ C10350a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C10349s m8188a() {
            return C10349s.f26943c;
        }
    }

    static {
        int i = MutableVector.f15792z;
        f26943c = new C10349s();
    }

    /* renamed from: b */
    public final MutableVector<ModifiedFocusRequesterNode> m8190b() {
        return this.f26944a;
    }

    /* renamed from: c */
    public final void m8189c() {
        if (this.f26944a.m23646s()) {
            MutableVector<ModifiedFocusRequesterNode> mutableVector = this.f26944a;
            int m23649p = mutableVector.m23649p();
            if (m23649p > 0) {
                int i = 0;
                Object[] m23650o = mutableVector.m23650o();
                do {
                    ModifiedFocusNode m21298Y1 = ((ModifiedFocusRequesterNode) m23650o[i]).m21298Y1();
                    if (m21298Y1 != null) {
                        FocusTransactions.m8179h(m21298Y1);
                    }
                    i++;
                } while (i < m23649p);
                return;
            }
            return;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }
}
