#!/usr/bin/env groovy

// install awscli
def call(){
    sh """
       sudo yum update 
       sudo yum install awscli -y
      """

}