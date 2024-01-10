#!/usr/bin/env groovy

// check bach syntax
def call(){
    sh 'sudo curl -sL https://rpm.nodesource.com/setup_10.x | sudo bash -'
    sh 'sudo yum install nodejs -y'
    sh 'sudo npm install -g sql-lint -y'
    sh 'sql-lint  \${WORKSPACE}/database/crud_flask.sql'


}
