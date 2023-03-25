(code below cleaned up)
```java
package af;  
  
import p181jd.Intrinsics;  
  
/* compiled from: ApiError.kt */  
/* renamed from: af.a */  
/* loaded from: classes2.dex */  
public final class APIError {  
  
    /* renamed from: a */  
    private final String errorMessage;  
  
    public APIError(String str) {  
        Intrinsics.isThisObjectNull(str, "message");  
        this.errorMessage = str;  
    }  
  
    /* renamed from: a */  
    public final String getMessage() {  
        return this.errorMessage;  
    }  
  
    public boolean equals(Object obj) {  
        if (this == obj) {  
            return true;  
        }  
        return (obj instanceof APIError) && Intrinsics.equals(this.errorMessage, ((APIError) obj).errorMessage);  
    }  
  
    public int hashCode() {  
        return this.errorMessage.hashCode();  
    }  
  
    public String toString() {  
        String str = this.errorMessage;  
        return "ApiError(message=" + str + ")";  
    }  
}
```
and this object is used in the method below:
```java
    public final APIError throwAPIError(int i) {  
        String string = this.f13109a.m6477a().getString(i);  
        Intrinsics.checkIfNull(string, "ctx.getString(id)");  
        return new APIError(string);  
    }
```
(this.f13109a.m6477a() is a Context, but no more detail was able to be found)
