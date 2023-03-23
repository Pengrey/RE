Request:
```json
GET /api/v2/user/clubs/codes HTTP/1.1
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
Accept-Encoding: gzip, deflate
User-Agent: okhttp/4.10.0
Connection: close
```

Response:
```json
HTTP/1.1 500 Internal Server Error
Connection: close
Content-Type: application/json
Date: Thu, 23 Mar 2023 18:00:53 GMT
api-supported-versions: 2
X-Powered-By: ASP.NET
Content-Length: 141

{"errors":[{"status":"500","code":"1","title":"Ocorreu um erro genÃ©rico","detail":"Object reference not set to an instance of an object."}]}
```