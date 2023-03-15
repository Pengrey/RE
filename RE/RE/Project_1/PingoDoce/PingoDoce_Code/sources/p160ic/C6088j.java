package p160ic;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.io.IOException;

/* renamed from: ic.j */
/* loaded from: classes2.dex */
public class C6088j {

    /* renamed from: a */
    private SurfaceHolder f16785a;

    /* renamed from: b */
    private SurfaceTexture f16786b;

    public C6088j(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f16785a = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }

    /* renamed from: a */
    public void m22177a(Camera camera) throws IOException {
        SurfaceHolder surfaceHolder = this.f16785a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f16786b);
        }
    }

    public C6088j(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f16786b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }
}
