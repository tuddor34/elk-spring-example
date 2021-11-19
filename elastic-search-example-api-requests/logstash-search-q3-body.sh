curl -X GET "http://elastic:changeme@localhost:9200/logstash/_search" \
  -H 'Content-Type: application/json' \
  -d '
{
  "query": {
    "query_string": {
      "query": "(message:Starting) AND (thread_name:main)"
    }
  }
}
' | jq

