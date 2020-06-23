Run client: 
```
python3 -m http.server 8081
```

Run server:
```
./gradlew installDist && ./build/install/examples/bin/hello-world-server
# or
node server.js
```

Run proxy: 
```
docker run -d -v "$(pwd)"/envoy.yaml:/etc/envoy/envoy.yaml:ro     -p 8080:8080 -p 9901:9901 envoyproxy/envoy:v1.14.1
```

