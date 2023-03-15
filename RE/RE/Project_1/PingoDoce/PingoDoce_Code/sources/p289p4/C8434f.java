package p289p4;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import p076e5.CrashShieldHandler;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p4.f */
/* loaded from: classes.dex */
public class C8434f implements SensorEventListener {

    /* renamed from: a */
    private InterfaceC8435a f21829a;

    /* compiled from: ViewIndexingTrigger.java */
    /* renamed from: p4.f$a */
    /* loaded from: classes.dex */
    public interface InterfaceC8435a {
        /* renamed from: a */
        void mo15408a();
    }

    /* renamed from: a */
    public void m15409a(InterfaceC8435a interfaceC8435a) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            this.f21829a = interfaceC8435a;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        CrashShieldHandler.m25963d(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            if (this.f21829a != null) {
                float[] fArr = sensorEvent.values;
                double d = fArr[0] / 9.80665f;
                double d2 = fArr[1] / 9.80665f;
                double d3 = fArr[2] / 9.80665f;
                if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.299999952316284d) {
                    this.f21829a.mo15408a();
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }
}
