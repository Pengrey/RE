package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.zxing.C4404i;
import com.google.zxing.C4411o;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4399d;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p138hc.C5888c;
import p138hc.C5898k;
import p138hc.InterfaceC5886a;
import p138hc.InterfaceC5893h;
import p160ic.C6086i;
import p201kb.C6628f;
import p201kb.C6629g;
import p201kb.C6635k;
import p201kb.C6636l;
import p201kb.C6639o;

/* loaded from: classes2.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: w */
    private BarcodeView f11971w;

    /* renamed from: x */
    private ViewfinderView f11972x;

    /* renamed from: y */
    private TextView f11973y;

    /* renamed from: z */
    private InterfaceC4437a f11974z;

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4437a {
        /* renamed from: a */
        void m27575a();

        /* renamed from: b */
        void m27574b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$b */
    /* loaded from: classes2.dex */
    public class C4438b implements InterfaceC5886a {

        /* renamed from: a */
        private InterfaceC5886a f11975a;

        public C4438b(InterfaceC5886a interfaceC5886a) {
            this.f11975a = interfaceC5886a;
        }

        @Override // p138hc.InterfaceC5886a
        /* renamed from: a */
        public void mo22820a(C5888c c5888c) {
            this.f11975a.mo22820a(c5888c);
        }

        @Override // p138hc.InterfaceC5886a
        /* renamed from: b */
        public void mo22819b(List<C4411o> list) {
            for (C4411o c4411o : list) {
                DecoratedBarcodeView.this.f11972x.m27573a(c4411o);
            }
            this.f11975a.mo22819b(list);
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m27582c(attributeSet);
    }

    /* renamed from: c */
    private void m27582c(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C6639o.f17919l);
        int resourceId = obtainStyledAttributes.getResourceId(C6639o.f17920m, C6636l.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        FrameLayout.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(C6635k.zxing_barcode_surface);
        this.f11971w = barcodeView;
        if (barcodeView != null) {
            barcodeView.m27551q(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(C6635k.zxing_viewfinder_view);
            this.f11972x = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f11971w);
                this.f11973y = (TextView) findViewById(C6635k.zxing_status_view);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    /* renamed from: b */
    public void m27583b(InterfaceC5886a interfaceC5886a) {
        this.f11971w.m27590I(new C4438b(interfaceC5886a));
    }

    /* renamed from: d */
    public void m27581d(Intent intent) {
        int intExtra;
        Set<EnumC4392a> m20431a = C6628f.m20431a(intent);
        Map<EnumC4399d, ?> m20429a = C6629g.m20429a(intent);
        C6086i c6086i = new C6086i();
        if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
            c6086i.m22178i(intExtra);
        }
        if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
            m27576i();
        }
        String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
        new C4404i().m27655f(m20429a);
        this.f11971w.setCameraSettings(c6086i);
        this.f11971w.setDecoderFactory(new C5898k(m20431a, m20429a, stringExtra2, intExtra2));
    }

    /* renamed from: e */
    public void m27580e() {
        this.f11971w.mo27547u();
    }

    /* renamed from: f */
    public void m27579f() {
        this.f11971w.m27546v();
    }

    /* renamed from: g */
    public void m27578g() {
        this.f11971w.m27543y();
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(C6635k.zxing_barcode_surface);
    }

    public C6086i getCameraSettings() {
        return this.f11971w.getCameraSettings();
    }

    public InterfaceC5893h getDecoderFactory() {
        return this.f11971w.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f11973y;
    }

    public ViewfinderView getViewFinder() {
        return this.f11972x;
    }

    /* renamed from: h */
    public void m27577h() {
        this.f11971w.setTorch(false);
        InterfaceC4437a interfaceC4437a = this.f11974z;
        if (interfaceC4437a != null) {
            interfaceC4437a.m27575a();
        }
    }

    /* renamed from: i */
    public void m27576i() {
        this.f11971w.setTorch(true);
        InterfaceC4437a interfaceC4437a = this.f11974z;
        if (interfaceC4437a != null) {
            interfaceC4437a.m27574b();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            m27576i();
            return true;
        } else if (i == 25) {
            m27577h();
            return true;
        } else if (i == 27 || i == 80) {
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setCameraSettings(C6086i c6086i) {
        this.f11971w.setCameraSettings(c6086i);
    }

    public void setDecoderFactory(InterfaceC5893h interfaceC5893h) {
        this.f11971w.setDecoderFactory(interfaceC5893h);
    }

    public void setStatusText(String str) {
        TextView textView = this.f11973y;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(InterfaceC4437a interfaceC4437a) {
        this.f11974z = interfaceC4437a;
    }
}
