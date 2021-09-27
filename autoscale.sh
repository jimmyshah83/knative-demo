#!/bin/bash

for i in {1..20}
do
  curl http://knative-demo.default.127.0.0.1.nip.io/demo 
  printf "\n"
done
