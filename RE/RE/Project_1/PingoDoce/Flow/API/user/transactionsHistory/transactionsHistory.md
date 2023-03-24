Request:
```json
GET /api/v2/user/transactionsHistory?pageNumber=1&pageSize=20 HTTP/1.1
Host: app-proxy.pingodoce.pt
Pdapp-Storeid: 814
Pdapp-Cardnumber: 2446100018213
Pdapp-Lcid: 64147ea7c77762af853639c2
Pdapp-Hid: 5826423315
Pdapp-Clubs: 
X-App-Version: v-3.1.5 buildType-release flavor-prod
X-Device-Version: Android-29
X-Screen-Density: 3.5
Authorization: Bearer eyJhbGciOiJSUzUxMiIsInR5cCI6ImF0K2p3dCJ9.eyJuYmYiOjE2Nzk2NzE0OTksImV4cCI6MTY3OTY3NTA5OSwiaXNzIjoiaHR0cHM6Ly9hcHAtcHJveHkucGluZ29kb2NlLnB0LyIsImF1ZCI6InBkYXBwIiwiY2xpZW50X2lkIjoiUERBcHBDbGllbnQiLCJzdWIiOiIzZGZkNDcyOC01NmQ2LTQ3MjAtNGRmMS0wOGRiMjZiNWUyMmMiLCJhdXRoX3RpbWUiOjE2Nzk2Njc2NTQsImlkcCI6ImxvY2FsIiwic2NvcGUiOlsib3BlbmlkIiwicGRhcHAuYW5vbnltb3VzX2FjY2VzcyIsInBkYXBwLnNtc19hY2Nlc3MiLCJwZGFwcC5vbmJvYXJkaW5nX2FjY2VzcyIsInBkYXBwLmNoYW5nZV9udW1iZXIiLCJwZGFwcC5mdWxsX2FjY2VzcyIsIm9mZmxpbmVfYWNjZXNzIl0sImFtciI6WyJwd2QiXX0.aWOnDblZZOHR2nBG4dUluuGxCLIa5Yj1pNirxiPgzWYVAKh1s3R4hFw159Z27J-FA4kMfnaA8v0HXsuO_o1CzbAPfZfi1BShhLc5vM0wBP8ekemO-bEyWCHO4U9O2UzZiVjlo_pF2UpQWt42GcRINi77nzwyJiwRjcjCTjrdRsbgQeaQMravj5IFRYz-KJvKkJF2XgJaTqkoPv3szd-dBdGQIop_0n4oEnpED5oC5LyubzW8zwvjz23MbLqw4heDJi77J_xaghKLfevYA1aZmXgAuoMI718oA2GzX9lBQY10CCycZbzf1O2h1zWedxyCQUfTzbz1q1QuQPr1jXhAdw
Accept-Language: en-US
Accept-Encoding: gzip, deflate
User-Agent: okhttp/4.10.0
Connection: close


```

Response:
```json
HTTP/1.1 404 Not Found
Connection: close
Content-Type: application/json
Date: Fri, 24 Mar 2023 15:40:37 GMT
api-supported-versions: 1,2
X-Powered-By: ASP.NET
Content-Length: 190

{"errors":[{"status":"404","code":"5403","title":"NÃ£o foi possÃ­vel obter os dados do seu histÃ³rico de compras","detail":"NÃ£o foi possÃ­vel obter os dados do seu histÃ³rico de compras"}]}
```