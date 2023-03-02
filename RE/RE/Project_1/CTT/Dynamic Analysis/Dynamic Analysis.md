# Intercept requests
## Set proxy on burpsuite
![[Pasted image 20230302184803.png]]

## Set proxy on Android VM
```powershell
PS adb shell settings put global http_proxy 192.168.0.16:8082
```

## Export Cert
1. generate cert on Burp
2. Add cert through settings on VM

## Result (SSL Pinning is being used?)
![[Pasted image 20230302184911.png]]