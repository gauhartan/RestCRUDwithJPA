### Rest CRUD med JPA (localhost)

1.

Mal: [GET]  - /channels/ ← Hämtar en lista över annonserade kanaler<br>
Curl:<br>
<code>
curl --location 'http://localhost:15000/api/v1/channels'
</code>

2.

Mal: [POST] - /channels/ ← skapar en ny kanal som en ny annons till ovanstående GET<br>
Curl:<br>
<code>
curl --location --request POST 'http://localhost:15000/api/v1/channels?title=2'
</code>

3.

Mal: [DELETE] - /channels/{id} ← tar bort en annonserad kanal<br>
Curl:<br>
<code>
curl --location --request DELETE 'http://localhost:15000/api/v1/channels/1'
</code>

4.

Mal: [PATCH] /channels/{id} ← uppdaterar titeln av en annons<br>
Curl:<br>
<code>
curl --location --request PATCH 'http://localhost:15000/api/v1/channels/59' \
--header 'Content-Type: application/json' \
--data '{
"title": "Channel 52"
}'
</code>

5.

Mal: [PUT] /channels/{id} ← skapar ett nytt meddelande i en kanal<br>
Curl:<br>
<code>
curl --location --request PUT 'http://localhost:15000/api/v1/channels/53' \
--header 'Content-Type: application/json' \
--data '{
"text": "Test message 4"
}'
</code>

6.

Mal: [GET] - /channels/{id} ← hämtar alla meddelanden i en kanal<br>
Curl:<br>
<code>
curl --location 'http://localhost:15000/api/v1/channels/2'
</code>