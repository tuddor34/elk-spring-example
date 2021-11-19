curl -X GET "http://elastic:changeme@localhost:9200/customer-index/_search/?pretty" -H 'Content-Type: application/json' -d'
{
  "query": {
    "term": {
      "user.id": "kimchy"
    }
  }
}
' | jq







#curl -X GET "localhost:9200/my-index-000001/_search?from=40&size=20&pretty" -H 'Content-Type: application/json' -d'
#{
#  "query": {
#    "term": {
#      "user.id": "kimchy"
#    }
#  }
#}
#'

