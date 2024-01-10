#!/usr/bin/env groovy

// check bach syntax
def call(){
    sh 'sudo yum install golang -y'
    sh 'go get -u golang.org/x/lint/golint'
    sh 'export PATH="$PATH:/home/ubuntu/go/bin/"'
    sh 'golint  \${WORKSPACE}/fake-backend/main.go'
    sh 'golint  \${WORKSPACE}/fake-backend/config.go'


}
