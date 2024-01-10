#!/usr/bin/env groovy

// check python syntax
def call(){
  
   sh 'sudo yum install epel-release -y'
   sh 'sudo yum install python-pip -y'
   sh 'pip --version'
   sh 'pip install pylint -y'
   sh 'pylint  \${WORKSPACE}/source_code/module/database.py'

}
