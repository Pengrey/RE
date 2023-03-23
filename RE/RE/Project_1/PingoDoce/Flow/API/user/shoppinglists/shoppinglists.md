Request:
```json
PUT /api/v2/user/shoppinglists HTTP/1.1
Host: app-proxy.pingodoce.pt
Pdapp-Storeid: 451
Pdapp-Cardnumber: 
Pdapp-Lcid: 
Pdapp-Hid: 
Pdapp-Clubs: 
X-App-Version: v-3.1.5 buildType-release flavor-prod
X-Device-Version: Android-29
X-Screen-Density: 3.5
Authorization: Bearer eyJhbGciOiJSUzUxMiIsInR5cCI6ImF0K2p3dCJ9.eyJuYmYiOjE2Nzk1OTE3MDAsImV4cCI6MTY3OTU5NTMwMCwiaXNzIjoiaHR0cHM6Ly9hcHAtcHJveHkucGluZ29kb2NlLnB0LyIsImF1ZCI6InBkYXBwIiwiY2xpZW50X2lkIjoiUERBcHBDbGllbnQiLCJzdWIiOiJkN2YwMjliMi03NWZiLTQxMjItZmU0Yi0wOGRiMmI2ZDI0MTkiLCJhdXRoX3RpbWUiOjE2Nzk1OTE3MDAsImlkcCI6ImxvY2FsIiwic2NvcGUiOlsicGRhcHAuYW5vbnltb3VzX2FjY2VzcyIsIm9mZmxpbmVfYWNjZXNzIl0sImFtciI6WyJwd2QiXX0.bcAX9ZYE_gfzb-rAb1O1x92N6qUhW6RQUNMPzO_qfCOFlOc4g0m3-uJGgyGIP5DBjxO175F_tU1nKj6U62fPf-yqxVaoG7m7JMpErMApLlf8m97HwGQop9E8SpJV5mfE-jonrpQhl-Vljr4jUFMngLUlPsnYpNSnXk23Yu3uvrcx2Lxl9A01ZJzYhQ668YTdbuBla5sx4qhyLymLqtskKE5NiMI2GuDnyusxTzVq7RKkW1VbTfmGQ5rFJ-VZkaaFQMBGMKslNGiJIXLJH-YC9iwIzOOhltwYJnSwC_mg0TAp0CFFysZy4VHBEXcx4I_ooGtXT9SlHNHFZkXay9dNQQ
Accept-Language: en-US
Content-Type: application/json; charset=UTF-8
Content-Length: 468
Accept-Encoding: gzip, deflate
User-Agent: okhttp/4.10.0
Connection: close

{"fullResponse":true,"shoppinglist":{"id":"8091f6a7-b07e-4f86-8c7b-55290a6c31ab","clientId":"ab94dd2d-4239-48f8-8f27-93c439afcbdf","userId":"d7f029b2-75fb-4122-fe4b-08db2b6d2419","name":"Nova Lista","description":"","isActive":true,"products":[],"sharedWith":[{"id":"d7f029b2-75fb-4122-fe4b-08db2b6d2419","name":" ","number":"","isOwner":true,"canWrite":true,"isActive":true}],"dateCreated":"2023-03-23T17:35:48.4012648Z","dateUpdated":"2023-03-23T17:35:48.4012651Z"}}
```

Response:
```json
HTTP/1.1 200 OK
Connection: close
Content-Type: application/json; charset=utf-8
Date: Thu, 23 Mar 2023 18:00:43 GMT
Vary: Accept-Encoding
Request-Context: appId=cid-v1:b18b1f5c-1067-4634-a8b5-28282182ef3d
Strict-Transport-Security: max-age=2592000; preload
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Content-Security-Policy: default-src 'self'; object-src 'none'; frame-ancestors 'none'; sandbox allow-forms allow-same-origin allow-scripts; base-uri 'self';
X-Content-Security-Policy: default-src 'self'; object-src 'none'; frame-ancestors 'none'; sandbox allow-forms allow-same-origin allow-scripts; base-uri 'self';
Referrer-Policy: no-referrer
api-supported-versions: 1,2
X-Powered-By: ASP.NET
Content-Length: 45

{"id":"8091f6a7-b07e-4f86-8c7b-55290a6c31ab"}
```