#!/usr/bin/env groovy


// check yaml syntax
def call(){

    sh 'yamllint --version'
    sh 'yamllint \${WORKSPACE}'
}
