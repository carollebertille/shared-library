#!/usr/bin/env groovy

// check dockerfile syntax
def call(){
    sh '/bin/hadolint  \${WORKSPACE}/Dockerfile-mysql'
    sh '/bin/hadolint  \${WORKSPACE}/Dockerfile-app'
    

}
