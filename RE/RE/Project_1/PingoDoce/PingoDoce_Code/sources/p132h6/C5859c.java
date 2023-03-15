package p132h6;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p007a6.AbstractC0046i;
import p007a6.AbstractC0056o;
import p007a6.C0062t;
import p028b6.InterfaceC1825b;
import p028b6.InterfaceC1831g;
import p154i6.InterfaceC6041v;
import p174j6.InterfaceC6313d;
import p196k6.InterfaceC6601a;
import p461y5.InterfaceC13117h;

/* renamed from: h6.c */
/* loaded from: classes.dex */
public class C5859c implements InterfaceC5861e {

    /* renamed from: f */
    private static final Logger f16283f = Logger.getLogger(C0062t.class.getName());

    /* renamed from: a */
    private final InterfaceC6041v f16284a;

    /* renamed from: b */
    private final Executor f16285b;

    /* renamed from: c */
    private final InterfaceC1825b f16286c;

    /* renamed from: d */
    private final InterfaceC6313d f16287d;

    /* renamed from: e */
    private final InterfaceC6601a f16288e;

    public C5859c(Executor executor, InterfaceC1825b interfaceC1825b, InterfaceC6041v interfaceC6041v, InterfaceC6313d interfaceC6313d, InterfaceC6601a interfaceC6601a) {
        this.f16285b = executor;
        this.f16286c = interfaceC1825b;
        this.f16284a = interfaceC6041v;
        this.f16287d = interfaceC6313d;
        this.f16288e = interfaceC6601a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m22869d(AbstractC0056o abstractC0056o, AbstractC0046i abstractC0046i) {
        this.f16287d.mo21221N(abstractC0056o, abstractC0046i);
        this.f16284a.mo22310a(abstractC0056o, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m22868e(final AbstractC0056o abstractC0056o, InterfaceC13117h interfaceC13117h, AbstractC0046i abstractC0046i) {
        try {
            InterfaceC1831g mo35291a = this.f16286c.mo35291a(abstractC0056o.mo42044b());
            if (mo35291a == null) {
                String format = String.format("Transport backend '%s' is not registered", abstractC0056o.mo42044b());
                f16283f.warning(format);
                interfaceC13117h.mo1574a(new IllegalArgumentException(format));
                return;
            }
            final AbstractC0046i mo33711b = mo35291a.mo33711b(abstractC0046i);
            this.f16288e.mo20509h(new InterfaceC6601a.InterfaceC6602a() { // from class: h6.b
                @Override // p196k6.InterfaceC6601a.InterfaceC6602a
                public final Object execute() {
                    Object m22869d;
                    m22869d = C5859c.this.m22869d(abstractC0056o, mo33711b);
                    return m22869d;
                }
            });
            interfaceC13117h.mo1574a(null);
        } catch (Exception e) {
            Logger logger = f16283f;
            logger.warning("Error scheduling event " + e.getMessage());
            interfaceC13117h.mo1574a(e);
        }
    }

    @Override // p132h6.InterfaceC5861e
    /* renamed from: a */
    public void mo22864a(final AbstractC0056o abstractC0056o, final AbstractC0046i abstractC0046i, final InterfaceC13117h interfaceC13117h) {
        this.f16285b.execute(new Runnable() { // from class: h6.a
            @Override // java.lang.Runnable
            public final void run() {
                C5859c.this.m22868e(abstractC0056o, interfaceC13117h, abstractC0046i);
            }
        });
    }
}
