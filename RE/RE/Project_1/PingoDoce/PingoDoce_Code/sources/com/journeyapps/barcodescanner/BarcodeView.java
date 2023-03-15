package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import com.google.zxing.C4411o;
import com.google.zxing.EnumC4399d;
import java.util.HashMap;
import java.util.List;
import p138hc.C5888c;
import p138hc.C5892g;
import p138hc.C5894i;
import p138hc.C5895j;
import p138hc.C5898k;
import p138hc.C5907s;
import p138hc.InterfaceC5886a;
import p138hc.InterfaceC5893h;
import p201kb.C6635k;

/* loaded from: classes2.dex */
public class BarcodeView extends C4440a {

    /* renamed from: a0 */
    private EnumC4436b f11962a0;

    /* renamed from: b0 */
    private InterfaceC5886a f11963b0;

    /* renamed from: c0 */
    private C5895j f11964c0;

    /* renamed from: d0 */
    private InterfaceC5893h f11965d0;

    /* renamed from: e0 */
    private Handler f11966e0;

    /* renamed from: f0 */
    private final Handler.Callback f11967f0;

    /* renamed from: com.journeyapps.barcodescanner.BarcodeView$a */
    /* loaded from: classes2.dex */
    class C4435a implements Handler.Callback {
        C4435a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == C6635k.zxing_decode_succeeded) {
                C5888c c5888c = (C5888c) message.obj;
                if (c5888c != null && BarcodeView.this.f11963b0 != null && BarcodeView.this.f11962a0 != EnumC4436b.NONE) {
                    BarcodeView.this.f11963b0.mo22820a(c5888c);
                    if (BarcodeView.this.f11962a0 == EnumC4436b.SINGLE) {
                        BarcodeView.this.m27586M();
                    }
                }
                return true;
            } else if (i == C6635k.zxing_decode_failed) {
                return true;
            } else {
                if (i == C6635k.zxing_possible_result_points) {
                    List<C4411o> list = (List) message.obj;
                    if (BarcodeView.this.f11963b0 != null && BarcodeView.this.f11962a0 != EnumC4436b.NONE) {
                        BarcodeView.this.f11963b0.mo22819b(list);
                    }
                    return true;
                }
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.journeyapps.barcodescanner.BarcodeView$b */
    /* loaded from: classes2.dex */
    public enum EnumC4436b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11962a0 = EnumC4436b.NONE;
        this.f11963b0 = null;
        this.f11967f0 = new C4435a();
        m27589J();
    }

    /* renamed from: G */
    private C5892g m27592G() {
        if (this.f11965d0 == null) {
            this.f11965d0 = m27591H();
        }
        C5894i c5894i = new C5894i();
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC4399d.NEED_RESULT_POINT_CALLBACK, c5894i);
        C5892g mo22795a = this.f11965d0.mo22795a(hashMap);
        c5894i.m22808b(mo22795a);
        return mo22795a;
    }

    /* renamed from: J */
    private void m27589J() {
        this.f11965d0 = new C5898k();
        this.f11966e0 = new Handler(this.f11967f0);
    }

    /* renamed from: K */
    private void m27588K() {
        m27587L();
        if (this.f11962a0 == EnumC4436b.NONE || !m27548t()) {
            return;
        }
        C5895j c5895j = new C5895j(getCameraInstance(), m27592G(), this.f11966e0);
        this.f11964c0 = c5895j;
        c5895j.m22799i(getPreviewFramingRect());
        this.f11964c0.m22797k();
    }

    /* renamed from: L */
    private void m27587L() {
        C5895j c5895j = this.f11964c0;
        if (c5895j != null) {
            c5895j.m22796l();
            this.f11964c0 = null;
        }
    }

    /* renamed from: H */
    protected InterfaceC5893h m27591H() {
        return new C5898k();
    }

    /* renamed from: I */
    public void m27590I(InterfaceC5886a interfaceC5886a) {
        this.f11962a0 = EnumC4436b.SINGLE;
        this.f11963b0 = interfaceC5886a;
        m27588K();
    }

    /* renamed from: M */
    public void m27586M() {
        this.f11962a0 = EnumC4436b.NONE;
        this.f11963b0 = null;
        m27587L();
    }

    public InterfaceC5893h getDecoderFactory() {
        return this.f11965d0;
    }

    public void setDecoderFactory(InterfaceC5893h interfaceC5893h) {
        C5907s.m22768a();
        this.f11965d0 = interfaceC5893h;
        C5895j c5895j = this.f11964c0;
        if (c5895j != null) {
            c5895j.m22798j(m27592G());
        }
    }

    @Override // com.journeyapps.barcodescanner.C4440a
    /* renamed from: u */
    public void mo27547u() {
        m27587L();
        super.mo27547u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.journeyapps.barcodescanner.C4440a
    /* renamed from: x */
    public void mo27544x() {
        super.mo27544x();
        m27588K();
    }
}
