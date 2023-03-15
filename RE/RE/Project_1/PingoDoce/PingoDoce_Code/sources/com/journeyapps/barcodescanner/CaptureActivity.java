package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import p201kb.C6635k;
import p201kb.C6636l;

/* loaded from: classes2.dex */
public class CaptureActivity extends Activity {

    /* renamed from: w */
    private C4450e f11969w;

    /* renamed from: x */
    private DecoratedBarcodeView f11970x;

    /* renamed from: a */
    protected DecoratedBarcodeView m27585a() {
        setContentView(C6636l.zxing_capture);
        return (DecoratedBarcodeView) findViewById(C6635k.zxing_barcode_scanner);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11970x = m27585a();
        C4450e c4450e = new C4450e(this, this.f11970x);
        this.f11969w = c4450e;
        c4450e.m27519p(getIntent(), bundle);
        this.f11969w.m27523l();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f11969w.m27514u();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f11970x.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f11969w.m27513v();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f11969w.m27512w(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f11969w.m27511x();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f11969w.m27510y(bundle);
    }
}
