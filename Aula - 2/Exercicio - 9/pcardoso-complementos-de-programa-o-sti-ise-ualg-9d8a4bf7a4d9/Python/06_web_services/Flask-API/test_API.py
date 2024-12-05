import requests

uri = 'http://localhost:8080/iot/api/v1.0/things/'

print(20 * '*' + ' GET all')
response = requests.get(uri)
print(response.text)


print(20 * '*' + ' GET one')
response = requests.get(uri + '1')
print(response.text)


print(20 * '*' + ' POST')
response = requests.post(uri, json={
      "local": "@lab. 163 / ISE /UAlg",
      "name": "Apollo",
      "sensors": [
        {
          "sensor_name": "temperature",
          "units": "numerical"
        },
        {
          "sensor_name": "humidity",
          "units": "percent"
        }
      ]
    })
print(response.text)


print(20 * '*' + ' PUT')
response = requests.put(uri + '3', json={
      "name": "Apollo X1",
    })
print(response.text)

print(20 * '*' + ' GET all (again)')
response = requests.get(uri)
print(response.text)


print(20 * '*' + ' DELETE')
response = requests.delete(uri + '3')
print(response.text)

print(20 * '*' + ' GET all (again)')
response = requests.get(uri)
print(response.text)


